package entities;

public class Tax {

	public static final Double SERVICESTAX = 0.15;
	public static final Double CAPITALTAX = 0.20;
	public static final Double TAXREBATE = 0.30;

	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public Tax(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,	double educationSpending) {

		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public double salaryTax() {

		double salaryTax = 0.00;
		if (salaryIncome < 36000.00) {

		} else if (salaryIncome < 60000.00) {
			return salaryTax = salaryIncome * 0.10;
		} else {
			return salaryTax = salaryIncome * 0.20;
		}
		return salaryTax;
	}

	public double servicesTax() {
		double servicesTax = servicesIncome * SERVICESTAX;
		return servicesTax;
	}

	public double capitalTax() {
		double capitalTax = capitalIncome * CAPITALTAX;
		return capitalTax;
	}

	public double grossTax() {
		double grossTax = salaryTax() + servicesTax() + capitalTax();
		return grossTax;
	}

	public double taxRebate() {
		double taxRebate = 0.00;
		if ((healthSpending + educationSpending) > grossTax()) {
			taxRebate = grossTax() * TAXREBATE;
		} else {
			taxRebate = healthSpending + educationSpending;
		}
		return taxRebate;
	}

	public double netTax() {
		double netTax = grossTax() - taxRebate();
		return netTax;
	}

	@Override
	public String toString() {
		return String.format("Total gross tax: %.2f\n", grossTax())
				+ String.format("Deduction: %.2f\n", taxRebate())
				+ String.format("Tax due: %.2f\n ", netTax());
	}
}
