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
      out.write("<script>");
      out.write("\n");
      out.write("        console.log('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("        if ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' == \"No UserName\") {\n");
      out.write("            location.href = '/' + (window.location.pathname.split('/')[1]) + \"/resources/j_spring_security_logout\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var session = {\n");
      out.write("            date: new Date(Number(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\")).setHours(0, 0, 0, 0),    // the current date without time\n");
      out.write("            time: new Date(Number(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\")),                      // the current date with time\n");
      out.write("            user: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\",                                            // the session user\n");
      out.write("            lang: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lang}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\",                                            // the language is page language\n");
      out.write("            other: [],                                                  // the other use for create request for other\n");
      out.write("            context: '/' + (window.location.pathname.split('/')[1]),    // the context path\n");
      out.write("            contextCurrentURL: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',                                   // the context path remove artifact web app\n");
      out.write("            userRole: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userRole}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',                                   // the session userRole\n");
      out.write("        };\n");
      out.write("        var _language = window.session.lang;\n");
      out.write("        /*    $(function(){\n");
      out.write("         var token = $(\"meta[name='_csrf']\").attr(\"content\");\n");
      out.write("         var header = $(\"meta[name='_csrf_header']\").attr(\"content\");\n");
      out.write("         console.log(token);\n");
      out.write("         console.log(header);\n");
      out.write("         $(document).ajaxSend(function(e, xhr, options) {\n");
      out.write("         xhr.setRequestHeader(header, token);\n");
      out.write("         });\n");
      out.write("         });*/\n");
      out.write("\n");
      out.write("    ");
      out.write("</script>");
      out.write("<nav class=\"navbar navbar-default\">");
      out.write("<div class=\"container-fluid\">");
      if (_jspx_meth_spring_url_2(_jspx_page_context))
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
      out.write("<a style=\"padding-left: 0px; padding-top: 0px; padding-bottom: 0px; padding-right: 0px;\" href=\"#MyProjectSpa\" class=\"navbar-brand\" />");
      out.write("<img class=\"image-nav\" style=\"width: 50px; height: 50px;\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${spa}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" id=\"image\" />");
      out.write("</div>");
      out.write("<div id=\"bs-example-navbar-collapse-1\" class=\"collapse navbar-collapse\">");
      out.write("<ul class=\"nav navbar-nav\">");
      out.write("<li class=\"active\">");
      out.write("<a href=\"#\">");
      out.write("Link ");
      out.write("<span class=\"sr-only\">");
      out.write("(current)");
      out.write("</span>");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Link");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"dropdown\">");
      out.write("<a aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">");
      out.write("Dropdown ");
      out.write("<span class=\"caret\" />");
      out.write("</a>");
      out.write("<ul class=\"dropdown-menu\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Action");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Another action");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Something else here");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"divider\" role=\"separator\" />");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Separated link");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"divider\" role=\"separator\" />");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("One more separated link");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</li>");
      out.write("</ul>");
      out.write("<ul class=\"nav navbar-nav navbar-right\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Link");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"dropdown\">");
      out.write("<a aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">");
      out.write("Dropdown ");
      out.write("<span class=\"caret\" />");
      out.write("</a>");
      out.write("<ul class=\"dropdown-menu\">");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Action");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Another action");
      out.write("</a>");
      out.write("</li>");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Something else here");
      out.write("</a>");
      out.write("</li>");
      out.write("<li class=\"divider\" role=\"separator\" />");
      out.write("<li>");
      out.write("<a href=\"#\">");
      out.write("Separated link");
      out.write("</a>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</li>");
      out.write("</ul>");
      out.write("</div>");
      out.write("</div>");
      out.write("</nav>");
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
    _jspx_th_spring_url_2.setValue("/resources/images/spa.png");
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
}