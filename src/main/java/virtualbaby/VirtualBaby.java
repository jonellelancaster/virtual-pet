package virtualbaby;

public class VirtualBaby {

	private int hungry = 50;
	private int energy = 50;
	private int diaper = 50;
	
	

	public int getHungry() {
		return hungry;

	}

	public int getEnergy() {
		return energy;
	}

	public int getDiaper() {
		return diaper;

	}
	public void feed() {
		hungry += 10;
		energy-= 1;
		diaper-=1;
		System.out.println("Baby is eating");
	}

	public void sleep() {
		energy+=10;
		hungry-=5;
		diaper-=10;
		System.out.println("Baby is sleeping.");
	}

	public void changeDiaper() {
		diaper+=10;
		System.out.println("Baby is getting diaper changed.");
	}

	public void tick() {
		hungry-=2;
		energy-=2;
		diaper-=2;
	}
	public void menu() {
		System.out.println("What would you like to do with your Virtual Baby? \n 1. Find out current state of baby. \n 2. Feed Baby. \n 3. Put baby down to sleep.\n 4. Change baby's diaper. ");
	}
	
	public void healthStatusMenu() {
		System.out.println("Hungry: " + hungry + "\nEnergy Level: "+ energy + "\nDiaper: "+ diaper+ "\n ");
		
		
	}

	public void declareDeath() {
		System.out.println("You killed your baby. You are a terrible person.");
		
	}

	public int getOverAllHealth() {
	return	hungry+energy+diaper;
		
		
	}
}
