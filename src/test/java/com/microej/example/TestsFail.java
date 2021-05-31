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
 * This class is implementing tests that will fail during the testsuite
 * execution.
 */
public class TestsFail {

	@Test
	public static void testAssertTrue() {
		/* This test will fail because the condition is false */
		Assert.assertTrue(false);
	}

	@Test
	public static void testAssertEquals() {
		/* This test will fail because the condition numbers are not equal */
		Assert.assertEquals(1, 0);
	}
}
