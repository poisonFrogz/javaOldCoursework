/*
Univerity of the West of Scotland
BSc Computing Science
Structures and Algorithms Coursework 2
B00345096
*/
public class productsList {
    public products firstProduct;
    
    productsList(){
        firstProduct = null;
    }
    
    public boolean noProducts(){
        return(firstProduct == null);
    }
    
    public void addProduct(String productCode, String productName, int noOfProduct){
        products newProduct = new products(productCode, productName,noOfProduct);
        
        newProduct.next = firstProduct;
        firstProduct = newProduct;
    }
    
    public products findProduct(String productCode){
        products product = firstProduct;
        
        if(!noProducts()){
            while(!product.productCode.equals(productCode)){
                if (product.next == null){
                    return null;
                }
                else{
                    product = product.next;
                }
            }
        }
        else{
            System.out.println("No products in the list");
        }
        
        return product;
    }
    
    public products removeProduct(String productCode){
        
        products currentProduct = firstProduct;
        products previousProduct = firstProduct; 
        
        while(!currentProduct.productCode.equals(productCode)){
            if(currentProduct.next == null){
                return null;
            }
            else{
                previousProduct = currentProduct;
                currentProduct = currentProduct.next;
            }
        }
        if(currentProduct == firstProduct){
           firstProduct = firstProduct.next;
        }
        else{
            previousProduct.next = currentProduct.next;
        }
        return currentProduct;
        
    }
    
    public void displayProducts(){
        
        products product = firstProduct;
        
        while(product != null){
            product.display();
            
            product = product.next;
        
    }
        
    }
}
