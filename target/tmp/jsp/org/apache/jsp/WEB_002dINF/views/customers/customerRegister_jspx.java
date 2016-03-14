package org.apache.jsp.WEB_002dINF.views.customers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerRegister_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div id=\"CompaniesTabs\" class=\"tab-pane active\" role=\"tabpanel\" version=\"2.0\">");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div role=\"form\" class=\"form-horizontal\">");
      out.write("<h3 class=\"col-sm-offset-1\">");
      out.write("Register");
      out.write("</h3>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("Username");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input maxlength=\"10\" data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"txt_CusUsername\" type=\"text\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("Password");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input class=\"form-control\" id=\"txt_password\" type=\"password\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("Name");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input class=\"form-control\" id=\"txt_CusName\" type=\"text\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("Address");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input class=\"form-control\" id=\"txt_CusAddr\" type=\"text\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\" for=\"dateWorking\">");
      out.write("BirthDay");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<div class=\"input-group\">");
      out.write("<input data-toggle=\"popover\" placeholder=\"dd/mm/yyyy\" readonly=\"true\" class=\"form-control\" id=\"txt_CusBirthDay\" type=\"text\" />");
      out.write("<span class=\"input-group-btn\">");
      out.write("<button type=\"button\" class=\"btn btn-default\" id=\"btn_BirthDate\">");
      out.write("<span class=\"glyphicon glyphicon-calendar\" />");
      out.write("</button>");
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("Age");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input max=\"100\" min=\"1\" class=\"form-control\" id=\"txt_CusAge\" type=\"number\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("Sex");
      out.write("</label>");
      out.write("<div clas=\"col-sm-6\">");
      out.write("<label class=\"radio-inline\">");
      out.write("<input id=\"rad_1\" value=\"male\" name=\"sex\" type=\"radio\">");
      out.write("Male");
      out.write("</input>");
      out.write("</label>");
      out.write("<label class=\"radio-inline\">");
      out.write("<input id=\"rad_2\" value=\"Female\" name=\"sex\" type=\"radio\">");
      out.write("Female");
      out.write("</input>");
      out.write("</label>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("E-mail");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input class=\"form-control\" id=\"txt_CusEmail\" type=\"email\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-2 control-label\">");
      out.write("Tel");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input class=\"form-control\" id=\"txt_CusTel\" type=\"text\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<button id=\"btn_Register\" class=\"btn btn-primary col-sm-offset-4\">");
      out.write("สมัครสมาชิก");
      out.write("</button>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${register}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
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
    _jspx_th_spring_url_0.setVar("register");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/register.js");
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
