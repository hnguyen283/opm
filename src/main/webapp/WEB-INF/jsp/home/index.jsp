<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/jsp/template/header.jsp"></jsp:include>
	
<!-- 	This is controller -->
	<script src="<%=request.getContextPath()%>/resources/app-code/home/home-controller.js"></script>
</head>
<body layout="row" ng-controller="HomeController">
	<div layout="column" layout-fill role="main">
		<md-content layout="column">
			<div ng-repeat="name in accounts">
				<div flex="25" layout="row">
					<card-v1 key="{{name}}"></card-v1>
				</div>
			</div>				
	  	</md-content>   
  	</div>   
</body>
</html>