<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Expense | Save Travels</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
	    <h1 class="header">Edit Expense ${expense.getId()}</h1>
	    <form:form action="/updateexpense/${expense.getId()}" method="post" modelAttribute="expense">
            <form:hidden path="id"/>
		    <div class="form-group">
		        <form:label path="name">Expense Name</form:label>
		        <form:input class="form-control mb-3" path="name"/>
		        <form:errors path="name" cssClass="alert alert-danger mb-4" />
		    </div>
		    <div class="form-group">
		        <form:label path="vendor">Vendor</form:label>
		        <form:input class="form-control mb-3" path="vendor" />
		        <form:errors path="vendor" cssClass="alert alert-danger mb-4" />
		    </div>
		    <div class="form-group">
		        <form:label path="amount">Amount</form:label>
		        <form:input class="form-control mb-3" path="amount" type="number"/>
		        <form:errors path="amount" cssClass="alert alert-danger mb-4" />
		    </div>
		    <div class="form-group">
		        <form:label path="description">Description</form:label>
		        <form:input class="form-control mb-3" path="description"/>
		        <form:errors path="description" cssClass="alert alert-danger mb-4" />
		    </div>
		    <input type="submit" class="btn btn-primary" value="Submit" />
		</form:form>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>