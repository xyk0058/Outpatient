<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>用户列表</title>
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
			内部员工列表
		</div>

		<div class="search">
		  <div style="float:left;width:600px;">
			<form>
				搜索:
				<input value="姓名/证件号/工号" />
				&nbsp;&nbsp;
				<input type="submit" value="Search" class="search-submit"/> <br />
			</form>		
		  </div>

		  <div style="float:left;width:180px;">
			<a href="addCustomer.htm">
				<img src="images/add.png"  alt="Add Customer" />
				添加用户
			</a>
			<a href="addCustomer.htm">
				<img src="images/add.png"  alt="Add Customer" />
				导入用户
			</a>
          </div>
		</div>
		<br />
		<div class="list">
		  <table>
			<tr>
				<th>
					工号
				</th>
				<th>
					姓名
				</th>
				<th>
					职位
				</th>
				
				<th style="width:150px;text-align:center;">
					操作
				</th>
			</tr>
			<tr>
				<td>
					3992
				</td>
		
				<td>
					李立
				</td>
				
				<td class="tdname">
					<a href="javascript:preview('inneruser_detail.htm');">医生</a>
				</td>
				
				<td>
					<a href="edit_inneruser.htm">
						<img src="images/icon-edit.png"  alt="Edit" />
						修改
					</a>
					| 
					<a href="">
						<img src="images/delete.png"  alt="Delete" />
						删除
					</a>
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
