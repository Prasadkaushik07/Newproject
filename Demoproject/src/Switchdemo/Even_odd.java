package Switchdemo;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number");
		int a=sc.nextInt();
		int num=a%2;
		switch(num)
		{
		case 0:
			System.out.println(a+" is Even number");
			break;
		case 1:
			System.out.println(a+" is Odd number");
		}
	 }
  }
