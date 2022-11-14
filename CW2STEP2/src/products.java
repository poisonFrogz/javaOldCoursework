/*
Univerity of the West of Scotland
BSc Computing Science
Structures and Algorithms Coursework 2
B00345096
*/
public class products {
    public String productCode;
    public String productName;
    public int noOfProduct;
    
    public products next;
    
    public products(String productCode, String productName, int noOfProduct){
        this.productCode = productCode;
        this.productName = productName;
        this.noOfProduct = noOfProduct;
                
    }
    
    public void display(){
        System.out.println(productCode + " " + productName + " " + noOfProduct + " Units");
    }
    
    @Override
    public String toString(){
        return productCode + " " + productName + " " + noOfProduct + " Units";
    }
    
    
    
    
}
