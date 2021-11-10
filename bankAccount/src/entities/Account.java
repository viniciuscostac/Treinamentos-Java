package entities;

public class Account {
	
	private int account;
	private String name;
	private double deposite;
	private double withdraw;

	public Account() {
		
	}

	public Account(int account, String name, double deposite, double withdraw) {
		super();
		this.account = account;
		this.name = name;
		this.deposite = deposite;
		this.withdraw = withdraw;
	}
	
	
