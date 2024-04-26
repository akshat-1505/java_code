package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ternary {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two values:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int max=(a>b)?a:b;
		System.out.println("max:"+max);
	}

}
