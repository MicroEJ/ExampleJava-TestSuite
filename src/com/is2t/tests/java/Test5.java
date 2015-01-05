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
 * This test will fail but will be ignored.
 */
public class Test5 {
	
	public static void main1(String[] args) {
		Class<Test5> cl = Test5.class;
		CheckHelper.startCheck(cl);
		
		CheckHelper.check(cl, "ERROR", 1, 3);
		
		CheckHelper.endCheck(cl);		
	}
}
