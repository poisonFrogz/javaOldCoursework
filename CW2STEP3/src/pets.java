/*
Univerity of the West of Scotland
BSc Computing Science
Structures and Algorithms Coursework 2
B00345096
*/

public class pets {

    petNode root; 
    
    public void addPet(int key, String petType){
        petNode newPet = new petNode(key,petType);
        
        if (root == null){
            root = newPet;
        }
        else{
            petNode focusNode = root;
            petNode parent;
            while(true){
                parent = focusNode;
                
                if (key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    
                    if(focusNode == null){
                        parent.leftChild = newPet;
                        return;
                    
                }
                    
                        
                } else{
                        focusNode = focusNode.rightChild;
                        
                        if (focusNode == null){
                            parent.rightChild = newPet;
                            return;
                            
                        }
                    }
            } 
        }
    }
    
    public void findPet(products petType) {
        
        
        
    }
    
    public petNode displayPet(int key) {
        petNode focusNode = root;
        
        while(focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftChild;
                
            } 
                else {
                    focusNode = focusNode.rightChild;
                
            }
            if(focusNode == null)
                return null;
            
            
        }
        return focusNode;
        
    }
    
    public void displayAll(petNode focusNode) {
        if(focusNode != null){
            displayAll(focusNode.leftChild);
            System.out.println(focusNode);
            displayAll(focusNode.rightChild);
        }
        
        
    }
    
    public boolean removePet(int key) {
       petNode focusNode = root;
       petNode parent = root;
       
       boolean leftChild = true;
       
       while(focusNode.key != key){
           parent = focusNode;
           
           if(key < focusNode.key){
               leftChild = true;
               focusNode = focusNode.leftChild;
           }
           else {
               leftChild = false;
               focusNode = focusNode.rightChild;
               
           }
           if(focusNode == null)
               return false;
       }
       
       if(focusNode.leftChild == null && focusNode.rightChild == null){
           if(focusNode == root){
               root = null;
           }
           else if(leftChild){
               parent.leftChild = null;
           }
           else{
               parent.rightChild = null;
           }
       }
       else if (focusNode.rightChild == null){
           if(focusNode == root)
               root = focusNode.leftChild;
           
           else if(leftChild)
               parent.leftChild = focusNode.leftChild;
           
           else parent.rightChild = focusNode.leftChild;
       }
       
       else if(focusNode.leftChild == null){
           if(focusNode == root)
              root = focusNode.rightChild; 
           
           else if(leftChild)
               parent.leftChild = focusNode.rightChild;
           
           else
               parent.rightChild = focusNode.leftChild;
       }
       
       else{
           petNode replace = replaceRemovedPet(focusNode);
           if(focusNode == root)
           root = replace;
           
           else if(leftChild)
               parent.leftChild = replace;
           
           else
               parent.rightChild = replace;
           
           replace.leftChild = focusNode.leftChild;
       }
       return true;
    }
    
    public petNode replaceRemovedPet(petNode removedPet){
        petNode newParent = removedPet;
        petNode replacementPet = removedPet;
        petNode focusNode = removedPet.rightChild;
        
        while(focusNode != null){
            newParent = replacementPet;
            
            replacementPet = focusNode;
            
            focusNode = focusNode.leftChild;
        }
        
        if(replacementPet != removedPet.rightChild){
            newParent.leftChild = replacementPet.rightChild;
            replacementPet.rightChild = removedPet.rightChild;
        }
        return replacementPet;
    }
    
    
}
