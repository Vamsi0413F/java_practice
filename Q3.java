class product{
    String productName;
    int quantity;

    //constructor
    product(String productName,int quantity){
        this.productName=productName;
        this.quantity=quantity;
    }

}

public class Q3 {
    public static void main(String[] args) {
        product[] objects = new product[5];
        objects[0] = new product("Laptop",15);
        objects[1] = new product("Mouse",5);
        objects[2] = new product("Moniter",12);
        objects[3] = new product("Keyboard",8);
        objects[4] = new product("Webcam",20);

        for(int i=0; i< objects.length;i++){
            if(objects[i].quantity<10){
                System.out.println(objects[i].productName + "Restock Recommended (Current:" + objects[i].quantity + ")");
            }
            else{
                continue;
            }
        }
    }
}