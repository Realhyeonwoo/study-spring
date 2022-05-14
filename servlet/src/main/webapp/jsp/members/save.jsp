<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="hello.servlet.domain.member.MemberRepository"%>
<%@ page import="hello.servlet.domain.member.Member"%>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("save.jsp");
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));
    
    Member member = new Member(username, age);
    System.out.println("member = " + member);
    memberRepository.save(member);
    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	SUCCESS!
	<ul>
		<li>id=<%=member.getId() %></li>
		<li>username=<%=member.getUsername() %></li>
		<li>age=<%=member.getAge() %></li>
	</ul>	
	<a href="/index.html">GO TO MAIN</a>
</body>
</html>