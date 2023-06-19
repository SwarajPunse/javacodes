package draw;

public class AreaDemo {

	public static void main(String[] args) {
		Drawable [] area= new Drawable[3];
		area[0]=new Rectangle(5,6);
		area[1]=new Circle(5);
		area[2]=new Triangle(5,6);
		for(int i=0;i<area.length;i++)
		{
	     System.out.println(area[i].calArea());
	     area[i].drawShape();
		}
		// TODO Auto-generated method stub

	}

}
