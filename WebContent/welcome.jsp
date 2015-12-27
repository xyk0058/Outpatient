<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>

<title>title</title>

<script type="text/javascript">

function delIndex(obj) {

var rowIndex = obj.parentNode.parentNode.rowIndex;//获得行下标

alert(rowIndex);

var tb = document.getElementById("tb");

tb.deleteRow(rowIndex);//删除当前行

add(rowIndex);//在当前行插入一行

}

function add(rowIndex) {

var tb = document.getElementById("tb");

if (rowIndex == "-1") {

rowIndex = tb.rows.length;//默认在末尾插入一行

}

var row = tb.insertRow(rowIndex);//在表格的指定插入一行

var c1 = row.insertCell(0);

c1.innerHTML = "new" + rowIndex;

var c2 = row.insertCell(1);

c2.innerHTML = '<a href="javascript:void(0)" onclick="delIndex(this)">删除</a>';

}

</script>

</head>

<body>

<input type="button" value="添加一行" onclick="add('-1')" ><input type="button" value="删除选中项" onclick="del()" />

<table id="tb">

<tr><td>1</td><td><a href="javascript:void(0)" onclick="delIndex(this)">删除</a></td></tr>

<tr><td>2</td><td><a href="javascript:void(0)" onclick="delIndex(this)">删除</a></td></tr>

<tr><td>3</td><td><a href="javascript:void(0)" onclick="delIndex(this)">删除</a></td></tr>

<tr><td>4</td><td><a href="javascript:void(0)" onclick="delIndex(this)">删除</a></td></tr>

<tr><td>5</td><td><a href="javascript:void(0)" onclick="delIndex(this)">删除</a></td></tr>

<tr><td>6</td><td><a href="javascript:void(0)" onclick="delIndex(this)">删除</a></td></tr>

<tr><td>7</td><td><a href="javascript:void(0)" onclick="delIndex(this)">删除</a></td></tr>

</table>

</body>

</html>
	</div>
	</body>
</html>