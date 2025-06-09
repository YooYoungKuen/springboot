<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>공지사항 목록</title>
  <style>
    .cls1 {text-decoration:none;}
    .cls2 {text-align:center; font-size:30px;}
  </style>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

<h2 class="cls2">공지사항 목록</h2>

<table align="center" border="1" width="80%">
  <tr height="40" align="center" bgcolor="lightgreen">
    <th width="10%">번호</th>
    <th width="20%">구분</th>
    <th width="50%">제목</th>
    <th width="20%">등록일</th>
  </tr>

  <c:choose>
    <c:when test="${noticeVOList == null || empty noticeVOList}">
      <tr>
        <td colspan="4" align="center">
          <b><span style="font-size:12pt;">등록된 공지사항이 없습니다.</span></b>
        </td>
      </tr>
    </c:when>

    <c:otherwise>
      <c:forEach var="notice" items="${noticeVOList}" varStatus="status">
        <tr align="center">
          <td>${status.count}</td>
          <td>${notice.nCategory}</td>
          <td align="left">
            <a class="cls1" href="${contextPath}/notice/view.do?nIdx=${notice.nIdx}">
              ${notice.nTitle}
            </a>
          </td>
          <td><fmt:formatDate value="${notice.nRegdate}" pattern="yyyy-MM-dd"/></td>
        </tr>
      </c:forEach>
    </c:otherwise>
  </c:choose>

</table>

</body>
</html>
