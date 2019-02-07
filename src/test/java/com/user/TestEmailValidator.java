package com.user;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestEmailValidator {
	
	@BeforeClass
	public static void intializeConnections() {

		System.out.println("Connections intialized");
	}

	@AfterClass
	public static void destroyConnections() {
		System.out.println("Connections closed!!");
	}
	
	@Before
	public void intializeObjects() {
		System.out.println("Objects intialized");
		
	}

	@After
	public void destroyObjects() {
		System.out.println("Objects destroyed..");

	}

	@Test(expected = NullPointerException.class, timeout=1000)
	public void testValidate() {
		System.out.println("testcase-1");
		EmailValidator obj = new EmailValidator();
		
		Assert.assertTrue(obj.validate("gajjellis@gmail.com"));
		Assert.assertFalse(obj.validate("srinivas.com"));
		Assert.assertTrue(obj.validate("srinivas.gajjeli@cognizant.com"));
		Assert.assertTrue(obj.validate(null));
	}
	
	@Ignore
	@Test
	public void testAddition() {
		System.out.println("testcase-2");
		EmailValidator obj = new EmailValidator();

		Assert.assertEquals(30, obj.addition(10, 20));
		Assert.assertNotEquals(50, obj.addition(10, 20));
		Assert.assertTrue(90 == obj.addition(40, 50));

	}
  
	

}
