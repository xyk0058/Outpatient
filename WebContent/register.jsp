<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>注册页面</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
	</head>

	<body>
		<!-- header start -->
		<div class="header">
			<div class="toplinks">
				<span>[<a href="register.jsp">注册</a>][<a
					href="login.jsp">登陆</a>]</span>
			</div>

			<h1>
				<img src="images/logo_title.png" alt="Contract Management System" />
			</h1>
		</div>
		<!-- header end -->

		<!-- main start -->
		<div class="main">
			<form action="login.jsp" method="post">

				<div class="register_main">
					<table>
						<tr>
							<td class="title" colspan="2">
								用户注册
							</td>
						</tr>
						<tr>
							<td width="120" align="center">
								用户名:
							</td>
							<td>
								<input type="text" name="name" id="name" value="" />
							</td>
						</tr>
						
						<tr>
							<td align="center">
								密码:
							</td>
							<td>
								<input type="password" name="password" id="password" value="" />
							</td>
						</tr>

						<tr>
							<td align="center">
								确认密码:
							</td>
							<td>
								<input type="password" name="password2" id="password2" value="" />
							</td>
						</tr>
						

						<tr>
							<td colspan="2">
								<input type="submit" value="提交" class="button" />
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