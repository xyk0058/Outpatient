<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title></title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<link href="./css/Common.css" rel="stylesheet" type="text/css" />
    <link href="./css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <link href="./css/test.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="./js/public.js" type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript">
    </script>
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
				<a href="<%=path %>/qiantai/userinfo/userXinxiModify.jsp" target="main">修改个人资料</a>
			</dd>
			
		</dl>
		
		<dl>
			<dt>
				医疗卡管理
			</dt>
			<dd>
				<a href="<%=path %>/qiantai/card/query.jsp">查询医疗卡</a>
			</dd>
			<dd>
				<a href="<%=path %>/qiantai/card/bind.jsp">绑定医疗卡</a>
			</dd>
			<dd>
				<a href="<%=path %>/qiantai/card/unbind.jsp">解绑医疗卡</a>
			</dd>
		</dl>
		<dl>
			<dt>
				挂号管理
			</dt>
			<dd>
				<a href="<%=path %>/qiantai/keshi/keshiAll.jsp">科室预约挂号</a>
			</dd>
			<dd>
				<a href="<%=path %>/qiantai/yuyue/yuyueManaMy.jsp">我的预约挂号查询</a>
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
				<a href="<%=path %>/qiantai/evaluate/evaluate.jsp">反馈记录</a>
			</dd>
		</dl>
		
		<!--
        	作者：wanghui9874@126.com
        	时间：2015-12-05
        	描述：第三方管理
        -->
		<dl>
			<dt>
				第三方管理
			</dt>
			<dd>
				<a href="<%=path %>/qiantai/fee/pre.jsp">预缴费记录</a>
			</dd>
			<dd>
				<a href="<%=path %>/qiantai/fee/final.jsp">终缴费记录</a>
			</dd>
		</dl>
	</div>
  </body>
</html>
