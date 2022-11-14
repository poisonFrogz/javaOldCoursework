/*
Univerity of the West of Scotland
BSc Computing Science
Structures and Algorithms Coursework 2
B00345096
*/

public class petTest {

    
    public static void main(String[] args) {
        pets pets1 = new pets();
        
        
        int choice;
        int menu = 1;
         // Text based menu with numbers that relate to each function of the program
            System.out.println ("Welcome to Pet Storage System\nPlease choose one of the following options");
            System.out.println ("1: Add a new pet");
            System.out.println ("2: Find products related to a pet type");
            System.out.println ("3: Display a singular pet type");
            System.out.println ("4: Display ALL pet types");
            System.out.println ("5: Remove a pet type");
            System.out.println ("10:Exit");
        
        while (menu == 1){
            
           
            choice = Input.getInteger("Enter one of the following numbers here: ");
            
            if(choice == 1){
                int key = Input.getInteger("Enter a key");
                String pet = Input.getString("Enter the pet type");
                
                pets1.addPet(key,pet);
            }
            else if (choice == 2){
               
               
               
            }
            else if (choice == 3){
                int key = Input.getInteger("Enter a key");
                if(pets1.displayPet(key)!= null){
                    System.out.println(pets1.displayPet(key));
                }
                else{
                    System.out.println("Pet type not found");
                }
            }
            else if (choice == 4){
                
                pets1.displayAll(pets1.root);
            }
            else if (choice == 5){
                int key = Input.getInteger("Enter a key to remove");
                if (pets1.removePet(key) == true){
                    pets1.removePet(key);
                    System.out.println("Pet Removed");
                }
                else{
                    System.out.println("Pet was not found, therefore could not be removed");
                }
                
            }
            else if (choice == 10){
                break;
            }
            else{
                System.out.println("Wrong Input, please try again");
            }
        
        }
        
        
        
        
        







    }
    
}
