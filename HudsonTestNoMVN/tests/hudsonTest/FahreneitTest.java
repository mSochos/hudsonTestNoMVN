package com.maersk.fahreneitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import hudsonTest.Fahreneit;

public class FahreneitTest {

	@Test
	public void test1() {
		assertEquals("failed test 1", 0, Fahreneit.convertFahrToCelcius(32),3);
	}

}
