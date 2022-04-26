package program;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the values of a,b and c: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.print(a+" is greater");
		}
		else if(b>a&&b>c)
			System.out.print(b+" is greater");
		else
			System.out.print(c+" is greater");
	}

}
