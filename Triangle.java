package draw;

public class Triangle implements Drawable {
	private double h;
	private double b;
	
	public Triangle()
	{
		this.h=0;
		this.b=0;
	}
	public Triangle(double h, double b) {
		super();
		this.h = h;
		this.b = b;
	}


	@Override
	public void drawShape() {
		System.out.println("you have selected Triangle");
		// TODO Auto-generated method stub

	}

	@Override
	public double calArea() {
		double Area=0.5*h*b;
		// TODO Auto-generated method stub
		return Area;
	}

}
