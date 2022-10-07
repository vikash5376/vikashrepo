package com.sj.ptc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class BSA 
{
	static int c;
	static boolean flag;
	static double total=0;
	static Scanner sc= new Scanner(System.in);
	public static void seller()
	{
		System.out.println("List of Items Available at Shopping Mart are:\n1.Electronics\n2.Bath\r\n"+ "3.Kitchen\r\n"+ "4.Cloths\r\n");
		System.out.println("Press the Item number which you want to purchase: ");
		int btn=sc.nextInt();
		switch(btn)
		{
		case 1:
		{
			int[] arr=new int[2];
			int qty,i=0;
			do {
				flag= false;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
					Statement statement=connection.createStatement();
					ResultSet set=statement.executeQuery("Select * from product_info.electronics");
					while(set.next())
					{
						System.out.println(set.getInt(1)+"***********"+set.getString(2)+"********"+"Cost is"+"****"+set.getInt(3));
						arr[i]=set.getInt(1);
						i++;
					}
					System.out.println(" Enter your code:->....");
					c = sc.nextInt();
					if(!(c==arr[0]||c==arr[1])) 
					{ 
						System.out.println("Invalid Input Please Try Again ");
						flag=true;
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				electronic(c);
			} while(flag);
			break;
		}
		case 2:
		{
	    int[] arr=new int[2];
		int qty,i=0;
		do {
			flag= false;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
				Statement statement=connection.createStatement();
				ResultSet set=statement.executeQuery("Select * from product_info.bath");
				while(set.next())
				{
					System.out.println(set.getInt(1)+"***********"+set.getString(2)+"********"+"Cost is"+"****"+set.getInt(3));
					arr[i]=set.getInt(1);
					i++;
				}
				System.out.println(" Enter your code:->....");
				c = sc.nextInt();
				if(!(c==arr[0]||c==arr[1])) 
				{ 
					System.out.println("Invalid Input Please Try Again ");
					flag=true;
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			bath(c);
		} while(flag);
		break;
		}
		case 3:
		{
			int[] arr=new int[2];
			int qty,i=0;
			double cost=0.0;
			do {
				flag= false;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
					Statement statement=connection.createStatement();
					ResultSet set=statement.executeQuery("Select * from product_info.kitchen");
					while(set.next())
					{
						System.out.println(set.getInt(1)+"***********"+set.getString(2)+"********"+"Cost is"+"****"+set.getInt(3));
						arr[i]=set.getInt(1);
						i++;
					}
					System.out.println(" Enter your code:->....");
					c = sc.nextInt();
					if(!(c==arr[0]||c==arr[1])) 
					{ 
						System.out.println("Invalid Input Please Try Again ");
						flag=true;
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				kitchen(c);
			} while(flag);
			break;
		}
		case 4:
		{
			int[] arr=new int[2];
			int qty,i=0;
			do {
				flag= false;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
					Statement statement=connection.createStatement();
					ResultSet set=statement.executeQuery("Select * from product_info.cloth");
					while(set.next())
					{
						System.out.println(set.getInt(1)+"***********"+set.getString(2)+"********"+"Cost is"+"****"+set.getInt(3));
						arr[i]=set.getInt(1);
						i++;
					}
					System.out.println(" Enter your code:->....");
					c = sc.nextInt();
					if(!(c==arr[0]||c==arr[1])) 
					{ 
						System.out.println("Invalid Input Please Try Again ");
						flag=true;
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				cloth(c);
			} while(flag);
			break;
		}
		}
	}
	public static void electronic(int a) 
	{
		int[] cost=new int[2];
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("Select * from product_info.electronics");
			while(set.next())
			{
				cost[i]=set.getInt(3);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(a==101)
		{
			System.out.println("You have choosed pendrive....:");
			System.out.println(" Enter a number of quantity: ");
			int qty=sc.nextInt();
			System.out.println("----------------------------------");
			total =total+(qty*cost[0]);
		}
		if(a==102)
		{
			System.out.println("You have choosed Ram....:  ");
			System.out.println("Enter  A Number Of quantity:");
			int qty=sc.nextInt();
			System.out.println("------------------------------------");
			total=total+(qty*cost[1]);
		}
	}
	public static void bath(int a)
	{
		int[] cost=new int[2];
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("Select * from product_info.bath");
			while(set.next())
			{
				cost[i]=set.getInt(3);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(a==201)
		{
			System.out.println("You have choosed Bucket....:");
			System.out.println("Enter  Number of quantity :");
			int qty=sc.nextInt();
			System.out.println("------------------------------------");		  
			total=total+(qty*cost[0]); 
		}
		if(a==202)
		{
			System.out.println("You have choosed Mug....:");
			System.out.println("Enter  Number of quantity :");
			int qty=sc.nextInt();
			System.out.println("------------------------------------");
			total=total+(qty*cost[1]);
		}
	}
	public static void kitchen(int a) 
	{
		int[] cost=new int[2];
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("Select * from product_info.kitchen");
			while(set.next())
			{
				cost[i]=set.getInt(3);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(a==301) 
		{
			System.out.println("You have choosed Plate....:.");
			System.out.println("Enter  No of quantity: ");
			int qty= sc.nextInt();
			System.out.println("-----------------------------");
			total=total+(qty*cost[0]);
		}
		if(a==302) 
		{
			System.out.println("You have choosed spoon....:");
			System.out.println("Enter  No of quantity: ");
			int qty = sc.nextInt();
			System.out.println("-----------------------------");
			total=total+(qty*cost[1]);
		}
	}
	public static void cloth(int a)
	{
		int[] cost=new int[2];
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info","root","root");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("Select * from product_info.cloth");
			while(set.next())
			{
				cost[i]=set.getInt(3);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(a==401) 
		{
			System.out.println("You have choosed Jeans....:");
			System.out.println("Enter  no of quantity ");
			int qty = sc.nextInt();
			System.out.println("-----------------------------");
			total=total+(qty*cost[0]);
		}
		if(a==402)
		{
			System.out.println("You have choosed shirts....:");
			System.out.println(" Enter of quantity :");
			int qty=sc.nextInt();
			System.out.println("----------------------------------");
			total=total+(qty*cost[1]);
		}
	} 
	public static void main(String[] args) {
		int choice;
		BSA aobj= new BSA();
		do {
			seller();
			boolean invalid;
			{
				do {
					invalid=false; 
					System.out.println("Do You Want To Purchase More");
					System.out.println("Continue Press 1");
					System.out.println("Press 2 for Exit");
					choice=aobj.sc.nextInt();
					if(!(choice==1||choice==2))
					{
						System.out.println("Invalid Input Please Try Again  ");
						invalid=true;
					}
				} while(invalid);	
			}
		}while(choice==1);
		System.out.println("  Your Total Bill :- "+aobj.total);	
	} 
}
