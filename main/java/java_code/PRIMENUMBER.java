package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRIMENUMBER {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number:");
		int a=Integer.parseInt(br.readLine());
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("is  a prime number:");
		}
		else {
			System.out.println("is not a prime number:");
		}
	}

}
