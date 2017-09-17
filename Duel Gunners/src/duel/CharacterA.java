package duel;



public class CharacterA implements Dueler {
	
	private String name;
	private String[] TAUNTS = {
			"You can't beat me.",
			"Just give up already, will ya?",
			"Is that all you got?",
			"You're a joke buddy.",
			"Ha, yeah right pal!",
			"Stop trying, you won't win.",
			"I'm too strong for you, just quit!",
			"You serious?"
	};
	
	public void taunt() {
		
		int x = (int)(Math.random() * TAUNTS.length);
		System.out.println(TAUNTS[x]);
		
	}
	
	public String getName() {
		
		return name;
		
	}

	public void setStartingHP(int hp) {
		
		
		
	}

	public int getHP() {
		
		return 0;
		
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		
		return false;
		
	}

	public int getAction(Object caller) {
		
		return 0;
		
	}

	public void hit(Object caller) {
		
		
		
	}
	
}
