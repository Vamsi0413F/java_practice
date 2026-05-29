package aggregation;

class Department {
	String name;
	String HOD;

	Department(String name, Professor professor) {
		this.name = name;
		this.HOD = professor.name;
		System.out.println(name + " Department created with " + HOD + " as HOD." );
	}
}

class Professor {
	String name;
	String deptName;

	Professor(String name, String deptName) {
		this.name = name;
		this.deptName = deptName;
		System.out.println("Professor joined: " + name + " in " + deptName + " department.");
	}
}

public class Aggregation_Example {

	public static void main(String[] args) {
		Professor p1 = new Professor("Dr. Smith", "Computer Science");
		
		Department ds = new Department("Data Science", p1);
		
		//Remove the department object
		ds = null;
		try {
			System.out.println("Department " + ds.name + " has HOD: " + ds.HOD);
		} catch (NullPointerException e) {
			System.out.println("Department object is null. Cannot access its properties.");
		}
		
		// Remove the professor object
//		p1 = null;
		try {
			System.out.println("Professor " + p1.name + " is still here");
		} 
		catch (NullPointerException e) {
			System.out.println("Professor object is null. Cannot access its properties.");
        }

	}

}