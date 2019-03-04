package ecommerce.registration;


	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	import ecommerce.customer.Customer;


	public class Registration {
		static String custName;
		static String pwd;
		static ArrayList<Customer> list=new ArrayList<Customer>();	
		public static void setInfo() throws IOException, ClassNotFoundException {
			Scanner sc=new Scanner(System.in);
			Customer customer=new Customer();
			int ch;
			ch=sc.nextInt();
			System.out.println(" enter your choice 1.new customer\n 2.Existing customer");
			switch(ch)
			{
			case 1:
			
			System.out.println("enter customer name");
			customer.setCustName(sc.next());
			
			System.out.println("enter Aadhar card");
			customer.setAadhar(sc.nextLong());
			
			System.out.println("enter address");
			customer.setAddress(sc.next());
			
			System.out.println("enter phone number");
			customer.setPhone(sc.nextLong());
			
			System.out.println("enter password");
			customer.setPassword(sc.next());
		
			
			System.out.println("");
			list.add(customer);
			break;
			case 2:
				System.out.println("enter customer name");
				customer.setCustName(sc.next());
				System.out.println("enter password");
				customer.setPassword(sc.next());
			    System.out.println("succeful login");
			}
			
		}
		
			
		
		public static void main(String args[]) throws ClassNotFoundException, IOException {
			Registration register=new Registration();
			register.setInfo();
		}
	}


