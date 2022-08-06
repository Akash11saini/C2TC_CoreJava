package com.acharya.FrameWork;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	private static final float MINBAL = 2000.0f;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float accBal) {
		System.out.println("Your balance after withdrawing is Rs."+ accBal);
	}
	
	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	

}
