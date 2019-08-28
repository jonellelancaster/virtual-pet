package virtualbaby;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualBabyTest {

	@Test
	
	
	public void  getHungry() {
		VirtualBaby underTest = new VirtualBaby();
		int result=underTest.getHungry();
		assertEquals(50,result);
	}
	@Test
	public void getTired() {
		
		VirtualBaby underTest = new VirtualBaby();
		int result=underTest.getEnergy();
		assertEquals(50,result);
				
	}
	
	@Test
	public void getDiaper() {
		VirtualBaby underTest = new VirtualBaby();
		int result=underTest.getDiaper();
		assertEquals(50,result);
	
		
	}
	@Test
	public void hungerIncreaseby10() {
		VirtualBaby underTest = new VirtualBaby();
		underTest.feed();
		int result = underTest.getHungry();
		assertEquals(60,result);
		
	}
	@Test
	public void energyIncreasedby10() {
		VirtualBaby underTest = new VirtualBaby();
		underTest.sleep();
		int result= underTest.getEnergy();
		assertEquals(60,result);
		
	}
	
	@Test 
	public void hungerDecreasedby2() {
		VirtualBaby underTest = new VirtualBaby();
		underTest.tick();
		int result=underTest.getHungry();
		assertEquals(48, result);

	
	}
	@Test
	public void getOverAllHealth() {
		VirtualBaby underTest = new VirtualBaby();
		underTest.getOverAllHealth();
		int result=underTest.getOverAllHealth();
		assertEquals(150,result);
	}
}
	
	
	

