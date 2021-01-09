<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Branch Master</title>

</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	<div class="container">
		<h1>Branch</h1>
		<p>Please fill in this form to create new Branch.</p>
		<form:form action="saveBranch" modelAttribute="branch" method="POST">
			<div class="row">
				<div class="col-sm-3">
					<label>Branch Id</label>
				</div>
				<div class="col-sm-3">
					<form:input path="branchId" class="form-control" readonly="true"/>
				</div>
				<form:errors path="branchId" cssClass="error" />
			
				<div class="col-sm-3">
					<label>Branch Name</label>
				</div>
				<div class="col-sm-3">
					<form:input path="branchName" class="form-control" />
				</div>
				<form:errors path="branchName" cssClass="error" />
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Company</label>
				</div>
				<div class="col-sm-3">
					<form:select path="company.companyId" class="form-control">
						<form:options items="${availableCompany}" itemValue="companyId" itemLabel="companyName"/>  
					</form:select>					
				</div>
				<form:errors path="branchName" cssClass="error" />
			
				<div class="col-sm-3">
					<label>Address</label>
				</div>
				<div class="col-sm-3">
					<form:input path="branchAddress" class="form-control" />
				</div>
				<form:errors path="branchAddress" cssClass="error" />
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>City</label>
				</div>
				<div class="col-sm-3">
					<form:input path="branchCity" class="form-control" />
				</div>
				<form:errors path="branchCity" cssClass="error" />
			
				<div class="col-sm-3">
					<label>State</label>
				</div>
				<div class="col-sm-3">
					<form:input path="branchState" class="form-control" />
				</div>
				<form:errors path="branchState" cssClass="error" />
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Pin Code</label>
				</div>
				<div class="col-sm-3">
					<form:input path="branchPincode" class="form-control" />
				</div>
				<form:errors path="branchPincode" cssClass="error" />
			</div>
			<br>
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



