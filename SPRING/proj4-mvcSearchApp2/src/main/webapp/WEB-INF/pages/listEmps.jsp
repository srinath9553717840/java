<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <center><h1>Search  Result</h1></center>
    <c:if test="${not empty searchResult}">
    <table border="1" align="center">
    <tr>
    <th>Emp No</th>
    <th>Emp Name</th>
    <th>Emp Salary</th>
     <th>Emp Desg</th>    
    <th>Emp Dept no</th>
    <th>Manager No</th>
   </tr>
    
    <c:forEach items="${searchResult}" var="result">
    <tr>
    <td><c:out value="${result.no}"/></td>
    <td><c:out value="${result.name}"/></td>
    <td><c:out value="${result.salary}"/></td>
    <td><c:out value="${result.desg}"/></td>
    <td><c:out value="${result.deptno}"/></td>
    <td><c:out value="${result.mgrno}"/></td>
    </tr>
    </c:forEach>
    </table>
    </c:if>
    