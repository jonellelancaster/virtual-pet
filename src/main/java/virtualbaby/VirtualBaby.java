package virtualbaby;

public class VirtualBaby {

	private int hungry = 50;
	private int energy = 50;
	private int diaper = 50;
	private int teething = 50;
	private int playTime = 50;
	private int parentMentalState = 50;

	public int getHungry() {
		return hungry;

	}

	public int getEnergy() {
		return energy;
	}

	public int getDiaper() {
		return diaper;

	}

	public int getTeething() {
		return teething;
	}

	public int getPlayTime() {
		return playTime;
	}

	public int getParentMentalState() {
		return parentMentalState;
	}

	public void feed() {
		hungry += 10;
		energy -= 1;
		diaper -= 1;
		teething-=2;
		playTime-=1;
		
		System.out.println("Baby is eating");
	}

	public void sleep() {
		energy += 10;
		hungry -= 5;
		diaper -= 10;
		teething +=2;
		playTime-=2;
		parentMentalState+=5;
		
		System.out.println("Baby is sleeping.");
	}

	public void changeDiaper() {
		diaper += 10;
		energy+=2;
		playTime +=2;
		parentMentalState+=5;
		System.out.println("Baby is getting diaper changed.");
	}

	public void tick() {
		hungry -= 2;
		energy -= 2;
		diaper -= 2;
		teething-=2;
		playTime-=2;
		parentMentalState-=5;
	}

	public void giveTeether() {
		teething += 10;
		energy -= 2;
		hungry -=1;
		
	}
	public void playWithBaby() {
		playTime+=10;
		energy-=5;
		parentMentalState+=5;	

	}
	
	public void drinkWine() {
		parentMentalState += 10;
	}

	public void menu() {
		System.out.println(
				"\nWhat would you like to do with your Virtual Baby? \n 1. Find out current state of baby. \n 2. Feed baby. \n 3. Put baby down to sleep.\n 4. Change baby's diaper. \n 5. Give baby a teether. \n 6. Play with baby. \n 7. Drink Wine ");
	}

	public void healthStatusMenu() {
		System.out.println("Hungry: " + hungry + "\nEnergy Level: " + energy + "\nDiaper: " + diaper + "\nTeething:" + teething + "\nPlay:" + playTime + "\nParent Mental State:" + parentMentalState+ "\n ");

	} 

	public void declareDeath() {
		System.out.println("You killed your baby. You are a terrible person.");

	}

	

	}

