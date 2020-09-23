package com.learning.console;

import java.util.Scanner;

import com.learning.numbers.PrimeNumbers;

public class TestConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("por favor ingrese un numero:");
		int numberToEvaluate = scanner.nextInt();
		scanner.close();
		if(PrimeNumbers.checkPrimeNumber(numberToEvaluate)) {
			System.out.println("el numero: ["+numberToEvaluate+"] es primo");
		}else {
			System.out.println("el numero: ["+numberToEvaluate+"] es compuesto");
		}
	}
}
