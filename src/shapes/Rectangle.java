package shapes;

public class Rectangle {
	private int width;
	private int length;
	public Rectangle(int kwidth, int blength){
	this.width = kwidth;
	this.length = blength;
	}
	public int getArea(){
		return width*length;
	}
}
