<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Omikuji</title>
</head>
<body>
 <div class="container">
 <form action="omikuji/massege/" method="POST">
   <h1>Send an Omikuji!!</h1>
        <label>Pick any number from 5 to 25</label>
        <input type="number" name="number" min="5" max="25" value="0">
        <label>Enter the name of any city.</label>
        <input type="text" name="city">
        <label>Enter the name of any real person</label>
        <input type="text" name="person">
        <label>Enter professional endeavor or hobby:</label>
        <input type="text" name="hoppy">
        <label>Enter any type of living thing.</label>
        <input type="text" name="living">
        <label>Say something nice to someone:</label>
        <input type="text" name="saysomething">
        <p>Send and show a friend</p>
        <button>Send</button>
        </form>
      
    </div>
</body>
</html>