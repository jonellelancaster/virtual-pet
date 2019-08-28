package virtualbaby;

import java.util.Scanner;

public class VirtualBabyApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualBaby virtualBaby = new VirtualBaby();

		System.out.println(
				"Hello! Welcome to Virtual Baby. \nIf any of your health status drop to 0, you will kill your baby. Good luck and don't kill your baby.\n ");

		virtualBaby.menu();

		int run = 0;

		for (run = 0; run <= 100; run++) {
			int menuSelect = input.nextInt();

			if (menuSelect == 1) {
				virtualBaby.healthStatusMenu();
				virtualBaby.menu();
				virtualBaby.tick();
				run++;

			} else if (menuSelect == 2) {
				virtualBaby.feed();
				virtualBaby.menu();
				virtualBaby.tick();
				virtualBaby.healthStatusMenu();
				run++;
			} else if (menuSelect == 3) {
				virtualBaby.sleep();
				virtualBaby.menu();
				virtualBaby.tick();
				virtualBaby.healthStatusMenu();
				run++;
			} else if (menuSelect == 4) {
				virtualBaby.changeDiaper();
				virtualBaby.menu();
				virtualBaby.tick();
				virtualBaby.healthStatusMenu();
				run++;
			} else if (menuSelect == 5) {
				virtualBaby.giveTeether();
				virtualBaby.menu();
				virtualBaby.tick();
				virtualBaby.healthStatusMenu();
				run++;
			} else if (menuSelect == 6) {
				virtualBaby.playWithBaby();
				virtualBaby.menu();
				virtualBaby.tick();
				virtualBaby.healthStatusMenu();
				run++;
			} else if (menuSelect==7) {
				virtualBaby.drinkWine();
				virtualBaby.menu();
				virtualBaby.tick();
				virtualBaby.healthStatusMenu();
				run++;
			} else {
				System.out.println("Incorrect Choice");
				virtualBaby.menu();
				virtualBaby.tick();
				run++;
			}

			if ((virtualBaby.getHungry() <= 0) ||(virtualBaby.getEnergy() <= 0)||(virtualBaby.getDiaper() <= 0)||(virtualBaby.getTeething() <= 0)||(virtualBaby.getPlayTime()<= 0)){
				
				virtualBaby.declareDeath();
			} else if ((virtualBaby.getHungry() <= 25) &&(virtualBaby.getEnergy() <= 25)&&(virtualBaby.getDiaper() <= 25)&&(virtualBaby.getTeething() <= 25)&&(virtualBaby.getPlayTime()<= 25)) {
				System.out.println("Baby is only half alive. Do you only want a half child?");
			}else if (virtualBaby.getParentMentalState() <= 25) {
				System.out.println("Your mental health is declining. Drinks some wine! You need some me time....or at least something to numb you.");
			} else {
				System.out.println("You are doing good at this parenting thing.");
			}

		}
		System.exit(0);

	}
}
