package duel;



public class CharacterB implements Dueler {
	
	void String[] listOfTaunts= {"You Suck",
			"Try harder",
			"Is that the best you can do?",
			"Just give up",
			"Stop wasting my time"
	}
	public void taunt() {
		System.out.println(listOfTaunt[Math.random()*listOfTaunts.length]);
	}
	private string name;
	public string getName() {
		return name;
	}
	private int hp;
	public int setStartingHP(int hp) {
		int jay;
		if(jay>1)
			return void;
		else
			jay+=1;
			return hp;
	}
	public int getHP(int hp) {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		int x = d.getHP();
		if(x == hp)
			return true;
	}
	public String[] result = {};
	public void setAction() {
<<<<<<< HEAD
		
		if(lastAction == NOTHING) {
			action = LOADING;
			loaded = true;
		} else {
			
			int x = (int)(Math.random() * 10);
			
			if(loaded) {
				
				if(x < 5) {
					action = GUARDING;
				} else {
					action = SHOOTING;
					loaded = false;
				}
				
			} else {
				
				if(x < 5) {
					action = GUARDING;
				} else {
					action = LOADING;
					loaded = true;
				}
				
			}
			
=======
		string x = outcome[Math.random()*outcome.length];
		result.add(string x);
		if(x == "shoots" && result.contains("loads")){
			result.remove(string "loads");
			return x;
>>>>>>> branch 'master' of https://github.com/YerBoySisi/duelrepository.git
		}
		else 
			setAction();
	}
	public int getAction(object caller){
		x= setAction();
		if(caller instanceof duel) {
			if(x =="loads")
				return 0;
			else if(x == "shoots")
				return 1;
			else if(x == "gaurds")
				return 2;
		}
		else 
			return 3;
	}
	public void hit(object caller) {
		if(caller instanceof duel)
			hp = hp-10;
		else 
			return 3;
	}
			
	
	
	
}