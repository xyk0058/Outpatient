<%@ page language="java" contentType="text/html; "
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width="98%" align="center" border="0" cellpadding="4"
		cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom: 8px">
		<tr align='center' bgcolor="#FFFFFF"
			onMouseMove="javascript:this.bgColor='red';"
			onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<td width="25%" bgcolor="#FFFFFF" align="left">姓名:</td>
			<td width="75%" bgcolor="#FFFFFF" align="left"><input
				name="name" readonly="readonly"  />
			</td>
		</tr>
		<tr align='center' bgcolor="#FFFFFF"
			onMouseMove="javascript:this.bgColor='red';"
			onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<td width="25%" bgcolor="#FFFFFF" align="left">生日:</td>
			<td width="75%" bgcolor="#FFFFFF" align="left"><input
				name="birthday" readonly="readonly" />
			</td>
		</tr>
		<tr align='center' bgcolor="#FFFFFF"
			onMouseMove="javascript:this.bgColor='red';"
			onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<td width="25%" bgcolor="#FFFFFF" align="left">身份证号:</td>
			<td width="75%" bgcolor="#FFFFFF" align="left"><input
				name="idcard"  readonly="readonly"/>
			</td>
		</tr>
		<tr align='center' bgcolor="#FFFFFF"
			onMouseMove="javascript:this.bgColor='red';"
			onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<td width="25%" bgcolor="#FFFFFF" align="left">医保卡:</td>
			<td width="75%" bgcolor="#FFFFFF" align="left"><input
				name="yibao"  readonly="readonly"/>
			</td>
		</tr>
		<tr align='center' bgcolor="#FFFFFF"
			onMouseMove="javascript:this.bgColor='red';"
			onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<td width="25%" bgcolor="#FFFFFF" align="left">手机号:</td>
			<td width="75%" bgcolor="#FFFFFF" align="left"><input
				name="phone"  readonly="readonly"/>
			</td>
		</tr>
			<tr align='center' bgcolor="#FFFFFF"
			onMouseMove="javascript:this.bgColor='red';"
			onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<td width="25%" bgcolor="#FFFFFF" align="left">验证码:</td>
			<td width="55%" bgcolor="#FFFFFF" align="left"><input
				name="phone" />
			</td>
			<td width="20%" bgcolor="#FFFFFF" align="left"><button value="获取验证码" type="submit"></button>
			</td>
		</tr>
		<tr align='center' bgcolor="#FFFFFF"
			onMouseMove="javascript:this.bgColor='red';"
			onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<td width="100%" bgcolor="#FFFFFF" align="left" colspan="2"><input
				type="hidden" name="yishengId"
				value="<%=request.getParameter("yishengId")%>" /> <input
				type="submit" value="解绑医疗卡" />&nbsp;</td>
		</tr>
	</table>
</body>
</html>