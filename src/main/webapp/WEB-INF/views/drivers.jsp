<%@ page import="java.util.Collection" %>
<%@ page import="dom.dima.autopark.entities.Driver" %><%--
  Created by IntelliJ IDEA.
  User: dmitriy
  Date: 11.10.18
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Водители</title>
</head>
<body>
    <%
        final Object driversObject = request.getAttribute("drivers");
        final Collection<Driver> drivers = (Collection<Driver>) driversObject;
    %>
    <table>
        <thead>
        <tr>
            <th>№ п.п.</th>
            <th>таб. №</th>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Отчество</th>
            <th>Дата рождения</th>
            <th>Возраст</th>
            <th>Дата приема на работу</th>
        </tr>
        </thead>
        <tbody>
        <% int index = 1; %>
        <% for (Driver driver: drivers){ %>

        <tr>
            <td><%=index%></td>
            <td><%=driver.getTabelNumber()%></td>
            <td><%=driver.getLastName()%></td>
            <td><%=driver.getFirstName()%></td>
            <td><%=driver.getSecondName()%></td>
            <td><%=driver.getBirthDate()%></td>
            <td><%=driver.getAge()%></td>
            <td><%=driver.getDateOfEmployment()%></td>
        </tr>
        <% index++;%>
        <% } %>
        </tbody>

    </table>
</body>
</html>
