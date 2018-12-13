<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: niko
  Date: 2018/8/29
  Time: 下午9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>




    <style>

        table{
            font-family: Arial;
            color: black;
            align: center;
        }


        h4{
            font-family: Arial;
            color: fuchsia;
            align: center;
        }



    </style>

</head>
<body align=center >

<h2>个人信息</h2>


<table  border="1px" align=center>

    <h5>${count}人</h5>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>sex</td>
        <td>phone</td>
    </tr>
    <c:forEach var="user" items="${users}" varStatus="status">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.sex=='M' ? '男':'女'}</td>
            <td>${user.phone}</td>
        </tr>
    </c:forEach>



</table>



</body>
</html>
