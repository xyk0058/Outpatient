<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Contract Management System - Login page</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
		<script type="text/javascript">  
 			// Make the page as the parent window display
 			if(top!=self){
 				top.location.href=self.location.href;
 			}  
  		</script>
	</head>

	<body>
		<!-- header start -->
		<div class="header">
			<div class="toplinks">
				<span> [<a href="login.jsp" target="_top">注册</a>]
					&nbsp;|&nbsp; [<a href="register.jsp">登陆</a>] </span>
			</div>

			<h1>
				<img src="images/logo_title.png" alt="Contract Management System" />
			</h1>
		</div>
		<!-- header end -->

		<!-- main start -->
		<div class="main">
			<form action="frame1.jsp" method="post">

				<div class="register_main">
					<table>
						<tr>
							<td class="title" colspan="3">
								用户登录
							</td>
						</tr>
						<tr>
							<td width="60">
								用户名:
							</td>
							<td width="200">
								<input type="text" name="name" id="name" value="" height="40" />
							</td>
							<td width="200"></td>
						</tr>

						<tr>
							<td>
								密码:
							</td>
							<td>
								<input type="password" name="password" id="password" value="" />
							</td>
							<td></td>
						</tr>
						<tr>
							<td colspan="3">
								<input type="submit" value="登陆" class="button" />
							</td>
						</tr>
					</table>
				</div>

			</form>
		</div>
		
		<!-- main end -->
		<div class="footer">

			<p>
				Copyright&nbsp;&copy;&nbsp;Clotho Wong&nbsp;
				&nbsp;Copyright
				Reserved
			</p>
		</div>
	</body>
</html>