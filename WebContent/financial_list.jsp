<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>交易记录</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
		
	</head>

	<body>
		<div class="mtitle">
			交易记录
		</div>

		<div class="search">
		  <div style="float:left;width:600px;">
			<form>
				搜索:
				<input value="时间" />
				&nbsp;&nbsp;
				<input type="submit" value="Search" class="search-submit"/> <br />
			</form>		
		  </div>

		  <div style="float:left;width:180px;">
			<a href="addCustomer.htm">
				<img src="images/add.png"  alt="Add Customer" />
				导出报表
			</a>
          </div>
		</div>
		<br />
		<div class="list">
		  <table>
			<tr>
				<th>
					病人用户名
				</th>
				<th>
					交易金额
				</th>
				<th>
					预缴费时间
				</th>
				<th>
					终缴费时间
				</th>
				<th>
					详细信息
				</th>
				<th>
					是否预缴费
				</th>
				<th>
					是否终缴费
				</th>
			</tr>
			
			<c:forEach items="${records}" var="record">
				<tr>
					<td>${record.patient_id}</td>
					<td>${record.price}</td>
					<td>${record.pre_time}</td>
					<td>${record.final_time}</td>
					<td>${record.trade_detail}</td>
					<td>${record.isPrePay}</td>
					<td>${record.isFinalPay}</td>
				</tr>
			</c:forEach>
			
			
			<tr>
				<td colspan="7"> </td>
			</tr>
		  </table>
		</div>

		<div align="right" class="pagelist">					
			<a href="#"><img src="images/page/first.png"  alt="" /></a> &nbsp;
			<a href="#"><img src="images/page/pre.png"  alt="" /></a>&nbsp;
			<a href="#"><img src="images/page/next.png"  alt="" /></a>&nbsp;
			<a href="#"><img src="images/page/last.png"  alt="" /></a>&nbsp;
			<span class="pageinfo">
				共&nbsp;<strong>2</strong>&nbsp;页&nbsp;<strong>13</strong>&nbsp;记录
			</span>
		</div>
	</body>
</html>
