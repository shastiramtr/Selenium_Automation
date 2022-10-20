package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExamble {
	
	String name ="ram";
	
	@Test
	public void checkEqual() {
		
		if (name.equals(name)) {
			System.out.println("Name is equal");
		}
		else {
			System.out.println();
		}
		
		Assert.assertEquals(name, "ram");
	}
	
	
	

}
