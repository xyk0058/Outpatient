<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Edit Role</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
	</head>

	<body>
		<div class="mtitle">
			体检化验
		</div>
		<br />		
		

		<br />
		<form>
			<table class="update" style="width:700px;">
				<tr height="28">
					<td width="100">患者编号:</td>
					<td><input type="text" name="3992" value="3992"/></td>
				</tr>
				<tr height="28">
					<td width="100">患者姓名:</td>
					<td><input type="text" name="李立" value="李立"/></td>
				</tr>
				<tr height="28">
					<td width="100">患者性别:</td>
					<td><input type="text" name="男" value="男"/></td>
				</tr>
				
				<tr>
					<td>体检化验选项:</td>	
					
					<td>
						<div>
							基本检查:<br />
							<input name="" type="checkbox" value="1" />身高
							<input name="" type="checkbox" value="2" />体重
							<input name="" type="checkbox" value="3" />血压
							<br />
							<input name="" type="checkbox" value="4" />心率
							<input name="" type="checkbox" value="5" />听力
							<input name="" type="checkbox" value="6" />视力
							<br />
							<input name="" type="checkbox" value="7" />体脂肪检测
							<input name="" type="checkbox" value="8" />血脂
							<input name="" type="checkbox" value="9" />空腹血糖
							<br /><br />
							常规检查:<br />
							<input name="" type="checkbox" value="10" />B超
							<input name="" type="checkbox" value="11" />胸腹X光
							<input name="" type="checkbox" value="12" />上肠胃道摄影
							:<br />
							<input name="" type="checkbox" value="13" />超音波
							<input name="" type="checkbox" value="14" />心电图
							<input name="" type="checkbox" value="15" />血液体检
							<br />
							<input name="" type="checkbox" value="16" />尿液体检
							<input name="" type="checkbox" value="17" />血常规
							<input name="" type="checkbox" value="18" />尿常规
							<br />
							<input name="" type="checkbox" value="27" />肿瘤检查
							<input name="" type="checkbox" value="19" />肿瘤化验
							<br /><br />
							其他检查:<br />
							<input name="" type="checkbox" value="20" />盆腔彩超
							<input name="" type="checkbox" value="21" />腹部彩超
							<input name="" type="checkbox" value="22" />胸部透视
							<br />
							<input name="" type="checkbox" value="23" />骨密度
							<br /><br />
							五官科检查:<br />
							<input name="" type="checkbox" value="24" />非接触性眼压
							<input name="" type="checkbox" value="25" />听力检查
							<input name="" type="checkbox" value="26" />口腔检查
						
						</div>
					</td>
				</tr>

				<tr height="28">
					<td align="center" colspan="4">
						&nbsp;&nbsp;<input type="submit" value="提交" class="button"> &nbsp; &nbsp; 
					</td>
			</tr>
			</table>
		</form>
	</body>
</html>
