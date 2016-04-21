package org.apache.jsp.WEB_002dINF.views.products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mySpaProductMasterData_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div id=\"ProductTabs\" class=\"tab-pane\" role=\"tabpanel\" version=\"2.0\">");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div role=\"form\" class=\"form-horizontal\">");
      out.write("<div style=\"margin-top: 10px\" class=\"form-group\">");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-success\" id=\"productBtnAdd\">");
      out.write("<span class=\"glyphicon glyphicon-plus\" />");
      out.write("</button>");
      out.write("<button style=\"margin-right:5px;\" class=\"btn btn-danger\" id=\"productDelete\">");
      out.write("<span class=\"glyphicon glyphicon-minus\" />");
      out.write("</button>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<div class=\"table-responsive\">");
      out.write("<table role=\"table\" data-toggle=\"table\" class=\"table\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      out.write("<div>");
      out.write("<center>");
      out.write("<input type=\"checkbox\" id=\"checkBoxproAll\" />");
      out.write("</center>");
      out.write("</div>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("edit");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("Product Code");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("product Name");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("Product datail");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("Product Price");
      out.write("</center>");
      out.write("</th>");
      out.write("<th>");
      out.write("<center>");
      out.write("Product types");
      out.write("</center>");
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody id=\"tableProduct\">");
      out.write("</tbody>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-horizontal\">");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalAddProduct\">");
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
      out.write("product Code");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"proCodeAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("product Name");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"pronameAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label\">");
      out.write("product type");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<select data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"select_Protype\">");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("product detail");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<textarea maxlength=\"50\" data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"prodesAdd\">");
      out.write("</textarea>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("product Price");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"propriceAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label\">");
      out.write("product picture");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<div class=\"input-group\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" disabled=\"disabled\" class=\"form-control\" type=\"text\" id=\"productPicture\" />");
      out.write("<span class=\"input-group-btn fileUpload\">");
      out.write("<span class=\"btn btn-primary btn-file glyphicon glyphicon-folder-close\">");
      out.write("<input class=\"upload\" id=\"file\" type=\"file\" />");
      out.write("</span>");
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddpro\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelpro\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-remove\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnAddNextpro\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-chevron-right\" />");
      out.write("</button>");
      out.write("</center>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalEditProduct\">");
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
      out.write("product Code");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"protypeCodeAdd\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("product Name");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"protypenameEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label\">");
      out.write("product type");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<select data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"select_ProtypeEdit\">");
      out.write("</select>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("product detail");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<textarea maxlength=\"50\" data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" id=\"protypedesEdit\">");
      out.write("</textarea>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label required\">");
      out.write("product Price");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" class=\"form-control\" type=\"text\" id=\"protypenameEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-3 control-label\">");
      out.write("product picture");
      out.write("</label>");
      out.write("<div class=\"col-sm-6\">");
      out.write("<div class=\"input-group\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" disabled=\"disabled\" class=\"form-control\" type=\"text\" id=\"productPictureEdit\" />");
      out.write("<span class=\"input-group-btn fileUpload\">");
      out.write("<span class=\"btn btn-primary btn-file glyphicon glyphicon-folder-close\">");
      out.write("<input class=\"upload\" id=\"productFileEdit\" type=\"producrfileedit\" />");
      out.write("</span>");
      out.write("</span>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"modal-footer\">");
      out.write("<center>");
      out.write("<button class=\"btn btn-primary\" id=\"modalBtnEditPro\">");
      out.write("<span class=\"glyphicon glyphicon glyphicon-ok\" />");
      out.write("</button>");
      out.write("<button class=\"btn btn-danger\" id=\"btnCancelEditPro\">");
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
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProDuct}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
      out.write("</script>");
      out.write("<style type=\"text/css\">");
      out.write("\n");
      out.write("        .fileUpload {\n");
      out.write("            position: relative;\n");
      out.write("            overflow: hidden;\n");
      out.write("            margin: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fileUpload input.upload {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            right: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-size: 20px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            opacity: 0;\n");
      out.write("            filter: alpha(opacity=0);\n");
      out.write("        }\n");
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
    _jspx_th_spring_url_0.setVar("ProDuct");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/product.js");
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
