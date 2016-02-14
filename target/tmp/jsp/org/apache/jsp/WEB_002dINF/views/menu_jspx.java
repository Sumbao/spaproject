package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item.tagx");
  }

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

      out.write("<div version=\"2.0\" id=\"menu\">");
      if (_jspx_meth_menu_menu_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_menu_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu
    org.apache.jsp.tag.web.menu.menu_tagx _jspx_th_menu_menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.menu_tagx.class) : new org.apache.jsp.tag.web.menu.menu_tagx();
    _jspx_th_menu_menu_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_menu_0.setZ("nZaf43BjUg1iM0v70HJVEsXDopc=");
    _jspx_th_menu_menu_0.setId("_menu");
    _jspx_th_menu_menu_0.setJspBody(new menu_jspxHelper( 0, _jspx_page_context, _jspx_th_menu_menu_0, null));
    _jspx_th_menu_menu_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_0.setParent(_jspx_parent);
    _jspx_th_menu_category_0.setZ("n7KHXc7GU0+9McB2s8fbiTRfHfg=");
    _jspx_th_menu_category_0.setId("c_producttypes");
    _jspx_th_menu_category_0.setJspBody(new menu_jspxHelper( 1, _jspx_page_context, _jspx_th_menu_category_0, null));
    _jspx_th_menu_category_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_0.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_0.setParent(_jspx_parent);
    _jspx_th_menu_item_0.setZ("l62yKRIB8f/STKzQkvoGA9vbFGY=");
    _jspx_th_menu_item_0.setUrl("/producttypeses?form");
    _jspx_th_menu_item_0.setMessageCode("global_menu_new");
    _jspx_th_menu_item_0.setId("i_producttypes_new");
    _jspx_th_menu_item_0.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_1.setParent(_jspx_parent);
    _jspx_th_menu_item_1.setZ("iFPG+5/s8IdO1kuHWCVcdI089fI=");
    _jspx_th_menu_item_1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/producttypeses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_1.setMessageCode("global_menu_list");
    _jspx_th_menu_item_1.setId("i_producttypes_list");
    _jspx_th_menu_item_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_1.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_1.setParent(_jspx_parent);
    _jspx_th_menu_category_1.setZ("sxLyQbJ/qSw9Reoi1NHvJhkZ/rU=");
    _jspx_th_menu_category_1.setId("c_employee");
    _jspx_th_menu_category_1.setJspBody(new menu_jspxHelper( 2, _jspx_page_context, _jspx_th_menu_category_1, null));
    _jspx_th_menu_category_1.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_2.setParent(_jspx_parent);
    _jspx_th_menu_item_2.setZ("+S/pgOAdANt9JPGnS20kM8qTu00=");
    _jspx_th_menu_item_2.setUrl("/employees?form");
    _jspx_th_menu_item_2.setMessageCode("global_menu_new");
    _jspx_th_menu_item_2.setId("i_employee_new");
    _jspx_th_menu_item_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_3.setParent(_jspx_parent);
    _jspx_th_menu_item_3.setZ("IfTXfF5mBLDCW+DUkfuN3Wgvias=");
    _jspx_th_menu_item_3.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/employees?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_3.setMessageCode("global_menu_list");
    _jspx_th_menu_item_3.setId("i_employee_list");
    _jspx_th_menu_item_3.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_2.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_2.setParent(_jspx_parent);
    _jspx_th_menu_category_2.setZ("IwkGg6P/GzYyT1/EZ2BfMznznXM=");
    _jspx_th_menu_category_2.setId("c_customertype");
    _jspx_th_menu_category_2.setJspBody(new menu_jspxHelper( 3, _jspx_page_context, _jspx_th_menu_category_2, null));
    _jspx_th_menu_category_2.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_4.setParent(_jspx_parent);
    _jspx_th_menu_item_4.setZ("A1hS8DjZzS5b7Lx9imNQsDalqL0=");
    _jspx_th_menu_item_4.setUrl("/customertypes?form");
    _jspx_th_menu_item_4.setMessageCode("global_menu_new");
    _jspx_th_menu_item_4.setId("i_customertype_new");
    _jspx_th_menu_item_4.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_5.setParent(_jspx_parent);
    _jspx_th_menu_item_5.setZ("JdoW5O6A8eEXil1aAQpty6VOucI=");
    _jspx_th_menu_item_5.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/customertypes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_5.setMessageCode("global_menu_list");
    _jspx_th_menu_item_5.setId("i_customertype_list");
    _jspx_th_menu_item_5.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_3.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_3.setParent(_jspx_parent);
    _jspx_th_menu_category_3.setZ("HpBsevuMnREYvH+2xVZHWrzlOhE=");
    _jspx_th_menu_category_3.setId("c_massage");
    _jspx_th_menu_category_3.setJspBody(new menu_jspxHelper( 4, _jspx_page_context, _jspx_th_menu_category_3, null));
    _jspx_th_menu_category_3.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_6.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_6.setParent(_jspx_parent);
    _jspx_th_menu_item_6.setZ("BqbIBFePzwrExm+Xnn3RT04mhLU=");
    _jspx_th_menu_item_6.setUrl("/massages?form");
    _jspx_th_menu_item_6.setMessageCode("global_menu_new");
    _jspx_th_menu_item_6.setId("i_massage_new");
    _jspx_th_menu_item_6.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_7.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_7.setParent(_jspx_parent);
    _jspx_th_menu_item_7.setZ("4FDcRk2KWyX/5jbNoBCmdmjwmzk=");
    _jspx_th_menu_item_7.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/massages?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_7.setMessageCode("global_menu_list");
    _jspx_th_menu_item_7.setId("i_massage_list");
    _jspx_th_menu_item_7.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_4.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_4.setParent(_jspx_parent);
    _jspx_th_menu_category_4.setZ("SEwnQzeH9Zo/YsYH5KxVHjl+vmY=");
    _jspx_th_menu_category_4.setId("c_holiday");
    _jspx_th_menu_category_4.setJspBody(new menu_jspxHelper( 5, _jspx_page_context, _jspx_th_menu_category_4, null));
    _jspx_th_menu_category_4.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_8.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_8.setParent(_jspx_parent);
    _jspx_th_menu_item_8.setZ("IfFUp52kysemIitooH7uuG3f7JA=");
    _jspx_th_menu_item_8.setUrl("/holidays?form");
    _jspx_th_menu_item_8.setMessageCode("global_menu_new");
    _jspx_th_menu_item_8.setId("i_holiday_new");
    _jspx_th_menu_item_8.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_9.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_9.setParent(_jspx_parent);
    _jspx_th_menu_item_9.setZ("Y6q/IDMKZpfmKMKoybo09i7Oa/I=");
    _jspx_th_menu_item_9.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/holidays?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_9.setMessageCode("global_menu_list");
    _jspx_th_menu_item_9.setId("i_holiday_list");
    _jspx_th_menu_item_9.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_5.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_5.setParent(_jspx_parent);
    _jspx_th_menu_category_5.setZ("TXc9t4+wI05kn6IcWLkoO6QqxNI=");
    _jspx_th_menu_category_5.setId("c_shoppingevent");
    _jspx_th_menu_category_5.setJspBody(new menu_jspxHelper( 6, _jspx_page_context, _jspx_th_menu_category_5, null));
    _jspx_th_menu_category_5.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_10.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_10.setParent(_jspx_parent);
    _jspx_th_menu_item_10.setZ("VlRnGM4gZstOFMGDZKcNH7igmI4=");
    _jspx_th_menu_item_10.setUrl("/shoppingevents?form");
    _jspx_th_menu_item_10.setMessageCode("global_menu_new");
    _jspx_th_menu_item_10.setId("i_shoppingevent_new");
    _jspx_th_menu_item_10.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_11.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_11.setParent(_jspx_parent);
    _jspx_th_menu_item_11.setZ("tMjfTQR7uxkjpdfptSq+prSBtCc=");
    _jspx_th_menu_item_11.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/shoppingevents?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_11.setMessageCode("global_menu_list");
    _jspx_th_menu_item_11.setId("i_shoppingevent_list");
    _jspx_th_menu_item_11.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_6.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_6.setParent(_jspx_parent);
    _jspx_th_menu_category_6.setZ("sVtRKNCGzVLVlzB8MLjDekN+wOo=");
    _jspx_th_menu_category_6.setId("c_massageevent");
    _jspx_th_menu_category_6.setJspBody(new menu_jspxHelper( 7, _jspx_page_context, _jspx_th_menu_category_6, null));
    _jspx_th_menu_category_6.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_12.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_12.setParent(_jspx_parent);
    _jspx_th_menu_item_12.setZ("JaG3Aib3bzDDJ346RZhiTBnc2kk=");
    _jspx_th_menu_item_12.setUrl("/massageevents?form");
    _jspx_th_menu_item_12.setMessageCode("global_menu_new");
    _jspx_th_menu_item_12.setId("i_massageevent_new");
    _jspx_th_menu_item_12.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_13.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_13.setParent(_jspx_parent);
    _jspx_th_menu_item_13.setZ("rVgBGHtUPVmmgZYbvP1O7H/bPSc=");
    _jspx_th_menu_item_13.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/massageevents?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_13.setMessageCode("global_menu_list");
    _jspx_th_menu_item_13.setId("i_massageevent_list");
    _jspx_th_menu_item_13.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_7.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_7.setParent(_jspx_parent);
    _jspx_th_menu_category_7.setZ("Wa+bVSiDyYo/wX1nGU1B/z+OKhE=");
    _jspx_th_menu_category_7.setId("c_customer");
    _jspx_th_menu_category_7.setJspBody(new menu_jspxHelper( 8, _jspx_page_context, _jspx_th_menu_category_7, null));
    _jspx_th_menu_category_7.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_14.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_14.setParent(_jspx_parent);
    _jspx_th_menu_item_14.setZ("d9+YIotZHp6KZLGKwwnMVzPvh8k=");
    _jspx_th_menu_item_14.setUrl("/customers?form");
    _jspx_th_menu_item_14.setMessageCode("global_menu_new");
    _jspx_th_menu_item_14.setId("i_customer_new");
    _jspx_th_menu_item_14.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_15.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_15.setParent(_jspx_parent);
    _jspx_th_menu_item_15.setZ("Yo9cUtyc7EUvbxwQ7EoeqXWaVJM=");
    _jspx_th_menu_item_15.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/customers?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_15.setMessageCode("global_menu_list");
    _jspx_th_menu_item_15.setId("i_customer_list");
    _jspx_th_menu_item_15.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_8.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_8.setParent(_jspx_parent);
    _jspx_th_menu_category_8.setZ("Q0OUyvBnyAtBRZB9cxmQUxv+KSU=");
    _jspx_th_menu_category_8.setId("c_massagetypes");
    _jspx_th_menu_category_8.setJspBody(new menu_jspxHelper( 9, _jspx_page_context, _jspx_th_menu_category_8, null));
    _jspx_th_menu_category_8.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_16.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_16.setParent(_jspx_parent);
    _jspx_th_menu_item_16.setZ("xYwpoaPRCWT2ySECFA+8/sXe0c4=");
    _jspx_th_menu_item_16.setUrl("/massagetypeses?form");
    _jspx_th_menu_item_16.setMessageCode("global_menu_new");
    _jspx_th_menu_item_16.setId("i_massagetypes_new");
    _jspx_th_menu_item_16.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_17 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_17.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_17.setParent(_jspx_parent);
    _jspx_th_menu_item_17.setZ("2kyFm++c6qy+5zHrjr2b7ALVF8o=");
    _jspx_th_menu_item_17.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/massagetypeses?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_17.setMessageCode("global_menu_list");
    _jspx_th_menu_item_17.setId("i_massagetypes_list");
    _jspx_th_menu_item_17.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_category_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_category_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.category_tagx.class) : new org.apache.jsp.tag.web.menu.category_tagx();
    _jspx_th_menu_category_9.setJspContext(_jspx_page_context);
    _jspx_th_menu_category_9.setParent(_jspx_parent);
    _jspx_th_menu_category_9.setZ("vJ6efqiSxFssuvqFTsXpvZ3AvA8=");
    _jspx_th_menu_category_9.setId("c_product");
    _jspx_th_menu_category_9.setJspBody(new menu_jspxHelper( 10, _jspx_page_context, _jspx_th_menu_category_9, null));
    _jspx_th_menu_category_9.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_18 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_18.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_18.setParent(_jspx_parent);
    _jspx_th_menu_item_18.setZ("Ezf8cTW61d2RkMNEcYkDJpG01kc=");
    _jspx_th_menu_item_18.setUrl("/products?form");
    _jspx_th_menu_item_18.setMessageCode("global_menu_new");
    _jspx_th_menu_item_18.setId("i_product_new");
    _jspx_th_menu_item_18.doTag();
    return false;
  }

  private boolean _jspx_meth_menu_item_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_item_19 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.menu.item_tagx.class) : new org.apache.jsp.tag.web.menu.item_tagx();
    _jspx_th_menu_item_19.setJspContext(_jspx_page_context);
    _jspx_th_menu_item_19.setParent(_jspx_parent);
    _jspx_th_menu_item_19.setZ("kEeyCmUUYXShbDEWwOLheaAkM50=");
    _jspx_th_menu_item_19.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/products?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_menu_item_19.setMessageCode("global_menu_list");
    _jspx_th_menu_item_19.setId("i_product_list");
    _jspx_th_menu_item_19.doTag();
    return false;
  }

  private class menu_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public menu_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_category_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_category_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_item_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_item_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
          case 4:
            invoke4( out );
            break;
          case 5:
            invoke5( out );
            break;
          case 6:
            invoke6( out );
            break;
          case 7:
            invoke7( out );
            break;
          case 8:
            invoke8( out );
            break;
          case 9:
            invoke9( out );
            break;
          case 10:
            invoke10( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
