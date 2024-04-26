package java_code;
	abstract class plan
	{
		protected double rate;
		public abstract void getRate();
		public void calculateBill(int units)
		{
			System.out.println("Bill amount for"+units +"units:");
			System.out.println(rate*units);
		}
	}
	class commercialPlan extends plan
	{
		public void getRate()
		{
			rate=5.00;
		}
	}
	class domesticPlan extends plan
	{
		public void getRate()
		{
			rate=2.60;
		}
	}
public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plan p;
		System.out.println("commercial connections:");
		p=new commercialPlan();
		p.getRate();
		p.calculateBill(250);
		System.out.println("domestic connections:");
		p=new domesticPlan();
		p.getRate();
		p.calculateBill(150);
	}

}
