
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENES
 */
public class DB {
    
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:derby://localhost:1527/BankAppDB";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, userName,password); 
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println(exception.getMessage());
        System.out.println(exception.getErrorCode());
    }
}
