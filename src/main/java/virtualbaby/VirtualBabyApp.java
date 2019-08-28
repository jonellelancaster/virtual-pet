package virtualbaby;

import java.util.Scanner;

public class VirtualBabyApp {
	

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	

		VirtualBaby virtualBaby = new VirtualBaby();

		System.out.println("Hello! Welcome to Virtual Baby. \nIf any of your health status drop to 0, you will kill your baby. Good luck and don't f*** it up.\n ");

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
			} else {
				System.out.println("Incorrect Choice");
				virtualBaby.menu();
				virtualBaby.tick();
				run++;
			}

	
			if (virtualBaby.getOverAllHealth() <= 0) {
				virtualBaby.declareDeath();
			} else if (virtualBaby.getOverAllHealth() <= 25) {
				System.out.println("Baby is only half alive. Do you only want a half child?");
			} else {
				System.out.println("You are doing good at this parenting thing.");
			}

		}
		System.exit(0);

	}
}
