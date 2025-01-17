package entidades;

public class funcionario {
	public String name;
	public Double grossSalary;
	public double tax;
	
	public double newSalary() {
		double salary = grossSalary - tax;
		return salary;
	}
	public void increseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", newSalary());
	}
}
