<%--
  Created by IntelliJ IDEA.
  User: wf
  Date: 2020/3/28
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div style="margin:0px auto; width:500px">

    <form action="../categories/${c.id}" method="post">
        <input type="hidden" name="_method" value="PUT">
        name: <input name="name" value="${c.name}"> <br>
        <button type="submit">提交</button>
    </form>
</div>
