<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Outpatient Management System - Administrator menu bar</title>
	<link href="css/frame.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
	<div class="menu">
		<!--
        	作者：wanghui9874@126.com
        	时间：2015-12-05
        	描述：用户管理
        -->
		<dl>
			<dt>
				用户管理
			</dt>
			<dd>
				<a href="inneruser_list.jsp" target="main">内部人员管理</a>
			</dd>
			<dd>
				<a href="patients_list.jsp" target="main">注册用户管理</a>
			</dd>
		</dl>
		
		<!--
        	作者：wanghui9874@126.com
        	时间：2015-12-05
        	描述：医疗卡管理
        -->
		<dl>
			<dt>
				医疗卡管理
			</dt>
			<dd>
				<a href="hcard_list.jsp"  target="main">医疗卡列表</a>
			</dd>
		</dl>
		<!--
        	作者：wanghui9874@126.com
        	时间：2015-12-05
        	描述：挂号管理
        -->
		<dl>
			<dt>
				挂号管理
			</dt>
			<dd>
				<a href="preregister_list.jsp"  target="main">预约挂号</a>
			</dd>
			<dd>
				<a href="register_list.jsp"  target="main">现场挂号</a>
			</dd>
		</dl>
		<!--
        	作者：wanghui9874@126.com
        	时间：2015-12-05
        	描述：财务管理
        -->
		<dl>
			<dt>
				财务管理
			</dt>
			<dd>
				<a href="ShowTradeRecordServlet"  target="main">交易记录</a>
			</dd>
		</dl>
		
		<!--
        	作者：wanghui9874@126.com
        	时间：2015-12-05
        	描述：反馈管理
        -->
		<dl>
			<dt>
				反馈管理
			</dt>
			<dd>
				<a href="feedback_list.jsp"  target="main">反馈记录</a>
			</dd>
		</dl>
		
		<!--
        	作者：wanghui9874@126.com
        	时间：2015-12-05
        	描述：第三方管理
        -->
	</div>
  </body>
</html>
