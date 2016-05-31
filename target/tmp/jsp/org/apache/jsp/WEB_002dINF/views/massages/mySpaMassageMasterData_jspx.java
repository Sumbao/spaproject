package org.apache.jsp.WEB_002dINF.views.massages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mySpaMassageMasterData_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div id=\"MassageTabs\" class=\"tab-pane\" role=\"tabpanel\" version=\"2.0\">");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div role=\"forn\" class=\"form-horizontal\">");
      out.write("<div style=\"margin-top: 10px\" class=\"form-group\">");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-success\" id=\"massageBtnAdd\">");
      out.write("<span class=\"glyphicon glyphicon-plus\" />");
      out.write("</button>");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-danger\" id=\"massageDelete\">");
      out.write("<span class=\"glyphicon glyphicon-minus\" />");
      out.write("</button>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<div style=\"width:100%\">");
      out.write("<table width=\"100%\" cellspacing=\"0\" id=\"tableMassage\" role=\"table\" data-toggle=\"table\" class=\"table table-responsive paginated\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th class=\"col\">");
      out.write("<div>");
      out.write("<center>");
      out.write("<input type=\"checkbox\" id=\"checkBoxMassageAll\" />");
      out.write("</center>");
      out.write("</div>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("\n");
      out.write("                                        รหัสการให้บริการ\n");
      out.write("                                        ");
      out.write("</center>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("\n");
      out.write("                                        ชื่อการให้บริการ\n");
      out.write("                                        ");
      out.write("</center>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("\n");
      out.write("                                        ประเภทการให้บริการ\n");
      out.write("                                        ");
      out.write("</center>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("\n");
      out.write("                                        เวลาในการให้บริการ\n");
      out.write("                                        ");
      out.write("</center>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("\n");
      out.write("                                        แก้ไข\n");
      out.write("                                        ");
      out.write("</center>");
      out.write("</th>");
      out.write("<th class=\"col\">");
      out.write("<center>");
      out.write("\n");
      out.write("                                        ลบ\n");
      out.write("                                        ");
      out.write("</center>");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"tablemassagebody\">");
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-horizontal\">");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalAddMassage\">");
      out.write("<div class=\"modal-dialog\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<h4>");
      out.write("เพิ่มข้อมูลการให้บริการ");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("รหัสการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"massageCodeAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("ชื่อการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"massagenameAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label\">");
      out.write("ประเภทการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<select data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"select_Massagetype\">");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("เวลาในการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<select data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"select_MassageTime\">");
      out.write("<option value=\"30\">");
      out.write("30 นาที");
      out.write("</option>");
      out.write("<option value=\"45\">");
      out.write("45 นาที");
      out.write("</option>");
      out.write("<option value=\"60\">");
      out.write("60 นาที");
      out.write("</option>");
      out.write("<option value=\"90\">");
      out.write("90 นาที");
      out.write("</option>");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("รายละเอียด");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<textarea maxlength=\"300\" data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"massageDesAdd\">");
      out.write("</textarea>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddmassage\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelmassage\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-remove\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddNextmassage\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-chevron-right\" />");
      out.write("</button>");
      out.write("</center>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalEditMassage\">");
      out.write("<div class=\"modal-dialog\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<h4>");
      out.write("แก้ไขข้อมูลการให้บริการ");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("รหัสการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"massageCodeEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("ชื่อการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"massagenameEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label\">");
      out.write("ประเภทการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<select data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"select_MassagetypeEdit\">");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("เวลาในการให้บริการ");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<select data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"select_MassageTimeEdit\">");
      out.write("<option value=\"30\">");
      out.write("30 นาที");
      out.write("</option>");
      out.write("<option value=\"45\">");
      out.write("45 นาที");
      out.write("</option>");
      out.write("<option value=\"60\">");
      out.write("60 นาที");
      out.write("</option>");
      out.write("<option value=\"90\">");
      out.write("90 นาที");
      out.write("</option>");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("รายละเอียด");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<textarea maxlength=\"300\" data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"massageDesEdit\">");
      out.write("</textarea>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnEditmassage\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelEditmassage\">");
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
      out.write("</div>");
      out.write("<style>");
      out.write("\n");
      out.write("        th center {\n");
      out.write("            font-family: \"Lucida Grande\", Helvetica, Arial, Verdana, sans-serif;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td center {\n");
      out.write("            font-family: \"Lucida Grande\", Helvetica, Arial, Verdana, sans-serif;\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .paging-nav {\n");
      out.write("            text-align: right;\n");
      out.write("            padding-top: 2px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .paging-nav a {\n");
      out.write("            margin: auto 1px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 1px 7px;\n");
      out.write("            background: #91b9e6;\n");
      out.write("            color: white;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .paging-nav .selected-page {\n");
      out.write("            background: #187ed5;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
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
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/massage.js");
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
