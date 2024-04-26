package java_code;
class person1 {
private String name;
private int age;
person1(){
	name="akshat";
	age=19;
}
person1(String s, int i){
	name=s;
	age=i;
}
void talks() {
	System.out.println("hello i am:"+name);
	System.out.println("my age is :"+age);
}
}
public class constructor {
	public static void main(String[] args) {
	person1 p=new person1();
	person1 n=new person1("prachi",20);
	p.talks();
	n.talks();
	}
}
