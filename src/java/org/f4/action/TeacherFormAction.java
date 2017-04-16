/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.f4.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.f4.beans.TeacherBean;
import org.f4.datasource.DAO;

/**
 *
 * @author jarvis
 */
public class TeacherFormAction extends HttpServlet {

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
        PrintWriter pw=response.getWriter();
        TeacherBean tbean=new TeacherBean();
        tbean.setName(request.getParameter("name"));
        tbean.setAddress(request.getParameter("address"));
        tbean.setEmail(request.getParameter("email"));
        tbean.setMoblileno(request.getParameter("mobileno"));
        tbean.setDob(request.getParameter("dob"));
        if(new DAO().teacherRegister(tbean))
        {
           
           pw.println("<h1>"+tbean.getName()+" registered successfully</h1>");
           pw.println("<h3>You have to create a password now please proceed by clicking below<h3></br><a href='/pwdcreate'>create password</a>");
            RequestDispatcher rd=request.getRequestDispatcher("/pwdcreate");
            System.out.println("Request disppatcher created");
            rd.forward(request, response);
        }
        else
        {
            pw.println("<h1>teacher not registered successfully</h1>");
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
