package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jackedarray {
	public static void main(String[] args) throws IOException{
		int x[][]=new int[2][];
		x[0]=new int[2];
		x[1]=new int[3];
		x[0][1]=10;
		x[1][0]=10;
		x[1][1]=10;
		x[1][2]=10;
		for(int i=0;i<2;i++)
		{
			System.out.print(x[0][i]+" ");
		}
		System.out.println( );
		for(int i=0;i<3;i++)
		{
			System.out.print(x[1][i]+" ");
		}
	}
}
