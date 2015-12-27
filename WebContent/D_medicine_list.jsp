<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>药品管理</title>
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
			患者处方
		</div>
		
		<div class="search">
			<form>
				搜索药品:
				<input value="药品名/药品编号" />
				&nbsp;&nbsp;
				<input type="submit" value="Search" class="search-submit"/> <br />
			</form>
		</div>

		<div class="list">
		  <table>
			 <tr>
				<th>
					药品编号
				</th>
				<th>
					药品名
				</th>
				<th width="270px">
					基本信息
				</th>
				<th>
					数量
				</th>
				<th class="th1">
					操作
				</th>
				
			</tr>
			<tr>	
				<td>
					AC8924
				</td>
				<td class="tdname">
					<a href="javascript:preview('contractDetail.htm');">藿香正气水</a>
				</td>
				<td>
					趋热解毒
				</td>
				<td><input type="text" size="1" name="2" value="1"/>
				</td>
				
				<td class="operate">
				    <a href="D_medicine_paper.htm">
						<img src="images/information.png"  alt="Countersign  opinion" />
						添加
					</a> 
					&nbsp;|&nbsp;
					<a href="dgContract.htm">
						<img src="images/icon-edit.png"  alt="Finalize " />
						删除
					</a>
				</td>
			</tr>
			
			<tr>	
				<td>
					BT6245
				</td>
				<td class="tdname">
					<a href="javascript:preview('contractDetail.htm');">阿莫西陵胶囊</a>
				</td>
				<td>
					消炎
				</td>
				<td>
				<input type="text" size="1" name="2" value="1"/></td>
				<td class="operate">
					<a href="javascript:preview('showHQOpinion.htm');">
						<img src="images/information.png"  alt="Countersign  opinion" />
						添加
					</a> 
					&nbsp;|&nbsp;
					<a href="dgContract.htm">
						<img src="images/icon-edit.png"  alt="Finalize " />
						删除
					</a>
				</td>
			</tr>
			
			<tr>
				<td colspan="3"> </td>
			</tr>	
		  </table>
		  <div align="right" class="pagelist">					
			<a href="#"><img src="images/page/first.png"  alt="" /></a> &nbsp;
			<a href="#"><img src="images/page/pre.png"  alt="" /></a>&nbsp;
			<a href="#"><img src="images/page/next.png"  alt="" /></a>&nbsp;
			<a href="#"><img src="images/page/last.png"  alt="" /></a>&nbsp;
					
			<span class="pageinfo">
				Total&nbsp;<strong>2</strong>&nbsp;pages&nbsp;<strong>13</strong>&nbsp;records
			</span>	
		</div>
		  
		
		  <table>
		        <tr>
					<td>患者症状:</td>
					<td>
						<textarea rows="4" cols="40" name="content" style="width:500px;height:150px;"></textarea>
					</td>
				</tr>
		        
		        <tr>
					<td>药方内容:</td>
					<td>
						<textarea rows="4" cols="40" name="content" style="width:500px;height:150px;"></textarea>
					</td>
				</tr>
				
				<tr height="28">
					<td align="center" colspan="2">
						<input type="submit" value="提交" class="button"> &nbsp; &nbsp; &nbsp;
					</td>
				</tr>
			</table>
		</div>

		
	</body>
</html>
