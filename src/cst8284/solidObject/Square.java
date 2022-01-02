package cst8284.solidObject;

public class Square extends BasicShape {
	public Square() {
		this(1.0);
	}
	public Square(double width) {
		super(width);
		
	}
	public Square(Square square) {
			this(square.getWidth());
	}
	@Override
	public double getArea() {
		double area = this.getWidth() * this.getWidth();
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = this.getWidth() * 4;
		return perimeter;
		
	}
	@Override
	public String toString() {
		return "Square extends"+super.toString();
		
	}
	@Override
	public boolean equals(Object obj) {
		return((obj instanceof Square) && ((Square)obj).getWidth() == this.getWidth());
		
	}
}
