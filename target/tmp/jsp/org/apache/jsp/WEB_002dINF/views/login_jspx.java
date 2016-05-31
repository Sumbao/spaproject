package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

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
      out.write("<div style=\"background-color: #428BCA\" class=\"container-fluid\">");
      out.write("<div style=\"margin-top: 30px\" class=\"mainbox col-sm-6 col-sm-offset-3\" id=\"loginbox\">");
      out.write("<div class=\"panel\">");
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("<div class=\"panel-header\">");
      out.write("<div class=\"panel-title\">");
      out.write("<legend>");
      out.write("<center>");
      out.write("<label style=\"color: black;\">");
      out.write("เข้าสู่ระบบ");
      out.write("</label>");
      out.write("</center>");
      out.write("</legend>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div style=\"padding-top: 30px\" class=\"panel-body\">");
      out.write("<div class=\"form-horizontal\">");
      out.write("<form method=\"POST\" action=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:escapeXml(form_url)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0) + "\" name=\"f\">");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("ชื่อผู้ใช้");
      out.write("</label>");
      out.write("<div class=\"col-sm-10\">");
      out.write("<input placeholder=\"ชื่อผู้ใช้\" name=\"j_username\" id=\"j_username\" class=\"form-control\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("รหัสผ่าน");
      out.write("</label>");
      out.write("<div class=\"col-sm-10\">");
      out.write("<input placeholder=\"รหัสผ่าน\" name=\"j_password\" id=\"j_password\" class=\"form-control\" type=\"password\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-danger                  btn-lg\" type=\"submit\" id=\"login\">");
      out.write("เข้าสู่ระบบ\n");
      out.write("                                    ");
      out.write("</button>");
      out.write("<a href=\"/MyProjectSpa/customers/register\">");
      out.write("<Input style=\"margin-left: 10px\" class=\"btn btn-success btn-lg\" id=\"regis\" value=\"สมัครสมาชิก\" onclick=\"return false;\" type=\"Button\" />");
      out.write("</a>");
      out.write("</center>");
      out.write("</div>");
      out.write("</form>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<style>");
      out.write("\n");
      out.write("        .container-fluid {\n");
      out.write("            background-size: 100%;\n");
      out.write("            position: fixed;\n");
      out.write("            min-width: 100%;\n");
      out.write("            min-height: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            font-family: \"Lucida Grande\", Helvetica, Arial, Verdana, sans-serif;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        legend label {\n");
      out.write("            font-family: \"Lucida Grande\", Helvetica, Arial, Verdana, sans-serif;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("    ");
      out.write("</style>");
      out.write("<script>");
      out.write("\n");
      out.write("        $(\"#regis\").on('click', function () {\n");
      out.write("            window.location.href = \"/MyProjectSpa/customers/register\";\n");
      out.write("        });\n");
      out.write("    ");
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
    _jspx_th_spring_url_0.setVar("loginbg");
    _jspx_th_spring_url_0.setValue("/resources/images/loginBg2.jpg");
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
    _jspx_th_spring_url_1.setVar("form_url");
    _jspx_th_spring_url_1.setValue("/resources/j_spring_security_check");
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
