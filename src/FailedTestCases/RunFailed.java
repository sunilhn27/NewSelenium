package FailedTestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunFailed {

	public static void main(String[] args) {

		TestNG runner = new TestNG();

		List<String> list = new ArrayList<>();

		list.add("F:\\Selenium The Grand Final\\Basics\\test-output\\Suite\\testng-failed.xml");

		runner.setTestSuites(list);
		runner.run();
		System.out.println("success");

	}
}
