/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.f4.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.f4.datasource.DAO;

/**
 *
 * @author shyamli
 */
public class PasswordSubmit extends HttpServlet {

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
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String email=request.getParameter("email");
            System.out.println("Email in PasswordSubmit "+email);
            String pass1=request.getParameter("password");
            String pass2=request.getParameter("confirmpassword");
            String role=request.getParameter("role");
            System.out.println("Role is "+role);
            if(pass1.equals(pass2)){

            if(new DAO().setPassword(email,pass1,role)){
             
                request.getRequestDispatcher("header.jsp").include(request, response);
                out.println("<br /><br /><br /><br /><br />");
                out.println("<h1>Your password created successfully</h1><a href='./login.jsp'><h2>Go to login page<a></h2>");
                out.println("<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />");
                 request.getRequestDispatcher("footer.jsp").include(request, response);
            }
            else{
            
                out.println("<h1>Password creation failed</h1>");
                request.setAttribute("message", "Password creation failed");
                request.getRequestDispatcher("error.jsp").forward(request, response);
                
            }
            }            else{
            
                out.println("<h1>Entered passwords do not match</h1>");
                request.setAttribute("message", "Password creation failed because entered passwords do not match" );
                request.getRequestDispatcher("pwdcreate").forward(request, response);
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
