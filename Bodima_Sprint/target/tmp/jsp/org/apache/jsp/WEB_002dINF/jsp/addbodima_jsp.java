/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2018-04-15 06:43:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addbodima_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<section id=\"addbodima\" class=\"wow fadeInUp\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"section-header\">\n");
      out.write("          <h2>Add Bodima</h2>\n");
      out.write("           <div class=\"container\" style=\"padding-top:28px\">\n");
      out.write("                 <div class=\"form\">\n");
      out.write("\n");
      out.write("                   <div id=\"errormessage\"></div>\n");
      out.write("                   <form action=\"\" method=\"post\" role=\"form\" class=\"contactForm\">\n");
      out.write("                     <div class=\"form-row\">\n");
      out.write("                       <div class=\"form-group col-md-6\">\n");
      out.write("                         <input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\" placeholder=\"Owner Name\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 4 chars\" />\n");
      out.write("                         <div class=\"validation\"></div>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"form-group col-md-6\">\n");
      out.write("                         <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Your Email\" data-rule=\"email\" data-msg=\"Please enter a valid email\" />\n");
      out.write("                         <div class=\"validation\"></div>\n");
      out.write("                       </div>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                       <input type=\"text\" class=\"form-control\" name=\"subject\" id=\"subject\" placeholder=\"Subject\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 8 chars of subject\" />\n");
      out.write("                       <div class=\"validation\"></div>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                       <textarea class=\"form-control\" name=\"message\" rows=\"5\" data-rule=\"required\" data-msg=\"Please write something for us\" placeholder=\"Message\"></textarea>\n");
      out.write("                       <div class=\"validation\"></div>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"text-center\"><button type=\"submit\">Send Message</button></div>\n");
      out.write("                   </form>\n");
      out.write("                 </div>\n");
      out.write("\n");
      out.write("               </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- #testimonials -->\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
