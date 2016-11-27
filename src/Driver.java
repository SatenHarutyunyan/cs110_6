import shapes.Square;
import shapes.Rectangle;
import utils.Math;

public class Driver {
	public static void main(String[] bldokh){
		Square fsquare = new Square(100);
		 System.out.println(fsquare.getArea());
		Rectangle frectangle = new Rectangle(50,80);
		 System.out.println(frectangle.getArea());
		 double mouble = 15.6;
			int kouble = (int)mouble;
			System.out.println(Math.Xfactor(kouble));
			System.out.println(Math.XtractorLoop(kouble));
	
	}
}