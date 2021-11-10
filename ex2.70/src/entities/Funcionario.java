package entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	
	
	public Double NetSalary() {
		return grossSalary - tax;
		
	}
	
	public void IncreaseSalary (double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
			}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
		
	}
}
