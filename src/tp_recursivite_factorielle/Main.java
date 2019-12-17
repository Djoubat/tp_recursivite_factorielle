package tp_recursivite_factorielle;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Entrez l'entier n svp :");
		Scanner sc = new Scanner(System.in);
		BigInteger res;
		try {
			int n = sc.nextInt();

			if (n < 0)
				throw new IllegalArgumentException("le n doit être positive!!");

			res = factorialWithRecursion(n);

			System.out.println(n + "! = " + res);
			System.out.println("Long max value = " + Long.MAX_VALUE);
			System.out.println("25! = 1 551 121 004 333 098 598 400 000 0");
		} catch (InputMismatchException e) {
			throw new IllegalArgumentException("Le n doit être un entier positive");
		} finally {
			sc.close();
		}

	}

	public static BigInteger factorialWithoutRecursion(int n) {

		BigInteger res = new BigInteger(String.valueOf(1));

		for (int i = 1; i <= n; i++) {
			res = res.multiply(new BigInteger(String.valueOf(i)));
		}

		return res;
	}

	public static BigInteger factorialWithRecursion(int n) {

		if (n >= 1)
			return factorialWithRecursion(n - 1)
					.multiply(new BigInteger(String.valueOf(n)));

		return new BigInteger(String.valueOf(1));
	}

}
