package duel;



public class CharacterB implements Dueler {
	
	public static final int NOTHING = -1;
	public static final int LOADING = 0;
	public static final int SHOOTING = 1;
	public static final int GUARDING = 2;
	public static final int YEAH_RIGHT = 3;
	
	private String name;
	private int hp;
	private int action;
	private boolean loaded;
	
	private int lastAction = NOTHING;
	
	private String[] TAUNTS = {
			"You can't beat me.",
			"Just give up already, will ya?",
			"You're a joke buddy.",
			"Think you can beat me? Ha, yeah right pal!",
			"Don't even try, you won't win.",
			"I'm too strong for you, just quit while you can!",
			"You seriously want to face me? HA!",
			"Give me a real challenge.",
			"Show me what you've got! If you even have anything...",
			"Let's see if you can even hold a gun.",
			"Bring it on then!"
	};
	
	public void taunt() {
		
		int x = (int)(Math.random() * TAUNTS.length);
		System.out.println(TAUNTS[x]);
		
	}
	
	public void setName() {
		
		name = "Deadeye";
		
	}
	
	public String getName() {
		
		return name;
		
	}

	public void setStartingHP(int hp) {
		
		if(this.hp != hp) {
			this.hp = hp;
		}
		
	}

	public int getHP() {
		
		return hp;
		
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		
		return (d.getHP() == hp);
		
	}
	
	public void setAction() {
		
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
			
		}
		
		lastAction = action;
		
	}
	
	public int getAction(Object caller) {
		
		if(caller instanceof Duel) {
			return action;
		} else {
			return YEAH_RIGHT;
		}
		
	}

	public void hit(Object caller) {
		
		if(caller instanceof Duel) {
			hp -= 10;
		}
		
	}
	
}
