<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Encrypt</title>
</head>
<body>
  <input type="hidden" id="modulus" value="${modulus}" />
  <input type="hidden" id="exponent" value="${exponent}" />
  <input type="hidden" id="password" value="${password}" />
  <input type="hidden" id="enpassword" value="" />

  <script type="application/javascript" src="<c:url value ='/js/jsbn.js'/>"></script>
  <script type="application/javascript" src="<c:url value ='/js/prng4.js'/>"></script>
  <script type="application/javascript" src="<c:url value ='/js/rng.js'/>"></script>
  <script type="application/javascript" src="<c:url value ='/js/rsa.js'/>"></script>
  <script type="application/javascript" src="<c:url value ='/js/base64.js'/>"></script>
  <script type="application/javascript" src="<c:url value ='/js/login.js'/>"></script>
</body>
</html>