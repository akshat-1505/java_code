package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcode {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name:");
		String str=br.readLine();
		System.out.println("Enter 1:for fictional books \n2:for suspence-mystrey books \n3:comics \n4:adventure");
		int a=Integer.parseInt(br.readLine());
		switch(a)
		{
		case 1:
			System.out.println("books available:");
			System.out.println("Whispers in the Mist\"\r\n"
					+ "\"Shadow of the Crescent Moon\"\r\n"
					+ "\"The Forgotten Key\"\r\n"
					+ "\"Beyond the Veil of Stars\"");
			break;
		case 2:
			System.out.println("books availabe:");
			System.out.println("The Silent Witness\"\r\n"
					+ "\"Shadows of Doubt\"\r\n"
					+ "\"The Vanishing Act\"\r\n"
					+ "\"Whispers in the Dark\"");
			break;
		case 3:
			System.out.println("books availabe:");
			System.out.println("Eclipse Chronicles\"\r\n"
					+ "\"Spectra Squad\"\r\n"
					+ "\"Shadowwatchers\"\r\n"
					+ "\"Starfall Heroes\"");
			break;
		case 4:
			System.out.println("books availabe:");
			System.out.println("The Lost City of Zephyr\"\r\n"
					+ "\"Island of Secrets\"\r\n"
					+ "\"Quest for the Crystal Skull\"\r\n"
					+ "\"The Forbidden Kingdom\"\r\n"
					+ "\"Tales of the Midnight Sea\"\r\n"
					+ "\"The Enchanted Forest Chronicles\"\r\n"
					+ "\"Secrets of the Ancient Temple\"");
			break;
		}
	}

}
