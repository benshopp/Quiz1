package main;

import java.util.Scanner;

public class QBrating {
	public static void main(String[] args){
		/**
		 * Takes in user inputs for each statistic
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("TD:");
		double TD = scanner.nextInt();

		System.out.println("Yards:");
		double Yards = scanner.nextInt();

		System.out.println("INT:");
		double INT = scanner.nextInt();

		System.out.println("comp:");
		double comp = scanner.nextDouble();

		System.out.println("ATT:");
		double ATT = scanner.nextInt();
		
		scanner.close();
		
		/**
		 * calculates the qb rating
		 */
		
		double a = ((comp / ATT) * 5);
		double b = ((Yards / ATT) * .25);
		double c = ((TD / ATT) * 20);
		double d = (2.375 - ((INT / ATT) * 25));

		double rating = (((a + b + c + d) / 6) * 100);


		System.out.println("QB rating:" + rating);
		
	}
}
