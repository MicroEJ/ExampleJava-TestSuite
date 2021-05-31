/*
 * Java
 *
 * Copyright 2021 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 */
package com.microej.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is implementing tests that will pass during the testsuite
 * execution.
 */
public class TestsPass {

	@Test
	public static void testMultiplierEquals() {
		/* This test will pass because 2x2 = 4 */
		Assert.assertEquals(4, Multiplier.multiplyByTwo(2));
	}

	@Test
	public static void testMultiplierNotEquals() {
		/* This test will pass because 2x2 != 2 */
		Assert.assertNotEquals(2, Multiplier.multiplyByTwo(2));
	}

	@Test
	public static void testAssertFalse() {
		/* This test will pass because the condition is false */
		Assert.assertFalse(false);
	}

	@Test
	public static void testEquals() {
		/* This test will pass because the two parameters are the same */
		Assert.assertEquals(2, 2);
	}

	@Test
	public static void testNotEqual() {
		/* This test will pass because the two parameters are different */
		Assert.assertNotEquals(3, 2);
	}

	@Test
	public static void testNull() {
		/* This test will pass because the Object is null */
		Assert.assertNull(null);
	}

	@Test
	public static void testEmpty() {
		/* This test does nothing */
	}
}
