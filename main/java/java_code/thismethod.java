package java_code;
class sample1{
	private int x;
	sample1()
	{
		this(55);
		this.access();
	}
	sample1(int x)
	{
		this.x=x;
	}
	void access()
	{
		System.out.println("x="+x);
	}
}
public class thismethod {

	public static void main(String[] args) {
		sample1 s=new sample1();
	}

}
