
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Interface.Cashier;
//import Interface.CashierManagerInterface;
import Interface.Manager;
//import Interface.addProducts;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;





public class DatabaseConnection {
    
   public Connection con;

    /**
     *
     */
//    public PreparedStatement pst;
//    public ResultSet rs;
    
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
        
        DatabaseConnection db = new DatabaseConnection();
           db.connect();
            PreparedStatement pst;
            ResultSet rs;
       if("".equals(userName)|| "".equals(password)|| "".equals(userType)){
           JOptionPane.showMessageDialog(null,"Please provide userName and password!");
       }
       else{
           try{
               String query="SELECT * FROM USER where userName=? and password=? and userType=?";
               pst=db.con.prepareStatement(query);
               pst.setString(1, userName);
               pst.setString(2, password);
               pst.setString(3, userType);
               
               rs=pst.executeQuery();
               
             if(rs.next()){
                 if("cashier".equals(rs.getString("userType"))){
                         Cashier Cfrm=new Cashier();
                         JOptionPane.showMessageDialog(null, "Welcome to the  " + rs.getString("userType") + " Dashboard");
                         Cfrm.setVisible(true);
                         
                     }
               
                 else if("manager".equals(rs.getString("userType"))){
                     Manager Mfrm = new Manager();
                     JOptionPane.showMessageDialog(null, "Welcome to the " + rs.getString("userType")+ " Dashboard");
                     Mfrm.setVisible(true);
                     
                 }
                 }
             else{
                 JOptionPane.showMessageDialog(null, "userName or password incorrect!");
             }  
           }
           catch(SQLException ex){
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);             
          }
       }
        
//       
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
//        
//       try{
//           PreparedStatement pst;
//           DatabaseConnection db=new DatabaseConnection();
//           db.connect();
//          String query= "INSERT INTO USER(userName,password,userType) VALUES(?,?,?)";
//           pst=db.con.prepareStatement(query); 
//           pst.setString(1,userName);
//           pst.setString(2,password);
//           pst.setString(3,userType);
//           pst.execute();
// 
//       }
//       catch(SQLException ex){
//           Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE,null,ex);
//           
//       }
    }

    public void viewProduct(String Pid, String productName, String category, String quantity, String price) {
        
      
        
    }

    public void searchStock() {
        
        
        
    }

    public void searchProduct() {
        
        
        
    }

    public void placeOrder() {
        
        
        
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   

    
}

