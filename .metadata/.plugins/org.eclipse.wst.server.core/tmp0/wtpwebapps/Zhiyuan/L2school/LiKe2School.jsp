<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>符合条件的理科2本学校</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css"/>
</head>
<script type="text/javascript">
	function deleteRow(r){
		var i = r.parentNode.parentNode.rowIndex;
		document.getElementById('myTable').deleteRow(i);
	}
</script>
<body>
	<h3 align="center">符合条件的理科二本学校</h1>
	
	<table align="center" border="1" >
			<tr>
				<td width="3%">姓名 &nbsp;&nbsp; </td>
				<td width="3%">性别 &nbsp;&nbsp;</td>
				<td width="3%">科类 &nbsp;&nbsp;</td>
				<td width="3%">分数 &nbsp;&nbsp;</td>
				<td width="3%">系数 &nbsp;&nbsp;</td>
				<td width="3%">位次 &nbsp;&nbsp;</td>
				<td width="3%">批次 &nbsp;&nbsp;</td>
			</tr>
	</table>
	
	
	<table align="center" border="1" style="border-spacing:18px" id="myTable">
		<tbody align="center">
			  <tr>
					<td width="4%"><label>招生人数</label></td>
					<td width="4%"><label>增减变化</label></td>
					<td width="4%"><label>专业分析</label></td>
					<td width="4%"><label>院校代码</label></td>
					<td width="14%"><label>学校名称</label></td>
					<td width="4%"><label>去年线差</label></td>
					<td width="4%"><label>前年线差</label></td>
					<td width="4%"><label>平均线差</label></td>
					<td width="4%"><label>去年系数</label></td>
					<td width="4%"><label>前年系数</label></td>
					<td width="4%"><label>平均系数</label></td>
					<td width="4%"><label>去年位次</label></td>
					<td width="4%"><label>前年位次</label></td>
					<td width="4%"><label>平均位次</label></td>
					<td width="4%"><label>线差对比</label></td>
					<td width="4%"><label>系数对比</label></td>
					<td width="4%"><label>位次对比</label></td>
					<td width="4%"><label>统计年数</label></td>
					<td width="4%"><label></label></td>
					<td width="4%"><label>序号</label></td>
				</tr>
				</hr>
				<c:forEach var="p" items="${LiKe2School}" varStatus="status">
				  		<tr>
					     <td><label>${p.count}</label></td>
					     <td><label>${p.change}</label></td>
					     <td><label>${p.hard}</label></td>
					     <td><label>${p.pid}</label></td>
					     <td><label>${p.name}</label></td>
					     <td><label>${p.xiancha1}</label></td>
					     <td><label>${p.xiancha2}</label></td>
					  	 <td><label>${p.averxiancha}</label></td>
					     <td><label>${p.xishu1}</label></td>
					     <td><label>${p.xishu2}</label></td>
					     <td><label>${p.averxishu}</label></td>
					     <td><label>${p.weici1}</label></td>
					     <td><label>${p.weici2}</label></td>
					     <td><label>${p.averweici}</label></td>
					     <td><label>${p.xiancha}</label></td>
					     <td><label>${p.xishu}</label></td>
					     <td><label>${p.weici}</label></td>
					     <td><label>${p.nian}年</label></td>
					     <td><input type="submit" value="删除" onclick="deleteRow(this)"></input></td>
					     <td><label>${status.index+1}</label></td>
				     	</tr>
				     	</hr>
			  	</c:forEach>
		</tbody>
	</table>
</body>
</html>