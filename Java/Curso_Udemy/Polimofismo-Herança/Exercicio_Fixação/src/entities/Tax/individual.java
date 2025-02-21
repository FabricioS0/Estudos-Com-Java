package entities.Tax;

public class individual extends TaxPayer {
	
	private double healthExpenditures;
	
	public individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double sum = 0;
		if(getAnualIncome() <= 20000) {
			if (healthExpenditures > 0) {
				sum = (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
			} else {
				sum = getAnualIncome() * 0.15;
			}
			
		} else {
			if (healthExpenditures > 0) {
				sum = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
			} else {
				sum = getAnualIncome() * 0.25;
			}
		}
		return sum;
		
	}
	
}
