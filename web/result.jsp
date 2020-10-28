<%-- 
    Document   : result
    Created on : Oct 28, 2020, 3:42:02 PM
    Author     : amam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result page</title>
    </head>
    <body>
        <h1>
             <%                
                if (request.getParameter("button").equals("Add")) {
                    double result = (Double) request.getAttribute("result");
                    String num1Str = request.getParameter("num1");
                    String num2Str = request.getParameter("num2");
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    String results = "The result of " + num1 +" + "+num2 +" is: "+result ;
                    out.print(results);
                }
                else if (request.getParameter("button").equals("Sub")) {
                    double result = (Double) request.getAttribute("result");
                    String num1Str  = request.getParameter("num1");
                    String num2Str  = request.getParameter("num2");
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    String results = "The result of " + num1 +" - "+num2 +" is: "+result ;
                    out.print(results);
                }
                else if (request.getParameter("button").equals("Mul")) {
                    double result = (Double) request.getAttribute("result");
                    String num1Str  = request.getParameter("num1");
                    String num2Str  = request.getParameter("num2");
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    String results = "The result of " + num1 +" * "+num2 +" is: "+result ;
                    out.print(results);
                }
                else if (request.getParameter("button").equals("Div")) {
                    double result = (Double) request.getAttribute("result");
                    String num1Str  = request.getParameter("num1");
                    String num2Str  = request.getParameter("num2"); 
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    if(num1==0.0 || num2 == 0.0 ){
                        String results = "The result of " + num1 +" / " +num2 +" is: " + " Error devide by 0" ;
                        out.print(results); 
                    }
                    else{
                    String results = "The result of " + num1 +" / " +num2 +" is: "+result ;
                    out.print(results); 
                    }
                }
             %>
             
        </h1>
    </body>
</html>
