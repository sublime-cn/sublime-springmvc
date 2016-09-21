<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 导航栏 -->
<header class="header header-fixed navbar">

    <!-- 项目logo及名称 -->
    <div class="brand">
        <a href="javascript:;" class="ti-menu off-left visible-xs" data-toggle="offscreen" data-move="ltr"></a>
        <a href="index.html" class="navbar-brand">
            <img src=${ctx}static/images/logo.png alt="">
            <span class="heading-font"> 后台管理系统 </span>
        </a>
    </div>

    <!-- 搜索框 -->
    <ul class="nav navbar-nav">
        <li class="hidden-xs">
            <a href="javascript:;" class="toggle-sidebar">
                <i class="ti-menu"></i>
            </a>
        </li>

        <li class="header-search">
            <a href="javascript:;" class="toggle-search">
                <i class="ti-search"></i>
            </a>

            <div class="search-container">
                <form role="search">
                    <input class="form-control search" placeholder="输入关键字"/>
                </form>
            </div>
        </li>
    </ul>

    <!-- 右侧导航栏 -->
    <ul class="nav navbar-nav navbar-right">
        <li class="dropdown hidden-xs">
            <a href="javascript:;" data-toggle="dropdown">
                <i class="ti-more-alt"></i>
            </a>
            <ul class="dropdown-menu animated zoomIn">
                <li class="dropdown-header">快速链接</li>
                <li><a href="javascript:;">开启新的活动</a></li>
                <li><a href="javascript:;">审查广告活动</a></li>
                <li class="divider"></li>
                <li><a href="javascript:;">设置</a></li>
                <li><a href="javascript:;">愿望清单</a></li>
                <li><a href="javascript:;">购买历史</a></li>
                <li class="divider"></li>
                <li><a href="javascript:;">活动日志</a></li>
                <li><a href="javascript:;">设置</a></li>
                <li><a href="javascript:;">系统报告</a></li>
                <li class="divider"></li>
                <li><a href="javascript:;">帮助</a></li>
                <li><a href="javascript:;">报告一个问题</a></li>
            </ul>
        </li>
        <li class="notifications dropdown">
            <a href="javascript:;" data-toggle="dropdown">
                <i class="ti-bell"></i>

                <div class="badge badge-top bg-danger animated flash">
                    <span>3</span>
                </div>
            </a>
            <!-- 消息列表 -->
            <div class="dropdown-menu animated fadeInLeft">
                <div class="panel panel-default no-m">
                    <div class="panel-heading small"><b>通知</b></div>
                    <ul class="list-group">
                        <li class="list-group-item">
                            <a href="javascript:;">
                                    <span class="pull-left mt5 mr15">
                                        <img src="${ctx}static/images/face4.jpg" class="avatar avatar-sm img-circle" alt="">
                                    </span>

                                <div class="m-body">
                                    <div>
                                        <small><b>CRYSTAL BROWN</b></small>
                                        <span class="label label-danger pull-right">手动分配</span>
                                    </div>
                                    <span>打开一个支持查询</span>
                                    <span class="time small">2分钟前</span>
                                </div>
                            </a>
                        </li>
                        <li class="list-group-item">
                            <a href="javascript:;">
                                <div class="pull-left mt5 mr15">
                                    <div class="circle-icon bg-danger">
                                        <i class="ti-download"></i>
                                    </div>
                                </div>
                                <div class=m-body><span>上传进度</span>

                                    <div class="progress progress-xs mt5 mb5">
                                        <div class="progress-bar" role="progressbar" aria-valuenow=40
                                             aria-valuemin=0 aria-valuemax=100 style="width: 40%"></div>
                                    </div>
                                    <span class="time small">23分钟前提交</span>
                                </div>
                            </a>
                        </li>
                        <li class="list-group-item">
                            <a href="javascript:;">
                                    <span class="pull-left mt5 mr15">
                                        <img src="${ctx}static/images/face3.jpg" class="avatar avatar-sm img-circle" alt="">
                                    </span>

                                <div class="m-body">
                                    <em>更新状态:</em>
                                    <span>所有服务器在线</span>
                                    <span class="time small">5天前</span></div>
                            </a>
                        </li>
                    </ul>
                    <div class="panel-footer"><a href="javascript:;">查看所有通知</a></div>
                </div>
            </div>
        </li>

        <li class="off-right">
            <a href="javascript:;" data-toggle="dropdown">
                <img src="${ctx}static/images/avatar.jpg" class="header-avatar img-circle" alt="user" title="user">
                <span class="hidden-xs ml10">超级管理员</span>
                <i class="ti-angle-down ti-caret hidden-xs"></i>
            </a>
            <ul class="dropdown-menu animated fadeInDown">
                <li><a href="javascript:;">设置</a></li>
                <li><a href="javascript:;">升级</a></li>
                <li>
                    <a href="javascript:;">
                        <div class="badge bg-danger pull-right">3</div>
                        <span>通知</span>
                    </a>
                </li>
                <li><a href="javascript:;">帮助</a></li>
                <li><a href="signin.html">注销</a></li>
            </ul>
        </li>
    </ul>
</header>