<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Contract Management System - Administrator menu bar</title>
	<link href="css/frame.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
	<div class="menu">
	
		<dl>
			<dt>
				患者信息管理
			</dt>
			<dd>
				<a href="D_inneruser_list.htm" target="main">查询患者信息</a>
			</dd>
			
		</dl>
		

		<dl>
			<dt>
				电子病历管理
			</dt>
			<dd>
				<a href="D_case_history.htm" target="main">查询历史病历</a>
			</dd>
			<dd>
				<a href="D_medicine_list.htm" target="main">开处方</a>
			</dd>
		</dl>

		<dl>
			<dt>
				挂号管理
			</dt>
			<dd>
				<a href="D_transfer_department.htm" target="main">科室转号</a>
			</dd>
			<dd>
				<a href="D_physical_test.htm" target="main">体检化验预约</a>
			</dd>
		</dl>
		
		
	
		<!--<dl>
			<dt>
				第三方管理
			</dt>
			<dd>
				<a href="#">预缴费记录</a>
			</dd>
			<dd>
				<a href="#">终缴费记录</a>
			</dd>
		</dl>-->
	</div>
  </body>
</html>
