package org.apache.jsp.WEB_002dINF.views.employees;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mySpaEmployeeMasterData_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div id=\"EmployeesTabs\" class=\"tab-pane active\" role=\"tabpanel\" version=\"2.0\">");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div role=\"forn\" class=\"form-horizontal\">");
      out.write("<div style=\"margin-top: 10px\" class=\"form-group\">");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-success\" id=\"employeeBtnAdd\">");
      out.write("<span class=\"glyphicon glyphicon-plus\" />");
      out.write("</button>");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-danger\" id=\"employeesDelete\">");
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
      out.write("<input type=\"checkbox\" id=\"checkBoxEmployeeAll\" />");
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
      out.write("EmpCode");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("EmpName");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("EmpAddr");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("EmpTel");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("EmpEmail");
      out.write("</center>");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"tableEmployee\">");
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-horizontal\">");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalAddEmployee\">");
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
      out.write("EmpCode");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"empCodeAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpName");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"empNameAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpAddr");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"empAddrAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpTel");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"tel\" id=\"empTelAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpEmail");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"email\" id=\"empemailAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddEmp\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelAdd\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-remove\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddNextEmp\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-chevron-right\" />");
      out.write("</button>");
      out.write("</center>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalEditEmployee\">");
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
      out.write("EmpCode");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"empCodeEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpName");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"empNameEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpAddr");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"empAddrEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpTel");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"tel\" id=\"empTelEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("EmpEmail");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"email\" id=\"empemailEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnEditEmp\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelEdit\">");
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
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employees}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
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
    _jspx_th_spring_url_0.setVar("employees");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/Employees.js");
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
