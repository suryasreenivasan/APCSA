
class Rectangle {
	
	private double width = 1; 	
	private double height = 1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public void setWidth(double w) {
		this.width = w;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
	public String toString() {
		return "The height of the rectangle is " + getHeight() + " and the width is " + getWidth();
	}
}
