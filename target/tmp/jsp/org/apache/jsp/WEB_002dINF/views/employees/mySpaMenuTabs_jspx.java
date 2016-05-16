package org.apache.jsp.WEB_002dINF.views.employees;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mySpaMenuTabs_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<ul id=\"myTab\" role=\"tablist\" class=\"nav nav-tabs\" version=\"2.0\">");
      out.write("<li class=\"active\" role=\"presentation\">");
      out.write("<a data-toggle=\"tab\" role=\"tab\" aria-controls=\"EmployeesTabs\" href=\"#EmployeesTabs\">");
      out.write("Employees");
      out.write("</a>");
      out.write("</li>");
      out.write("<li role=\"presentation\">");
      out.write("<a data-toggle=\"tab\" role=\"tab\" aria-controls=\"CustomerTabs\" href=\"#CustomerTabs\">");
      out.write("Customer");
      out.write("</a>");
      out.write("</li>");
      out.write("<li role=\"presentation\">");
      out.write("<a data-toggle=\"tab\" role=\"tab\" aria-controls=\"MassageTabs\" href=\"#MassageTabs\">");
      out.write("Massage");
      out.write("</a>");
      out.write("</li>");
      out.write("<li role=\"presentation\">");
      out.write("<a data-toggle=\"tab\" role=\"tab\" aria-controls=\"ProductTypesTabs\" onclick=\"loadtableprotype(this)\" href=\"#ProductTypesTabs\">");
      out.write("ProductTypes");
      out.write("</a>");
      out.write("</li>");
      out.write("<li role=\"presentation\">");
      out.write("<a data-toggle=\"tab\" role=\"tab\" aria-controls=\"ProductTabs\" onclick=\"loadtableproduct(this);setproType(this)\" href=\"#ProductTabs\">");
      out.write("Product");
      out.write("</a>");
      out.write("</li>");
      out.write("<li role=\"presentation\">");
      out.write("<a data-toggle=\"tab\" role=\"tab\" aria-controls=\"InformationTabs\" href=\"#InformationTabs\">");
      out.write("Information");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
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
