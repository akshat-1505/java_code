package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dowhile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int i= 1;
		int sum=0;
		do {
			System.out.println("enter numbers:");
			a = Integer.parseInt(br.readLine());
			if (a<0)
				continue;
			sum+=a;
			i++;
		}while(i<=10);
		System.out.println("sum of number: "+sum);
		}
}
