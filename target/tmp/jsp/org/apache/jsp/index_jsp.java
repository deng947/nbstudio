package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_set_var.release();
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
      out.write("\r\n");
      out.write("<div id=\"intro\">\r\n");
      out.write("    <!--<h2>欢迎来到艺术工作室!</h2>\r\n");
      out.write("    <p>\r\n");
      out.write("        <a href=\"http://appfuse-light.java.net\">艺术工作室</a> is a lightweight version of <a href=\"http://appfuse.org\">AppFuse</a>.\r\n");
      out.write("        I was inspired to create it while writing <a href=\"http://springlive.com\">Spring Live</a> and\r\n");
      out.write("        looking at the <em>struts-blank</em> and <em>webapp-minimal</em>\r\n");
      out.write("        applications that ship with Struts and Spring, respectively.\r\n");
      out.write("        These \"starter\" apps were not robust enough for me, and I wanted\r\n");
      out.write("        something like AppFuse, only simpler.\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>\r\n");
      out.write("        The basic AppFuse Light application shows how to do simple\r\n");
      out.write("        <abbr title=\"Create, Retrieve, Update and Delete\">CRUD</abbr> on a database table.\r\n");
      out.write("        To see this feature, click on the button below. <a href=\"?\" onclick=\"readMore(); return false\">Click here</a>\r\n");
      out.write("        to learn more about AppFuse Light.\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>\r\n");
      out.write("        <button class=\"btn btn-primary\" onclick=\"location.href='users'\">View Demonstration</button>\r\n");
      out.write("    </p>  -->\r\n");
      out.write("     <!--<h2><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/banner02.jpg\" title=\"Automatically generated caption\"></h2>  -->\r\n");
      out.write("\r\n");
      out.write("      <!--  Outer wrapper for presentation only, this can be anything you like -->\r\n");
      out.write("       <!-- start Basic Jquery Slider -->\r\n");
      out.write("      <!--<div id=\"banner-slide\">\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <ul class=\"bjqs\">\r\n");
      out.write("          <li><a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/banner01.jpg\" title=\"Automatically generated caption\"></a></li>\r\n");
      out.write("          <li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/banner02.jpg\" title=\"Automatically generated caption\"></li>\r\n");
      out.write("          <li><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/banner03.jpg\" title=\"Automatically generated caption\"></li>\r\n");
      out.write("        </ul>-->\r\n");
      out.write("        <!-- end Basic jQuery Slider \r\n");
      out.write("\r\n");
      out.write("      </div>-->\r\n");
      out.write("      <!-- End outer wrapper -->\r\n");
      out.write("   <div class=\"container\">   \r\n");
      out.write("    <div id=\"slides\">\r\n");
      out.write("      <!-- <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-1.jpg\" alt=\"Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-2.jpg\" alt=\"Photo by: Daniel Parks Link: http://www.flickr.com/photos/parksdh/5227623068/\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-3.jpg\" alt=\"Photo by: Mike Ranweiler Link: http://www.flickr.com/photos/27874907@N04/4833059991/\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-4.jpg\" alt=\"Photo by: Stuart SeegerLink: http://www.flickr.com/photos/stuseeger/97577796/\">\r\n");
      out.write("      <a href=\"#\" class=\"slidesjs-previous slidesjs-navigation\"><i class=\"icon-chevron-left icon-large\"></i></a>\r\n");
      out.write("      <a href=\"#\" class=\"slidesjs-next slidesjs-navigation\"><i class=\"icon-chevron-right icon-large\"></i></a> -->\r\n");
      out.write("      \r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-1.jpg\" alt=\"Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-2.jpg\" alt=\"Photo by: Daniel Parks Link: http://www.flickr.com/photos/parksdh/5227623068/\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-3.jpg\" alt=\"Photo by: Mike Ranweiler Link: http://www.flickr.com/photos/27874907@N04/4833059991/\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/slides/example-slide-4.jpg\" alt=\"Photo by: Stuart SeegerLink: http://www.flickr.com/photos/stuseeger/97577796/\">\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div> \r\n");
      out.write("<div id=\"readmore\" style=\"display:none\">\r\n");
      out.write("    <h3>Introduction to AppFuse Light</h3>\r\n");
      out.write("    <p>\r\n");
      out.write("        AppFuse Light is designed to show Java Web Developers how to start\r\n");
      out.write("        a bare-bones webapp using a <a href=\"http://www.springframework.org\">\r\n");
      out.write("        Spring</a>-managed middle-tier backend and <a href=\"http://www.hibernate.org\">\r\n");
      out.write("        Hibernate</a> for persistence. In addition to Hibernate, you can also use JPA.\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>\r\n");
      out.write("        You can use many different web frameworks for your UI, including:\r\n");
      out.write("    </p>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"http://myfaces.apache.org\">JSF/MyFaces</a></li>\r\n");
      out.write("        <li><a href=\"http://springframework.org\">Spring MVC</a></li>\r\n");
      out.write("        <li><a href=\"http://stripesframework.org\">Stripes</a></li>\r\n");
      out.write("        <li><a href=\"http://struts.apache.org/2.x/\">Struts 2</a></li>\r\n");
      out.write("        <li><a href=\"http://tapestry.apache.org\">Tapestry</a></li>\r\n");
      out.write("        <li><a href=\"http://wicket.apache.org/\">Wicket</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <p>\r\n");
      out.write("        In addition, there's a couple of extras for Spring MVC, including FreeMarker and\r\n");
      out.write("        Spring MVC versions. All versions are available using\r\n");
      out.write("        <a href=\"http://static.appfuse.org/light/archetypes.html\">Maven Archetypes</a>.\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>\r\n");
      out.write("        By default, AppFuse Light uses an in-memory H2 database. It will create it on-the-fly\r\n");
      out.write("        the first time tests are run or the application is started. More information on database\r\n");
      out.write("        configuration can be found in this project's README.txt file.\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>\r\n");
      out.write("        Since no server configuration is required, this application should\r\n");
      out.write("        this application should work with any Servlet 3.0 servlet engine.\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>\r\n");
      out.write("        <button class=\"btn\" onclick=\"readMore();\">&laquo; Back</button>\r\n");
      out.write("    </p>\r\n");
      out.write("</div>\r\n");
      out.write("<content tag=\"underground\">\r\n");
      out.write("<h3><!--AssumptionsQQ在线交谈代码开始 \r\n");
      out.write("<a href=\"tencent://message/?uin=594997602&Site=第27届中国浙江国际自行车电动车展览会&Menu=yes\"><img src=\"picthmp/qq.gif\" alt=\"在线qq交流\" width=\"68\" height=\"29\" border=\"0\" ></a>\r\n");
      out.write(" QQ在线交谈代码开始 --></h3>\r\n");
      out.write("<ul>\r\n");
      out.write("    <li>NB工作室，成立于2007年。是平邑县内唯一婚纱影楼相册、相框制作厂家，已承接临沂市几家大影楼、平邑县城内几乎所有大影楼相册、相框制作、相册亚膜、烤漆等业务。 <a href=\"tencent://message/?uin=330597889&Site=联系本站&Menu=yes\" rel=\"nofollow\"><img border=\"0\" SRC='http://wpa.qq.com/pa?p=1:330597889:47' alt=\"\"></a> </li>\r\n");
      out.write("    <!--<li>JRebel should be used to allow quick reloading of classes.</li>\r\n");
      out.write("    <li>Conventions are more important than configurability.</li>-->\r\n");
      out.write("</ul>\r\n");
      out.write("</content>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function readMore() {\r\n");
      out.write("    var main = document.getElementById(\"intro\");\r\n");
      out.write("    var more = document.getElementById(\"readmore\");\r\n");
      out.write("    if (main.style.display == \"\") {\r\n");
      out.write("        main.style.display = \"none\";\r\n");
      out.write("        more.style.display = \"\";\r\n");
      out.write("    } else {\r\n");
      out.write("        more.style.display = \"none\";\r\n");
      out.write("        main.style.display = \"\";\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
}
