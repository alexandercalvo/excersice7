package com.learning.numbers;

public class PrimeNumbers {

	public static boolean checkPrimeNumber(int number) {
		int acount = 2;
		boolean prime = true;
		while (prime && acount != number) {
			if (number % acount == 0) {
				prime = false;
			}
			acount++;
		}
		return prime;
	}

}
