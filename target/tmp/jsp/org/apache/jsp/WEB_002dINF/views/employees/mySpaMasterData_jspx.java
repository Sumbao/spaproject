package org.apache.jsp.WEB_002dINF.views.employees;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mySpaMasterData_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<legend>");
      out.write("<h1>");
      out.write("Data");
      out.write("</h1>");
      out.write("</legend>");
      out.write("<form role=\"form\" class=\"form-horizontal\">");
      if (_jspx_meth_tiles_insertTemplate_0(_jspx_page_context))
        return;
      out.write("</form>");
      out.write("<div role=\"tabpanel\">");
      out.write("<div class=\"tab-content\">");
      if (_jspx_meth_tiles_insertTemplate_1(_jspx_page_context))
        return;
      if (_jspx_meth_tiles_insertTemplate_2(_jspx_page_context))
        return;
      if (_jspx_meth_tiles_insertTemplate_3(_jspx_page_context))
        return;
      if (_jspx_meth_tiles_insertTemplate_4(_jspx_page_context))
        return;
      if (_jspx_meth_tiles_insertTemplate_5(_jspx_page_context))
        return;
      if (_jspx_meth_tiles_insertTemplate_6(_jspx_page_context))
        return;
      if (_jspx_meth_tiles_insertTemplate_7(_jspx_page_context))
        return;
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
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

  private boolean _jspx_meth_tiles_insertTemplate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_0.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_0.setTemplate("/WEB-INF/views/employees/mySpaMenuTabs.jspx");
    _jspx_th_tiles_insertTemplate_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertTemplate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_1.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_1.setTemplate("/WEB-INF/views/employees/mySpaEmployeeMasterData.jspx");
    _jspx_th_tiles_insertTemplate_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertTemplate_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_2.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_2.setTemplate("/WEB-INF/views/customers/mySpaCustomerMasterData.jspx");
    _jspx_th_tiles_insertTemplate_2.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertTemplate_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_3.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_3.setTemplate("/WEB-INF/views/holidays/mySpaHolidayMasterData.jspx");
    _jspx_th_tiles_insertTemplate_3.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertTemplate_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_4.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_4.setTemplate("/WEB-INF/views/massagetypeses/mySpaMassagetypeMasterData.jspx");
    _jspx_th_tiles_insertTemplate_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertTemplate_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_5.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_5.setTemplate("/WEB-INF/views/massages/mySpaMassageMasterData.jspx");
    _jspx_th_tiles_insertTemplate_5.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertTemplate_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_6.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_6.setTemplate("/WEB-INF/views/producttypeses/mySpaProductTypesMasterData.jspx");
    _jspx_th_tiles_insertTemplate_6.doTag();
    return false;
  }

  private boolean _jspx_meth_tiles_insertTemplate_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_insertTemplate_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertTemplateTag.class) : new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jspx_th_tiles_insertTemplate_7.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertTemplate_7.setTemplate("/WEB-INF/views/products/mySpaProductMasterData.jspx");
    _jspx_th_tiles_insertTemplate_7.doTag();
    return false;
  }
}
