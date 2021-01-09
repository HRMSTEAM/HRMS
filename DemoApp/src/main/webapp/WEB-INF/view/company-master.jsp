<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Master</title>

</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	<div class="container">
		<h1>Company</h1>
		<p>Please fill in this form to create new Company.</p>
		<form:form action="saveCompany" modelAttribute="company" method="POST">
			<div class="row">
				<div class="col-sm-3">
					<label>Company Id</label>
				</div>
				<div class="col-sm-3">
					<form:input path="companyId" class="form-control" readonly="true"/>
				</div>
				<form:errors path="companyId" cssClass="error" />
				
				<div class="col-sm-3">
					<label>Company Name</label>
				</div>
				<div class="col-sm-3">
					<form:input path="companyName" class="form-control" />
				</div>
				<form:errors path="companyName" cssClass="error" />
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Address</label>
				</div>
				<div class="col-sm-3">
					<form:input path="companyAddress" class="form-control" />
				</div>
				<form:errors path="companyAddress" cssClass="error" />
				
				<div class="col-sm-3">
					<label>Pin Code</label>
				</div>
				<div class="col-sm-3">
					<form:input path="companyPinCode" class="form-control" />
				</div>
				<form:errors path="companyPinCode" cssClass="error" />
				
			</div>
			<div class="row">	
				
				<div class="col-sm-3">
					<label>City</label>
				</div>
				<div class="col-sm-3">
					<form:input path="companyCity" class="form-control" />
				</div>
				<form:errors path="companyCity" cssClass="error" />
			
				<div class="col-sm-3">
					<label>State</label>
				</div>
				<div class="col-sm-3">
					<form:input path="companyState" class="form-control" />
				</div>
				<form:errors path="companyState" cssClass="error" />
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Country</label>
				</div>
				<div class="col-sm-3">
					<form:input path="country" class="form-control" />
				</div>
				<form:errors path="country" cssClass="error" />
		
				<div class="col-sm-3">
					<label>GST No</label>
				</div>
				<div class="col-sm-3">
					<form:input path="gstNo" class="form-control" />
				</div>
				<form:errors path="gstNo" cssClass="error" />
			</div>
			<br><br>
			<div class="row">
				<div class="col-sm-3">
					<label></label>
				</div>
				<div class="col-sm-6">
					<input type="submit" value="Save" class="btn btn-block">
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>



