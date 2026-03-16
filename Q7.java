import java.util.Scanner;

//Product class
class Product {
 int productId;
 String name;
 double price;
 int quantity;

 public Product(int productId, String name, double price, int quantity) {
     this.productId = productId;
     this.name = name;
     this.price = price;
     this.quantity = quantity;
 }

 public double getTotalPrice() {
     return price * quantity;
 }
}

//Customer class
class Customer {
 private int customerId;
 private String name;
 private Product purchasedProducts[];
 static int customercount=0; // Static variable to track total number of customers
 
  public Customer(int customerId, String name, Product[] purchasedProducts) {
     this.customerId = customerId;
     this.name = name;
     this.purchasedProducts = purchasedProducts;
     customercount++; // Increment customer count when a new customer is created
 }
 
 public double getTotalBill() {
     double total = 0;
     for (int i = 0; i < purchasedProducts.length; i++) {
         total += purchasedProducts[i].getTotalPrice();
     }
     return total;
 }
 
 public void displayCustomerDetails() {
     System.out.println("Customer ID: " + customerId);
     System.out.println("Customer Name: " + name);
     System.out.println("Purchased Products:");
     for (int i = 0; i < purchasedProducts.length; i++) {
         System.out.println(" - " + purchasedProducts[i].name + " (" + purchasedProducts[i].quantity + " x " + purchasedProducts[i].price + ") = " + purchasedProducts[i].getTotalPrice());
     }
     System.out.println("Total Bill: Rs." + getTotalBill());
 }
}

//Main class
public class Q7 {
	 private static Customer[] customers = new Customer[100]; // Assuming max 100 customers
	 
	 private static Scanner scanner = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add a new customer");
	            System.out.println("2. Display all customers");
	            System.out.println("3. Display the customer with the highest total purchase");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            
	            switch (choice) {
	                case 1:
	                    addCustomer();
	                    break;
	                case 2:
	                    displayAllCustomers();
	                    break;
	                case 3:
	                    displayHighestSpender();
	                    break;
	                case 4:
	                    System.out.println("Exiting... Thank you!");
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }

	    private static void addCustomer() {
	        System.out.print("Enter Customer ID: ");
	        int customerId = scanner.nextInt();
	        
	        
	        System.out.print("Enter Customer Name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter number of products purchased: ");
	        int numProducts = scanner.nextInt();
	        
	        Product[] products = new Product[numProducts];
	        for (int i = 0; i < numProducts; i++) {
	            System.out.println("\nEnter details for Product " + (i + 1) + ":");
	            System.out.print("Product ID: ");
	            int productId = scanner.nextInt();
	            
	            System.out.print("Product Name: ");
	            String productName = scanner.nextLine();
	            
	            System.out.print("Price: ");
	            double price = scanner.nextDouble();
	            
	            System.out.print("Quantity: ");
	            int quantity = scanner.nextInt();
	            
	            products[i] = new Product(productId, productName, price, quantity);
	        }
	         
	        Customer newCustomer = new Customer(customerId, name, products);
	        customers[Customer.customercount - 1] = newCustomer; // Store customer at the correct index
	        System.out.println("Customer added successfully!");

	        
	 
	    }
	    
	    private static void displayAllCustomers() {
	        
	        
	        for (int i = 0; i < Customer.customercount ; i++) {
	            customers[i].displayCustomerDetails();
	            System.out.println("--------------------------------");
	        }
	    }
	    
	    private static void displayHighestSpender() {
	        
	        
	        Customer highestSpender = customers[0];
	        for (int i = 0; i < Customer.customercount ; i++) {
	            if (customers[i].getTotalBill() > highestSpender.getTotalBill()) {
	                highestSpender = customers[i];
	            }
	        }
	        
	        System.out.println("Customer with the highest total purchase:" + highestSpender.displayCustomerDetails(););
	        
	    }
	}
