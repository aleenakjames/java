package program;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the values of a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.print("Sum= "+sum);
	}

}
