<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: niko
  Date: 2018/8/29
  Time: 下午1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>个人信息注册</h2>
<form:form method="post" action="addUser">
    <table>

        <tr>
            <td><form:label path="name">名字：</form:label></td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="phone">电话：</form:label></td>
            <td><form:input type="tel" path="phone"></form:input></td>
        </tr>

        <tr>
            <form:radiobutton path="sex" value="M" label="男"/>
            <form:radiobutton path="sex" value="F" label="女"/>
        </tr>

        <tr>
            <td><form:label path="password">密码：</form:label></td>
            <td><form:password path="password"/></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
            </td>
        </tr>


    </table>


</form:form>


</body>
</html>
