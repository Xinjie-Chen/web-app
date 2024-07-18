<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chenxinjie
  Date: 2024/7/17
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>

</head>
<body>
<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>添加内容</strong></div>
<div class="body-content">
    <form method="post" class="form-x" action="/patientAppointSet">
        <div class="form-group">
            <div class="label">
                <label>Patient Id</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="patient_id" value="${patient_id}" readonly/>
                <div class="tips"></div>
            </div>
            <div class="form_group">
                <div class="label">status</div>
            </div>
            <div class="field">
                <select name="status" class="input w50">
                    <option value="booked">booked</option>
                    <option value="completed">completed</option>
                    <option value="cancelled">cancelled</option>
                </select>
            </div>
            <div class="field">
                <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
