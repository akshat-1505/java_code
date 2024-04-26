package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bitwise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two values:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		System.out.println("a&b"+(a&b));
		System.out.println("a|b"+(a|b));
		System.out.println("a^b"+(a^b));
		System.out.println("~b"+(~b));
		System.out.println("a<<b"+(a<<1));
		System.out.println("a>>"+(a>>1));
	}

}
