package java_code;
class sample
{
	static double sum(double num1, double num2)
	{
		double res =num1+num2;
		return res;
	}
}
class test
{
	static int a=5;
	static void access()
	{
		System.out.println("a:"+a);
	}
}
class employe{
	int id1,id2;
	employe(int id1, int id2){
		this.id1=id1;
		this.id2=id2;
	}
}
class check
{
	void swap( employe obj)
	{
		int temp;
		temp=obj.id1;
		obj.id1=obj.id2;
		obj.id2=temp;
	}
}
public class staticMethod
{
public static void main (String args[])
{
	double x=sample.sum(10,22.5);
	System.out.println("sum:"+x);
	test.access();
	employe obj1=new employe(10,20);
	check obj=new check();
	System.out.println(obj1.id1+"\t"+obj1.id2);
	obj.swap(obj1);
	System.out.println(obj1.id1+"\t"+obj1.id2);
	
}
}
