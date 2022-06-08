<%--
  Created by IntelliJ IDEA.
  User: veli
  Date: 7.06.2022
  Time: 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customers</title>

    <!-- reference our style sheet -->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"
    />

</head>
<body>

<div id="wrapper">

    <div id="header">

        <h2>CRM - Customer Relationship Manager</h2>
    </div>

</div>

<div id="container">
    <div id="content">

        <!-- add out html table here -->

        <table>

            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>


            </tr>

            <!-- loop over and print our customers -->

            <c:forEach var="tempCustomer" items="${customers}">

                <tr>
                    <td>${tempCustomer.firstName}</td>
                    <td>${tempCustomer.lastName}</td>
                    <td>${tempCustomer.email}</td>

                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
