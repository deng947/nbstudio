<%@ include file="/taglibs.jsp" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <title><decorator:title default="欢迎"/></title>
    <meta http-equiv="Cache-Control" content="no-cache"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <!-- SlidesJS Required (if responsive): Sets the page width to the device width. -->
  		<meta name="viewport" content="width=device-width">
    <!-- End SlidesJS Required -->
    <link rel="shortcut icon" href="${ctx}/images/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${ctx}/webjars/bootstrap/2.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="${ctx}/webjars/bootstrap/2.2.1/css/bootstrap-responsive.min.css">
    <link rel="stylesheet" href="${ctx}/styles/app.css"> 
    <link rel="stylesheet" href="${ctx}/styles/example.css">
    <link rel="stylesheet" href="${ctx}/styles/font-awesome.min.css">
    <!--<link rel="stylesheet" href="${ctx}/webjars/bootstrap/3.3.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="${ctx}/webjars/bootstrap/3.3.2/css/bootstrap-theme.min.css">-->
    
    <!--
    <link rel="stylesheet" href="${ctx}/styles/bootstrap-submenu.min.css">
    <link rel="stylesheet" href="${ctx}/styles/equidistantNavbar.css" media="screen" type="text/css" /> -->
    
    <!--<script type="text/javascript" src="${ctx}/webjars/jquery/1.8.2/jquery.min.js"></script>-->
    <!--<script src="${ctx}/webjars/jquery/2.1.3/jquery.min.js" defer></script>
    <script src="${ctx}/webjars/jquery/1.11.2/jquery.min.js" defer></script>-->
    <script type="text/javascript" src="${ctx}/scripts/app.js"></script> 
    <script type="text/javascript" src="${ctx}/webjars/bootstrap/2.2.1/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx}/scripts/unslider.js" defer></script> 
      
    <!--
    <script src="${ctx}/webjars/bootstrap/3.3.2/js/bootstrap.min.js" defer></script>
    <script type="text/javascript" src="${ctx}/scripts/bootstrap-submenu.min.js" defer></script>-->
    <script type="text/javascript" src="${ctx}/webjars/jquery/1.8.2/jquery.min.js"></script>
    <script src="${ctx}/scripts/bjqs-1.3.min.js"></script>
    <link rel="stylesheet" href="${ctx}/styles/demo.css">
    <link rel="stylesheet" href="${ctx}/styles/bjqs.css">
    <script src="${ctx}/scripts/jquery.slides.min.js"></script>
    <!-- attach the plug-in to the slider parent element and adjust the settings as required -->
      <script class="secret-source">
      <!-- SlidesJS Required: Initialize SlidesJS with a jQuery doc ready --> 
        $(function() {
          $('#slides').slidesjs({
            width: 940,
            height: 528,
            play: {
              active: true,
              auto: true,
              interval: 4000,
              swap: true
            }
          });
        });
        <!-- End SlidesJS Required -->
        /*jQuery(document).ready(function($) {
          
          $('#banner-slide').bjqs({
            animtype      : 'slide',
            height        : 320,
            width         : 620,
            responsive    : true,
            randomstart   : true
          });
          
        });*/
        </script>
       
      
   <!-- SlidesJS Optional: If you'd like to use this design -->
  <style>
    body {
      -webkit-font-smoothing: antialiased;
      font: normal 15px/1.5 "Helvetica Neue", Helvetica, Arial, sans-serif;
      color: #232525;
      padding-top:70px;
    }

    #slides {
      display: none
    }

    #slides .slidesjs-navigation {
      margin-top:5px;
    }

    a.slidesjs-next,
    a.slidesjs-previous,
    a.slidesjs-play,
    a.slidesjs-stop {
      background-image: url(../images/slides/btns-next-prev.png);
      background-repeat: no-repeat;
      display:block;
      width:12px;
      height:18px;
      overflow: hidden;
      text-indent: -9999px;
      float: left;
      margin-right:5px;
    }

    a.slidesjs-next {
      margin-right:10px;
      background-position: -12px 0;
    }

    a:hover.slidesjs-next {
      background-position: -12px -18px;
    }

    a.slidesjs-previous {
      background-position: 0 0;
    }

    a:hover.slidesjs-previous {
      background-position: 0 -18px;
    }

    a.slidesjs-play {
      width:15px;
      background-position: -25px 0;
    }

    a:hover.slidesjs-play {
      background-position: -25px -18px;
    }

    a.slidesjs-stop {
      width:18px;
      background-position: -41px 0;
    }

    a:hover.slidesjs-stop {
      background-position: -41px -18px;
    }

    .slidesjs-pagination {
      margin: 7px 0 0;
      float: right;
      list-style: none;
    }

    .slidesjs-pagination li {
      float: left;
      margin: 0 1px;
    }

    .slidesjs-pagination li a {
      display: block;
      width: 13px;
      height: 0;
      padding-top: 13px;
      background-image: url(../images/slides/pagination.png);
      background-position: 0 0;
      float: left;
      overflow: hidden;
    }

    .slidesjs-pagination li a.active,
    .slidesjs-pagination li a:hover.active {
      background-position: 0 -13px
    }

    .slidesjs-pagination li a:hover {
      background-position: 0 -26px
    }

    #slides a:link,
    #slides a:visited {
      color: #333
    }

    #slides a:hover,
    #slides a:active {
      color: #9e2020
    }

    .navbar {
      overflow: hidden
    }
  </style>
  <!-- End SlidesJS Optional-->

  <!-- SlidesJS Required: These styles are required if you'd like a responsive slideshow -->
  <style>
    #slides {
      display: none
    }

    .container {
      margin: 0 auto
    }

    /* For tablets & smart phones */
    @media (max-width: 767px) {
      body {
        padding-left: 20px;
        padding-right: 20px;
      }
      .container {
        width: auto
      }
    }

    /* For smartphones */
    @media (max-width: 480px) {
      .container {
        width: auto
      }
    }

    /* For smaller displays like laptops */
    @media (min-width: 768px) and (max-width: 979px) {
      .container {
        width: 724px
      }
    }

    /* For larger displays */
    @media (min-width: 1200px) {
      .container {
        width: 1170px
      }
    }
  </style>
  <!-- SlidesJS Required: --> 
    <decorator:head/>
