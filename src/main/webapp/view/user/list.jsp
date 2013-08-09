<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../header.jsp" %>

<strong>list user</strong> <p />

<c:forEach items="${users }" var="user">
	${user.loginId }
	${user.password }
	${user.createDateStr }
	<br />
</c:forEach>