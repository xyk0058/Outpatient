<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Contract Management System - Operator page</title>
		<link href="css/frame.css" rel="stylesheet" 
			type="text/css" />
	</head>

	<!-- Frame structure:upper, middle (left, right), under-->
	<frameset rows="100,*,70" frameborder="no" border="0">
		<frame src="header2.htm"  scrolling="no"/>
		<frameset cols="250,*" >
			<frame src="D_left2.htm"  scrolling="no"/>
			<frame src="welcome.htm"  name="main"  scrolling="auto"/>
		</frameset>
		<frame src="footer2.htm" scrolling="no"/>
	</frameset>
	<!-- Set prompt message for browser that does not support Frame structure-->
	<noframes>
		<body>
			Your browser does not support frame structure!
		</body>
	</noframes>
</html>