package com.arjendev.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arjendev.jenkins.Main;

public class TestCase {
	
	@Test
	public void testIsIntNumber() {
		assertTrue(Main.isInt("8"));
	}
	
	@Test
	public void testIsIntLetter() {
		assertFalse(Main.isInt("x"));
	}

}
