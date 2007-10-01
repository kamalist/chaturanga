<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
<head>
<title><fmt:message key="title.general"/></title>
</head>
<body>
<h1><fmt:message key="heading.hello.welcome"/></h1>
<p><fmt:message key="msg.hello.time"/> <c:out value="${model.now}"/></p>
<p><fmt:message key="msg.hello.intro"/></p>
<p><fmt:message key="msg.hello.disclaimer"/></p>
<hr/>
<p><fmt:message key="msg.hello.test.disclaimer"/></p>
<hr/>
<h3><fmt:message key="heading.players"/></h3>
<c:forEach items="${model.players}" var="player">
  <c:out value="${player.username}"/> (<i><c:out value="${player.fullName}"/></i>)<br><br>
</c:forEach>
</body>
</html>
