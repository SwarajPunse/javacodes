package draw;

public class Rectangle implements Drawable {
	private double l;
	private double b;
	
	public Rectangle()
	{
		this.l=0;
		this.b=0;
	}
	public Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	

	@Override
	public void drawShape() {
		System.out.println("you have selected rectangle");
		// TODO Auto-generated method stub

	}

	@Override
	public double calArea() {
		
		// TODO Auto-generated method stub
		return l*b;
	}

}
