package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerCustom_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>");
      java.util.Date now = null;
      synchronized (request) {
        now = (java.util.Date) _jspx_page_context.getAttribute("now", PageContext.REQUEST_SCOPE);
        if (now == null){
          now = new java.util.Date();
          _jspx_page_context.setAttribute("now", now, PageContext.REQUEST_SCOPE);
        }
      }
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\">");
      out.write("<div class=\"container-fluid\">");
      if (_jspx_meth_spring_url_2(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_3(_jspx_page_context))
        return;
      out.write("<div class=\"navbar-header\">");
      out.write("<button aria-expanded=\"false\" data-target=\"#bs-example-navbar-collapse-1\" data-toggle=\"collapse\" class=\"navbar-toggle collapsed\" type=\"button\">");
      out.write("<span class=\"sr-only\">");
      out.write("Toggle navigation");
      out.write("</span>");
      out.write("<span class=\"icon-bar\" />");
      out.write("<span class=\"icon-bar\" />");
      out.write("<span class=\"icon-bar\" />");
      out.write("</button>");
      out.write("</div>");
      out.write("<a style=\"padding-left: 0px; padding-top: 0px; padding-bottom: 0px; padding-right: 0px;\" href=\"/MyProjectSpa\" class=\"navbar-nav\" />");
      out.write("<img class=\"image-nav\" style=\"width: 50px; height: 50px;\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${spa}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" id=\"image\" />");
      out.write("<div role=\"navigation\" class=\"collapse navbar-collapse\">");
      out.write("<ul class=\"nav navbar-nav\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("service");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"dropdown\">");
      out.write("<a aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">");
      out.write("products ");
      out.write("<span class=\"caret\" />");
      out.write("</a>");
      out.write("<ul class=\"dropdown-menu\">");
      out.write("<li>");
      out.write("<a href=\"/MyProjectSpa/products/productall\">");
      out.write("product");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"divider\" role=\"separator\" />");
      out.write("<li>");
      out.write("<a href=\"/MyProjectSpa/massages/massageall\">");
      out.write("massage");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"divider\" role=\"separator\" />");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("beauty");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</li>");
      out.write("</ul>");
      out.write("<ul class=\"nav navbar-nav navbar-right\">");
      out.write("<li class=\"btn\">");
      out.write("<button id=\"btn_loginmain\" aria-haspopup=\"true\" role=\"button\" class=\"btn btn-warning\">");
      out.write("login");
      out.write("</button>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</div>");
      out.write("</div>");
      out.write("</nav>");
      out.write("<div role=\"form\" class=\"form-horizontal\">");
      out.write("<div aria-hidden=\"true\" aria-labelledby=\"myModalLabel\" role=\"dialog\" class=\"modal fade\" id=\"modalRegister\">");
      out.write("<div class=\"modal-dialog modal-md\">");
      out.write("<div class=\"modal-content\">");
      out.write("<div class=\"modal-header\">");
      out.write("<h4>");
      out.write("\n");
      out.write("                            login\n");
      out.write("                        ");
      out.write("</h4>");
      out.write("</div>");
      out.write("<div class=\"modal-body\">");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-4 control-label\">");
      out.write("Username");
      out.write("</label>");
      out.write("<div class=\"col-sm-7\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" maxlength=\"10\" class=\"form-control\" type=\"text\" id=\"txt_CompanyCodeEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label class=\"col-sm-4 control-label\">");
      out.write("Password");
      out.write("</label>");
      out.write("<div class=\"col-sm-7\">");
      out.write("<input data-placement=\"bottom\" data-content=\"GG\" data-toggle=\"popover\" maxlength=\"30\" class=\"form-control\" type=\"text\" id=\"txt_CompanyNameEdit\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<center>");
      out.write("<div class=\"modal-footer\">");
      out.write("<button class=\"btn btn-primary\" type=\"button\" id=\"btn_Login\">");
      out.write("Login");
      out.write("</button>");
      out.write("<button class=\"btn btn-warning\" type=\"button\" id=\"btn_Register\">");
      out.write("Register");
      out.write("</button>");
      out.write("</div>");
      out.write("</center>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
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
    _jspx_th_spring_url_0.setVar("dash_board_url");
    _jspx_th_spring_url_0.setValue("/");
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
    _jspx_th_spring_url_1.setVar("image_brand_url");
    _jspx_th_spring_url_1.setValue("/resources/images/ess-brand.png");
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

  private boolean _jspx_meth_spring_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_2 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_2.setParent(null);
    _jspx_th_spring_url_2.setVar("spa");
    _jspx_th_spring_url_2.setValue("/resources/images/logo_spa.png");
    int[] _jspx_push_body_count_spring_url_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_2 = _jspx_th_spring_url_2.doStartTag();
      if (_jspx_th_spring_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_2.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_3 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_3.setParent(null);
    _jspx_th_spring_url_3.setVar("login");
    _jspx_th_spring_url_3.setValue("/resources/scripts/MyProjectSpa/loginScript.js");
    int[] _jspx_push_body_count_spring_url_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_3 = _jspx_th_spring_url_3.doStartTag();
      if (_jspx_th_spring_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_3.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_3);
    }
    return false;
  }
}
