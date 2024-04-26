package java_code;
class calc{
	int a=4;
	void square()
	{
		System.out.println("square:"+(a*a));
		
	}
	void roots() {
		System.out.println("squareroot:"+Math.sqrt(a));
	}
}
public class squareroots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c=new calc();
		c.square();
		c.roots();

	}

}
