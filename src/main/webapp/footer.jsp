<%--
  Created by IntelliJ IDEA.
  User: 18224292860
  Date: 2020/10/30
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%! int pageCount = 0;

    void addCount() {
        pageCount++;
    }
%>

<%
    addCount();
%>
<div style="text-align: center;">
    <p>Copyright © 2018 | 备案号：琼ICP备13001417号-3 |   访问次数：<%=pageCount%></p>
</div>