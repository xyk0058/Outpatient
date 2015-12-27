<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>转换科室列表</title>
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
		
		<br />
		<div class="list">
		  <table>
			<tr>
				<th>
					就诊编号
				</th>
				<th>
					姓名
				</th>
				<th>
					当前科室
				</th>
				<th>
					转换科室
				</th>	
				
			</tr>
			
			<tr>
				<td>
					3992
				</td>
		
				<td>
					李立
				</td>
				
				<td>
					外科
				</td>
				<td>
					<select>  
                            <option value="1">牙科</option>  
							<option value="2">内科</option>  
							<option value="3">五官科</option>  
							 
					</select>  
				
				</td>
				
			</tr>
			
			<tr>
				<td colspan="7"> </td>
			</tr>
			<tr height="28">
					<td align="center" colspan="4">
						&nbsp;&nbsp;<input type="submit" value="提交" class="button"> &nbsp; &nbsp; 
					</td>
			</tr>
		  </table>
		  
		  
		</div>

		<!--<div align="right" class="pagelist">					
			<a href="#"><img src="images/page/first.png"  alt="" /></a> &nbsp;
			<a href="#"><img src="images/page/pre.png"  alt="" /></a>&nbsp;
			<a href="#"><img src="images/page/next.png"  alt="" /></a>&nbsp;
			<a href="#"><img src="images/page/last.png"  alt="" /></a>&nbsp;
					
			<span class="pageinfo">
				Total&nbsp;<strong>2</strong>&nbsp;pages&nbsp;<strong>13</strong>&nbsp;records
			</span>
		</div>-->
	</body>
</html>

