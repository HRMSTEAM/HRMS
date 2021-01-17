<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Form</title>
<jsp:include page="../include/includefile.jsp" />    
<script>
function myFunction() {
	  var x = document.getElementById("userPassword");
	  if (x.type === "password") {
	    x.type = "text";
	  } else {
	    x.type = "password";
	  }
	}
</script>
</head>
<body themebg-pattern="theme1">
	<!-- Pre-loader start -->
	<jsp:include page="../include/spiner.jsp"></jsp:include>
	<!-- Pre-loader end -->
	<section class="login-block">
        <!-- Container-fluid starts -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12">
                    <form:form action="user/userLogin" modelAttribute="user" method="POST" class="md-float-material form-material">
                        <div class="text-center">
                            <img src="${pageContext.request.contextPath}/resources/assets/images/logo.png" alt="logo.png">
                        </div>
                        <div class="auth-box card">
                            <div class="card-block">
                                <div class="m-b-20 row">
                                    <div class="col-md-12" style="text-align: center;">
                                        <h3 class="text-center txt-primary">Sign In</h3>
                                        <span  class="form-txt-error">${failMsg}</span>                                        
                                    </div>
                                </div>                                
                                <div class="form-group form-primary">
									<form:input path="userId" class="form-control" />
									<span class="form-bar"></span><label class="float-label">User ID</label>
								</div>
								<div class="form-group form-primary">
									<form:input path="userPassword" type="password" class="form-control" />
									<span class="form-bar"></span><label class="float-label">Password</label>									
								</div>
								
								<div class="checkbox-fade fade-in-primary d-">
                                            <label>
                                                <input type="checkbox" onclick="myFunction()">
                                                <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                <span class="text-inverse">Show Password</span>
                                            </label>
                                        </div>
								
							 <div class="row m-t-25 text-left">
                                        <div class="col-12">
                                            <div class="checkbox-fade fade-in-primary d-">
                                                <label>
                                                    <input type="checkbox" value="">
                                                    <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                    <span class="text-inverse">Remember me</span>
                                                </label>
                                            </div>
                                            <div class="forgot-phone text-right f-right">
                                                <a href="auth-reset-password.html" class="text-right f-w-600"> Forgot Password?</a>
                                            </div>
                                        </div>
                                    </div>
                                <div class="row m-t-30">
                                    <div class="col-md-12">
                                        <button type="submit" class="btn btn-primary btn-md btn-block waves-effect waves-light text-center m-b-20">Sign in</button>
                                    </div>
                                </div>
                                <hr/>
                                <div class="col-md-10">
                              <p><a href="${pageContext.request.contextPath}/ShowUserMasterForm">Not registered yet? Sign in</a>.</p>

                                </div>
                                <div class="col-md-2">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/auth/Logo-small-bottom.png" alt="small-logo.png">
                                </div>
                            </div>
                        </div>
                    </form:form>
                    
                </div>
                <!-- end of col-sm-12 -->
            </div>
            <!-- end of row -->
        </div>
        <!-- end of container-fluid -->
    </section>
</body>    
</html>
