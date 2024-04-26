package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tokenizer_example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name,age,salary:");
		String str=br.readLine();
		
		StringTokenizer st=new StringTokenizer(str, ",");
		
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
        
		s1=s1.trim();	
        s2=s2.trim();	
        s3=s3.trim();	
        
        String name=s1;
        
        int age=Integer.parseInt(s2);
        
        float salary=Float.parseFloat(s3);
        
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
	}

}
