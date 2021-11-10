package entities;

public class CCarro {
	private int quantity;

	public CCarro(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public int setQuantity(int quantity) {
		return this.quantity + quantity;
	}
	
	public double TotalPessoas() {
		return this.quantity + quantity;
	}
	public void addPessoas(int quantity) {
		this.quantity += quantity;
	}

	public void removePessoas (int quantity) {
		this.quantity -= quantity;
	}
	
}