/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
public class update extends HttpServlet {

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
            throws ServletException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("lgnm");
        String source=request.getParameter("source");
        String destitation=request.getParameter("dest");
         String d=request.getParameter("date");
        String reg=request.getParameter("update");
   
         operation o=new operation();
        try {
             if(request.getParameter("update")!=null){
             o.update(name, source, destitation, d);
//            RequestDispatcher d=   request.getRequestDispatcher("index.jsp");
//            d.forward(request, response);
  PrintWriter out = response.getWriter() ;

       
out.println("<meta http-equiv='refresh' content='3;URL=tiketReservation.jsp'>");
   out.println("<p style='color:red;'> update successful  !</p>");
        
                System.out.println("adddded");
            }} catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
    PrintWriter out = response.getWriter() ;
//            response.sendRedirect("login.jsp");
out.println("<meta http-equiv='refresh' content='3;URL=tiketReservation.jsp'>");
   out.println("<p style='color:red;'> incorrect!</p>");
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
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
