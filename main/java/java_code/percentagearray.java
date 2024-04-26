package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percentagearray {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter number of subjects:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int marks[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks:");
			marks[i]=Integer.parseInt(br.readLine());
		}
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=marks[i];
		}
		System.out.println("total marks:"+total);
		float per=(float)(total*100/(n*100));
		System.out.println("percentage:"+per);
	}

}
