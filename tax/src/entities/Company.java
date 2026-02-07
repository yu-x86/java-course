package entities;


public final class Company extends TaxPayer{
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public final Double totalTax() {
		double sum = 0.0;
		if(numberOfEmployees > 10) {
			sum += (income * (14.0/100.0));
		} else {
			sum += (income * (16.0/100.0));
		}
		return sum;
	}
}
