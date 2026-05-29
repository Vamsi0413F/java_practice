package abstractClassDemo;

//Concrete Class 2
class Rectangle extends Shape {
	double length;
	double width;
	public Rectangle(String color, double length, double width) {
		//calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}
	double area() {
		return length * width;
	}
	public String toString() {
		return "Rectangle color is " + super.getColor() + " and area is : " + area();
	}
}