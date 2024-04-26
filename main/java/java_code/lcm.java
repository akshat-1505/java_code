package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lcm {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
        int c=0;
        int max=(a>b)?a:b;
        while(true) {
        	if(max%a==0 && max%b==0) {
        		System.out.println(max+" ");
                break;
        	}
        	max++;
        }
	}

}
