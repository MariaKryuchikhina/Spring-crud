<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <body>
        <h3>User info</h3>
        <div>
            <form:form action="saveUser" modelAttribute="user">
                <form:hidden path="id"/>
                    <div>Fullname<form:input path="fullName"/></div>
                    <div style="color: red;"><form:errors path="fullName"/></div>
                <br>
                    <div>Email <form:input path="email"/></div>
                    <div style="color: red;"><form:errors path="email"/></div>
                <br>
                    <div>Phone <form:input path="phone"/></div>
                    <div style="color: red;"><form:errors path="phone"/></div>
                <br>
                    <div>Address <form:input path="address"/></div>
                    <div style="color: red;"><form:errors path="address"/></div>
                <br>
                    <div>Date of birth <form:input path="dateOfBirth"/></div>
                    <div style="color: red;"><form:errors path="dateOfBirth"/></div>
                <br>
                <br>
                <div><input type="submit" value="OK"></div>
            </form:form>
        </div>
    </body>
</html>
