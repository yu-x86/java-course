package entities;


public final class Individual extends TaxPayer{
	protected Double healthExpenditures;
	
	public Individual() {
		super();
	}

	
	public Individual(String name, Double income, Double healthExpenditures) {
		super(name, income);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public final Double totalTax() {
		double sum = 0.0;
		if(income >= 20000.00) {
			sum += (income * (25.0/100.0)) - (healthExpenditures * (50.0/100.0));
		} else {
			sum += (income * (15.0/100.0)) - (healthExpenditures * (50.0/100.0));
		}
		return sum;
	}
	
	
}
