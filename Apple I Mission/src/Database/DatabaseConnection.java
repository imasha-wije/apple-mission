
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Interface.Cashier;
import Interface.Manager;
import javax.swing.JOptionPane;
//import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;





public class DatabaseConnection {
    
   public Connection con;
    //PreparedStatement pst;
    
    public void connect() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/apple i mission","root","");
            System.out.println("Connected");
        }
        catch(SQLException | ClassNotFoundException ex){
            String msg = null;
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, msg, ex);
        }
    }
    
    
    
    public void login(String userName,String password,String userType){
        //String passwordString = new String(password); // Convert char array to String
        
        if (userName.equals("cashier") || password.equals("123") || userType.equals("cashier") ) {
             Cashier Cfrm = new Cashier();
             Cfrm.setVisible(true);
           
        }
   
            else if (userName.equals("manager") || password.equals("456") || userType.equals("manager")) {
                  Manager Mfrm = new Manager();
                  Mfrm.setVisible(true);
            }
                
            else {
                   JOptionPane.showMessageDialog(null, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
                  }
        
    }
   
    
    
    public void addProduct(String Pid,String productName,String category,String quantity,String price){
        DatabaseConnection db=new DatabaseConnection();
        System.out.println(Pid);
        System.out.println(productName);
        System.out.println(category);
        System.out.println(quantity);
        System.out.println(price);
                
    }
    public void CreateNewAccount(String userName, String password,String confirmPassword,String userType){
        
        System.out.println(userName);
        System.out.println(password);
        System.out.println(confirmPassword);
        System.out.println(userType);
        
    }

    public void viewProduct(String Pid, String productName, String category, String quantity, String price) {
        
      
        
    }

    public void searchStock() {
        
        
        
    }

    public void searchProduct() {
        
        
        
    }

    public void placeOrder() {
        
        
        
    }

    
    
   

    
}

