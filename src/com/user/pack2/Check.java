package com.user.pack2;
import java.util.Scanner;
public class Check
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the two number:");
		Scanner sc=new Scanner(System.in);
		int a,b,count1=0,count2=0,count3=0;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b)
		{
		    for(;a<=b;a++)
		    {
			    if(a%3==0)
			    {
				count1++;
			    }
			    if(a%4==0)
			    {
			    	count2++;
			    }
			    if(a%5==0)
			    {
			    	count3++;
			    }
		    }
		}
		else
		{
			for(;b<=a;b++)
			{
				if(b%3==0)
				{
				   count1++;
				}
				if(b%4==0)
				{
				   count2++;
				}
				if(b%5==0)
				{
				   count3++;
			    }
			}
		}	
		System.out.println("total nuber divisble by 3 between "+a+"and"+b+"are"+count1);
		System.out.println("total nuber divisble by 4 between "+a+"and"+b+"are"+count2);
		System.out.println("total nuber divisble by 5 between "+a+"and"+b+"are"+count3);
	}
}


