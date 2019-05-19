package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("        <style>\n");
      out.write("            input[type=text] {\n");
      out.write("    width: 20%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 2px solid blue;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    color:#0066cc;\n");
      out.write("    font-size: bold;\n");
      out.write("    font-size: 15px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Airline Reservation</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"100%\">\n");
      out.write("            <tr height=\"100px\">\n");
      out.write("                <td colspan=\"3\" align=\"center\"><h1>Airline Reservation</h1></td>\n");
      out.write("            <td align=\"right\" style=\"vertical-align: top;\"><h3>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("</h3></td></tr>\n");
      out.write("            <tr height=\"50px\" align=\"center\"><td><h3><a href=\"Home.jsp\">Home</a></h3></td>\n");
      out.write("                <td><h3><a href=\"tiketReservation.jsp\">Ticket Reservation</a></h3></td>\n");
      out.write("                <td><h3><a href=\"aboutus.jsp\">About Us</a></h3></td>\n");
      out.write("                <td><h3><a href=\"feedback.jsp\">Feedback</a></h3></td></tr>\n");
      out.write("                    <tr height=\"500px\" align=\"center\"><td colspan=\"4\">\n");
      out.write("                            <form action=\"feedback\" method=\"post\">\n");
      out.write("                                \n");
      out.write("                                <h2 style=\"text-align: center;width: 100%;\">We would Love to hear your thoughts, concerns or problems with anything so we can improve.</h2>\n");
      out.write("                                <h3>Delete tiket </h3>\n");
      out.write("                                <h3>Name</h3>\n");
      out.write("                                <input type=\"text\" name=\"lname\"/><br>\n");
      out.write("                                <button type=\"submit\" name=\"delete\">delete</button> \n");
      out.write("                               \n");
      out.write("                            </form>\n");
      out.write("                </td>\n");
      out.write("               </tr>\n");
      out.write("               <tr height=\"20px\" align=\"center\"><td colspan=\"4\"><footer><h3>Airline Reservation Copyright &copy; 2017</h3></footer></td>\n");
      out.write("               </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
