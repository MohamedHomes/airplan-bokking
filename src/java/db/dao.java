
package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class dao {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String userName = "homes";
        String password = "homes12345";
        String url = "jdbc:mysql://localhost:3306/IP?useUnicode=yes&characterEncoding=UTF-8";
        Connection con = DriverManager.getConnection(url, userName, password);
        return con;
    }
   
}

