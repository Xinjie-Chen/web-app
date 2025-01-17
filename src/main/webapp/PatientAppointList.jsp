<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chenxinjie
  Date: 2024/7/15
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-cn">
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
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong></div>
  <div class="padding border-bottom">
<%--    <button type="button" class="button border-yellow" onclick="window.location.href='/PatientAppointAdd.jsp'"><span class="icon-plus-square-o"></span> 添加分类</button>--%>
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th>appointment_id</th>
      <th>patient_id</th>
      <th>doctor_id</th>
      <th>appointment_date</th>
      <th>appointment_time</th>
      <th>status</th>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="vs">
      <c:choose>
        <c:when test="${(vs.index+1)%2==0}">
          <tr style="background-color: #bfa">
            <td>${user.appointment_id}</td>
            <td>${user.patient_id}</td>
            <td>${user.doctor_id}</td>
            <td>${user.appointment_date}</td>
            <td>${user.appointment_time}</td>
            <td>${user.status}</td>
            <td><div class="button-group"> <a class="button border-main" href="/patientAppointSetHelper?id=${user.patient_id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" onclick="return del(1,2)"><span class="icon-trash-o"></span> 删除</a> </div></td>
          </tr>
        </c:when>
        <c:otherwise>
          <tr>
            <td>${user.appointment_id}</td>
            <td>${user.patient_id}</td>
            <td>${user.doctor_id}</td>
            <td>${user.appointment_date}</td>
            <td>${user.appointment_time}</td>
            <td>${user.status}</td>
              <td><div class="button-group"> <a class="button border-main" href="/patientAppointSetHelper?id=${user.patient_id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" onclick="return del(${user.patient_id})"><span class="icon-trash-o"></span> 删除</a> </div></td>
          </tr>
        </c:otherwise>
      </c:choose>
    </c:forEach>
  </table>
</div>
<script type="text/javascript">
  function del(id){
    if(confirm("您确定要删除吗?")){
        $.ajax({
            type: "POST",
            url: "/doctorScheduleDelete",
            data: {id:id},
            success: function(data){
                if(data == "ok"){
                    alert("删除成功");
                    window.location.reload();
                }else{
                    alert("删除失败");
                }
            }
        });
    }
  }
</script>
<%--<div class="panel admin-panel margin-top">--%>
<%--  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>添加内容</strong></div>--%>
<%--  <div class="body-content">--%>
<%--    <form method="post" class="form-x" action="">--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label>上级分类：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <select name="pid" class="input w50">--%>
<%--            <option value="">请选择分类</option>--%>
<%--            <option value="">产品分类</option>--%>
<%--            <option value="">产品分类</option>--%>
<%--            <option value="">产品分类</option>--%>
<%--            <option value="">产品分类</option>--%>
<%--          </select>--%>
<%--          <div class="tips">不选择上级分类默认为一级分类</div>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label>分类标题：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <input type="text" class="input w50" name="title" />--%>
<%--          <div class="tips"></div>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label>批量添加：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <textarea type="text" class="input w50" name="tits" style="height:150px;" placeholder="多个分类标题请转行"></textarea>--%>
<%--          <div class="tips">多个分类标题请转行</div>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label>关键字标题：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <input type="text" class="input" name="s_title" />--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label>分类关键字：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <input type="text" class="input" name="s_keywords" />--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label>关键字描述：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <input type="text" class="input" name="s_desc"/>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label>排序：</label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <input type="text" class="input w50" name="sort" value="0"  data-validate="number:排序必须为数字" />--%>
<%--          <div class="tips"></div>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="label">--%>
<%--          <label></label>--%>
<%--        </div>--%>
<%--        <div class="field">--%>
<%--          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--    </form>--%>
<%--  </div>--%>
<%--</div>--%>
</body>
</html>