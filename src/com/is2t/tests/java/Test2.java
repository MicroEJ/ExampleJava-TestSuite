/*
 * Java
 *
 * Copyright 2013 IS2T. All rights reserved.
 * For demonstration purpose only.
 * IS2T PROPRIETARY. Use is subject to license terms.
 */
package com.is2t.tests.java;

import com.is2t.testsuite.support.CheckHelper;

/**
 * This test will succeed.
 */
public class Test2 {

	public static void main(String[] args) {
		Class<Test2> cl = Test2.class;
		CheckHelper.startCheck(cl);
		
		CheckHelper.check(cl, "ERROR", 1, 1);
		
		CheckHelper.endCheck(cl);
	}
	
}
