package virtualbaby;

import java.util.Scanner;

public class VirtualBabyApp {

	public static void main(String[] args) {
//	
		Scanner input = new Scanner(System.in);
//		

		VirtualBaby virtualBaby = new VirtualBaby();

		System.out.println("Hello! Welcome to Virtual Baby.");

		virtualBaby.menu();

		int menuSelect = input.nextInt();
		
	// for loop--how would i do this OR should i use a DOWHILE loop-- do tick() while baby is alive.

		if(menuSelect==1) {
			virtualBaby.healthStatusMenu();
		} else if (menuSelect==2) {
			virtualBaby.feed();
		}else if (menuSelect==3) {
			virtualBaby.sleep();
		}else if (menuSelect==4) {
			virtualBaby.changeDiaper();
		} else {
			System.out.println("Incorrect Choice");
			virtualBaby.menu();
		}
	}
		
		 menuSelect = input.nextInt();
	}

}
