<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/20/020
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>亲亲口腔诊所</title>
    <style>
        .wx-index .banner {
            background-image: url("${pageContext.request.contextPath}/images/banner.jpg");
            background-position: center;
            background-size: 100% 100%;
            background-repeat: no-repeat;
            height: 150px;
        }

        .wx-index .weui-grids {
            margin-top: 10px;
            background: #ffffff;
        }
    </style>
</head>
<body>
<div class="dc-page wx-index">
    <div class="main">
        <div class="banner">
        </div>
        <div class="content">
            <div class="weui-grids">
                <a class="weui-grid" v-for="item in category" :href="urlEncode(item)">
                    <div class="weui-grid__icon">
                        <img :src="item.img||'../images/icon_tabbar.png'">
                    </div>
                    <p class="weui-grid__label">{{item.name}}</p>
                </a>
            </div>

            <div class="weui-panel weui-panel_access flex-1">
                <div class="weui-panel__hd">文章列表</div>
                <div class="weui-panel__bd">
                    <div class="weui-media-box weui-media-box_text">
                        <h4 class="weui-media-box__title">标题一</h4>
                        <p class="weui-media-box__desc">文章文章文章文章文章文章文章文章文章文章文章文章</p>
                    </div>
                    <div class="weui-media-box weui-media-box_text">
                        <h4 class="weui-media-box__title">标题一</h4>
                        <p class="weui-media-box__desc">文章文章文章文章文章文章文章文章文章文章文章文章</p>
                    </div>
                    <div class="weui-media-box weui-media-box_text">
                        <h4 class="weui-media-box__title">标题一</h4>
                        <p class="weui-media-box__desc">文章文章文章文章文章文章文章文章文章文章文章文章</p>
                    </div>
                    <div class="weui-media-box weui-media-box_text">
                        <h4 class="weui-media-box__title">标题一</h4>
                        <p class="weui-media-box__desc">文章文章文章文章文章文章文章文章文章文章文章文章</p>
                    </div>
                    <div class="weui-media-box weui-media-box_text">
                        <h4 class="weui-media-box__title">标题一</h4>
                        <p class="weui-media-box__desc">文章文章文章文章文章文章文章文章文章文章文章文章</p>
                    </div>
                </div>
                <div class="weui-panel__ft" style="border-bottom:1px solid #e5e5e5">
                    <a href="javascript:void(0);" class="weui-cell weui-cell_access weui-cell_link">
                        <div class="weui-cell__bd">查看更多</div>
                        <span class="weui-cell__ft"></span>
                    </a>
                </div>
            </div>

        </div>
    </div>
    <div class="footer flex">
        <div class="weui-tabbar__item ">
            <img src="../images/icon/yuyue.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">预约</p>
        </div>
        <div class="weui-tabbar__item ">
            <img src="../images/icon/zixun.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">咨询</p>
        </div>
        <div class="weui-tabbar__item ">
            <img src="../images/icon/wenjuan.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">问卷</p>
        </div>
        <div class="weui-tabbar__item ">
            <img src="../images/icon/bingli.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">病历本</p>
        </div>
    </div>
</div>

<script>
    (function () {
        new Vue({
            el: '.wx-index',
            data: function () {
                return {
                    category: []
                }
            },
            created: function () {
                var _this = this
                httpService.getCategorys().then(function (data) {
                    _this.category = data.data
                })
            },
            methods: {
                urlEncode: function (item) {
                    if (item.module == 'article') {
                        return Util.urlEncode('articleList', {
                            id: item.id,
                            name: item.name
                        })
                    }
                }
            }
        })
    }())
</script>
</body>
</html>
