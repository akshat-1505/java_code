package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignmentoperator {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter values of a and b");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("a+b:"+ (a+=b));
		System.out.println("a-b:"+ (a-=b));
		System.out.println("a*b:"+ (a*=b));
		System.out.println("a/b:"+ (a/=b));
		System.out.println("a%b:"+ (a%=b));
	}
}
