package program;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter values of a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After swapping: "+a+" "+b);
	}

}
