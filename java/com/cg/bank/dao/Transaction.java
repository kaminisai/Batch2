package com.cg.bank.dao;

public interface Transaction {
	public boolean withdraw();
	public boolean deposit();
	public int transfer();
	public int balance();
	
}
