package java_code;
class person 
{
	String name="prachi";
	int age=20;
	void talks()
	{
		System.out.println("hello i am:"+name);
		System.out.println("my age is :"+age);
	}
}
public class classdemo {

	public static void main(String[] args) {
		person p=new person();
	System.out.println(+p.hashCode());
	//p.name="akshat";
	//
p.age=19;
	p.talks();
		
	}

}
