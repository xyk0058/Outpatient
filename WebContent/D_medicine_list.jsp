<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>药品管理</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
		<!-- Use JavaScript script to open a new window display information when preview-->
		<script type="text/javascript">
			function preview(url) {
				window.open(url,'Preview','toolbar=no,scrollbars=yes,width=720,height=560,top=50,left=100');
			}
			
			//要确定行的唯一性（提示：你可以使用你的主键）
			   var id=1;
			   var MName = null;
			   var MUser = null;
			   var MAttation = null;
			   var MNum =0;
			   
			//添加行的方法
			   function addTr()
			   { 
			    //获得表格对象
			    var tb=document.getElementById('MTable');
			   
			    //添加一行    
			    var newTr = tb.insertRow(-1);//在最下的位置
			   
			    //给这个行设置id属性，以便于管理（删除）
			    newTr.id='tr'+id;
			    //设置对齐方式（只是告诉你，可以以这种方式来设置任何它有的属性）
			    newTr.align='center';
			    //添加两列    
			    var newTd0 =  newTr.insertCell();    
			    var newTd1 =  newTr.insertCell();
			    var newTd2 =  newTr.insertCell();
			    var newTd3 =  newTr.insertCell();
			    var newTd4 =  newTr.insertCell();
			    var newTd5 =  newTr.insertCell();
			   
			    //设置列内容和属性    
			    newTd0.innerHTML = id; //让你看到删除的是指定的行
			    newTd1.innerHTML ="<input type=\"text\" size=\"20\" name=\"MName\" value=\"\"/>";
			    newTd2.innerHTML ="<input type=\"text\" size=\"20\" name=\"Mname\" value=\"\"/>";	    
			    newTd3.innerHTML ="<input type=\"text\" size=\"20\" name=\"MAttation\" value=\"\"/>";
			    newTd4.innerHTML ="<input type=\"text\" size=\"1\" name=\"MNum\" value=\"\"/>";
			    newTd5.innerHTML= "<button onclick=\"moveTr('"+id+"');\" >移除</button>";
			   
			    id++;
			   
			   }
			   
			   //移除行的方法
			   function moveTr(id)
			   {
			    //获得表格对象
			    var tb=document.getElementById('MTable');
			    //根据id获得将要删除行的对象
			    var tr=document.getElementById('tr'+id);
			    //取出行的索引，设置删除行的索引
			    tb.deleteRow(tr.rowIndex);
			   
			   }
 
		</script>
	</head>


	<body>
		<div class="mtitle" >
			患者处方
		</div>
		
	   <center>  药方内容：
   <table id="MTable" border="2" bordercolor="black" width="700px" height="30px">
    <tr>
     <td>
      标号
     </td>
     <td>
      药品名称
     </td>
     <td>
      药剂具体使用事项
     </td>
     <td>
    药品使用注意事项 
     </td>
     <td>
     数量
     </td>
     <td>
   操作
     </td>
    </tr>
</table>
   <button onclick="addTr();">添加</button>

  
		<table>
		        <tr>
					<td>患者症状:</td>
					<td>
						<textarea rows="4" cols="40" name="content" style="width:500px;height:150px;"></textarea>
					</td>
				</tr>
				<tr height="28">
					<td align="center" colspan="2">
						&nbsp; &nbsp;<input type="submit" value="提交" class="button"> &nbsp; &nbsp; &nbsp;
						
					</td>
				</tr>
		</table>	
	</center>	       
	</body>
</html>
