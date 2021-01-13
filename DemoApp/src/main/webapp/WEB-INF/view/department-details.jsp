<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Department Master</title>
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
										<!-- Basic table card start -->
                                        <div class="card">
                                            <div class="card-header">
                                                <h5>Department Details</h5>
                                                <%-- <span>use class <code>table</code> inside table element</span> --%>
                                                
                                                <div align="right"><a href="${pageContext.request.contextPath}/department/ShowDepartmentMasterForm">Add New Department</a></div>
                                                <div class="card-header-right">
                                                    <ul class="list-unstyled card-option">
                                                        <li><i class="fa fa fa-wrench open-card-option"></i></li>
                                                        <li><i class="fa fa-window-maximize full-card"></i></li>
                                                        <li><i class="fa fa-minus minimize-card"></i></li>
                                                        <li><i class="fa fa-refresh reload-card"></i></li>
                                                        <li><i class="fa fa-trash close-card"></i></li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <div class="card-block table-border-style">
                                                <div class="table-responsive">
                                                <%-- <p><a href="${pageContext.request.contextPath}/department/ShowDepartmentMasterForm">Add New Department</a></p> --%>
                                                    <table class="table">
                                                        <thead>
                                                            <tr>
                                                                <th>#</th>
                                                                <th>Department Id</th>
                                                                <th>Department Name</th>
                                                                <th>Action</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <c:forEach var="tempDepartment" items="${department}">
																<c:url var="updateLink" value="showFormForUpdate">
																	<c:param name="departmentId" value="${tempDepartment.departmentId }"></c:param>
																</c:url>
																<c:url var="deleteLink" value="deleteDepartment">
																	<c:param name="departmentId" value="${tempDepartment.departmentId }"></c:param>
																</c:url>
																<tr>
																	<th scope="row">
																	<td> ${tempDepartment.departmentId} </td>
																	<td> ${tempDepartment.departmentName} </td>
																	<td>
																		<a href="${updateLink}"><i class="far fa-edit"> </i></a> | 
																		<a href="${deleteLink}" onclick="if(!(confirm('Are your sure want to delete the department?'))) return false"><i class="far fa-trash-alt"> </i></a>
																	</td> 
																</tr>
															</c:forEach>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- Basic table card end -->										
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


