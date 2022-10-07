package com.user.pack2;
import java.util.Scanner;
public class Second
{
	private int add()
	{
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a:");
		a=(float)(sc.nextInt());
		System.out.println("enter the values of b:");
		b=(float)(sc.nextInt());
		c=a+b;
		return (int)c;
	}
	public static void main(String[] args)
	{
		Second s=new Second();
		System.out.println(s.add());
	}

}
