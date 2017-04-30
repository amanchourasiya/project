package org.f4.action;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shyamli
 */
public class PasswordCreation extends HttpServlet {

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
        String email=request.getParameter("email");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
request.getRequestDispatcher("header.jsp").include(request, response);
            out.println("<div class=\"section section-breadcrumbs\">\n" +
"			<div class=\"container\">\n" +
"				<div class=\"row\">\n" +
"					<div class=\"col-md-12\">\n" +
"						<h1>Password Creation</h1>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"		</div>");
            String role=(String)request.getAttribute("role");
            if(request.getAttribute("message")!=null){
            
                out.println("<h3>"+request.getAttribute("message")+"</h3>");
            }
            out.println("<form name='passwordform' action='passwordsubmit'>");
            if(role.equalsIgnoreCase("student")){
            
                out.println("<input type='hidden' name='role' value='student'>");
            }
            else if(role.equalsIgnoreCase("teacher")){
            
                out.println("<input type='hidden' name='role' value='teacher'>");
            }
            out.println("<lable>Password");
            out.println("<input type='password' name='password' maxlength='20' required/>");
            out.println("</lable>");
            out.println("<p>");
            out.println("<lable>Confirm Password");
            out.println("<input type='password' name='confirmpassword' maxlength='20' required/>");
           
            out.println("</lable>");
            out.println("<input type='hidden' value='"+email+"' name='email'>");
            out.println("</p>");
            out.println("<p>");
            out.println("<input type='submit' value='Submit'/>");
            out.println("</p>");
            out.println("</form>");
            out.println("</html>");
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
