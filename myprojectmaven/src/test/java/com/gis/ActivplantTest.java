package com.gis;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivplantTest {
	
	@Test
	public void testlogin1()
	{
		Activplant myactivplant=new Activplant();
		Assert.assertEquals(0,myactivplant.userLogin("Administrator","@qwerty"));
		screenshots("Login");	
	}
	
	private void screenshots(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testlogin2()
	{
		Activplant myactivplant=new Activplant();
		Assert.assertEquals(1,myactivplant.userLogin("Administrator","qwerty"));
	}
	
	

}
