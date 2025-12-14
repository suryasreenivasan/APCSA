
public class CircL extends GeometricObject {
	
	private double radius = 1.0;
	private String color;
	private static int numberOfObjects = 0;
	public CircL() {
		numberOfObjects++;
	}
	
	public CircL (double r) {
		r = Math.abs(r);
		radius = r;
		numberOfObjects++;
	}
	public CircL (double r, String c, boolean f) {
		super(c, f);
		r = Math.abs(r);
		radius = r;
		color = c;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRadius(double r) {
		r = Math.abs(r);
		radius = r;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public String toString() {
		return "This circle's radius: " + radius + " color: " + color;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	@Override
	public boolean equals(Object a) {
		if (this.getClass() == a.getClass()) {
			
			if (a instanceof CircL && this.radius == ((CircL) a).radius && this.color.equals(((CircL) a).color) && a instanceof GeometricObject && this.isFilled() == ((GeometricObject) a).isFilled()) {

				return true;
			}
		}
		return false;
	}
	
	
}
