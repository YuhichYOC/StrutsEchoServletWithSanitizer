<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

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

<s:property value="inputBean.searchKey" />

</div>

</body>

</html>