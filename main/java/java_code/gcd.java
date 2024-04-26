package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gcd {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=0;
        for(int i=1;i<=a&&i<=b;i++) {
        if(a%i==0 && b%i==0){
        	c=i;
        }
        }
        System.out.println(c+" ");
	}

}
