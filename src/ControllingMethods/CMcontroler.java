
package ControllingMethods;

import Database.DatabaseConnection;


public class CMcontroler {
    
    public  CMcontroler(){
        DatabaseConnection db=new DatabaseConnection();
    }
    
    
    public void viewProduct(String Pid,String productName,String category,String quantity,String price){
        
         //db.viewProduct(Pid, productName, category, quantity, price);
    }
    
    
    public void searchStock(){
       
         //db.searchStock();
    }
    
    public void searchProduct(){
         
         //db.searchProduct();
    }
}
