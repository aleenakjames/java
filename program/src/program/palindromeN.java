package program;

import java.util.Scanner;

public class palindromeN {

	public static void main(String[] args) {
		int a, rev=0,r,temp;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number: ");
		a=sc.nextInt();
		temp=a;
		while(a!=0)
		{
			r=a%10;
			rev=(rev*10)+r;
			a=a/10;
		}
		if(temp==rev)
			System.out.print(temp+" is palindrome");
		else
			System.out.print(temp+" is not palindrome");
	}

}
