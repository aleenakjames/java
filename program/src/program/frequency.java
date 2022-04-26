package program;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		String word="";
		int len;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		word=sc.next();
		len=word.length();
		int[] f=new int[len];
		char str[]=word.toCharArray();
		for(int i=0;i<len;i++)
		{
			f[i]=1;
			for(int j=i+1;j<len;j++)
			{
				if(str[i]==str[j])
				{
					f[i]++;
					str[j]='0';
				}
			}
			
		}
		for(int i1=0;i1<f.length;i1++)
		{
			if(str[i1]!='\0'&&str[i1]!='0')
		System.out.print("\nFrequency of "+str[i1]+"= "+f[i1]);
		}
		

	}

}
