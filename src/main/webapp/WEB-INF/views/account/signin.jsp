<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/commons/taglib.jsp" %>
<!doctype html>
<html lang="zh-cn">
<head>
    <%@ include file="/commons/meta.jsp" %>
    <title>Sublime - Web Application Admin Dashboard</title>
    <%@ include file="/commons/csslib.jsp" %>
    <%@ include file="/commons/headerjs.jsp" %>
</head>
<body class="bg-primary">
<div class="cover" style="background-image: url(${ctx}static/images/cover.jpg)"></div>
<div class="overlay bg-primary"></div>
<div class="center-wrapper">
    <div class="center-content">
        <div class="row no-m">
            <div class="col-xs-10 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
                <section class="panel bg-white no-b">
                    <header class="panel-heading no-b text-center" style="font-size:30px;">
                        会员管理系统
                    </header>
                    <div class="p15">
                        <form action="${ctx}account/signin" role="form" id="loginForm" data-parsley-validate method="POST">
                            <div class="form-group">
                                <input type="text" class="form-control input-lg mb25" placeholder="Username"
                                       id="username" name="username" required autofocus>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control input-lg mb25" placeholder="Password"
                                       id="password" name="password" required>
                            </div>

                            <button class="btn btn-primary btn-lg btn-block" type="submit">登 录</button>
                        </form>
                    </div>
                </section>
                <p class="text-center text-default">
                    Copyright &copy;
                    <span id="year" class="mr5"></span>
                </p>
            </div>
        </div>
    </div>
</div>
<%@ include file="/commons/jslib.jsp" %>
<script type="text/javascript">
    $(function(){
        $("#year").html(new Date().getFullYear());
    });
</script>
</body>
</html>