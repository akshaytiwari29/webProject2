package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Calculator extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    public Calculator() {
        super();
        
    }

                protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                {
                        try
                        {
                        response.setContentType("text/html");
                        PrintWriter out= response.getWriter();
                        int a1= Integer.parseInt(request.getParameter("n1"));
                        int a2= Integer.parseInt(request.getParameter("n2"));
                        if(request.getParameter("r1").equals("add"))
                        {
                             
                             Add a=new Add();
                             int result1=a.addition(a1, a2);
                             
                             System.out.println(+result1);
                             
                            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
                                    "<html>\r\n" + 
                                    "<head>\r\n" + 
                                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n" + 
                                    "<title>Calculator</title>\r\n" + 
                                    "</head>\r\n" + 
                                    "<body>\r\n" + 
                                    "<h1 style=\"text_align=center\">Calculator</h1>\r\n" + 
                                    "<form method=\"get\" action=\"Calculator\">\r\n" + 
                                    "<label>first number:</label>\r\n" + 
                                    "<input type=\"text\" name=\"n1\" />\r\n" + 
                                    ""+"<br />\r\n" + 
                                    "<label>Second number : </label>\r\n" + 
                                    "<input type=\"text\" name=\"n2\" />\r\n" + 
                                    "<br />\r\n" + 
                                    "<div>\r\n" + 
                                    "<label>\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"add\" />addition\r\n" + 
                                    "<br />\r\n" + 
                                    "</label>\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"sub\" />subtraction \r\n" + 
                                    "<br />\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"mul\" />multiplication\r\n" + 
                                    "<br />\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"div\" />division\r\n" + 
                                    "<br /> \r\n" + 
                                    "</div>\r\n" + 
                                    "<input type=\"submit\" value=\"submit\" />\r\n" + 
                                    "</form>\r\n" + 
                                    "</body>\r\n" + 
                                    "</html>\r\n" + 
                                    "");
                             out.println(+result1);

                        }
                        if(request.getParameter("r1").equals("sub"))
                        {
                             Sub s=new Sub();
                             int result2=s.subtract(a1, a2);
                           System.out.println(+result2);
                           
                           out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
                                   "<html>\r\n" + 
                                   "<head>\r\n" + 
                                   "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n" + 
                                   "<title>Calculator</title>\r\n" + 
                                   "</head>\r\n" + 
                                   "<body>\r\n" + 
                                   "<h1 style=\"text_align=center\">Calculator</h1>\r\n" + 
                                   "<form method=\"get\" action=\"Calculator\">\r\n" + 
                                   "<label>first number:</label>\r\n" + 
                                   "<input type=\"text\" name=\"n1\" />\r\n" + 
                                   ""+"<br />\r\n" + 
                                   "<label>Second number : </label>\r\n" + 
                                   "<input type=\"text\" name=\"n2\" />\r\n" + 
                                   "<br />\r\n" + 
                                   "<div>\r\n" + 
                                   "<label>\r\n" + 
                                   "<input type=\"radio\" name=\"r1\" value=\"add\" />addition\r\n" + 
                                   "<br />\r\n" + 
                                   "</label>\r\n" + 
                                   "<input type=\"radio\" name=\"r1\" value=\"sub\" />subtraction \r\n" + 
                                   "<br />\r\n" + 
                                   "<input type=\"radio\" name=\"r1\" value=\"mul\" />multiplication\r\n" + 
                                   "<br />\r\n" + 
                                   "<input type=\"radio\" name=\"r1\" value=\"div\" />division\r\n" + 
                                   "<br /> \r\n" + 
                                   "</div>\r\n" + 
                                   "<input type=\"submit\" value=\"submit\" />\r\n" + 
                                   "</form>\r\n" + 
                                   "</body>\r\n" + 
                                   "</html>\r\n" + 
                                   "");
                            out.println(+result2);

                           
                        }
                        if(request.getParameter("r1").equals("mul"))
                        {
                             Multiplication m1=new Multiplication();
                             int result3=m1.mul(a1, a2);
                             System.out.println(+result3);
                             
                            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
                                    "<html>\r\n" + 
                                    "<head>\r\n" + 
                                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n" + 
                                    "<title>Calculator</title>\r\n" + 
                                    "</head>\r\n" + 
                                    "<body>\r\n" + 
                                    "<h1 style=\"text_align=center\">Calculator</h1>\r\n" + 
                                    "<form method=\"get\" action=\"Calculator\">\r\n" + 
                                    "<label>first number:</label>\r\n" + 
                                    "<input type=\"text\" name=\"n1\" />\r\n" + 
                                    ""+"<br />\r\n" + 
                                    "<label>Second number : </label>\r\n" + 
                                    "<input type=\"text\" name=\"n2\" />\r\n" + 
                                    "<br />\r\n" + 
                                    "<div>\r\n" + 
                                    "<label>\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"add\" />addition\r\n" + 
                                    "<br />\r\n" + 
                                    "</label>\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"sub\" />subtraction \r\n" + 
                                    "<br />\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"mul\" />multiplication\r\n" + 
                                    "<br />\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"div\" />division\r\n" + 
                                    "<br /> \r\n" + 
                                    "</div>\r\n" + 
                                    "<input type=\"submit\" value=\"submit\" />\r\n" + 
                                    "</form>\r\n" + 
                                    "</body>\r\n" + 
                                    "</html>\r\n" + 
                                    "");
                             out.println(+result3);

                             
                           
                        }if(request.getParameter("r1").equals("div"))
                        {
                             
                             Div d1=new Div();
                             int result4=d1.division(a1, a2);
                             System.out.println(+result4);
                            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
                                    "<html>\r\n" + 
                                    "<head>\r\n" + 
                                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n" + 
                                    "<title>Calculator</title>\r\n" + 
                                    "</head>\r\n" + 
                                    "<body>\r\n" + 
                                    "<h1 style=\"text_align=center\">Calculator</h1>\r\n" + 
                                    "<form method=\"get\" action=\"Calculator\">\r\n" + 
                                    "<label>first number:</label>\r\n" + 
                                    "<input type=\"text\" name=\"n1\" />\r\n" + 
                                    ""+"<br />\r\n" + 
                                    "<label>Second number : </label>\r\n" + 
                                    "<input type=\"text\" name=\"n2\" />\r\n" + 
                                    "<br />\r\n" + 
                                    "<div>\r\n" + 
                                    "<label>\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"add\" />addition\r\n" + 
                                    "<br />\r\n" + 
                                    "</label>\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"sub\" />subtraction \r\n" + 
                                    "<br />\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"mul\" />multiplication\r\n" + 
                                    "<br />\r\n" + 
                                    "<input type=\"radio\" name=\"r1\" value=\"div\" />division\r\n" + 
                                    "<br /> \r\n" + 
                                    "</div>\r\n" + 
                                    "<input type=\"submit\" value=\"submit\" />\r\n" + 
                                    "</form>\r\n" + 
                                    "</body>\r\n" + 
                                    "</html>\r\n" + 
                                    "");
                             out.println(+result4);

                        }
                        }
                        catch(Exception e)
                        {

                        }
                    }
                }

}
