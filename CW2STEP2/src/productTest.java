/*
Univerity of the West of Scotland
BSc Computing Science
Structures and Algorithms Coursework 2
B00345096
*/
public class productTest {

   
    public static void main(String[] args) {
        int choice;
        int menu = 1;
        productsList products = new productsList();
        
         // Text based menu with numbers that relate to each function of the program
            System.out.println ("Welcome to Pet Product System\nPlease choose one of the following options");
            System.out.println ("1: Add a new product");
            System.out.println ("2: Find products");
            System.out.println ("3: Display products");
            System.out.println ("4: Remove a product");
            System.out.println ("10:Exit");
            
            while(menu == 1){
                choice = Input.getInteger("Enter one of the following numbers here: ");
                
                if(choice == 1){
                    String productCode = Input.getString("What is the product code?");
                    String productName = Input.getString("What is the product name?");
                    int noOfProduct = Input.getInteger("How many of the product is available?");
                    products.addProduct(productCode, productName, noOfProduct);
                }
                
                else if(choice == 2){
                    String productCode = Input.getString("What is the product code?");
                    System.out.println(products.findProduct(productCode));
                }
                
                else if (choice == 3){
                   
                       products.displayProducts();
                   
                   
                }
                
                else if (choice == 4){
                    String productCode = Input.getString("What is the product code?");
                    System.out.println(products.removeProduct(productCode));
                }
                
                else if (choice == 10){
                    break;
                }
                
                else{
                    System.out.println("Incorrect choice");
                }
            }
    }
    
}
