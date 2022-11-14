/*
Univerity of the West of Scotland
BSc Computing Science
Structures and Algorithms Coursework 2
B00345096
*/
public class petSystemTest {

    
    public static void main(String[] args) {
        int choice;
        int menu = 1;
        pets pets1 = new pets();
        productsList products = new productsList();
        
        
         // Text based menu with numbers that relate to each function of the program
            System.out.println ("Welcome to Pet Product System\nPlease choose one of the following options");
            System.out.println ("1: Add a new Pet");
            System.out.println ("2: Add a new Product");
            System.out.println ("3: Check if pet has products");
            System.out.println ("4: Display all pets that have products");
            System.out.println ("5:Display all products for one pet");
            System.out.println ("6:Display all Products");
            System.out.println ("7:Remove product for a pet");
            System.out.println ("8:Remove a pet from the system");
            System.out.println ("10:Exit");
            
            while(menu == 1){
                choice = Input.getInteger("Enter one of the following numbers here: ");
                
                if(choice == 1){
                    int key = Input.getInteger("Enter a key");
                    String pet = Input.getString("Enter the pet type");
                
                    pets1.addPet(key,pet);
                }
                else if(choice == 2){
                    String productCode = Input.getString("What is the product code?");
                    String productName = Input.getString("What is the product name?");
                    String petType = Input.getString("What type of pet is the product for?");
                    int noOfProduct = Input.getInteger("How many of the product is available?");
                    products.addProduct(productCode, productName,petType, noOfProduct);
                    
                }
                else if(choice == 3){
                    String petType = Input.getString("What is the pet Type?");
                    if(products.findProduct(petType)!= null){
                        System.out.println("Items for this pet are stocked");
                    }
                    else{
                        System.out.println("No items found");
                    }
                    
                    
                }
                else if(choice == 4){
                    
                }
                else if(choice == 5){
                    String petType = Input.getString("What is the pet you are looking for?");
                    products.displayProductsPets(petType);
                }
                else if(choice == 6){
                    products.displayProducts();
                }
                else if(choice == 7){
                    String productCode = Input.getString("What is the product code?");
                    System.out.println(products.removeProduct(productCode));
                }
                else if(choice == 8){
                    int key = Input.getInteger("Enter a key to remove");
                if (pets1.removePet(key) == true){
                    pets1.removePet(key);
                    System.out.println("Pet Removed");
                }
                else{
                    System.out.println("Pet was not found, therefore could not be removed");
                }
                }
                else if(choice == 10){
                    break;
                }
                
            }
    }
}

                
      
