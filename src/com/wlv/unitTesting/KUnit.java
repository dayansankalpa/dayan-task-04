package com.wlv.unitTesting;

import java.util.LinkedList;
import java.util.List;

public class KUnit {
	private static List<String> checks;
	private static double checksMade = 0;
	private static double passedChecks = 0;
	private static double failedChecks = 0;

	private static void addToReport(String txt) {
		if (checks == null) {
			checks = new LinkedList<String>();
		}
		checks.add(String.format("%04d: %s", checksMade++, txt));
	}
	public static void checkEquals(double value1, double value2) {
		if (value1 == value2) {
			addToReport(String.format(" %d == %d", value1, value2));
			passedChecks++;
		}else {
			addToReport(String.format(" %d == %d", value1, value2));
			failedChecks++;
		}
	}
	
	public static void checkNotEquals(double value1, double value2) {
		if (value1 != value2) {
			addToReport(String.format(" %d != %d", value1, value2));
			passedChecks++;
		}else {
			addToReport(String.format(" %d != %d", value1, value2));
			failedChecks++;
		}
	}
	
	public static void report() {
		System.out.printf("%d checks passed\n", passedChecks);
		System.out.printf("%d checks faild\n", failedChecks);
		System.out.println();
			
		for(String check : checks) {
			System.out.println(check);
		}
	}
}



