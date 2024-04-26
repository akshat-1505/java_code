package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class controlStaatement {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your nationality:");
        String str=br.readLine();
        if(str.equals("indian"))
        {
        	System.out.println("enter your age:");
        	int a=Integer.parseInt(br.readLine());
        	if(a>=18)
        	{
        		System.out.println("you are wligible for vote");
        	}
        	else
        	{
        		System.out.println("you are not eligible to vote");
        	}
        }
        else
        {
        	System.out.println("you are not eligible to vote");
        }
	}

}
