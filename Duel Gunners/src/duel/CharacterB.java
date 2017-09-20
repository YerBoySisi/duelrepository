package duel;


public class CharacterB implements Dueler {
	
	private String name;
	private int hp;
	private int loaded;
	private int result;
	
	

	public static final int LOADING = 0;
	public static final int SHOOTING = 1;
	public static final int GUARDING = 2;
	public static final int YEAH_RIGHT = 3;
	
	private String[] TAUNT= {"You Suck","Try harder","Is that the best you can do?","Just give up","Stop wasting my time"};
	
	public void taunt() {
		System.out.println(TAUNT[(int)Math.random()*TAUNT.length]);
	
	}
	
	public void setName() {
		
		name = "Jace";
		
	}
	public String getName() {
		return name;
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		int x = d.getHP();
		return (x == hp);
	}
	
	public void setAction() {
		double x = Math.random();
		if(loaded>1) {
			if(x>0.49) {
				result = SHOOTING;
				loaded = loaded - 1;
			}
			else{
				result = LOADING;
				loaded= loaded + 1;
			}
		}
			else if(x>0.15) {
				result = GUARDING;
			}
			else{
				result = LOADING;
				loaded = loaded + 1;
			}	
	}
	public int getAction(Object caller){
		if(caller instanceof Duel) {
			return result;
		}
		else 
			return YEAH_RIGHT;
	}
	public void hit(Object caller) {
		if(caller instanceof Duel)
			hp = hp-10;
	}
			
	
	
	
}