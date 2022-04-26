package program;

import java.util.Scanner;

public class palindroms {

	public static void main(String[] args) {
		String rev ="",a;
		int len;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		a=sc.next();
		len=a.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		if(rev.equals(a))
			System.out.print(a+" is palindrome");
		else
			System.out.print(a+" is not palindrome");

	}

}
