package org.apache.jsp.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/taglibs.jsp");
    _jspx_dependants.add("/messages.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_getProperty_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_title_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_body_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_security_authorize_ifAnyGranted;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_getProperty_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_title_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_body_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_security_authorize_ifAnyGranted = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_decorator_getProperty_property_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_decorator_title_default_nobody.release();
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_decorator_body_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_decorator_head_nobody.release();
    _jspx_tagPool_security_authorize_ifAnyGranted.release();
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>");
      if (_jspx_meth_decorator_title_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
      out.write("    <meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n");
      out.write("    <meta http-equiv=\"Expires\" content=\"0\"/>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <!--<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> -->\r\n");
      out.write("    <!-- SlidesJS Required (if responsive): Sets the page width to the device width. -->\r\n");
      out.write("  \t\t<meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <!-- End SlidesJS Required -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\" type=\"image/x-icon\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/bootstrap/2.2.1/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/bootstrap/2.2.1/css/bootstrap-responsive.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/styles/app.css\"> \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/styles/example.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/styles/font-awesome.min.css\">\r\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/bootstrap/3.3.2/css/bootstrap-theme.min.css\">-->\r\n");
      out.write("    \r\n");
      out.write("    <!--\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/styles/bootstrap-submenu.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/styles/equidistantNavbar.css\" media=\"screen\" type=\"text/css\" /> -->\r\n");
      out.write("    \r\n");
      out.write("    <!--<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/jquery/1.8.2/jquery.min.js\"></script>-->\r\n");
      out.write("    <!--<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/jquery/2.1.3/jquery.min.js\" defer></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/jquery/1.11.2/jquery.min.js\" defer></script>-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/app.js\"></script> \r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/bootstrap/2.2.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/unslider.js\" defer></script> \r\n");
      out.write("      \r\n");
      out.write("    <!--\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/bootstrap/3.3.2/js/bootstrap.min.js\" defer></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/bootstrap-submenu.min.js\" defer></script>-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/webjars/jquery/1.8.2/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/bjqs-1.3.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/styles/demo.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/styles/bjqs.css\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/jquery.slides.min.js\"></script>\r\n");
      out.write("    <!-- attach the plug-in to the slider parent element and adjust the settings as required -->\r\n");
      out.write("      <script class=\"secret-source\">\r\n");
      out.write("      <!-- SlidesJS Required: Initialize SlidesJS with a jQuery doc ready --> \r\n");
      out.write("        $(function() {\r\n");
      out.write("          $('#slides').slidesjs({\r\n");
      out.write("            width: 940,\r\n");
      out.write("            height: 528,\r\n");
      out.write("            play: {\r\n");
      out.write("              active: true,\r\n");
      out.write("              auto: true,\r\n");
      out.write("              interval: 4000,\r\n");
      out.write("              swap: true\r\n");
      out.write("            }\r\n");
      out.write("          });\r\n");
      out.write("        });\r\n");
      out.write("        <!-- End SlidesJS Required -->\r\n");
      out.write("        /*jQuery(document).ready(function($) {\r\n");
      out.write("          \r\n");
      out.write("          $('#banner-slide').bjqs({\r\n");
      out.write("            animtype      : 'slide',\r\n");
      out.write("            height        : 320,\r\n");
      out.write("            width         : 620,\r\n");
      out.write("            responsive    : true,\r\n");
      out.write("            randomstart   : true\r\n");
      out.write("          });\r\n");
      out.write("          \r\n");
      out.write("        });*/\r\n");
      out.write("        </script>\r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("   <!-- SlidesJS Optional: If you'd like to use this design -->\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      -webkit-font-smoothing: antialiased;\r\n");
      out.write("      font: normal 15px/1.5 \"Helvetica Neue\", Helvetica, Arial, sans-serif;\r\n");
      out.write("      color: #232525;\r\n");
      out.write("      padding-top:70px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #slides {\r\n");
      out.write("      display: none\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #slides .slidesjs-navigation {\r\n");
      out.write("      margin-top:5px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a.slidesjs-next,\r\n");
      out.write("    a.slidesjs-previous,\r\n");
      out.write("    a.slidesjs-play,\r\n");
      out.write("    a.slidesjs-stop {\r\n");
      out.write("      background-image: url(../images/slides/btns-next-prev.png);\r\n");
      out.write("      background-repeat: no-repeat;\r\n");
      out.write("      display:block;\r\n");
      out.write("      width:12px;\r\n");
      out.write("      height:18px;\r\n");
      out.write("      overflow: hidden;\r\n");
      out.write("      text-indent: -9999px;\r\n");
      out.write("      float: left;\r\n");
      out.write("      margin-right:5px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a.slidesjs-next {\r\n");
      out.write("      margin-right:10px;\r\n");
      out.write("      background-position: -12px 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a:hover.slidesjs-next {\r\n");
      out.write("      background-position: -12px -18px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a.slidesjs-previous {\r\n");
      out.write("      background-position: 0 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a:hover.slidesjs-previous {\r\n");
      out.write("      background-position: 0 -18px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a.slidesjs-play {\r\n");
      out.write("      width:15px;\r\n");
      out.write("      background-position: -25px 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a:hover.slidesjs-play {\r\n");
      out.write("      background-position: -25px -18px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a.slidesjs-stop {\r\n");
      out.write("      width:18px;\r\n");
      out.write("      background-position: -41px 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    a:hover.slidesjs-stop {\r\n");
      out.write("      background-position: -41px -18px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .slidesjs-pagination {\r\n");
      out.write("      margin: 7px 0 0;\r\n");
      out.write("      float: right;\r\n");
      out.write("      list-style: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .slidesjs-pagination li {\r\n");
      out.write("      float: left;\r\n");
      out.write("      margin: 0 1px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .slidesjs-pagination li a {\r\n");
      out.write("      display: block;\r\n");
      out.write("      width: 13px;\r\n");
      out.write("      height: 0;\r\n");
      out.write("      padding-top: 13px;\r\n");
      out.write("      background-image: url(../images/slides/pagination.png);\r\n");
      out.write("      background-position: 0 0;\r\n");
      out.write("      float: left;\r\n");
      out.write("      overflow: hidden;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .slidesjs-pagination li a.active,\r\n");
      out.write("    .slidesjs-pagination li a:hover.active {\r\n");
      out.write("      background-position: 0 -13px\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .slidesjs-pagination li a:hover {\r\n");
      out.write("      background-position: 0 -26px\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #slides a:link,\r\n");
      out.write("    #slides a:visited {\r\n");
      out.write("      color: #333\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #slides a:hover,\r\n");
      out.write("    #slides a:active {\r\n");
      out.write("      color: #9e2020\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .navbar {\r\n");
      out.write("      overflow: hidden\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  <!-- End SlidesJS Optional-->\r\n");
      out.write("\r\n");
      out.write("  <!-- SlidesJS Required: These styles are required if you'd like a responsive slideshow -->\r\n");
      out.write("  <style>\r\n");
      out.write("    #slides {\r\n");
      out.write("      display: none\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .container {\r\n");
      out.write("      margin: 0 auto\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* For tablets & smart phones */\r\n");
      out.write("    @media (max-width: 767px) {\r\n");
      out.write("      body {\r\n");
      out.write("        padding-left: 20px;\r\n");
      out.write("        padding-right: 20px;\r\n");
      out.write("      }\r\n");
      out.write("      .container {\r\n");
      out.write("        width: auto\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* For smartphones */\r\n");
      out.write("    @media (max-width: 480px) {\r\n");
      out.write("      .container {\r\n");
      out.write("        width: auto\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* For smaller displays like laptops */\r\n");
      out.write("    @media (min-width: 768px) and (max-width: 979px) {\r\n");
      out.write("      .container {\r\n");
      out.write("        width: 724px\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* For larger displays */\r\n");
      out.write("    @media (min-width: 1200px) {\r\n");
      out.write("      .container {\r\n");
      out.write("        width: 1170px\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  <!-- SlidesJS Required: --> \r\n");
      out.write("    ");
      if (_jspx_meth_decorator_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body");
      if (_jspx_meth_decorator_getProperty_0(_jspx_page_context))
        return;
      if (_jspx_meth_decorator_getProperty_1(_jspx_page_context))
        return;
      out.write(">\r\n");
      out.write("<a name=\"top\"></a>\r\n");
      out.write("  <div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("            <div class=\"container-fluid\"> \r\n");
      out.write("                <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" title=\"主页\">艺术工作室</a>\r\n");
      out.write("                <div class=\"nav-collapse collapse\">\r\n");
      out.write("                 \r\n");
      out.write("                 <ul class=\"nav\">\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/about\" title=\"公司介绍\">公司介绍</a></li>\r\n");
      out.write("                        <!--<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" title=\"Home\">主页</a></li>-->\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/users\" title=\"用户\">系统管理</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/customers\" title=\"客户\">客户管理</a></li> \r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t                <li class=\"dropdown-submenu\">\r\n");
      out.write("\t\t                    <a tabindex=\"-1\" href=\"javascript:;\">一级菜单</a>\r\n");
      out.write("\t\t                    <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t                        <li><a tabindex=\"-1\" href=\"javascript:;\">二级菜单</a></li>\r\n");
      out.write("\t\t                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t                        <li class=\"dropdown-submenu\">\r\n");
      out.write("\t\t                            <a href=\"javascript:;\">二级菜单</a>\r\n");
      out.write("\t\t                            <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t                                <li><a href=\"javascript:;\">三级菜单</a></li>\r\n");
      out.write("\t\t                            </ul>\r\n");
      out.write("\t\t                        </li>\r\n");
      out.write("\t\t                    </ul>\r\n");
      out.write("\t\t                </li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/contact\" title=\"联系我们\">联系我们</a></li>\r\n");
      out.write("                        ");
      if (_jspx_meth_security_authorize_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </ul> \r\n");
      out.write("                   \r\n");
      out.write("             <!--<ul class=\"nav dropdown-menu multi-level\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\r\n");
      out.write("               \r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/customers\" title=\"客户\">客户管理</a></li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li class=\"dropdown-submenu\">\r\n");
      out.write("                    <a tabindex=\"-1\" href=\"javascript:;\">一级菜单</a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a tabindex=\"-1\" href=\"javascript:;\">二级菜单</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li class=\"dropdown-submenu\">\r\n");
      out.write("                            <a href=\"javascript:;\">二级菜单</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"javascript:;\">三级菜单</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/customers\" title=\"联系我们\">联系我们</a></li>\r\n");
      out.write("                ");
      if (_jspx_meth_security_authorize_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>-->\r\n");
      out.write("              <!-- <ul class=\"nav\">\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/\" title=\"Home\">主页</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/users\" title=\"用户\">用户</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/customers\" title=\"客户\">客户</a></li> \r\n");
      out.write("                        ");
      if (_jspx_meth_security_authorize_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </ul>-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    $('a[href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.requestURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"]').parent().addClass('active');\r\n");
      out.write("                </script>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row-fluid\">\r\n");
      out.write("            <div class=\"span9\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_decorator_body_0(_jspx_page_context))
        return;
      if (_jspx_meth_decorator_getProperty_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"span2\">\r\n");
      out.write("                <!--<div id=\"branding\">\r\n");
      out.write("                    <a href=\"http://appfuse.org\" title=\"AppFuse - eliminating project startup time\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/powered-by-appfuse.gif\" width=\"203\" height=\"75\" alt=\"AppFuse\"/></a>\r\n");
      out.write("                </div>  -->\r\n");
      out.write("                <h3>优惠信息</h3>\r\n");
      out.write("\r\n");
      out.write("                <!-- <p>The following is a list of resources that will make <a href=\"http://springframework.org\">Spring</a> infinitely easier to use.</p> -->\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"glassList\">\r\n");
      out.write("                    <li><a href=\"http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/\">70*90水晶相框</a></li>\r\n");
      out.write("                    <li><a href=\"http://static.springsource.org/spring/docs/3.2.x/javadoc-api/\">100*120水晶相框</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.amazon.com/s/ref=nb_ss?url=search-alias%3Daps&field-keywords=spring+framework\">65*80木质相框</a></li>\r\n");
      out.write("                    <li><a href=\"http://forum.springframework.org/\">30*40摆台</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"footer\" class=\"footer\">\r\n");
      out.write("        <p align=\"center\">\r\n");
      out.write("            ©2015 All Rights Reserved. NB版权所有\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/scripts/equidistantNavbar.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("datePattern");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_0);
    _jspx_th_fmt_message_0.setKey("date.format");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctx");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_decorator_title_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_title_0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_decorator_title_default_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_decorator_title_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_title_0.setParent(null);
    _jspx_th_decorator_title_0.setDefault("欢迎");
    int _jspx_eval_decorator_title_0 = _jspx_th_decorator_title_0.doStartTag();
    if (_jspx_th_decorator_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_title_default_nobody.reuse(_jspx_th_decorator_title_0);
      return true;
    }
    _jspx_tagPool_decorator_title_default_nobody.reuse(_jspx_th_decorator_title_0);
    return false;
  }

  private boolean _jspx_meth_decorator_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_head_0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _jspx_tagPool_decorator_head_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_decorator_head_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_head_0.setParent(null);
    int _jspx_eval_decorator_head_0 = _jspx_th_decorator_head_0.doStartTag();
    if (_jspx_th_decorator_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_head_nobody.reuse(_jspx_th_decorator_head_0);
      return true;
    }
    _jspx_tagPool_decorator_head_nobody.reuse(_jspx_th_decorator_head_0);
    return false;
  }

  private boolean _jspx_meth_decorator_getProperty_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:getProperty
    com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag _jspx_th_decorator_getProperty_0 = (com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag) _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag.class);
    _jspx_th_decorator_getProperty_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_getProperty_0.setParent(null);
    _jspx_th_decorator_getProperty_0.setProperty("body.id");
    _jspx_th_decorator_getProperty_0.setWriteEntireProperty("true");
    int _jspx_eval_decorator_getProperty_0 = _jspx_th_decorator_getProperty_0.doStartTag();
    if (_jspx_th_decorator_getProperty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody.reuse(_jspx_th_decorator_getProperty_0);
      return true;
    }
    _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody.reuse(_jspx_th_decorator_getProperty_0);
    return false;
  }

  private boolean _jspx_meth_decorator_getProperty_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:getProperty
    com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag _jspx_th_decorator_getProperty_1 = (com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag) _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag.class);
    _jspx_th_decorator_getProperty_1.setPageContext(_jspx_page_context);
    _jspx_th_decorator_getProperty_1.setParent(null);
    _jspx_th_decorator_getProperty_1.setProperty("body.class");
    _jspx_th_decorator_getProperty_1.setWriteEntireProperty("true");
    int _jspx_eval_decorator_getProperty_1 = _jspx_th_decorator_getProperty_1.doStartTag();
    if (_jspx_th_decorator_getProperty_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody.reuse(_jspx_th_decorator_getProperty_1);
      return true;
    }
    _jspx_tagPool_decorator_getProperty_writeEntireProperty_property_nobody.reuse(_jspx_th_decorator_getProperty_1);
    return false;
  }

  private boolean _jspx_meth_security_authorize_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_ifAnyGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_0.setParent(null);
    _jspx_th_security_authorize_0.setIfAnyGranted("ROLE_USER,ROLE_ADMIN");
    int _jspx_eval_security_authorize_0 = _jspx_th_security_authorize_0.doStartTag();
    if (_jspx_eval_security_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("                            <li class=\"logout\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\">登出</a></li>\r\n");
      out.write("                        ");
    }
    if (_jspx_th_security_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_ifAnyGranted.reuse(_jspx_th_security_authorize_0);
      return true;
    }
    _jspx_tagPool_security_authorize_ifAnyGranted.reuse(_jspx_th_security_authorize_0);
    return false;
  }

  private boolean _jspx_meth_security_authorize_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_ifAnyGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_1.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_1.setParent(null);
    _jspx_th_security_authorize_1.setIfAnyGranted("ROLE_USER,ROLE_ADMIN");
    int _jspx_eval_security_authorize_1 = _jspx_th_security_authorize_1.doStartTag();
    if (_jspx_eval_security_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("                \t<li class=\"logout\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\">登出</a></li>\r\n");
      out.write("                ");
    }
    if (_jspx_th_security_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_ifAnyGranted.reuse(_jspx_th_security_authorize_1);
      return true;
    }
    _jspx_tagPool_security_authorize_ifAnyGranted.reuse(_jspx_th_security_authorize_1);
    return false;
  }

  private boolean _jspx_meth_security_authorize_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_ifAnyGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_2.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_2.setParent(null);
    _jspx_th_security_authorize_2.setIfAnyGranted("ROLE_USER,ROLE_ADMIN");
    int _jspx_eval_security_authorize_2 = _jspx_th_security_authorize_2.doStartTag();
    if (_jspx_eval_security_authorize_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("                            <li class=\"logout\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\">登出</a></li>\r\n");
      out.write("                        ");
    }
    if (_jspx_th_security_authorize_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_ifAnyGranted.reuse(_jspx_th_security_authorize_2);
      return true;
    }
    _jspx_tagPool_security_authorize_ifAnyGranted.reuse(_jspx_th_security_authorize_2);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty message}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <div class=\"alert alert-success fade in\">\r\n");
        out.write("        <a href=\"#\" data-dismiss=\"alert\" class=\"close\">&times;</a>\r\n");
        out.write("        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </div>\r\n");
        out.write("    ");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("msg");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("<br />\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_remove_0.setVar("message");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }

  private boolean _jspx_meth_decorator_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_body_0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _jspx_tagPool_decorator_body_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_body_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_body_0.setParent(null);
    int _jspx_eval_decorator_body_0 = _jspx_th_decorator_body_0.doStartTag();
    if (_jspx_th_decorator_body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_body_nobody.reuse(_jspx_th_decorator_body_0);
      return true;
    }
    _jspx_tagPool_decorator_body_nobody.reuse(_jspx_th_decorator_body_0);
    return false;
  }

  private boolean _jspx_meth_decorator_getProperty_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:getProperty
    com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag _jspx_th_decorator_getProperty_2 = (com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag) _jspx_tagPool_decorator_getProperty_property_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag.class);
    _jspx_th_decorator_getProperty_2.setPageContext(_jspx_page_context);
    _jspx_th_decorator_getProperty_2.setParent(null);
    _jspx_th_decorator_getProperty_2.setProperty("page.underground");
    int _jspx_eval_decorator_getProperty_2 = _jspx_th_decorator_getProperty_2.doStartTag();
    if (_jspx_th_decorator_getProperty_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_getProperty_property_nobody.reuse(_jspx_th_decorator_getProperty_2);
      return true;
    }
    _jspx_tagPool_decorator_getProperty_property_nobody.reuse(_jspx_th_decorator_getProperty_2);
    return false;
  }
}
