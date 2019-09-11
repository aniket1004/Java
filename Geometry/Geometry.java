import java.lang.*;

class Circle
{
	public float radius;
	public final float pi=3.14f;

	public Circle(float value)
	{
		radius=value;
	}
	
	public float area ()
	{
		float area=pi*radius*radius;
		
		return area;
	}
}

class NewCircle extends Circle
{
	public float radius;
	

	public NewCircle(float value)
	{
		super(value);
		radius=1.0f;
	}
	
	public float Circum ()
	{
		float Circum=2*pi*(super.radius);
		
		return Circum;
	}
}

class Geometry
{
	public static void main (String arg[ ])
	{
		Circle cobj=new Circle(3.1f);
		float ans=cobj.area();
		
		System.out.println("Area of cobj"+ans);//30.1754

		NewCircle nobj=new NewCircle(6.19f);
		ans=nobj.area();
		System.out.println("Area of nobj"+ans);//120.3125
		
		ans=nobj.Circum();
		System.out.println("Circum of nobj"+ans);//38.8732

		cobj=null;
		nobj=null;
	}
}