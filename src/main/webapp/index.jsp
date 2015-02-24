<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/taglibs.jsp"%>

<div id="intro">
    <!--<h2>欢迎来到艺术工作室!</h2>
    <p>
        <a href="http://appfuse-light.java.net">艺术工作室</a> is a lightweight version of <a href="http://appfuse.org">AppFuse</a>.
        I was inspired to create it while writing <a href="http://springlive.com">Spring Live</a> and
        looking at the <em>struts-blank</em> and <em>webapp-minimal</em>
        applications that ship with Struts and Spring, respectively.
        These "starter" apps were not robust enough for me, and I wanted
        something like AppFuse, only simpler.
    </p>
    <p>
        The basic AppFuse Light application shows how to do simple
        <abbr title="Create, Retrieve, Update and Delete">CRUD</abbr> on a database table.
        To see this feature, click on the button below. <a href="?" onclick="readMore(); return false">Click here</a>
        to learn more about AppFuse Light.
    </p>
    <p>
        <button class="btn btn-primary" onclick="location.href='users'">View Demonstration</button>
    </p>  -->
     <!--<h2><img src="${ctx}/images/banner02.jpg" title="Automatically generated caption"></h2>  -->

      <!--  Outer wrapper for presentation only, this can be anything you like -->
       <!-- start Basic Jquery Slider -->
      <!--<div id="banner-slide">

       
        <ul class="bjqs">
          <li><a href=""><img src="${ctx}/images/banner01.jpg" title="Automatically generated caption"></a></li>
          <li><img src="${ctx}/images/banner02.jpg" title="Automatically generated caption"></li>
          <li><img src="${ctx}/images/banner03.jpg" title="Automatically generated caption"></li>
        </ul>-->
        <!-- end Basic jQuery Slider 

      </div>-->
      <!-- End outer wrapper -->
   <div class="container">   
    <div id="slides">
      <!-- <img src="${ctx}/images/slides/example-slide-1.jpg" alt="Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/">
      <img src="${ctx}/images/slides/example-slide-2.jpg" alt="Photo by: Daniel Parks Link: http://www.flickr.com/photos/parksdh/5227623068/">
      <img src="${ctx}/images/slides/example-slide-3.jpg" alt="Photo by: Mike Ranweiler Link: http://www.flickr.com/photos/27874907@N04/4833059991/">
      <img src="${ctx}/images/slides/example-slide-4.jpg" alt="Photo by: Stuart SeegerLink: http://www.flickr.com/photos/stuseeger/97577796/">
      <a href="#" class="slidesjs-previous slidesjs-navigation"><i class="icon-chevron-left icon-large"></i></a>
      <a href="#" class="slidesjs-next slidesjs-navigation"><i class="icon-chevron-right icon-large"></i></a> -->
      
      <img src="${ctx}/images/slides/example-slide-1.jpg" alt="Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/">
      <img src="${ctx}/images/slides/example-slide-2.jpg" alt="Photo by: Daniel Parks Link: http://www.flickr.com/photos/parksdh/5227623068/">
      <img src="${ctx}/images/slides/example-slide-3.jpg" alt="Photo by: Mike Ranweiler Link: http://www.flickr.com/photos/27874907@N04/4833059991/">
      <img src="${ctx}/images/slides/example-slide-4.jpg" alt="Photo by: Stuart SeegerLink: http://www.flickr.com/photos/stuseeger/97577796/">
    </div>
    </div>
</div> 
<div id="readmore" style="display:none">
    <h3>Introduction to AppFuse Light</h3>
    <p>
        AppFuse Light is designed to show Java Web Developers how to start
        a bare-bones webapp using a <a href="http://www.springframework.org">
        Spring</a>-managed middle-tier backend and <a href="http://www.hibernate.org">
        Hibernate</a> for persistence. In addition to Hibernate, you can also use JPA.
    </p>
    <p>
        You can use many different web frameworks for your UI, including:
    </p>
    <ul>
        <li><a href="http://myfaces.apache.org">JSF/MyFaces</a></li>
        <li><a href="http://springframework.org">Spring MVC</a></li>
        <li><a href="http://stripesframework.org">Stripes</a></li>
        <li><a href="http://struts.apache.org/2.x/">Struts 2</a></li>
        <li><a href="http://tapestry.apache.org">Tapestry</a></li>
        <li><a href="http://wicket.apache.org/">Wicket</a></li>
    </ul>
    <p>
        In addition, there's a couple of extras for Spring MVC, including FreeMarker and
        Spring MVC versions. All versions are available using
        <a href="http://static.appfuse.org/light/archetypes.html">Maven Archetypes</a>.
    </p>
    <p>
        By default, AppFuse Light uses an in-memory H2 database. It will create it on-the-fly
        the first time tests are run or the application is started. More information on database
        configuration can be found in this project's README.txt file.
    </p>
    <p>
        Since no server configuration is required, this application should
        this application should work with any Servlet 3.0 servlet engine.
    </p>
    <p>
        <button class="btn" onclick="readMore();">&laquo; Back</button>
    </p>
</div>
<content tag="underground">
<h3><!--AssumptionsQQ在线交谈代码开始 
<a href="tencent://message/?uin=594997602&Site=第27届中国浙江国际自行车电动车展览会&Menu=yes"><img src="picthmp/qq.gif" alt="在线qq交流" width="68" height="29" border="0" ></a>
 QQ在线交谈代码开始 --></h3>
<ul>
    <li>NB工作室，成立于2007年。是平邑县内唯一婚纱影楼相册、相框制作厂家，已承接临沂市几家大影楼、平邑县城内几乎所有大影楼相册、相框制作、相册亚膜、烤漆等业务。 <a href="tencent://message/?uin=330597889&Site=联系本站&Menu=yes" rel="nofollow"><img border="0" SRC='http://wpa.qq.com/pa?p=1:330597889:47' alt=""></a> </li>
    <!--<li>JRebel should be used to allow quick reloading of classes.</li>
    <li>Conventions are more important than configurability.</li>-->
</ul>
</content>

<script type="text/javascript">
function readMore() {
    var main = document.getElementById("intro");
    var more = document.getElementById("readmore");
    if (main.style.display == "") {
        main.style.display = "none";
        more.style.display = "";
    } else {
        more.style.display = "none";
        main.style.display = "";
    }
}
</script>
