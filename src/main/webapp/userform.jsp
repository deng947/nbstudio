<%@ include file="/taglibs.jsp"%>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<head>
    <title><fmt:message key="userForm.title"/></title>
</head>

<p align="center">用户信息维护</p>

<spring:bind path="user.*">
    <c:if test="${not empty status.errorMessages}">
        <div class="alert alert-error fade in">
            <a href="#" data-dismiss="alert" class="close">&times;</a>
            <c:forEach var="error" items="${status.errorMessages}">
                <c:out value="${error}" escapeXml="false"/><br/>
            </c:forEach>
        </div>
    </c:if>
</spring:bind>

<form:form commandName="user" method="post" action="userform" autocomplete="off"
           onsubmit="return validateUser(this)" id="userForm" cssClass="well form-horizontal">
<form:hidden path="id"/>
<form:hidden path="version"/>
    <table style="width:100%;">
    <tr>
    <td>
    <spring:bind path="user.username">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="username" class="control-label">* <fmt:message key="user.username"/>:</label>
        <div class="controls">
            <form:input path="username" id="username" required="true"/>
            <form:errors path="username" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    
    <td>
    <spring:bind path="user.userFullName">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="userFullName" class="control-label">* <fmt:message key="user.userFullName"/>:</label>
        <div class="controls">
            <form:input path="userFullName" id="userFullName" required="true"/>
            <form:errors path="userFullName" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    </tr>
    <tr>
    <td>
    <spring:bind path="user.password">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="password" class="control-label">* <fmt:message key="user.password"/>:</label>
        <div class="controls">
            <form:password path="password" id="password" showPassword="true" required="true"/>
            <form:errors path="password" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    
    <td>
    <spring:bind path="user.confirmPassword">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="confirmPassword" class="control-label">* <fmt:message key="user.confirmPassword"/>:</label>
        <div class="controls">
            <form:password path="confirmPassword" id="confirmPassword" showPassword="true" required="true"/>
            <form:errors path="confirmPassword" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    </tr>
    <tr>
    <td>
     <spring:bind path="user.email">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="email" class="control-label"><fmt:message key="user.email"/>:</label>
        <div class="controls">
            <form:input path="email" id="email" />
            <form:errors path="email" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    <td>
    <spring:bind path="user.website">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="website" class="control-label"><fmt:message key="user.website"/>:</label>
        <div class="controls">
            <form:input path="website" id="website" />
            <form:errors path="website" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    </tr>
    <tr>
    
    <td>
    
    <spring:bind path="user.phoneNumber">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="phoneNumber" class="control-label"><fmt:message key="user.phoneNumber"/>:</label>
        <div class="controls">
            <form:input path="phoneNumber" id="phoneNumber" />
            <form:errors path="phoneNumber" cssClass="help-inline"/>
        </div>
    </div>
    </td>
     <td>
     
     <spring:bind path="user.QQ">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="QQ" class="control-label"><fmt:message key="user.QQ"/>:</label>
        <div class="controls">
            <form:input path="QQ" id="QQ" />
            <form:errors path="QQ" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    
    </tr>
    <tr>
    <td>
    
     <spring:bind path="user.wechat">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="wechat" class="control-label"><fmt:message key="user.wechat"/>:</label>
        <div class="controls">
            <form:input path="wechat" id="wechat" />
            <form:errors path="wechat" cssClass="help-inline"/>
        </div>
    </div>
    </td>
     <td>
     
   <spring:bind path="user.weibo">
    <div class="control-group${(not empty status.errorMessage) ? ' error' : ''}">
    </spring:bind>
        <label for="weibo" class="control-label"><fmt:message key="user.weibo"/>:</label>
        <div class="controls">
            <form:input path="weibo" id="weibo" />
            <form:errors path="weibo" cssClass="help-inline"/>
        </div>
    </div>
    </td>
    
    </tr>
    </table>
    
    
   
    <div class="form-actions" align="center">
        <button type="submit" class="btn btn-primary" name="save" id="save">
            <i class="icon-ok icon-white"></i> <fmt:message key="button.save"/>
        </button>

        <c:if test="${not empty param.id}">
          <security:authorize ifAllGranted="ROLE_ADMIN">
            <button type="submit" class="btn" name="delete" id="delete">
                <i class="icon-trash"></i> <fmt:message key="button.delete"/>
            </button>
          </security:authorize>
        </c:if>

        <a href="${ctx}/users" class="btn" id="cancel">
            <i class="icon-remove"></i> <fmt:message key="button.cancel"/>
        </a>
    </div>
</form:form>

<script type="text/javascript">
    $(document).ready(function() {
        $("input[type='text']:visible:enabled:first", document.forms['userForm']).focus();
    });
</script>

<v:javascript formName="user" staticJavascript="false" xhtml="true" cdata="false"/>
<script type="text/javascript" src="<c:url value="/scripts/validator.jsp"/>"></script>
