package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_var_htmlEscape_code_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_var_htmlEscape_code_arguments_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_message_var_htmlEscape_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_message_var_htmlEscape_code_arguments_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.release();
    _jspx_tagPool_spring_url_var_value_nobody.release();
    _jspx_tagPool_spring_message_var_htmlEscape_code_arguments_nobody.release();
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
      if (_jspx_meth_spring_message_0(_jspx_page_context))
        return;
      if (_jspx_meth_spring_message_1(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_2(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_3(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_4(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_5(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_6(_jspx_page_context))
        return;
      if (_jspx_meth_spring_url_7(_jspx_page_context))
        return;
      out.write("<div class=\"container\">");
      out.write("<div data-ride=\"carousel\" class=\"carousel slide\" id=\"myCarousel\">");
      out.write("<div role=\"listbox\" class=\"carousel-inner\">");
      out.write("<div class=\"item active\">");
      out.write("<img style=\"width: 100%;height: auto;max-height: 400px\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${spahead}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img style=\"width: 100%;height: auto;max-height: 400px\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pic01}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img style=\"width: 100%;height: auto;max-height: 400px\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pic02}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<img style=\"width: 100%;height: auto;max-height: 400px\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pic03}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</div>");
      out.write("</div>");
      out.write("<a data-slide=\"prev\" role=\"button\" href=\"#myCarousel\" class=\"left carousel-control\">");
      out.write("<span aria-hidden=\"true\" class=\"glyphicon glyphicon-chevron-left\" />");
      out.write("<span class=\"sr-only\">");
      out.write("Previous");
      out.write("</span>");
      out.write("</a>");
      out.write("<a data-slide=\"next\" role=\"button\" href=\"#myCarousel\" class=\"right carousel-control\">");
      out.write("<span aria-hidden=\"true\" class=\"glyphicon glyphicon-chevron-right\" />");
      out.write("<span class=\"sr-only\">");
      out.write("Next");
      out.write("</span>");
      out.write("</a>");
      out.write("</div>");
      out.write("<div class=\"row\">");
      out.write("<div class=\"column\">");
      out.write("<h1 style=\"text-align: center\">");
      out.write("ยินดีต้อนรับเข้าสู่ สถานบริการสุขภาพและความงาม วิทยาลัยการแพทย์แผนไทย ราชมงคลธัญบุรี");
      out.write("</h1>");
      out.write("<div class=\"page\">");
      out.write("<p style=\"text-align: center\">");
      out.write("เปิดให้บริการด้านรักษาด้วยศาตร์การแพทย์แผนไทย การตรวจวินิจฉัย ให้คำแนะนำ จ่ายยาสมุนไพรไทย");
      out.write("</p>");
      out.write("<p style=\"text-align: center\">");
      out.write("หัตถบำบัด ประคบอบสมุนไพร และส่งเสริมดูแลสุขภาพและผิวพรรณ");
      out.write("</p>");
      out.write("<br />");
      out.write("<p style=\"text-align: center\">");
      out.write("เปิดให้บริการทุกวันตั้งแต่เวลา 9.00น. ถึง 18.00น.เว้นวันอาทิตย์และวันหยุดราชการ");
      out.write("</p>");
      out.write("<br />");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<h2 style=\"text-align: center\">");
      out.write("การให้บริการ");
      out.write("</h2>");
      out.write("<br />");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-4\">");
      out.write("<a href=\"/MyProjectSpa/massages/beautyall\">");
      out.write("<center>");
      out.write("<img style=\"width:150px;height:150px;\" class=\"img-rounded\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${beauty}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</center>");
      out.write("<h2 style=\"text-align: center\">");
      out.write("เสริมความงาม");
      out.write("</h2>");
      out.write("</a>");
      out.write("</div>");
      out.write("<div class=\"col-sm-4\">");
      out.write("<a href=\"/MyProjectSpa/massages/massageall\">");
      out.write("<center>");
      out.write("<img style=\"width:150px;height:150px\" class=\"img-rounded\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${massage}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</center>");
      out.write("<h2 style=\"text-align: center\">");
      out.write("นวดเพื่อสุขภาพ");
      out.write("</h2>");
      out.write("</a>");
      out.write("</div>");
      out.write("<div class=\"col-sm-4\">");
      out.write("<a href=\"/MyProjectSpa/products/productall\">");
      out.write("<center>");
      out.write("<img style=\"width:150px;height:150px\" class=\"img-rounded\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" />");
      out.write("</center>");
      out.write("<h2 style=\"text-align: center\">");
      out.write("ผลิตภัณท์");
      out.write("</h2>");
      out.write("</a>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Informationall}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
      out.write("</script>");
      out.write("<style>");
      out.write("\n");
      out.write("        .container h1 {\n");
      out.write("            font-family: FontAwesome;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .page p{\n");
      out.write("            font-family: FontAwesome;\n");
      out.write("            font-size: 23px;\n");
      out.write("        }\n");
      out.write("        .content p{\n");
      out.write("            font-family: FontAwesome;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            font-family: FontAwesome;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("    ");
      out.write("</style>");
      out.write("<style>");
      out.write("\n");
      out.write("        .carousel-inner > .item > img,\n");
      out.write("        .carousel-inner > .item > a > img {\n");
      out.write("            width: 70%;\n");
      out.write("            margin: auto;\n");
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

  private boolean _jspx_meth_spring_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent(null);
    _jspx_th_spring_message_0.setHtmlEscape("false");
    _jspx_th_spring_message_0.setCode("application_name");
    _jspx_th_spring_message_0.setVar("app_name");
    int[] _jspx_push_body_count_spring_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_0 = _jspx_th_spring_message_0.doStartTag();
      if (_jspx_th_spring_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_0.doFinally();
      _jspx_tagPool_spring_message_var_htmlEscape_code_nobody.reuse(_jspx_th_spring_message_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_1 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_var_htmlEscape_code_arguments_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_1.setParent(null);
    _jspx_th_spring_message_1.setHtmlEscape("false");
    _jspx_th_spring_message_1.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${app_name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_spring_message_1.setCode("welcome_titlepane");
    _jspx_th_spring_message_1.setVar("title");
    int[] _jspx_push_body_count_spring_message_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_1 = _jspx_th_spring_message_1.doStartTag();
      if (_jspx_th_spring_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_1.doFinally();
      _jspx_tagPool_spring_message_var_htmlEscape_code_arguments_nobody.reuse(_jspx_th_spring_message_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setVar("Informationall");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/informationall.js");
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
    _jspx_th_spring_url_1.setVar("spahead");
    _jspx_th_spring_url_1.setValue("/resources/images/spaheader.jpg");
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
    _jspx_th_spring_url_2.setVar("beauty");
    _jspx_th_spring_url_2.setValue("/resources/images/beauty.jpg");
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
    _jspx_th_spring_url_3.setVar("massage");
    _jspx_th_spring_url_3.setValue("/resources/images/massage.jpg");
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

  private boolean _jspx_meth_spring_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_4 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_4.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_4.setParent(null);
    _jspx_th_spring_url_4.setVar("product");
    _jspx_th_spring_url_4.setValue("/resources/images/product.jpg");
    int[] _jspx_push_body_count_spring_url_4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_4 = _jspx_th_spring_url_4.doStartTag();
      if (_jspx_th_spring_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_4.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_5 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_5.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_5.setParent(null);
    _jspx_th_spring_url_5.setVar("pic01");
    _jspx_th_spring_url_5.setValue("/resources/images/01.JPG");
    int[] _jspx_push_body_count_spring_url_5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_5 = _jspx_th_spring_url_5.doStartTag();
      if (_jspx_th_spring_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_5.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_6 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_6.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_6.setParent(null);
    _jspx_th_spring_url_6.setVar("pic02");
    _jspx_th_spring_url_6.setValue("/resources/images/02.JPG");
    int[] _jspx_push_body_count_spring_url_6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_6 = _jspx_th_spring_url_6.doStartTag();
      if (_jspx_th_spring_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_6.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_6);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_7 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_7.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_7.setParent(null);
    _jspx_th_spring_url_7.setVar("pic03");
    _jspx_th_spring_url_7.setValue("/resources/images/03.JPG");
    int[] _jspx_push_body_count_spring_url_7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_7 = _jspx_th_spring_url_7.doStartTag();
      if (_jspx_th_spring_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_7.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_7);
    }
    return false;
  }
}
