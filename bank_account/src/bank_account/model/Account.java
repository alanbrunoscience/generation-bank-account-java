package bank_account.model;

import bank_account.utils.TextUtils;

public abstract class Account {

	// Declaring Class Attributes
	private int accountNumber;
	private int branchNumber;
	private String holderName;
	private float balance;

	// Constructor Method: used to initialize class objects with default values
	public Account(int accountNumber, int branchNumber, String holderName, float balance) {
		this.accountNumber = accountNumber;
		this.branchNumber = branchNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// Getters and Setters
	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBranchNumber() {
		return this.branchNumber;
	}

	public void setBranchNumber(int branchNumber) {
		this.branchNumber = branchNumber;
	}

	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(String holderName) {
		if (holderName == null || holderName.trim().isEmpty()) {
			throw new IllegalArgumentException("\n-> Invalid name! The name mustn't be empty or blank.");
		}
		this.holderName = TextUtils.toTitleCase(holderName);
	}

	public float getBalance() {
		return this.balance;
	}

	public void setBalance(float balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("\n-> Invalid balance! The balance mustn't be negative.");
		}
		this.balance = balance;
	}

	// Auxiliary Methods
	public boolean withdraw(float amount) {
		if (this.getBalance() < amount) {
			System.out.println("\n-> Insufficient Balance!");
			return false;
		}

		this.setBalance(this.getBalance() - amount);
		return true;

	}

	public void deposit(float amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("\n-> Invalid amount! The amount must be greater than 0.");
		}

		this.setBalance(this.getBalance() + amount);
	}

	public abstract String getAccountType();

	public abstract void displaySpecificDetails();

	public void displaysInfo() {

		System.out.println("\n\n**************************************************");
		System.out.println("                  Account Details                 ");
		System.out.println("**************************************************\n");
		System.out.printf("→ Account number: %d;%n", this.getAccountNumber());
		System.out.printf("→ Branch number: %d;%n", this.getBranchNumber());
		System.out.printf("→ Type: %s;%n", this.getAccountType());
		System.out.printf("→ Holder's name: %s;%n", this.getHolderName());
		System.out.printf("→ Balance: US$ %.2f;%n", this.getBalance());

		this.displaySpecificDetails();

		System.out.println("**************************************************");

	}

}