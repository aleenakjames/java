package program;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] m1=new int[20][20];
		int[][] m2=new int[20][20];
		int[][] m3=new int[20][20];
		int r1,r2,c1,c2,i,j,k;
		System.out.print("Enter the value of r1 and c1: ");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.print("Enter the value of r2 and c2: ");
		r2=sc.nextInt();
		c2=sc.nextInt();
		System.out.print("enter the elements of matrix 1: \n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				m1[i][j]=sc.nextInt();
		}
		System.out.print("enter the elements of matrix 2:\n ");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
				m2[i][j]=sc.nextInt();
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(k=0;k<c1;k++)
					m3[i][j]=m3[i][j]+(m1[i][k]*m2[k][j]);
			}
		}
		System.out.print("multiplied matrix: \n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				System.out.print(m3[i][j]+" ");
			System.out.print("\n");
		}
	}

}
