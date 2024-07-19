package bank.serviceimpl;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bank.conf.Hibernate_con;
import bank.model.Account;
import bank.service.RBI;

public class Axis implements RBI
{
	Scanner sc =new Scanner(System.in);
	
	Account ac=null;
	
	public void createAccount() 
	{
		System.out.println("Welcome to Account opening Section of Axis Bank");
		System.out.println("*****------*******-----****");
		System.out.println();
		ac=new Account();
		
		System.out.println("Enter Account number to create");
		ac.setAcno(sc.nextLong());
		
		System.out.println("Enter your name ");
		ac.setAcname(sc.next()+sc.nextLine());
		
		System.out.println("Enter Your Address");
		ac.setAcAddress(sc.next());
		
		System.out.println("Enter your AadharNo");
		ac.setAadharNo(sc.nextLong());
		
		System.out.println("Enter Your PANNO");
		ac.setPanNo(sc.next());
		
		System.out.println("Enter Your MobileNo");
		ac.setMobileNo(sc.nextLong());
		
		System.out.println("Enter Your Gender");
		ac.setGender(sc.next());
		
		System.out.println("Enter your Balance");
		ac.setBalance(sc.nextDouble());
		
		SessionFactory sf = Hibernate_con.getSessionFactory();
		Session session = sf.openSession();
		session.save(ac);
		session.beginTransaction().commit();
		System.out.println();
		System.out.println("Account created Successfully....!");
		System.out.println("Thank you for Visting");
		System.out.println("********************");
		System.out.println();
		
	}

	public void viewAccountDetails() {
		
		SessionFactory sf = Hibernate_con.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("Enter account number to see the details ");
		long acno = sc.nextLong();
		
		Account ac = session.get(Account.class, acno);
		
		if(ac!=null)
		{
			System.out.println();
			System.out.println("Account Number : "+ac.getAcno());
			System.out.println("Account Holder Name : "+ac.getAcname());
			System.out.println("Account Holder Address :"+ac.getAcAddress());
			System.out.println("Account Aadhar No : "+ac.getAadharNo());
			System.out.println("Account PANNO : "+ac.getPanNo());
			System.out.println("Account MObile No : "+ac.getMobileNo());
			System.out.println("Gender : "+ac.getGender());
			System.out.println("Account Saving balance : "+ac.getBalance());
			
			System.out.println();
		}
		else {System.out.println();
			System.out.println("Account not found with this acc number:"+ acno);
			System.out.println();
		}
		
		session.save(ac);
		session.beginTransaction().commit();
	}

	
	public void depositeMoney() 
	{
		SessionFactory sf = Hibernate_con.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("Enter account number to deposite money");
		long acno = sc.nextLong();
		
		Account ac = session.get(Account.class, acno);
		
		
		if(ac!=null)
		{
			double avbal = ac.getBalance();
			
			System.out.println("enter Amount to Deposite");
			double depomo = sc.nextDouble();
			
			if(depomo>1000 && depomo<=50000)
			{
				double newbalance = avbal+depomo;
				ac.setBalance(newbalance);
				
				System.out.println("Amount deposite Successfull.....!");
				System.out.println();
				session.beginTransaction().commit();
				
			}
			else {
				System.out.println();
				System.out.println("Please Enter Amount between 1000 to 50000 ");
				System.out.println("*******************");
			}
			
			
	}
	}

	public void withdrawMoney() {
		SessionFactory sf = Hibernate_con.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("enter your account number to withdraw money:");
		long acno = sc.nextLong();
		Account ac = session.get(Account.class, acno);
		if(ac!=null)
		{
			double avbal = ac.getBalance();
			
			System.out.println("enter Amount to withdraw money");
			double wamo = sc.nextDouble();
			
			if(wamo>100 && wamo<100000)
			{
				double newbalance = avbal-wamo;
				ac.setBalance(newbalance);
				
				System.out.println("Amount withdraw Successfull.....!");
				System.out.println();
				session.beginTransaction().commit();
				
			}
			else {
				
				System.out.println("Please Enter Amount between 100 to 100000 ");
			}
			
		}
		 
	}

	public void Showbalance() {
		SessionFactory sf= Hibernate_con.getSessionFactory();
		Session session = sf.openSession();
		System.out.println("enter account number to see the details:");
		long l = sc.nextLong();
		
		Account ac = session.get(Account.class, l);
		
		if(ac!=null)
		{
			System.out.println("Your Saving Account Balance is : rs "+ac.getBalance());
			System.out.println();
		}
		else {
			System.out.println("Create Account then come back");
		}
		session.beginTransaction().commit();
		
		
	}

	public void updateDetails() 
	{
		SessionFactory sf = Hibernate_con.getSessionFactory();
		Session session = sf.openSession();
		
		System.out.println("enter your account no to update details:");
		long l = sc.nextLong();
		Account ac = session.get(Account.class,l);
		if(ac!=null)
		{
			
			System.out.println("Enter your name ");
			ac.setAcname(sc.next()+sc.nextLine());
			
			System.out.println("Enter Your Address");
			ac.setAcAddress(sc.next());
			
			System.out.println("Enter your AadharNo");
			ac.setAadharNo(sc.nextLong());
			
			System.out.println("Enter Your PANNO");
			ac.setPanNo(sc.next());
			
			System.out.println("Enter Your MobileNo");
			ac.setMobileNo(sc.nextLong());
			
			System.out.println("Enter Your Gender");
			ac.setGender(sc.next());
			
			System.out.println("Enter your Balance");
			ac.setBalance(sc.nextDouble());
		}
		System.out.println("details updated.....");
		session.save(ac);
		session.beginTransaction().commit();
		
	}


}
