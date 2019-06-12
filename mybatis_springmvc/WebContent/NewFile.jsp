<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
	<table>
	  <thead>员工信息</thead>
	  <tbody>
	     <tr>
	     <td><label>${user.id}</label></td>
	     <td><label>${user.username}</label></td>
	     <td><label>${user.sex}</label></td>
	     <td><label>${user.birthday}</label></td>
	     <td><label>${user.address}</label></td>
	     </tr>
	  </tbody>
	</table>
</body>
</html>