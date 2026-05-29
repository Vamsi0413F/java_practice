package composition;

class Engine {
    String type;

    Engine(String type) {
        this.type = type;
        System.out.println("Engine created: " + type);
    }
}

class Car {
	String model;
	Engine engine;

	Car(String model, String engineType) {
		this.model = model;
		this.engine = new Engine(engineType); // Car creates and owns the Engine
		System.out.println("Car created: " + model);
	}
}

public class Composition_Example {

	public static void main(String[] args) {
		Car car = new Car("Toyota Camry", "V8");

		// Remove the car object
		car = null;

		try {
			System.out.println("Car model: " + car.model);
			System.out.println("Car engine type: " + car.engine.type);
		} catch (NullPointerException e) {
			System.out.println("Car object is null. Cannot access its properties.");
		}
		
		try {
			System.out.println("Engine type: " + car.engine.type);
		} catch (NullPointerException e) {
			System.out.println("Engine object is null. Cannot access its properties.");
		}

	}

}
