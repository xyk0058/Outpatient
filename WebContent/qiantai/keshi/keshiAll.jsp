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
	<link href="css/Common.css" rel="stylesheet" type="text/css" />
    <link href="css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" type="text/javascript">
    </script>
  </head>
  
<body>

	
	
	
	
<!--body-->
<div align="center" class="Wrapper">
<div id="MainCenter" align="center" class="MainCenter">
	     <div id="navigation" class="naivgation">
				<!-- 登录-->
				
				 <div class="SquarelyGreenContainer">
					<div class="top">
						<div class="bgbtop-center">
							<span><a href="">网站公告</a></span>
							<div class="WinRight"></div>
						</div>
					</div>
					<div class="Slot">
					   <!--   <s:action name="gonggaoQian5" executeResult="true"></s:action> --> 
					</div>
				 </div>
				 <!-- 公告-->
				 <!-- 登录-->
				<div class="SquarelyGreenContainer">
					<div class="top">
						<div class="bgbtop-center">
							<span><a href="">日历表</a></span>
							<div class="WinRight"></div>
						</div>
					</div>
					<div class="Slot">
					    <jsp:include flush="true" page="/qiantai/rili/rili.jsp"></jsp:include>
					</div>
				 </div>
		 </div>
		 <div id="content" class="Sub">
				<div class="NewContainer770">
					<div class="BoxHeader">
						<div class="BoxHeader-center MarginTop10">科室</div>
					</div>
					<div class="Slot">
						<table  border="1"width="98%">
						<!--  <s:iterator value="#request.keshiList" id="keshi">-->
							<tr align='left'>
								<td height="30" width="20%">
								 &nbsp;&nbsp;科室名称：
								</td>
								<td>
									 &nbsp;&nbsp;科室简介：<!-- <s:property value="#keshi.keshiJianjie"/>-->
								</td>				
							</tr>
							<!-- </s:iterator>-->	
						</table>
                    </div>
                    <div class="BoxHeader">
						<div class="BoxHeader-center MarginTop10">专家</div>
					</div>
                    <div >
                    <table width="99%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
							<tr align="center" bgcolor="#FAFAF1" height="22">
								<td width="10%">姓名</td>
								<td width="10%">性别</td>
								<td width="10%">年龄</td>
								<td width="60%">简介</td>
								<td width="10%">操作</td>
					        </tr>	
							
							<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
								<td bgcolor="#FFFFFF" align="center">
									
								</td>
								<td bgcolor="#FFFFFF" align="center">
									
								</td>
								<td bgcolor="#FFFFFF" align="center">
									 
								</td>
								<td bgcolor="#FFFFFF" align="center">
									
								</td>
								<td bgcolor="#FFFFFF" align="center">
									 <a href="#" onclick="yuyue(<s:property value="#yisheng.yishengId"/> )">预约</a>
								</td>
							</tr>
							
						</table>
                  </div>
				</div>
				
		 </div>
</div>
</div>
<!--body-->
	

<!--foot -->	
</body>
</html>
