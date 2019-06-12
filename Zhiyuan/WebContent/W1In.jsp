<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>高考志愿查询</title>
</head>
<script type="text/javascript"> 
　　function test1() { 
　　　　var number1 = document.getElementById("num1").value; 
　　　　var number2 = document.getElementById("num2").value; 
        var number3 = document.getElementById("num3").value;
　　　　if (number1=="" || number2=="" || number3=="") { 
　　　　　　alert("内容不为空"); 
　　　　　　return false; 
　　　　} 
　　　　if (!(/(^[1-9]\d*$)/.test(number1))&&!(/(^[1-9]\d*$)/.test(number2))) { 
　　　　　　alert("输入不正确"); 
　　　　　　return false; 
　　　　} 
		return true;
　　}  
</script> 
<body>
	<form action="<%= request.getContextPath()%>/wenke1/findWenKe1School" onsubmit="test1()">
		<table align="center"> 
			<tr>
				<td><a href="<%= request.getContextPath()%>/wenke1/findAll">查询所有文科1本&nbsp;&nbsp;</a></td>
				<td><label>实力线差1</><input id="num1" type="text" name="xiancha1"></input></td>
				<td><label>排名位次</label><input id="num2" type="text" name="weici1"></input></td>
				<td><label>实力系数1</label><input id="num3" type="text" name="xishu1"></input></td>
				<td><input type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>
</body>
</html>