<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.main{margin: 0 auto; width: 800px;}
	.red{background: red}
	.green{background: green}
</style>

</head>
<body>
	<div class="main">
		<table>
			<tbody >
				<tr class="red"><th>人员列表</th></tr>
				<tr class="green">
					<td>编号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>年龄</td>
					<td>等级</td>
					<td>部门</td>
					<td>操作</td>
				</tr>
				<c:forEach var="person" items="${personList }" varStatus="status">
					<tr 
					<c:if test="${status.count%2 == 0 }">style="background: green;"</c:if>
					<c:if test="${status.count%2 != 0 }">style="background: red;"</c:if> > 
						<td>${person.id }</td>
						<td>${person.name }</td>
						<td>${person.gender }</td>
						<td>${person.age }</td>
						<td>${person.rank }</td>
						<td>${person.department }</td>
						<td>操作</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>

</body>
</html>