<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Company Master</title>
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
													<h5>Company Master</h5>
													<div class="card-header-right"><a href="${pageContext.request.contextPath}/company/list">Company Details</a></div>
													<!--<span>Add class of <code>.form-control</code> with <code>&lt;input&gt;</code> tag</span>-->
												</div>
												<div class="card-block">
													<form:form action="saveCompany" class="form-material row" modelAttribute="company" method="POST">

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyId" class="form-control" readonly="true" />
															<span class="form-bar"></span> <label class="float-label">Company ID</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyName" class="form-control" placeholder="Enter Company Name" />
															<span class="form-bar"></span> <label class="float-label">Company Name</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyAddress" class="form-control"  placeholder="Enter Company Address" />
															<span class="form-bar"></span> <label class="float-label">Company Address</label>
														</div>
														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyPinCode" class="form-control" placeholder="Enter Company Pincode" />
															<span class="form-bar"></span> <label class="float-label">Company Pincode</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyCity" class="form-control" placeholder="Enter  City" />
															<span class="form-bar"></span> <label class="float-label">Company City</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyState" class="form-control" placeholder="Enter State" />
															<span class="form-bar"></span> <label class="float-label">Company State</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="country" class="form-control" placeholder="Enter Company Country" />
															<span class="form-bar"></span> <label class="float-label">Country</label>
														</div>

														<div class="form-group form-default form-static-label col-sm-6">
															<form:input path="gstNo" class="form-control" placeholder="Enter Gst No" />
															<span class="form-bar"></span> <label class="float-label">Gst No</label>
														</div>
														<br><br>
														<div class="form-group form-default form-static-label col-sm-12" align="center">
															<button class="btn btn-primary waves-effect waves-light">Save</button>
															<button class="btn btn-primary waves-effect waves-light">Clear</button>
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



