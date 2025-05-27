<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Fruit Store</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
  <h1 class="title">Fruit Store</h1>
 
  <div class="table-container">
    <table>
      <thead>
        <tr>
          <th>Name</th>
          <th>Price</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="menuItem" items="${fruits}">
        <tr>
          <td><c:out value="${menuItem.name}"></c:out></td>
          <td><c:out value="${menuItem.price}"></c:out></td>
        </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>