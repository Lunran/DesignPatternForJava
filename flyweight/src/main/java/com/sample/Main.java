package com.sample;

class Main {
	public static void main(String args[]) {
		String digits = "1212123";
		if (args.length >= 1) {
			digits = args[0];
		}

		BigString[] bsarray = new BigString[100];

		printMemoryUsage();

		for (int i=0; i<100; i++) {
			bsarray[i] = new BigString(digits, true);
		}

		printMemoryUsage();
	}

	private static void printMemoryUsage() {
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("使用メモリ = " + used);
	}
}
