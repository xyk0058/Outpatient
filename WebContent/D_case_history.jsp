<%@ page language="java" contentType="text/html; charset=utf-8"%>
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
			患者历史病历信息
		</div>	
		<br />
		
		<br />
		<form>
			<table class="update" style="width:700px;">
				<tr height="28">
					<td>姓名:</td>
					<td><input type="text" name="" value="李立"/></td>
				</tr>
				<tr height="28">
					<td>性别:</td>
					<td><input type="text" name="" value="男"/></td>
				</tr>
				<tr height="28">
					<td>年龄:</td>
					<td><input type="text" name="" value="65"/></td>
				</tr>
				
				<tr>
					<td>历史病历:</td>
					<td>
						<textarea rows="4" cols="40" name="content" style="width:600px;height:200px;"></textarea>
					</td>
				</tr>
				
				
			</table>
		</form>
	</body>
</html>
