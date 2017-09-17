package duel;



public class CharacterB implements Dueler {
	
	private String name;
	private int hp;
	
	private String[] TAUNTS = {
			"You can't beat me.",
			"Just give up already, will ya?",
			"Is that all you've got?",
			"You're a joke buddy.",
			"Ha, yeah right pal!",
			"Stop trying, you won't win.",
			"I'm too strong for you, just quit!",
			"You serious?",
			"Give me a real challenge.",
			"Show me what you've got! If you even have anything...",
			"C'mon, you can do better than that! I hope.",
			"Pathetic!"
	};
	
	public void taunt() {
		
		int x = (int)(Math.random() * TAUNTS.length);
		System.out.println(TAUNTS[x]);
		
	}
	
	public void setName() {
		
		name = "Spade";
		
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
		
		
		
	}
	
	public int getAction(Object caller) {
		
		return 0;
		
	}

	public void hit(Object caller) {
		
		if(caller instanceof Duel) {
			hp -= 10;
		}
		
	}
	
}
