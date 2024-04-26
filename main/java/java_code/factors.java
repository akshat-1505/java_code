package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factors {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number:");
		int a=Integer.parseInt(br.readLine());
				for(int i=1;i<=a;i++)
				{
					if(a%i==0){
						System.out.println(i+" ");
					}
				}
}
}