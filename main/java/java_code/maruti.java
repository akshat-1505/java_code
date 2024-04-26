package java_code;

public class maruti extends car {
	maruti(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("take a turn");
		System.out.println("this iuss ordinary steering");
	}
	void braking(int force)
	{
		System.out.println("breaks applied");
		System.out.println("these are hydraulic break");
	}
}
