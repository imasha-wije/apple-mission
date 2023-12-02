
package ControllingMethods;

import Database.DatabaseConnection;


public class CashierController extends CMcontroler{
    
    
    
    public void placeOrder(){
        DatabaseConnection db=new DatabaseConnection();
         db.placeOrder();
    }
}
