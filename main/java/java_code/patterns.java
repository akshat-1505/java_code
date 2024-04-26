package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class patterns {
	public static void main(String[] args) throws IOException {
		int i,j,k;
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=4;j++)
			{
				System.out.print(j);
			}
			System.out.println( );
		}
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println( );
		}
		for(i=0;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println( );
		}
		for(i=0;i<=4;i++)
		{
			for(j=4-i;j>=0;j--)
			{
				System.out.print(j);
			}
			System.out.println( );
		}
		
		System.out.print("_________________");
		System.out.println();
		//diamond
		
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k!=2*i+1;k++)
			{
				if(k==0 || k==2*i ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
		for(i=5;i>=0;i--)
		{
			for(j=0;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k!=2*i+1;k++)
			{
				if(k==0 || k==2*i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
		System.out.print("_________________");
		System.out.println();
		//plus
		
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k!=2*i+1;k++)
			{
				if(i==5 || k==i || i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
		for(i=5;i>=0;i--)
		{
			for(j=0;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k!=2*i+1;k++)
			{
				if(i==5 || k==i || i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
		
		
		System.out.print("_________________");
		System.out.println();
		
		for(i=0;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				if(j==5||i==0||i==j||j==5||i==5) {
				System.out.print(j+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println( );
		}
}
}