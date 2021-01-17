<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login In</title>
<jsp:include page="../include/includefile.jsp" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	
	$("#userId").change(function(){
		$.ajax({
			type: "GET",
			url:'user/validateUserId',
			data:{userId:$("#userId").val()},
		   success:function(responseText){
			   $("#errMsg").text(responseText);
			   
			   if(responseText!=""){
				   $("#userId").focus(); 
			   }
			   if(responseText!=""){
				   $("#errMsg").css('color','red');
			   }
			   
			   
			}
		});
	});
	
});
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
                    <form:form action="saveUser" modelAttribute="user" method="POST" class="md-float-material form-material">
                        <div class="text-center">
                            <img src="${pageContext.request.contextPath}/resources/assets/images/logo.png" alt="logo.png">
                        </div>
                        <div class="auth-box card" style="max-width: 700px;">
                            <div class="card-block row">
                                <div class="m-b-20 col-sm-12">
                                    <div class="col-md-12">
                                        <h3 class="text-center txt-primary">Sign up</h3>
                                    </div>
                                </div>                                
                                <div class="form-group form-primary  col-sm-12">
									<form:input path="userId" class="form-control" />
									<span class="form-bar"></span><label class="float-label">User ID</label>
									<span id="errMsg" cssClass="error"></span>
								</div>
								<div class="form-group form-primary  col-sm-6">
									<form:input path="userPassword" class="form-control" />
									<span class="form-bar"></span><label class="float-label">Password</label>
								</div>
								<div class="form-group form-primary  col-sm-6">
									<form:input path="userPassword" class="form-control" />
									<span class="form-bar"></span><label class="float-label">Comfirm Password</label>
								</div>								
                                <div class="form-group form-primary col-sm-6">
									<form:input path="firstName" class="form-control" />
									<span class="form-bar"></span> <label class="float-label">First Name</label>
								</div>

								<div class="form-group form-primary col-sm-6">
									<form:input path="lastName" class="form-control"/>
									<span class="form-bar"></span> <label class="float-label">Last Name</label>
								</div>
                                <div class="form-group form-primary col-sm-6">
									<form:input path="emailId" class="form-control"/>
									<span class="form-bar"></span> <label class="float-label">Email Id</label>
								</div>

								<div class="form-group form-primary col-sm-6">
									<form:input path="mobileNo" class="form-control"/>
									<span class="form-bar"></span> <label class="float-label">Mobile No</label>
								</div>
                                
                                <div class="row m-t-25 text-left">
                                    <div class="col-md-12">
                                        <div class="checkbox-fade fade-in-primary">
                                            <label>
                                                <input type="checkbox" value="">
                                                <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                <span class="text-inverse">I read and accept <a href="#">Terms &amp; Conditions.</a></span>
                                            </label>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="checkbox-fade fade-in-primary">
                                            <label>
                                                <input type="checkbox" value="">
                                                <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                <span class="text-inverse">Send me the <a href="#!">Newsletter</a> weekly.</span>
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="m-t-30">
                                    <div class="col-md-12">
                                        <button type="button" class="btn btn-primary btn-md btn-block waves-effect text-center m-b-20">Sign up now</button>
                                    </div>
                                </div>
                                <hr/>
                                <div class="col-md-10">
                                    <p class="text-inverse text-left m-b-0">Thank you.</p>
                                    <p class="text-inverse text-left"><a href="index.html"><b>Back to website</b></a></p>
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
