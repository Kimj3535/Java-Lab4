package cst8284.solidObject;

public class Triangle extends BasicShape {
	public Triangle() {
		this(1.0);
}
	public Triangle(double width) {
		super(width);
		setWidth(width);
	}
	public Triangle(Triangle triangle) {
		this(triangle.getWidth());
	}
	@Override
	public double getArea() {
		double area = (double)(this.getWidth() * this.getWidth())*Math.sqrt(3)/4; 
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = this.getWidth() + this.getWidth() + this.getWidth();
		return perimeter;
		
	}
	@Override
	public String toString() {
		return super.toString();
		
	}
	@Override
	public boolean equals(Object obj) {
		return((obj instanceof Triangle) && ((Triangle)obj).getWidth() ==this.getWidth());
		
	} 
}
