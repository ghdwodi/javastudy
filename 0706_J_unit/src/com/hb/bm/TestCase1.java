package com.hb.bm;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class TestCase1 {
	
	@Test
	public void test() {
		Calc calc = new Calc();
		assertEquals(30,calc.plus(10, 20));
	}

}
