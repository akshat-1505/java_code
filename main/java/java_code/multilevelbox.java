package java_code;
class Box{
	private double width;
	private double height;
	private double depth;

	Box(Box ob) 
	{ 
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
		System.out.println("box ob called");
	}

	Box(double w, double h, double d) 
	{
		width = w;
		height = h;
		depth = d;
		System.out.println("box w,h,b called");
	}

	Box() 
	{
		width = -1;
		height = -1;
		depth = -1; 
		System.out.println("box () called");
	}

	Box(double len) 
	{
		width = height = depth = len;
		System.out.println("box len called");
	}

	double volume() 
	{
		return width * height * depth;
	}

}
class BoxWeight extends Box 
{
	double weight; 

	BoxWeight(BoxWeight ob) 
	{ 
		super(ob);
		weight = ob.weight;
		System.out.println("boxweight ob called");
	}

	BoxWeight(double w, double h, double d, double m) 
	{
		super(w, h, d); 
		weight = m;
		System.out.println("boxweight w,h,m called");
	}

	BoxWeight() 
	{
		super();
		weight = -1;
		System.out.println("box weight () called");
	}

	BoxWeight(double len, double m) 
	{
		super(len);
		weight = m;
	}
}
class BoxCost extends BoxWeight 
{
	double cost;

	BoxCost(BoxCost ob) 
	{ 
		super(ob);
		cost = ob.cost;
	}

	BoxCost(double w, double h, double d, double m, double c) 
	{
		super(w, h, d, m); 
		cost = c;
	}

	BoxCost() 
	{
		super();
		cost = -1;
	}

	BoxCost(double len, double m, double c) 
	{
		super(len, m);
		cost = c;
	}
}

public class multilevelbox {

	public static void main(String[] args) {
		BoxCost b1=new BoxCost(10,15,20,25.75,50.75);
		BoxCost b2=new BoxCost(2,3,4,5.6,10.5);
		double vol;
		vol=b1.volume();
		System.out.println("volume of b1 is"+vol);
		System.out.println("weight of b1 is"+b1.weight);
		System.out.println("cost RS "+b1.cost);
		System.out.println();
		vol=b2.volume();
		System.out.println("volume of b2 is"+vol);
		System.out.println("weight of b2 is"+b2.weight);
		System.out.println("cost RS "+b2.cost);
		System.out.println();
	}

}
