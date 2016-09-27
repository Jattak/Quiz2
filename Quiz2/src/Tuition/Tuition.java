package Tuition;

import java.util.Scanner;

public class Tuition {

	public class TuitionCalculator {
		private int iCost;
		private int iIncrease;

		Scanner input = new Scanner(System.in);
		{
			System.out.println("How much is your original tuition rate? ");
			iCost = (int) input.nextDouble();
			System.out.println("How much does your tuition plan to increase percentage wise? ");
			iIncrease = (int) input.nextDouble();
		}

		public int iTuitionCalc(int iCost, int iIncrease) {
			int x;
			for (x = 0, x > 4, ++x); {
				int payment = iCost + (iCost * (iIncrease / 100));
				return payment;}
		}

	}
}

