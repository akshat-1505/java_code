package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class bankdemo{
	String name;
	int pin;
	double a;
	int amm;
	void register() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		 name=br.readLine();
		 System.out.println("Enter your bank balance:");
		 amm=Integer.parseInt(br.readLine());
		 System.out.println("Enter your account number:");
		 a=Integer.parseInt(br.readLine());
		 System.out.println("creat your 4 digit pin:");
		 pin=Integer.parseInt(br.readLine());
	}
	void login() throws IOException{
		int b;
		int p;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter your account number:");
		 b=Integer.parseInt(br.readLine());
		 System.out.println("Enter your four digit pin:");
		 p=Integer.parseInt(br.readLine());
		 if(b==a && p==pin) {
			 System.out.println("choose: 1.withdraw \n2.depoiste \n3.checkbalance ");
			 int s;
			 s=Integer.parseInt(br.readLine());
			 switch(s) {
			 case 1:
				 System.out.println("Enter amount you want to withdraw:");
				 int x=Integer.parseInt(br.readLine());
				 amm-=x;
				 System.out.println("your current balance is:"+amm);
				 break;
			 case 2:
				 System.out.println("Enter amount you want to deposite:");
				 int w=Integer.parseInt(br.readLine());
				 amm+=w;
				 System.out.println("your current balance is:"+amm);
				 break;
			 case 3:
				
				 System.out.println("your current balance is:"+amm);
				 break;
			 }
		 }
		 else {
			 System.out.println("please check your acccount number or pin");
		 }
	}
}
public class bank {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
bankdemo b=new bankdemo();
b.register();
b.login();
	}

}
