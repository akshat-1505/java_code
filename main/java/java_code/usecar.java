package java_code;

public class usecar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maruti m=new maruti(1001);
		santro s=new santro(5005);
		car ref;
		ref=m;
		ref.openTank();
		ref.steering(1,90);
		ref.braking(500);
		
	}

}
