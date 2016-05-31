package org.apache.jsp.WEB_002dINF.views.massages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class massageall_jspx extends org.apache.jasper.runtime.HttpJspBase
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
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("<div style=\"margin-top: 25px\" class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<legend>");
      out.write("<p style=\"font-family: FontAwesome;             font-size: 24px;\">");
      out.write("การนวดเพื่อสุขภาพ");
      out.write("</p>");
      out.write("</legend>");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div class=\"col-sm-4\">");
      out.write("<p>");
      out.write("<img src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${massages}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" style=\"display: block;float: right ;width: 400px; height: 480px;\" />");
      out.write("</p>");
      out.write("</div>");
      out.write("<div class=\"col-sm-8\">");
      out.write("<div class=\"table-responsive\">");
      out.write("<table id=\"massagetable\" class=\"table\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("นวดเพื่อสุขภาพ");
      out.write("</center>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("เวลา/นาที");
      out.write("</center>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("ราคา/บาท");
      out.write("</center>");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"massagebodytable\">");
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<style>");
      out.write("\n");
      out.write("        .dataTables_filter, .dataTables_info { display: none; }\n");
      out.write("        td center{\n");
      out.write("              font-family: FontAwesome;\n");
      out.write("              font-size: 16px;\n");
      out.write("          }\n");
      out.write("        th center{\n");
      out.write("            font-family: FontAwesome;\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background: #66afe9;\n");
      out.write("        }\n");
      out.write("    ");
      out.write("</style>");
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${massage}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
      out.write("</script>");
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
    _jspx_th_spring_url_0.setVar("massage");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/massageall.js");
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

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setVar("massages");
    _jspx_th_spring_url_1.setValue("/resources/images/massage.jpg");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }
}
