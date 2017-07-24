package com.hb.bm;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value=Suite.class)
@SuiteClasses(value = {TestCase1.class, TestCase2.class, TestCase3.class})
public class TestSuite {
	
}
