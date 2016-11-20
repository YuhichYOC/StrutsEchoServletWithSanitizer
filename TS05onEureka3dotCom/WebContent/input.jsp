<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" 
           uri="/struts-tags" %>

<!DOCTYPE html>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ include file="commonreference.jsp" %>

<title>
Insert title here
</title>
</head>

<body>

<div class="centerContents">

<%@ include file="commonheader.jsp" %>

<s:form action="test">
  <s:textfield name="inputBean.searchKey" label="input test" />
  <s:submit label="submit" />
</s:form>

<s:if test="%{inputBean.searchKey != null}">
  you input <s:property value="inputBean.searchKey" />
</s:if>

</div>

</body>

</html>