<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>OnlineShopping-${title}</title>

<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootswatch css -->
<link href="${css}/bootswatch.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">



</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@ include file="./shared/navbar.jsp"%>

		<!-- Page Content -->
		<div class="content">
			<c:if test="${userClickHome == true }">

				<%@ include file="./shared/home.jsp"%>

			</c:if>


			
			<c:if test="${userClickAbout == true }">

				<!-- About Us -->
				<%@ include file="./shared/about.jsp"%>

			</c:if>

			<c:if test="${userClickContact == true }">

				<!-- Page Content -->
				<%@ include file="./shared/contact.jsp"%>

			</c:if>

			<c:if test="${userClickProducts == true }">

				<!-- Page Content -->
				<%@ include file="./shared/product.jsp"%>

			</c:if>

		</div>
		<div class="container">

			<hr>

			<!-- Footer -->
			<%@ include file="./shared/footer.jsp"%>
			<!-- /.container -->

			<!-- jQuery -->
			<script src="${js}/jquery.js"></script>
			<script src="${js}/myapp.js"></script>

			<!-- Bootstrap Core JavaScript -->
			<script src="${js}/bootstrap.min.js"></script>
		</div>
</body>

</html>
