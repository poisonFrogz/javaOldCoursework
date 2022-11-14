/*
Univerity of the West of Scotland
BSc Computing Science
Structures and Algorithms Coursework 2
B00345096
*/
public class petNode {
    int key;
    String petType;
    //left side of the tree
    petNode leftChild;
    //right side of the tree
    petNode rightChild;
    
    //constructor
    petNode(int key, String petType){
        this.key = key;
        this.petType = petType;
    }
    //Makes Node outputs readable
    @Override
    public String toString(){
        return key + " " + petType;
    }
    
}
