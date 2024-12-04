package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Tax;

public class Taxpayers {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many taxpayers are you going to enter? ");
		int quantity = sc.nextInt();

		List<Tax> taxpayers = new ArrayList<>();

		for (int i = 0; i < quantity; i++) {
			System.out.println("\nEnter the data of the " + (i + 1) + "st contributor: ");
			sc.nextLine(); // Consome a quebra de linha pendente
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

			taxpayers.add(new Tax(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
		}

		for (int i = 0; i < taxpayers.size(); i++) {
			System.out.println();
			System.out.println((i + 1) + "st taxpayer summary: ");
			System.out.printf(taxpayers.get(i).toString());
			System.out.println();
		}

		sc.close();
	}
}
