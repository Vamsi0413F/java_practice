package abstractClassDemo;

//Abstract Class
abstract class Shape {
	String color;
	
	abstract double area();
	public abstract String toString();
	
	//abstract class can have a constructor
	public Shape(String color){
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	//this is a concrete method
	public String getColor() {
		return color;
	}
}