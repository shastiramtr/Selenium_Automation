package testNG;

import org.testng.annotations.Test;

public class Dependanciesmanagment {
	
	//Problem1: you have to admit a student to engineering
	//Problem1: you have to admit a student to higher secondary
	
	
	@Test(enabled=true)
	public void highschool() {
		System.out.println("High school");
	}
	@Test (dependsOnMethods ="highschool")
	public void Highersecondary () {
		System.out.println("Higher sec school");
	}

	@Test (dependsOnMethods ="Highersecondary")
	public void engineering() {
		System.out.println("college");
	}

	
	

}
