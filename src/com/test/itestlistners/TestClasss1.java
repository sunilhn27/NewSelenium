package com.test.itestlistners;

import org.testng.annotations.Test;

public class TestClasss1 {

	@Test(priority = 1)
	public void test1() {
		System.out.println("Tests 1");
	}

	@Test(priority = 2)
	public void test2() {
		System.out.println("Tests 2");
	}

	@Test(priority = 3)
	public void test3() {
		System.out.println("Tests 3");
	}

	@Test(priority = 4)
	public void test4() {
		System.out.println("Tests 4");
	}

	@Test(priority = 5)
	public void test5() {
		System.out.println("Tests 5");
	}
}
