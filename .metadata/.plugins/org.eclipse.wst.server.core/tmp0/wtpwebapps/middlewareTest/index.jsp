<%@page import="model.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDao dao = new MemberDao();
	Member[] members = dao.memberList();
%>

<table>
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>이메일</td>
	</tr>
		
		<%for(Member m : members){%>
	<tr>
		<td><%= m.getId() %></td>
		<td><%= m.getName() %></td>
		<td><%= m.getEmail() %></td>
	</tr>
	<%}%>
		
</table>

</body>
</html>
<style>
	table, tr, td {
		border : 1px solid;
	}
</style>


