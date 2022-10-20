package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	/*
	 Scenario : A big basket is having a different kind of mobile.
	 Let us say there are Apply phone, Moto G, VIVO and Levono.
	 I want to run tests only for VIVO and Moto phones. Write a program for that.
	 */
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple testing");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple testing");
	}
	@Test(groups = {"Moto"})
	public void moto1() {
		System.out.println("Moto testing");
	}
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("Moto testing");
	}
	@Test(groups = {"VIVO"})
	public void VIVO1() {
		System.out.println("VIVO testing");
	}
	@Test(groups = {"VIVO"})
	public void VIVO2() {
		System.out.println("VIVO testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Levono testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo testing");
	}
	
	
	
	

}
