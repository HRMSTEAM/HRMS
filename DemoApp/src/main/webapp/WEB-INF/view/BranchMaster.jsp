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
 		<form:form action="BranchMaster" modelAttribute="branchmaster" method="POST">
			<div class="row">
				<div class="col-sm-2">
					<label>Company Id</label>
				</div>
				<div class="col-sm-2">
					<form:input path="companyid" class="form-control" type="text"/>
				</div>
				<div class="col-sm-2">
					<label>Branch Id</label>
				</div>
				<div class="col-sm-2">
					<form:input path="branchid" class="form-control" type="text"
						id="branchid" />
 				</div>
 				
 				<div class="col-sm-2">
					<label>Branch Name</label>
				</div>
				<div class="col-sm-2">
					<form:input path="branchname" class="form-control" type="text"
						id="branchname" name="branchname" />
 				</div>
 
			</div>
			
			<div class="row">
				<div class="col-sm-2">
					<label>Branch Address</label>
				</div>
				<div class="col-sm-2">
					<form:input path="companyid" class="form-control" type="text"
						id="branchadd" name="branchadd" />
				</div>
				<div class="col-sm-2">
					<label>City</label>
				</div>
				<div class="col-sm-2">
					<form:input path="city" class="form-control" type="text"
						id="city"  name="city"/>
 				</div>
 				<div class="col-sm-2">
					<label>State</label>
				</div>
				<div class="col-sm-2">
					<form:input path="state" class="form-control" type="text"
						id="state" name="state" />
 				</div> 
			</div>
			<div class="row">
				
				<div class="col-sm-2">
					<label>Pin Code</label>
				</div>
				<div class="col-sm-2">
					<form:input path="pincode" class="form-control" type="text"
						id="pincode"  name="pincode"/>
 				</div>
 				<div class="col-sm-2">
					<label>Pan No</label>
				</div>
				<div class="col-sm-2">
					<form:input path="panno" class="form-control" type="text"
						id="panno" name="panno" />
				</div>
 				<div class="col-sm-4">
 				</div>
				  
			</div>
			
			<div class="row">
				
 
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>First Name (*)</label>
				</div>
				<div class="col-sm-3">
					<form:input path="firstName" class="form-control" />
				</div>
				<form:errors path="firstName" cssClass="error" />

			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Middle Name (*)</label>
				</div>
				<div class="col-sm-3">
					<form:input path="middleName" class="form-control" />
				</div>
				<form:errors path="middleName" cssClass="error" />

			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Last Name (*)</label>
				</div>
				<div class="col-sm-3">
					<form:input path="lastName" class="form-control" />

				</div>
				<form:errors path="lastName" cssClass="error" />
			</div>
			<div class="row">
				<div class="col-sm-3">
					<label>Gender</label>
				</div>
				<div class="col-sm-3">
					<label class="radio-inline"> <form:radiobutton
							path="gender" value="Male" /> Male
					</label> <label class="radio-inline"> <form:radiobutton
							path="gender" value="Female" /> Female
					</label> <label class="radio-inline"> <form:radiobutton
							path="gender" value="Other" /> Other
					</label>

				</div>
				<form:errors path="gender" cssClass="error" />
			</div>

			<div class="row">
				<div class="col-sm-3">
					<label></label>
				</div>
				<div class="col-sm-3">
					<input type="submit" value="Save" class="btn btn-block">
				</div>
			</div>
		</form:form>
	</div>
 

</body>
</html>