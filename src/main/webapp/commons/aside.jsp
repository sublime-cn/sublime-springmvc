<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section class=layout>

    <!-- 左侧菜单树 -->
    <aside class="sidebar offscreen-left">
        <nav class="main-navigation"
             data-height="auto" data-size="6px"
             data-distance=0 data-rail-visible=true
             data-wheel-step=10>
            <p class="nav-title">菜单</p>
            <ul class="nav">
                <li>
                    <a href="index.html">
                        <i class="ti-home active"></i>
                        <span>控制台</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:;">
                        <i class="toggle-accordion"></i>
                        <i class="ti-settings"></i>
                        <span>系统管理</span>
                    </a>
                    <ul class="sub-menu">
                        <li><a href="${ctx}dept/index"><i class="ti-drupal"></i><span>部门管理</span></a></li>
                        <li><a href=""><i class="ti-user"></i><span>用户管理</span></a></li>
                        <li><a href=""><i class="ti-ruler"></i><span>角色管理</span></a></li>
                        <li><a href=""><i class="ti-menu"></i><span>菜单管理</span></a></li>
                        <li><a href=""><i class="ti-themify-logo"></i><span>日志管理</span></a></li>
                        <li><a href=""><i class="ti-settings"></i><span>系统参数</span></a></li>
                    </ul>
                </li>

            </ul>

            <p class="nav-title">标签</p>
            <ul class="nav">
                <li>
                    <a href="javascript:;">
                        <i class="ti-control-record text-warning"></i>
                        <span>项目</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:;">
                        <i class="ti-control-record text-success"></i>
                        <span>应用</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:;">
                        <i class="ti-control-record text-danger"></i>
                        <span>支持</span>
                    </a>
                </li>
            </ul>
        </nav>
    </aside>

    <!-- 内容区域 -->
    <section class="main-content">
        <div class="content-wrap">

            <div class="wrapper">
                <dl class="accordion">
                    <dt>
                        <a href="javascript:;" class="active">3.x</a>
                    </dt>
                    <dd style="display: block">
                        <b>版本特性</b><br>
                        &#149; 集成Shrio权限框架<br>
                        &#149; 集成Ehcache缓存<br>
                        &#149; 集成Redis<br>
                        &#149; 支持语言国际化(仅作演示,页面没有全部翻译)<br>
                        &#149; 支持动作链<br>
                        &#149; 支持注解式日志<br>
                        &#149; 集成Email服务<br>
                        &#149; 集成Quartz定时任务<br>
                        &#149; 集成Lucene搜索引擎<br>
                        &#149; 集成Beetl模板引擎<br>
                        &#149; 采用Bootsrtap+Pjax<br><br>
                        <b>源码地址</b><br>
                        <a href="https://github.com/Wizzercn/NutzWk" target="_blank">https://github.com/Wizzercn/NutzWk</a>
                        <br>
                        <b><span style="color: red">捐助 | 合作</span></b><br>
                        支付宝：wizzer@qq.com<br>
                        微&nbsp;信：wizzer
                        <br><br>
                        NutzWk 是采用 Apache Licence 2.0许可的开源项目，使用完全免费。不过，如果没有资金的支持，维护和开发新功能是不可能持续的。你可以通过以上支付帐号来赞助，或定制开发。
                        <br>
                        如果你是企业经营者并且将 NutzWk 用在商业产品中，那么赞助 NutzWk 有商业上的益处：可以让你的产品保持健康并得到积极的维护。
                        <br>
                        如果你是个人开发者并且享受 NutzWk 带来的高开发效率，可以用捐助来表示你的谢意——比如发个红包 ：）
                    </dd>
                    <dt>
                        <a href="javascript:;" class="active">使用说明</a>
                    </dt>
                    <dd style="display: block">
                        &#149; 创建空的数据库<br>
                        &#149; 修改数据库连接 /resources/config/custom/db.properties<br>
                        &#149; 项目使用Maven构建，IDEA/Eclipse直接打开，等待包下载完毕即可<br>
                        &#149; 启动时自动初始化数据表<br>
                        &#149; 用户名：superadmin  密码：1<br>
                    </dd>

                </dl>
            </div>

        </div>
    </section>
</section>