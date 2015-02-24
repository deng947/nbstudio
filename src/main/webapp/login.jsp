<%@ include file="/taglibs.jsp"%>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<title>登录</title>
<body id="login">
<form method="post" id="loginForm" action="<c:url value='/j_security_check'/>" class="form-signin" autocomplete="off">
    <h2 class="form-signin-heading">登录</h2>
<c:if test="${param.error != null}">
    <div class="alert alert-error fade in">
        ${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}
    </div>
</c:if>
    <input type="text" name="j_username" id="j_username" class="input-block-level"
           placeholder="用户名" required tabindex="1">
    <input type="password" class="input-block-level" name="j_password" id="j_password" tabindex="2"
           placeholder="密码" required>

    <label class="checkbox" for="rememberMe">
        <input type="checkbox" class="checkbox" name="_spring_security_remember_me" id="rememberMe" tabindex="3"/>
                     记住我
    </label>

    <input type="submit" class="btn btn-large btn-primary" name="login" id="login" tabindex="4" value="登录">
</form>

<script type="text/javascript">
    $(document).ready(function() {
        $("input[type='text']:visible:enabled:first", document.forms['loginForm']).focus();
    });
</script>
</body>

