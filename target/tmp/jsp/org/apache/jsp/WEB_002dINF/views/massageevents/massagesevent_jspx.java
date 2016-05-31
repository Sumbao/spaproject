package org.apache.jsp.WEB_002dINF.views.massageevents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class massagesevent_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
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

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<div style=\"margin-top: 20px\" class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div class=\"form-horizontal\">");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"control-label col-sm-4\">");
      out.write("พนักงาน");
      out.write("</label>");
      out.write("<div class=\"col-sm-3\">");
      out.write("<select class=\"form-control\" id=\"selectemp\">");
      out.write("<option value=\"01\" />");
      out.write("</select>");
      out.write("</div>");
      out.write("<button id=\"searchEmpEvent\" class=\"btn btn-primary\" type=\"button\">");
      out.write("<span class=\"glyphicon glyphicon-search\" />");
      out.write("</button>");
      out.write("<button style=\"margin-left: 5px\" id=\"newEmpEvent\" class=\"btn btn-danger\" type=\"button\">");
      out.write("จองเวลาใช้บริการ");
      out.write("</button>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"fc fc-ltr fc-unthemed\" id=\"calendar\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${massageevent}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
      out.write("</script>");
      out.write("<style>");
      out.write("\n");
      out.write("        body {\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: \"Lucida Grande\",Helvetica,Arial,Verdana,sans-serif;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #calendar {\n");
      out.write("            /*max-width: 900px;*/\n");
      out.write("            margin: 0 auto;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fc-title{\n");
      out.write("            font-family: \"Lucida Grande\",Helvetica,Arial,Verdana,sans-serif;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fc-time{\n");
      out.write("            font-family: \"Lucida Grande\",Helvetica,Arial,Verdana,sans-serif;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        label{\n");
      out.write("            font-family: \"Lucida Grande\",Helvetica,Arial,Verdana,sans-serif;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fc-widget-header{\n");
      out.write("            background-color:#66afe9;\n");
      out.write("            color:white;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fc-unthemed .fc-today {\n");
      out.write("            background-color: #fcefa1;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fc-sun { color:red;  }\n");
      out.write("\n");
      out.write("    ");
      out.write("</style>");
      out.write("</div>");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setVar("massageevent");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/massageEvent.js");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }
}
