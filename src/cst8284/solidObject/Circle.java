package cst8284.solidObject;

public class Circle extends BasicShape {
	public Circle() {
		this(1.0);
		
	}
	public Circle(double width) {
		super(width);
		setWidth(width);
		
			}
	
	public Circle(Circle circle) {
		this(circle.getWidth());
		
	}
	@Override
	public double getArea() {
		double area = this.getWidth()/2 * this.getWidth()/2 *Math.PI;
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = this.getWidth() * Math.PI;
		return perimeter;
		
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		return((obj instanceof Circle) && ((Circle)obj).getWidth() ==this.getWidth());
		
	}
}
