package main;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		double a = 5.6;
		double b = 3.8;
		double c = a + b;

		BigDecimal bigA = BigDecimal.valueOf(a);
		BigDecimal bigB = BigDecimal.valueOf(b);

		BigDecimal bigC = bigA.add(bigB);

		System.out.println(c); // affiche 9.399999999999999
		System.out.println(bigC); // affiche 9.4

	}

}
