package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class array2d {

	public static void main(String[] args){
		System.out.println("Enter number rows and columns:");
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter elements of matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements of matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
