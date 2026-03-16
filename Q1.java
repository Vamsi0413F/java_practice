class laptop{
    String brand;
    int amount;
    //constructor
    laptop(String brand,int amount) {
        this.brand = brand;
        this.amount= amount;
    }
     

}

public class Q1 {
    public static void main(String[] args) {
        laptop[] Laptop = new laptop[4];

        Laptop[0] = new laptop("Dell",2000);
        Laptop[1] = new laptop("Hp" , 50000);

    for(int i=0;i<Laptop.length;i++){
        if(Laptop[i]!= null){
            System.out.println(Laptop[i].amount);
        }
        else{
            System.out.print("Leave null");
        }
    }

    }
}