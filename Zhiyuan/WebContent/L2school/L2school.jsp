<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>理科2本所有学校</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css"/>
</head>

<body>
	<h3 align="center">理科二本学校信息</h1>
	
			<table align="center" border="1" style="border-spacing:18px" >
			  <tbody align="center">
			  <tr>
					<td width="4%"><label>序号</label></td>
					<td width="4%"><label>学校代码</label></td>
					<td width="14%"><label>学校名称</label></td>
					<td width="4%"><label>平均分</label></td>
					<td width="4%"><label>2018线差</label></td>
					<td width="4%"><label>2018位次</label></td>
					<td width="4%"><label>系数</label></td>
					<td width="4%"><label>2017线差</label></td>
					<td width="4%"><label>2017位次</label></td>
					<td width="4%"><label>系数</label></td>
					<td width="4%"><label>2016线差</label></td>
					<td width="4%"><label>2016位次</label></td>
					<td width="4%"><label>系数</label></td>
					<td width="4%"><label>2015线差</label></td>
					<td width="4%"><label>2015位次</label></td>
					<td width="4%"><label>系数</label></td>
					<td width="4%"><label>平均线差</label></td>
					<td width="4%"><label>平均位次</label></td>
					<td width="4%"><label>平均系数</label></td>
					<td width="4%"><label>录取人数</label></td>
					<td width="4%"><label>增减变化</label></td>
					<td width="4%"><label>专业分析</label></td>
				</tr>
				</hr>
			  	<c:forEach var="p" items="${L2school}">
				  		<tr>
					     <td><label>${p.id}</label></td> 
					     <td><label>${p.pid}</label></td>
					     <td><label>${p.name}</label></td>
					     <td><label>${p.avercore} </label></td>
					     <td><label>${p.xiancha1}</label></td>
					     <td><label>${p.weici1}</label></td>
					     <td><label>${p.xishu1}</label></td>
					     <td><label>${p.xiancha2}</label></td>
					     <td><label>${p.weici2}</label></td>
					     <td><label>${p.xishu2}</label></td>
					     <td><label>${p.xiancha3}</label></td>
					     <td><label>${p.weici3}</label></td>
					     <td><label>${p.xishu3}</label></td>
					     <td><label>${p.xiancha4}</label></td>
					     <td><label>${p.weici4}</label></td>
					     <td><label>${p.xishu4}</label></td>
					     <td><label>${p.averxiancha}</label></td>
					     <td><label>${p.averweici}</label></td>
					     <td><label>${p.averxishu}</label></td>
					     <td><label>${p.count}</label></td>
					     <td><label>${p.change}</label></td>
					     <td><label>${p.hard}</label></td>
				     	</tr>
				     	</hr>
			  	</c:forEach>
			  </tbody>
		</table>
	
</body>
</html>