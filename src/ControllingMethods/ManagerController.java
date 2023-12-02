
package ControllingMethods;

import Database.DatabaseConnection;
import com.sun.istack.internal.logging.Logger;
import java.sql.PreparedStatement;

import java.sql.ResultSet;





public class ManagerController extends CMcontroler{
    
    DatabaseConnection db=new DatabaseConnection();
    public ResultSet rs;
    
    
    public ManagerController(){
        db.connect();
        
    }
    
    
    
    public void addProduct(String id,String productName,String category,String quantity,String price){
        
        db.addProduct(id, productName, category, quantity, price);
        
    }

    public void createNewAccount(String userName, String password, String userType) {
        
        /*try{
            PreparedStatement prs;
            prs = db.prepareStatement("insert into user (userName,password,userType ) values (?,?,?)");
            prs.setString(1, userName);
            prs.setString(2,  password);
            prs.setString(3, userType);
        }
        catch(SQLException ex){
            Logger.getLogger(, type)
        }*/
      
       
    }

    
}