<%@ include file="/taglibs.jsp"%>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<title><fmt:message key="customerList.title"/></title>
<h2><fmt:message key="customerList.title"/></h2>

<button class="btn btn-primary" onclick="location.href='customerform'" style="float: right; margin-top: -30px">
    <i class="icon-plus icon-white"></i>新增客户</button>

<display:table name="customerInformationsList" class="table table-condensed table-striped table-hover" requestURI="customers" id="customerInformationsList" export="true" pagesize="10" excludedParams="ajax">
    <display:setProperty name="export.pdf.filename" value="customers.pdf"/>
    <display:column property="id" sortable="true" href="customerform" media="html"
        paramId="id" paramProperty="id" titleKey="customer.id"/>
    <display:column property="id" media="csv excel xml pdf" titleKey="customer.id"/>   
    <display:column property="customerName" sortable="true" titleKey="customer.customerName" escapeXml="true"/>
    <display:column property="customerSite" sortable="true" titleKey="customer.customerSite" escapeXml="true"/>
    <display:column property="legalRepresentativePerson" sortable="true" titleKey="customer.legalRepresentativePerson" escapeXml="true"/>
    <display:column property="preChargeAmount" sortable="true" titleKey="customer.preChargeAmount" escapeXml="true"/>
    <display:column property="remainAmount" sortable="true" titleKey="customer.remainAmount" escapeXml="true"/>
</display:table>