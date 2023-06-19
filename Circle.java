package draw;

public class Circle implements Drawable {
	private double radius;
	
	public Circle()
	{
		this.radius=0;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}

	@Override
	public void drawShape() {
		System.out.println("you have selected Circle");
		

	}

	@Override
	public double calArea() {
		double Area=PI*radius*radius;
		
		return Area;
	}

}
