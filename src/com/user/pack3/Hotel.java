package com.user.pack3;
import java.util.Scanner;

public class Hotel
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int adult=0,child=0,fMember;
		String hName,tRoom;
		float price;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to shimla");
		System.out.println("Hotels available in shimla are:\n 1.Marigold Sarovar Portico Shimla.\n 2.Radisson Jass Shimla.");
		System.out.println("Enter the total members in a Family:");
		fMember=sc.nextInt();
		int[] age=new int[fMember];
		System.out.println("Enter the age of each family member:");
		for(int i=0;i<fMember;i++)
		{
			age[i]=sc.nextInt();
		}
		for(int j=0;j<fMember;j++)
		{
		    if(age[j]>10)
		    {
		    	adult++;
		    }
		    else
		    {
		    	child++;
		    }
		}
		System.out.println("choose hotel by name:");
		hName=sc.next();
		String s1="Marigold Sarovar Portico Shimla";
		String s2="Radisson Jass Shimla";
		if(hName.equals(s1))
		{
			System.out.println("Types of rooms available are:\n1.AC --------3000\n2.Non AC----------2500");
			System.out.println("\n and for each room 2 adults and 2 child can accomodate.");
			System.out.println("Enter the type of Room which you want to avail:");
			tRoom=sc.nextLine();
			if((fMember<=4) && (tRoom.equals("AC")))
			{
				System.out.println("Price =3000");
			}
			else if((fMember<=4) && (tRoom.equals("Non AC")))
			{
				System.out.println("Price =2500");
			}
			else if((fMember>4 && fMember<=8) && (tRoom.equals("AC")))
			{
				System.out.println("Price =6000");
			}
			else if((fMember>4 && fMember<=8) && (tRoom.equals("Non AC")))
			{
				System.out.println("Price =5000");
			}
		}
		if(hName.equals(s2))
		{
			System.out.println("Types of rooms available are:\n1.AC --------3000\n2.Non AC----------2500");
			System.out.println("\n and for each room 2 adults and 2 child can accomodate.");
			System.out.println("Enter the type of Room which you want to avail:");
			tRoom=sc.nextLine();
			if((fMember<=4) && (tRoom.equals("AC")))
			{
				System.out.println("Price =3000");
			}
			else if((fMember<=4) && (tRoom.equals("Non AC")))
			{
				System.out.println("Price =2500");
			}
			else if((fMember>4 && fMember<=8) && (tRoom.equals("AC")))
			{
				System.out.println("Price =6000");
			}
			else if((fMember>4 && fMember<=8) && (tRoom.equals("Non AC")))
			{
				System.out.println("Price =5000");
			}
	    }
    }
}