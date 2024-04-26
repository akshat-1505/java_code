package java_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class teacher  
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int id;
	void getId() throws IOException{
		System.out.println("Enter number of subjects:");
		id=Integer.parseInt(br.readLine());
		
	}
	int setId() {
		return id;
	}
	String name;
	void getName()throws IOException {
		System.out.println("Enter number of subjects:");
		name=br.readLine();
	}
	String setname() {
		return name;
	}
	float salary;
	void getSalary() throws IOException{
		System.out.println("Enter number of subjects:");
		salary=Float.parseFloat(br.readLine());
	}
	float setsalary() {
		return salary;
	}
}
class student extends teacher
{
	float marks;
	void getMarks()throws IOException {
		System.out.println("Enter number of subjects:");
		marks=Float.parseFloat(br.readLine());
	}
	float setmarks() {
		return marks;
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		
	}
}
