package virtualbaby;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualBabyTest {

	@Test
	
	
	public void  getHungry() {
		VirtualBaby underTest = new VirtualBaby();
		int result=underTest.getHungry();
		assertEquals(10,result);
	}
	@Test
	public void getTired() {
		
		VirtualBaby underTest = new VirtualBaby();
		int result=underTest.getTired();
		assertEquals(10,result);
				
	}
	
	@Test
	public void getDiaper() {
		VirtualBaby underTest = new VirtualBaby();
		int result=underTest.getDiaper();
		assertEquals(10,result);
	
		
	}
	@Test
	public void hungerDecreaseby5() {
		VirtualBaby underTest = new VirtualBaby();
		underTest.feed();
		int result = underTest.getHungry();
		assertEquals(5,result);
		
	}
	@Test
	public void tiredDecreasedby5() {
		VirtualBaby underTest = new VirtualBaby();
		underTest.sleep();
		int result= underTest.getTired();
		assertEquals(5,result);
		
	}
	
	@Test 
	public void hungerIncreaseby1() {
		VirtualBaby underTest = new VirtualBaby();
		underTest.tick();
		int result=underTest.getHungry();
		assertEquals(11, result);

	}
	
	@Test
	public void printMenu() {
		VirtualBaby underTest= new VirtualBaby();
		underTest.menu();
		
	}
}
