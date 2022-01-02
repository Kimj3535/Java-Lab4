package cst8284.solidObject;

public class SolidObject<T extends BasicShape> {
	
 private T shape;
 private double depth;
 
 public SolidObject() {
	 
 }
 
 protected SolidObject(T shape, double depth) {
	 this.setBasicShape(shape);
	 this.setDepth(depth);
	 
	  }
 protected SolidObject(T shape) {
	 this.setBasicShape(shape);
 }
 public double getDepth() {
	 return depth;
 }
 public void setDepth(double depth) {
	 this.depth = depth;
 }
 public T getShape() {
	 return shape;
 }
 public void setBasicShape(T shape) {
	 this.shape = shape;
 }
 
 public double getVolume() {
	 double v;
	 v = (shape.getArea()*this.getDepth());
	 return v;
 }
 public double getSurfaceArea() {
	 double SA;
	 SA = this.getShape() .getPerimeter() * this.getDepth() + (2 * this.getShape().getArea());
	 	 return SA;
	 //return (2*getShape().getArea())+(getShape().getPerimeter()*getDepth()); ???
	 
 }
	// TODO: Use the UML diagram to create the members required in the space below

	
	
	// the toString() method is provided for you -- do not remove
	public String toString() {
		String solidTypeEquivalent = "unknown   ";
		switch (getShape().getClass().getSimpleName()) {
		   case "Circle": solidTypeEquivalent = "cylinder "; break;
		   case "Square": solidTypeEquivalent = "block     "; break;
		   case "Triangle": solidTypeEquivalent = "prism    "; break;
		}
		return solidTypeEquivalent;
	}

}
