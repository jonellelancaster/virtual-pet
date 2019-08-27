package virtualbaby;

public class VirtualBaby {

	private int hungry = 10;
	private int tired = 10;
	private int diaper = 10;
	

	public int getHungry() {
		return hungry;

	}

	public int getTired() {
		return tired;
	}

	public int getDiaper() {
		return diaper;

	}
	public void feed() {
		hungry -= 5;
		System.out.println("Baby is eating");
	}

	public void sleep() {
		tired-=5;
		System.out.println("Baby is sleeping.");
	}

	public void changeDiaper() {
		diaper-=5;
		System.out.println("Baby is getting diaper changed.");
	}

	public void tick() {
		hungry+=1;
		tired +=1;
		diaper+=1;
	}
	public void menu() {
		System.out.println("What would you like to do with your Virtual Baby? \n 1. Find out current state of baby. \n 2. Feed Baby. \n 3. Put baby down to sleep.\n 4. Change baby's diaper. ");
	}
	
	public void healthStatusMenu() {
		System.out.println("Hungry: " + hungry + "\nTired: "+ tired + "\nDiaper: "+ diaper+ "\n ");
		
		
	}

	public void declareDeath() {
		System.out.println("You killed your baby. You are a terrible person.");
		
	}
}