</head>
<body<decorator:getProperty property="body.id" writeEntireProperty="true"/><decorator:getProperty property="body.class" writeEntireProperty="true"/>>
<a name="top"></a>
  <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid"> 
                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="brand" href="${ctx}/" title="主页">艺术工作室</a>
                <div class="nav-collapse collapse">
                 
                 <ul class="nav">
                        <li><a href="${ctx}/about" title="公司介绍">公司介绍</a></li>
                        <!--<li><a href="${ctx}/" title="Home">主页</a></li>-->
                        <li><a href="${ctx}/users" title="用户">系统管理</a></li>
                        
                        <li><a href="${ctx}/customers" title="客户">客户管理</a></li> 
                        <li class="divider"></li>
		                <li class="dropdown-submenu">
		                    <a tabindex="-1" href="javascript:;">一级菜单</a>
		                    <ul class="dropdown-menu">
		                        <li><a tabindex="-1" href="javascript:;">二级菜单</a></li>
		                        <li class="divider"></li>
		                        <li class="dropdown-submenu">
		                            <a href="javascript:;">二级菜单</a>
		                            <ul class="dropdown-menu">
		                                <li><a href="javascript:;">三级菜单</a></li>
		                            </ul>
		                        </li>
		                    </ul>
		                </li>
                        
                        <li><a href="${ctx}/contact" title="联系我们">联系我们</a></li>
                        <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
                            <li class="logout"><a href="${ctx}/logout">登出</a></li>
                        </security:authorize>
                  </ul> 
                   
             <!--<ul class="nav dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
               
                <li><a href="${ctx}/customers" title="客户">客户管理</a></li>
                <li class="divider"></li>
                <li class="dropdown-submenu">
                    <a tabindex="-1" href="javascript:;">一级菜单</a>
                    <ul class="dropdown-menu">
                        <li><a tabindex="-1" href="javascript:;">二级菜单</a></li>
                        <li class="divider"></li>
                        <li class="dropdown-submenu">
                            <a href="javascript:;">二级菜单</a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:;">三级菜单</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="${ctx}/customers" title="联系我们">联系我们</a></li>
                <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
                	<li class="logout"><a href="${ctx}/logout">登出</a></li>
                </security:authorize>
            </ul>-->
              <!-- <ul class="nav">
                        <li><a href="${ctx}/" title="Home">主页</a></li>
                        <li><a href="${ctx}/users" title="用户">用户</a></li>
                        
                        <li><a href="${ctx}/customers" title="客户">客户</a></li> 
                        <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
                            <li class="logout"><a href="${ctx}/logout">登出</a></li>
                        </security:authorize>
               </ul>-->
                </div>
                <script type="text/javascript">
                    $('a[href="${pageContext.request.requestURI}"]').parent().addClass('active');
                </script>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span9">
                <%@ include file="/messages.jsp"%>
                <decorator:body/>

                <decorator:getProperty property="page.underground"/>
            </div>
            <div class="span2">
                <!--<div id="branding">
                    <a href="http://appfuse.org" title="AppFuse - eliminating project startup time">
                        <img src="${ctx}/images/powered-by-appfuse.gif" width="203" height="75" alt="AppFuse"/></a>
                </div>  -->
                <h3>优惠信息</h3>

                <!-- <p>The following is a list of resources that will make <a href="http://springframework.org">Spring</a> infinitely easier to use.</p> -->

                <ul class="glassList">
                    <li><a href="http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/">70*90水晶相框</a></li>
                    <li><a href="http://static.springsource.org/spring/docs/3.2.x/javadoc-api/">100*120水晶相框</a></li>
                    <li><a href="http://www.amazon.com/s/ref=nb_ss?url=search-alias%3Daps&field-keywords=spring+framework">65*80木质相框</a></li>
                    <li><a href="http://forum.springframework.org/">30*40摆台</a></li>
                </ul>

            </div>
        </div>
    </div>

    <div id="footer" class="footer">
        <p align="center">
            ©2015 All Rights Reserved. NB版权所有
        </p>
    </div>
    <script src="${ctx}/scripts/equidistantNavbar.js"></script>
</body>
</html>
