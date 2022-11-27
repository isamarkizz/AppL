/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author bonda
 */
public class BdConnection {
 
    static Connection Connect() throws SQLException, ClassNotFoundException{       
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
                "integratedSecurity=true;databaseName=Appeal;user=NetbeansUser;password=12345;";  
             Connection conn = DriverManager.getConnection(connectionUrl);  
             JOptionPane.showMessageDialog(null, "Connect");
            return conn;
    }
}
