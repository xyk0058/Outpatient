<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Edit Customer</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
	</head>

	<body>
		<div class="mtitle">
			药方信息
		</div>	
		<br />
		
		<br />
		<form>
			<table class="update" style="width:700px;">
				<tr height="28">
					<td width="140px">医生编号:</td>
					<td><input type="text" name="name" value="2333"/></td>
				</tr>
				<tr height="28">
					<td>姓名:</td>
					<td><input type="text" name="" value="李立"/></td>
				</tr>
				<tr height="28">
					<td>电话:</td>
					<td><input type="text" name="" value="111"/></td>
				</tr>
				<tr height="28">
					<td>职位:</td>
					<td><input type="text" name="" value="111"/></td>
				</tr>
				<tr height="28">
					<td>住址:</td>
					<td><input type="text" name="" value="111"/></td>
				</tr>
				
				<tr>
					<td>记录:</td>
					<td>
						<textarea rows="4" cols="40" name="content" style="width:400px;height:100px;"></textarea>
					</td>
				</tr>
				
				<tr height="28">
					<td align="center" colspan="2">
						<input type="submit" value="提交" class="button"> &nbsp; &nbsp; &nbsp;
						<input type="reset" value="重置" class="button">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
