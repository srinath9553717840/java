package com.nt.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionOperationTest {
	private static ArithmaticOperations op=null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("AdditionOperationTest.setUpBeforeClass()");
		op=new AdditionOperation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AdditionOperationTest.tearDownAfterClass()");
		op=null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("AdditionOperationTest.setUp()");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("AdditionOperationTest.tearDown()");
	}

	@Test
	public void testAdd() {
		
		int actualResult=0;
		//calling method
		actualResult=op.add(10, 20);

		int expectedResult=30;
			
			//testing class method
	assertEquals(expectedResult, actualResult);	
	}

}
