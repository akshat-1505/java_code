package java_code;

public class santro extends car{
	santro(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("take a turn");
		System.out.println("this car uses power steering");
	}
	void breaking(int force) 
	{
		System.out.println("breaks applied");
		System.out.println("this car uses gas breaks");
	}
}
