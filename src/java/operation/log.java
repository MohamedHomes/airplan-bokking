/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import db.dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class log extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          response.setContentType("text/html;charset=UTF-8");
         
        String email=request.getParameter("email");
        String password=request.getParameter("pass");
       if(email!=null){
        Connection con=null;
        PreparedStatement per=null;
        ResultSet rs=null;
        try {
            con=dao.getConnection();
              String sql="select * from member where EMALI=?and PASSWORD1=? ";
            per= con.prepareStatement(sql);
            per.setString(1, email);
            per.setString(2, password);
            rs=per.executeQuery();
            
  if(rs.next()){
//  response.sendRedirect("index.jsp");
//
//      HttpSession s=request.getSession();
//      s.setAttribute("name", email);
//            
//      
request.setAttribute("name", email);
 
                        RequestDispatcher d=   request.getRequestDispatcher("index.jsp");
            d.forward(request, response);
  } 
  else{
  PrintWriter out = response.getWriter() ;
//            response.sendRedirect("login.jsp");
out.println("<meta http-equiv='refresh' content='3;URL=login.jsp'>");
   out.println("<p style='color:red;'>User or password incorrect!</p>");
        }
  }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
         }
       }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
