package virtualbaby;

import java.util.Scanner;

public class VirtualBabyApp {

	private static VirtualBaby virtualBaby = new VirtualBaby();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Hello! Welcome to Virtual Baby. \nIf any of your health status drop to 0, you will kill your baby. Good luck and don't kill your baby.\n ");

		printMenu();
		
		

		while (true) {
			int menuSelect = input.nextInt();

			if (menuSelect == 1) {
				healthStatusMenu();
				printMenu();
				virtualBaby.tick();

			} else if (menuSelect == 2) {
				virtualBaby.feed();
				printMenu();
				virtualBaby.tick();
				healthStatusMenu();

			} else if (menuSelect == 3) {
				virtualBaby.sleep();
				printMenu();
				virtualBaby.tick();
				healthStatusMenu();

			} else if (menuSelect == 4) {
				virtualBaby.changeDiaper();
				printMenu();
				virtualBaby.tick();
				healthStatusMenu();

			} else if (menuSelect == 5) {
				virtualBaby.giveTeether();
				printMenu();
				virtualBaby.tick();
				healthStatusMenu();

			} else if (menuSelect == 6) {
				virtualBaby.playWithBaby();
				printMenu();
				virtualBaby.tick();
				healthStatusMenu();

			} else if (menuSelect == 7) {
				virtualBaby.drinkWine();
				printMenu();
				virtualBaby.tick();
				healthStatusMenu();

			} else {
				System.out.println("Incorrect Choice");
				printMenu();
				virtualBaby.tick();

			}

			if ((virtualBaby.getHungry() <= 0) || (virtualBaby.getEnergy() <= 0) || (virtualBaby.getDiaper() <= 0)
					|| (virtualBaby.getTeething() <= 0) || (virtualBaby.getPlayTime() <= 0)) {

				virtualBaby.declareDeath();
				System.exit(0);
			} else if ((virtualBaby.getHungry() <= 25) && (virtualBaby.getEnergy() <= 25)
					&& (virtualBaby.getDiaper() <= 25) && (virtualBaby.getTeething() <= 25)
					&& (virtualBaby.getPlayTime() <= 25)) {
				System.out.println("Baby is only half alive. Do you only want a half child?");
			} else if (virtualBaby.getParentMentalState() <= 25) {
				System.out.println(
						"Your mental health is declining. Drinks some wine! You need some me time....or at least something to numb you.");
			} else {
				System.out.println("You are doing good at this parenting thing.");
			}

		}

	}

	public static void printMenu() {
		System.out.println(
				"\nWhat would you like to do with your Virtual Baby? \n 1. Find out current state of baby. \n 2. Feed baby. \n 3. Put baby down to sleep.\n 4. Change baby's diaper. \n 5. Give baby a teether. \n 6. Play with baby. \n 7. Drink Wine ");
	}

	public static void healthStatusMenu() {
		System.out.println("Hungry: " + virtualBaby.getHungry() + "\nEnergy Level: " + virtualBaby.getEnergy()
				+ "\nDiaper: " + virtualBaby.getDiaper() + "\nTeething:" + virtualBaby.getTeething() + "\nPlay:"
				+ virtualBaby.getPlayTime() + "\nParent Mental State:" + virtualBaby.getParentMentalState() + "\n ");

	}

}
