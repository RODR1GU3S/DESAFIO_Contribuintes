package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Tax;

public class Taxpayers {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many taxpayers are you going to enter? ");
		int quantity = sc.nextInt();

		Tax[] tax = new Tax[quantity];

		for (int i = 0; i < tax.length; i++) {
			System.out.println("\nEnter the data of the " + (i + 1) + "st contributor: ");
			sc.nextLine();
			System.out.print("Annual income from salary: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Annual income from services rendered: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Annual income from capital gains: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Medical expenses: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Educational expenses: ");
			double educationSpending = sc.nextDouble();

			tax[i] = new Tax(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
		}

		for (int i = 0; i < tax.length; i++) {
			System.out.println();
			System.out.println((i + 1) + "st taxpayer summary: ");
			System.out.printf(tax[i].toString());
			System.out.println();
		}

		sc.close();
	}
}
