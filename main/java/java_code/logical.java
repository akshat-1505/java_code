package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class logical {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("three two values:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		boolean d= a==b && a==c;
		boolean e= a==b && b==c;
		boolean f= a==b && a!=c;
		boolean g= a!=b && a==c;
		boolean h= a==b || a==c;
		boolean i= a==b || b==c;
		boolean j= a==b || a!=c;
		boolean k= a!=b || a==c;
		boolean l= !(a==5);
		boolean m= !(a>=5);
		boolean n= !(a<=5);
		boolean o= !(a!=5);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("g:"+g);
		System.out.println("h:"+h);
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		System.out.println("k:"+k);
		System.out.println("l:"+l);
		System.out.println("m:"+m);
		System.out.println("n:"+n);
		System.out.println("o:"+o);
	}
}
