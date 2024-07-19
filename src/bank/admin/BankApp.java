package bank.admin;
import java.util.Scanner;

import bank.service.RBI;
import bank.serviceimpl.Axis;

public class BankApp 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		RBI r = new Axis();
		
		boolean flag =true;
		
		while(flag)
		{
			System.out.println("***************");
			System.out.println("Welcome to Axis Bank : ");
			System.out.println("Enter 1 to create Account : ");
			System.out.println("Enter 2 to view Account Details : ");
			System.out.println("Enter 3 to deposite Money : ");
			System.out.println("Enter 4 to Withdraw Money :");
			System.out.println("Enter 5 to view Balance : ");
			System.out.println("Enter 6 to update Details : ");
			System.out.println("Enter 7 to Exit from Application : ");
			
			System.out.println("********------*******-------******");
			
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				r.createAccount();
				break;
			case 2:
				r.viewAccountDetails();
				break;
			case 3:
				r.depositeMoney();
				break;
			case 4:
				r.withdrawMoney();
				break;
			case 5 : 
				r.Showbalance();
				break;
			case 6 :
				r.updateDetails();
				break;
			case 7 :
				flag= false;
				break;
			default:
				break;
			}
			
			
			
		}
		
	}

}

