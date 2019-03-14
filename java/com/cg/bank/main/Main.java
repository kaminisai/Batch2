package com.cg.bank.main;

import java.util.Scanner;

import com.cg.bank.beans.Customer_details;
import com.cg.bank.dao.Credential;
import com.cg.bank.service.CredentialImpl;

public class Main {

static	Scanner sc=new Scanner(System.in);
	static Customer_details cust=new Customer_details();
	
	public static void main(String args[]) {
		System.out.println("Welcome to online Banking transaction");
		while(true) {
			System.out.println("1:- Registration \n 2:- login \n 3:- exit");
			Credential cred=new CredentialImpl();
			int in=sc.nextInt();
			
			switch(in) {
			case 1:
				System.out.println("Enter the acc no");
				cust.setAcc_no(sc.next());
				
				System.out.println("Enter the first name");
				cust.setFirst_name(sc.next());
				
				System.out.println("Enter the last name");
				cust.setLast_name(sc.next());
				
				System.out.println("Enter the email_id");
				cust.setEmail_id(sc.next());
				
				System.out.println("Enter the password");
				cust.setPassword(sc.next());
				
				System.out.println("Enter the pancard no");
				cust.setPancardNo(sc.next());
				
				System.out.println("Enter the aadhar card number");
				cust.setAadhar_no(sc.next());
				
				System.out.println("Enter the address");
				cust.setAddress(sc.next());
			
				System.out.println("Enter the mobile number");
				cust.setMobile_no(sc.next());
				
				System.out.println("Enter the balance");
				cust.setBalance(sc.nextFloat());
				
				cred.registration();
				
				
			}
			
		}
		
		}
}
