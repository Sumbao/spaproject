package org.apache.jsp.WEB_002dINF.views.products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productall_jspx extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>");
      out.write("\n");
      out.write("        .itemactive{\n");
      out.write("            background-position: center thumbnail;\n");
      out.write("            background-position: center center;\n");
      out.write("            background-position: center bottom;\n");
      out.write("        }\n");
      out.write("    ");
      out.write("</style>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("        var partImages = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("    ");
      out.write("</script>");
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<div class=\"col-sm-12\">");
      out.write("<div role=\"form\" class=\"form-horizontal\">");
      out.write("<div class=\"form-group\">");
      out.write("<div class=\"table-responsive\">");
      out.write("<div class=\"form-horizontal\">");
      out.write("<div class=\"form-group col-sm-12\">");
      out.write("<label class=\"control-label\">");
      out.write("All Product");
      out.write("</label>");
      out.write("</div>");
      out.write("<div class=\"col-sm-12\" id=\"productSearchAll\">");
      out.write("<div class=\"row\" id=\"rowProduct\">");
      out.write("</div>");
      out.write("<div class=\"container main-container\">");
      out.write("<div class=\"carousel slide\" id=\"carousel-example-generic\">");
      out.write("<div role=\"listbox\" class=\"carousel-inner\">");
      out.write("<div class=\"itemactive \">");
      out.write("<div class=\"carousel-captionactive\">");
      out.write("</div>");
      out.write("</div>");
      out.write("<div class=\"item\">");
      out.write("<div class=\"carousel-captionitem\">");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<a style=\"width: 0px; height: 400px;\" data-slide=\"prev\" role=\"button\" href=\"#carousel-example-generic\" class=\"left carousel-control\">");
      out.write("<span aria-hidden=\"true\" class=\"glyphicon glyphicon-chevron-left\" />");
      out.write("<span class=\"sr-only\">");
      out.write("Previous");
      out.write("</span>");
      out.write("</a>");
      out.write("<a style=\"width: 0px; height: 400px;\" data-slide=\"next\" role=\"button\" href=\"#carousel-example-generic\" class=\"right carousel-control\">");
      out.write("<span aria-hidden=\"true\" class=\"glyphicon glyphicon-chevron-right\" />");
      out.write("<span class=\"sr-only\">");
      out.write("Next");
      out.write("</span>");
      out.write("</a>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\" src=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productsearch}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\">");
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
    _jspx_th_spring_url_0.setVar("productsearch");
    _jspx_th_spring_url_0.setValue("/resources/scripts/MyProjectSpa/productsearch.js");
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
