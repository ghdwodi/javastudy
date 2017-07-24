package com.hb.cm;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HamcrestTest {
	@Test
	public void test(){
		Calc calc = new Calc();
		assertThat("+ 테스트,",5,equalTo(calc.plus(2, 3)));
	}
}
