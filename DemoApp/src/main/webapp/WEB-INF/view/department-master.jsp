<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department Master</title>

</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	<div class="container">
		<h1>Department</h1>
		<p>Please fill in this form to create new Department.</p>
		<form:form action="saveDepartment" modelAttribute="department" method="POST">
			<div class="row">
				<div class="col-sm-3">
					<label>Department Id</label>
				</div>
				<div class="col-sm-3">
					<form:input path="departmentId" class="form-control" readonly="true"/>
				</div>
				<form:errors path="departmentId" cssClass="error" />
			
				<div class="col-sm-3">
					<label>Department Name</label>
				</div>
				<div class="col-sm-3">
					<form:input path="departmentName" class="form-control" />
				</div>
				<form:errors path="departmentName" cssClass="error" />
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Company</label>
				</div>
				<div class="col-sm-3">
					<form:select path="company.companyId" class="form-control">
						<form:options items="${companyList}" itemValue="companyId" itemLabel="companyName"/>  
					</form:select>					
				</div>
				<form:errors path="departmentName" cssClass="error" />
			
				<div class="col-sm-3">
					<label>Branch</label>
				</div>
				<div class="col-sm-3">
					<form:select path="branch.branchId" class="form-control">
						<form:options items="${branchList}" itemValue="branchId" itemLabel="branchName"/>  
					</form:select>					
				</div>
				<form:errors path="departmentName" cssClass="error" />
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



