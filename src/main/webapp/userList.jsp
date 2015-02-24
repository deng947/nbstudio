<%@ include file="/taglibs.jsp"%>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<title><fmt:message key="userList.title"/></title>
<h2><fmt:message key="userList.title"/></h2>

<button class="btn btn-primary" onclick="location.href='userform'" style="float: right; margin-top: -30px">
    <i class="icon-plus icon-white"></i>新增用户</button>

<display:table name="userList" class="table table-condensed table-striped table-hover" requestURI="users" id="userList" export="true" pagesize="10" excludedParams="ajax">
    <display:setProperty name="export.pdf.filename" value="users.pdf"/>
    <display:column property="id" sortable="true" href="userform" media="html"
        paramId="id" paramProperty="id" titleKey="user.id"/>
    <display:column property="id" media="csv excel xml pdf" titleKey="user.id"/>   
    <display:column property="username" sortable="true" titleKey="user.username" escapeXml="true"/>
    <display:column property="userFullName" sortable="true" titleKey="user.userFullName" escapeXml="true"/>
    <display:column property="email" sortable="true" titleKey="user.email" escapeXml="true"/>
</display:table>