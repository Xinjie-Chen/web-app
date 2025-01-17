<%--
  Created by IntelliJ IDEA.
  User: chenxinjie
  Date: 2024/7/17
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <form method="post" class="form-x" action="/DoctorScheduleSet">
        <div class="form-group">
            <div class="label">
                <label>Doctor Id</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="doctor_id" />
                <div class="tips"></div>
            </div>
            <div class="label">
                <label>Date</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="date" />
                <div class="tips"></div>
            </div>
            <div class="label">
                <label>shift time</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="shift_time" />
                <div class="tips"></div>
            </div>
            <div class="label">
                <label>remarks</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="remarks" />
                <div class="tips"></div>
            </div>
            <div class="field">
                <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
