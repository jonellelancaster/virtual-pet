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
		
		if(menuSelect==1) {
			System.out.println("Hungry: " + virtualBaby.getHungry() + " \nTired: " + virtualBaby.getTired()+ " \nSoiled Diaper: "+ virtualBaby.getDiaper());
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
		virtualBaby.tick();
		virtualBaby.menu();
		
		 menuSelect = input.nextInt();
	}

}
