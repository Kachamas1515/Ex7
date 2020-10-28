/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amam
 */
public class calculateServlet extends HttpServlet {

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

        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String button = request.getParameter("button");
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        if(num1Str != null && num2Str != null && button.equals("Add") )
	{
            double result = num1 + num2;
            request.setAttribute("result", result);
        }
	else if(num1Str != null && num2Str != null && button.equals("Sub") )
	{
            double result = num1 - num2;
            request.setAttribute("result", result);
        }
        else if(num1Str != null && num2Str != null && button.equals("Mul") )
	{
            double result = num1 * num2;
            request.setAttribute("result", result);
        }
        else if(num1Str != null && num2Str != null && button.equals("Div") )
	{
            double result = num1 / num2;
            if(result > 0){
            request.setAttribute("result", result);
            }
            
        }
        request.getRequestDispatcher("result.jsp").forward(request, response);        
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
