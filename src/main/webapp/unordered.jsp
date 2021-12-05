<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Numbers</title>
</head>

<style>
    body {
        background: bisque;
        color: midnightblue;
        text-align: center;
    }
</style>

<body>
<h2>Добро пожаловать!</h2>
<p>Текущий список:
    <% List<Integer> list = (List) request.getAttribute("numbers");%>
    <% out.println(Arrays.toString(list.toArray()));%>
</p>

<p>Нажав на кнопку, Вы отсортируете список.</p>
<form action="" method="post">
    <button type="submit" name="button">
        <b>Order List</b>
    </button>
</form>

</body>
</html>