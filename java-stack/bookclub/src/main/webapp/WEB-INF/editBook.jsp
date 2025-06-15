<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Book</title>
</head>
<body>

<h2>Edit Book</h2>

<form:form modelAttribute="book" method="post" action="${pageContext.request.contextPath}/books/${book.id}/edit">
    <table>
        <tr>
            <td>Title:</td>
            <td><form:input path="title" /></td>
        </tr>
        <tr>
            <td>Author:</td>
            <td><form:input path="author" /></td>
        </tr>
        <tr>
            <td>ISBN:</td>
            <td><form:input path="isbn" /></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><form:input path="price" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form:form>

<a href="${pageContext.request.contextPath}/books">Back to list</a>

</body>
</html>
