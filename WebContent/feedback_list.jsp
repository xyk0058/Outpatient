<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>反馈列表</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
		<!-- Use JavaScript script to open a new window display information when preview-->
		<script>
			function preview(url) {
				window.open(url,'Preview','toolbar=no,scrollbars=yes,width=720,height=560,top=50,left=100');
			}
		</script>
	</head>

	<body>
		<div class="mtitle">
			反馈列表
		</div>

		<div class="search">
		  <div style="float:left;width:600px;">
			<form>
				搜索:
				<input value="姓名/证件号" />
				&nbsp;&nbsp;
				<input type="submit" value="Search" class="search-submit"/> <br />
			</form>		
		  </div>
		  
		</div>
		<br />
		<div class="list">
		  <table>
			<tr>
				<th>
					用户名
				</th>
				<th>
					内容
				</th>
				<th>
					反馈科室
				</th>
			</tr>
			<tr>
				<td>
					8888
				</td>
		
				<td>
					很好
				</td>
				
				<td>
					耳鼻喉科
				</td>
			</tr>
		
			
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
				Total&nbsp;<strong>2</strong>&nbsp;pages&nbsp;<strong>13</strong>&nbsp;records
			</span>
		</div>
	</body>
</html>
