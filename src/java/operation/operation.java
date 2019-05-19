/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import com.mysql.fabric.xmlrpc.base.Data;
import db.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class operation {
    
    Connection con;
    PreparedStatement per;
    ResultSet rs=null;
    
    public void add(  String name , String email,String pass1,String pass2,String addrss) throws ClassNotFoundException{
        try {
            con=dao.getConnection();
            String sql="INSERT INTO member(NAME,EMALI,PASSWORD1,PASSWORD2,ADDRESE) VALUES ('"+name+"','"+email+"','"+pass1+"','"+pass2+"','"+addrss+"')";
            per= con.prepareStatement(sql);
            per.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
       
    }
     public void log( String email,String pass) throws ClassNotFoundException{
        try {
            con=dao.getConnection();
            String sql="select EMALI,PASSWORD1 from MEMBER where EMALI  = '"+email+"' and PASSWORD ='"+pass+"'";
            per= con.prepareStatement(sql);
           rs= per.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
        
    }
      public void addreservtion(  String name , String fromw,String tow,String date) throws ClassNotFoundException{
        try {
            con=dao.getConnection();
            String sql="INSERT INTO reservition(NAME,FROMW,TOW,DATE) VALUES ('"+name+"','"+fromw+"','"+tow+"','"+date+"')";
            per= con.prepareStatement(sql);
            per.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
       
    }
        
      
      public void addfeedback(  String desc , String name) throws ClassNotFoundException{
        try {
            con=dao.getConnection();
            String sql="INSERT INTO feedback(descrition,NAME) VALUES ('"+desc+"','"+name+"')";
            per= con.prepareStatement(sql);
            per.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
       
    }
        
      public void update( String name , String fromw,String tow,String date) throws ClassNotFoundException, SQLException{
        try {
            con=dao.getConnection();
        String sql = "UPDATE reservition SET FROMW=? , TOW=? ,DATE=?  WHERE  name='"+name+"'";
            per= con.prepareStatement(sql);
             per.setString(1, fromw);
                    
            per.setString(2, tow);
           
            per.setString(3, date);
      
            per.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
       
    }
  public void deletetiket(  String name  ) throws ClassNotFoundException{
        try {
            con=dao.getConnection();
            String sql="DELETE FROM reservition WHERE name='"+name+"'";
            per= con.prepareStatement(sql);
            per.execute();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
       
    }
 public void showdate() throws ClassNotFoundException{
        try {
            con=dao.getConnection();
            String sql="select *from reservition";
            per= con.prepareStatement(sql);
           rs= per.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
        
    }
}
