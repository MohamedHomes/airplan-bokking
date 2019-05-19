package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Login</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style_1.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <div class=\"wrap\">\n");
      out.write("\t\t<div class=\"avatar\">\n");
      out.write("                    <img src=\"images/w.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("      <form method=\"post\" action=\"log\">\n");
      out.write("      <input type=\"text\" name=\"email\" placeholder=\"EMAIL\" required>\n");
      out.write("\t\t<div class=\"bar\">\n");
      out.write("\t\t\t<i></i>\n");
      out.write("\t\t</div>\n");
      out.write("      <input type=\"password\"  name=\"pass\" placeholder=\"password\" required>\n");
      out.write("\t\t<a href=\"\" class=\"forgot_link\">forgot ?</a>\n");
      out.write("\t\t<button>Sign in</button>\n");
      out.write("\t</div>\n");
      out.write("    </form>\n");
      out.write("    <script src=\"js/index.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
