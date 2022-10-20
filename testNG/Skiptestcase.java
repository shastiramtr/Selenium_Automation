package testNG;

import org.testng.annotations.Test;

public class Skiptestcase {
	
	@Test (priority=0)
	public void stratthecar() {
		System.out.println("strat the car");
	}
	@Test (priority=5,enabled = false)
	public void turnthemusicon() {
		System.out.println("music turn on");
	}
	@Test (priority=1)
	public void putfirstgear() {
		System.out.println("putfirstgear");
	}
	
	@Test (priority=2)
	public void putsecondgear() {
		System.out.println("putsecondgear");
	}
	
	@Test (priority=3)
	public void putthirdgear() {
		System.out.println("putthirdgear");
	}
	
	@Test (priority=4)
	public void putfourthgear() {
		System.out.println("putfourthgear");
	}
	

}
