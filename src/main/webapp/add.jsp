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
    <form method="post" class="form-x" action="/insert">
        <div class="form-group">
            <div class="label">
                <label>上级分类：</label>
            </div>
            <div class="field">
                <select name="pid" class="input w50">
                    <option value="">请选择分类</option>
                    <option value="">产品分类</option>
                    <option value="">产品分类</option>
                    <option value="">产品分类</option>
                    <option value="">产品分类</option>
                </select>
                <div class="tips">不选择上级分类默认为一级分类</div>
            </div>
        </div>
        <div class="form-group">
            <div class="label">
                <label>分类标题：</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="title" />
                <div class="tips"></div>
            </div>
        </div>
        <div class="form-group">
            <div class="label">
                <label>批量添加：</label>
            </div>
            <div class="field">
                <textarea type="text" class="input w50" name="tits" style="height:150px;" placeholder="多个分类标题请转行"></textarea>
                <div class="tips">多个分类标题请转行</div>
            </div>
        </div>
        <div class="form-group">
            <div class="label">
                <label>关键字标题：</label>
            </div>
            <div class="field">
                <input type="text" class="input" name="s_title" />
            </div>
        </div>
        <div class="form-group">
            <div class="label">
                <label>分类关键字：</label>
            </div>
            <div class="field">
                <input type="text" class="input" name="s_keywords" />
            </div>
        </div>
        <div class="form-group">
            <div class="label">
                <label>关键字描述：</label>
            </div>
            <div class="field">
                <input type="text" class="input" name="s_desc"/>
            </div>
        </div>
        <div class="form-group">
            <div class="label">
                <label>排序：</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="sort" value="0"  data-validate="number:排序必须为数字" />
                <div class="tips"></div>
            </div>
        </div>
        <div class="form-group">
            <div class="label">
                <label></label>
            </div>
            <div class="label">
                <label>shift time</label>
            </div>
            <div class="field">
                <input type="text" class="input w50" name="shiftTime" />
                <div class="tips"></div>
            </div>
        </div>
    </form>
</div>
</body>
</html>
