package com.bassam.junit.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestHelperClass {

	@Test
	public void test() {
		StringHelper helper = new StringHelper();
		String expextOutput = "CD";
		String  actualOutput= helper.truncateInFirst2Position("AACD");
		assertEquals(expextOutput, actualOutput);

	}
	
	@Test
	public void testareFirstAndTowCharactersTheSame() {
		
		StringHelper helper=new StringHelper();
		assertFalse(helper.areFirstAndTowCharactersTheSame(""));
		assertFalse(helper.areFirstAndTowCharactersTheSame("A"));
		assertTrue(helper.areFirstAndTowCharactersTheSame("AB"));
		assertTrue(helper.areFirstAndTowCharactersTheSame("AAA"));
		assertFalse(helper.areFirstAndTowCharactersTheSame("AAB"));
		
	}
	

}
