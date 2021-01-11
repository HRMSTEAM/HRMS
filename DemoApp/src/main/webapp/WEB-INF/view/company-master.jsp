<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />

<meta name="keywords"
	content="bootstrap, bootstrap admin template, admin theme, admin dashboard, dashboard template, admin template, responsive" />
<meta name="author" content="Codedthemes" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Master</title>

</head>
<body>

	<div class="theme-loader">
		<div class="loader-track">
			<div class="preloader-wrapper">
				<div class="spinner-layer spinner-blue">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>
				<div class="spinner-layer spinner-red">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>

				<div class="spinner-layer spinner-yellow">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>

				<div class="spinner-layer spinner-green">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
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
						<div class="page-header">
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
						</div>
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
													<h5>Company</h5>
													<!--<span>Add class of <code>.form-control</code> with <code>&lt;input&gt;</code> tag</span>-->
												</div>
												<div class="card-block">
													<form:form action="saveCompany" class="form-material row"
														modelAttribute="company" method="POST">

														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyId" class="form-control" readonly="true" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Company ID</label>
														</div>

														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyName" class="form-control" placeholder="Enter Company Name" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Company Name</label>
														</div>

														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyAddress" class="form-control"  placeholder="Enter Company Address" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Company Address</label>
														</div>
														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyPinCode" class="form-control" placeholder="Enter Company Pincode" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Company Pincode</label>
														</div>

														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyCity" class="form-control" placeholder="Enter  City" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Company City</label>
														</div>

														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="companyState" class="form-control" placeholder="Enter State" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Company State</label>
														</div>

														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="country" class="form-control" placeholder="Enter Company Country" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Country</label>
														</div>

														<div
															class="form-group form-default form-static-label col-sm-6">
															<form:input path="gstNo" class="form-control" placeholder="Enter Gst No" />

															<!--   <input type="text" name="footer-email" class="form-control" placeholder="Enter User Name"> -->
															<span class="form-bar"></span> <label class="float-label">Gst No</label>
														</div>
<br><br>
														<div class="row">
														<div class="col-md-2"></div>
															<div class="col-md-2"></div>
															
															<div class="col-md-6">
															<button class="btn btn-primary waves-effect waves-light">SAVE</button>
															
															</div>
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
	</div>

</body>
</html>



