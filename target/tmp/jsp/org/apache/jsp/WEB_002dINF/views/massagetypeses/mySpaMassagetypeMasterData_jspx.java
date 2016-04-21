package org.apache.jsp.WEB_002dINF.views.massagetypeses;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mySpaMassagetypeMasterData_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div id=\"MassageTypesTabs\" class=\"tab-pane\" role=\"tabpanel\" version=\"2.0\">");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div role=\"forn\" class=\"form-horizontal\">");
      out.write("<div style=\"margin-top: 10px\" class=\"form-group\">");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-success\" id=\"mastypeBtnAdd\">");
      out.write("<span class=\"glyphicon glyphicon-plus\" />");
      out.write("</button>");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-danger\" id=\"mastypeDelete\">");
      out.write("<span class=\"glyphicon glyphicon-minus\" />");
      out.write("</button>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<div>");
      out.write("<table role=\"table\" data-toggle=\"table\" class=\"table table-responsive\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      out.write("<div>");
      out.write("<center>");
      out.write("<input type=\"checkbox\" id=\"checkBoxmastypeAll\" />");
      out.write("</center>");
      out.write("</div>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("Edit");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("TypeCode");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("TypeName");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("Detail");
      out.write("</center>");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"tablemastype\">");
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-horizontal\">");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalAddmastype\">");
      out.write("<div class=\"modal-dialog\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<h4>");
      out.write("Add Data");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("TypeCode");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"typeCodeAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("TypeName");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"typeNameAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("Detail");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<textarea maxlength=\"50\" data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"typeDetailAdd\">");
      out.write("</textarea>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddmastype\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelmastype\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-remove\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddNextmastype\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-chevron-right\" />");
      out.write("</button>");
      out.write("</center>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalEditmastype\">");
      out.write("<div class=\"modal-dialog\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<h4>");
      out.write("Edit Data");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("TypeCode");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"typeCodeEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("TypeName");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"typeNameEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("Detail");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<textarea maxlength=\"50\" data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"typeDetailEdit\">");
      out.write("</textarea>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnEditmastype\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelEditmastype\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-remove\" />");
      out.write("</button>");
      out.write("</center>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<script src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${massagetypes}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
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
    _jspx_th_spring_url_0.setVar("massagetypes");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/MassageTypes");
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
