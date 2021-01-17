<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Master</title>
</head>
<body>
	<jsp:include page="../include/spiner.jsp"></jsp:include>
	<!-- Pre-loader end -->
	<div id="pcoded" class="pcoded">
		<div class="pcoded-overlay-box"></div>
		<div class="pcoded-container navbar-wrapper">
			<jsp:include page="../include/header.jsp"></jsp:include>
			<div class="pcoded-main-container">
				<div class="pcoded-wrapper">
					<jsp:include page="../include/menu.jsp"></jsp:include>
					<div class="pcoded-content">
						<!-- Page-header start -->
						<!-- <div class="page-header">
							<div class="page-block">
								<div class="row align-items-center">
									<div class="col-md-8">
										<div class="page-header-title">
											<h5 class="m-b-10">Dashboard</h5>
											<p class="m-b-0">Welcome to Material Able</p>
										</div>
									</div>
									<div class="col-md-4">
										<ul class="breadcrumb">
											<li class="breadcrumb-item"><a href="index.html"> <i
													class="fa fa-home"></i>
											</a></li>
											<li class="breadcrumb-item"><a href="#!">Dashboard</a></li>
										</ul>
									</div>
								</div>
							</div>
						</div> -->
						<!-- Page-header end -->
						<div class="pcoded-inner-content">
							<!-- Main-body start -->
							<div class="main-body">
								<div class="page-wrapper">
									<!-- Page-body start -->
									<div class="page-body">
										<div class="col-md-12">
											<div class="card">
												<div class="card-header">
													<h5>User Master</h5>													
													<span class="form-txt-success">${successMsg}</span>
												</div>
												<div class="card-block">
													<form:form action="saveUser" class="form-material row" modelAttribute="user" method="POST">

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="userId" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">User ID</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="userCode" class="form-control" />
															<span class="form-bar"></span> <label class="float-label">User Code</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="firstName" class="form-control" />
															<span class="form-bar"></span> <label class="float-label">First Name</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="lastName" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">Last Name</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="emailId" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">Email Id</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="mobileNo" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">Mobile No</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="dateOfBirth" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">DOB</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="userAddress" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">Address</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="userPincode" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">Pin Code</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="userCity" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">City</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="userState" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">State</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="userCountry" class="form-control"/>
															<span class="form-bar"></span> <label class="float-label">Country</label>
														</div>	
														<div class="form-group form-default form-static-label col-sm-6">
															<form:select path="company.companyId" class="form-control">
																<form:options items="${companyList}" itemValue="companyId" itemLabel="companyName"/>  
															</form:select>
															<span class="form-bar"></span> <label class="float-label">Company Name</label>
														</div>
														
														<div class="form-group form-default form-static-label col-sm-6">
															<form:select path="branch.branchId" class="form-control">
																<form:options items="${branchList}" itemValue="branchId" itemLabel="branchName"/>  
															</form:select>
															<span class="form-bar"></span> <label class="float-label">Branch Name</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:select path="department.departmentId" class="form-control">
																<form:options items="${departmentList}" itemValue="departmentId" itemLabel="departmentName"/>  
															</form:select>
															<span class="form-bar"></span> <label class="float-label">Department Name</label>
														</div>
														
														<br><br>
														<div class="form-group form-default form-static-label col-sm-12" align="center">
															<input type="submit" name="action" value="Save" class="btn btn-primary waves-effect waves-light">
															<input type="submit" name="action" value="Clear" class="btn btn-primary waves-effect waves-light">
															<input type="submit" name="action" value="Close" class="btn btn-primary waves-effect waves-light">
														</div>
													</form:form>												
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- Page-body end -->
							</div>
							<div id="styleSelector"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>



