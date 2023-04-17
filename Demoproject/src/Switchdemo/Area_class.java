package Switchdemo;

import java.util.Scanner;

public class Area_class {

	public static void main(String[] args) {
		System.out.print("1-Circle\n2-Rectangle\n Please enter a number:");
		Scanner scan=new Scanner(System.in);
		int choice = scan.nextInt();
		
		if(choice==1)
		{
			System.out.println("Please enter the radius of the circle:");
			double r = scan.nextDouble();
			double area = Math.PI* r *r;
			System.out.print("Area:" + area);
		}
		else if(choice == 2)
		{
			System.out.print("Please enter the length of the rectangle:");
			double l=scan.nextDouble();
			System.out.println("Please enter the width of the rectangle:");
			double w = scan.nextDouble();
			
			double area =1*w;
			System.out.println("Area:"+ area);
		}
		else
		{
			System.out.println("You entered an invalid choice!");	
		}
	}
}
