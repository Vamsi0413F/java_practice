class Student {

    String name;
    int[] marks;

    // Constructor
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Q4 {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        int[] marks1= new int[]{80, 90, 100};
        int[] marks2= new int[]{70, 70, 70};
        int[] marks3= new int[]{60, 80, 70};

        students[0] = new Student("Student 1", marks1);
        students[1] = new Student("Student 2", marks2);
        students[2] = new Student("Student 3", marks3);

        double totalClassAverage = 0;

        for (int i = 0; i < students.length; i++) {

            int sum = 0;

            // Calculate individual student total
            for (int j = 0; j < students[i].marks.length; j++) {
                sum += students[i].marks[j];
            }

            double individualAverage = (double) sum / students[i].marks.length;

            System.out.println(students[i].name 
                    + " Average: " + individualAverage);

            totalClassAverage += individualAverage;
        }

        double finalClassAverage = totalClassAverage / students.length;

        System.out.println("Total Class Average: "+ finalClassAverage);
    }
}