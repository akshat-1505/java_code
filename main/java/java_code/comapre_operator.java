package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class comapre_operator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two values:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		boolean c= a==b;
		boolean d= a!=b;
		boolean e= a>=b;
		boolean f= a<=b;
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
	}
}
