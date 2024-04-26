package java_code;

import java.io.*;
import java.lang.*;
public class armstrong {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int org=a;
		int count=0,rem=0,sum=0;
		 while(a!=0)
		 {
			 count++;
			 a/=10;
		 }
		 
		 System.out.println("count: "+ count);
		 a=org;
		 while(a!=0)
		 {
			 rem=a%10;
			 sum += Math.pow(rem,count);
			 a/=10;
		 }
		 
		 System.out.println("Arm strong: "+sum );
		 
		 if(sum==org)
		 {
			 System.out.println("number is armstrong");
		 }
		 else {
			 System.out.println("number is not");
		 }

		 

	}

}
