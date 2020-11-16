<%@ page import="java.util.Date" %>
<%@ page import="java.util.Random" %>
<%--

  Created by IntelliJ IDEA.
  User: 18224292860
  Date: 2020/10/29
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>123456789</h1>
<%! String k = "world" ;
%>
<%
    out.print("hello,"+ k);
%>
<p>当前时间:<%=new Date()%></p>
<% request.getPathInfo();
   request.getRemoteAddr();
   request.getRemoteAddr();
%>

        <%! int i=1;  %>
        <%
            if(i%2==0)
            {
        %>
        <p>偶数</p>
        <%
            }
            else
            {
        %>
        <p>奇数</p>
       <%
           }
       %>

<%! int number; %>
<%! int a[50];>
<% for(number=0;number<50)
  {
       a[number]=rand.nextInt(50);
  }


</body>
</html>
