
package Model;


public class Product {
      private String Pid;
      private String productName;
      private String category;
      private int quantity;
      private int price;
   
        
        
        public Product(String Pid,String productName,String category, int quantity,int price){
            this.Pid=Pid;
            this.productName=productName;
            this.category=category;
            this.quantity=quantity;
            this.price=price;
            
        }
        public String getId(){
            return Pid;
        }
        
        public String getProductName(){
            return productName;
        }
        
        public void setProductName(String ProductName){
            this.productName=ProductName;
        }
        
        public String getCategory(){
            return category;
        }
        
        public void setCategory(String category){
            this.category=category;
        }
        
        public int getQuantity(){
            return quantity;
        }
        
        public void setQuantity(int quantity){
            this.quantity=quantity;
        }
        
        public int getPrice(){
            return price;
        }
        
}
