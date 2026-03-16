class Employee{
    String name;
    double salesamount;

    //constructor
    Employee(String name,double salesamount){
        this.name=name;
        this.salesamount=salesamount;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee[] details = new Employee[4];
        details[0] = new Employee("Alice",5000.0);
        details[1] = new Employee("Bob",7500.0);
        details[2] = new Employee("Charlie",3000.0);
        details[3] = new Employee("Diana",9000.0);

        double topAmt=0;
        String topSeller=" ";
        for(int i=0;i<details.length;i++){
            if(details!= null){
                for(int j=0;j<details.length;j++){
                    if(details[j].salesamount>topAmt){
                        topAmt=details[j].salesamount;
                        topSeller=details[j].name;
                    }
                    else{
                        continue;
                    }
                }
                System.out.print("the top performer is :" + topSeller + "with an amount of " + topAmt);
            }
            else{
                System.out.print("Leave null");
            }
        }
    }
}