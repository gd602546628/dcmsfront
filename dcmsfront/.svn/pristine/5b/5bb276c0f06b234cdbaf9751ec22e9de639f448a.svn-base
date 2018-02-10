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
    <link rel="stylesheet" href="https://unpkg.com/mint-ui/lib/style.css">
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

        .wx-index .text-wrap {
            display: block;
        }

        .wx-index .swipe {
            height: 150px;
            background: #ffffff;
        }

        .swipe-item {
            position: relative;
            width: 100%;
            height: 100%;
            display: block;
        }

        .swipe-item .title {
            position: absolute;
            bottom: 0;
            text-align: left;
            width: 100%;
            height: 30px;
            background: rgba(0, 0, 0, 0.5);
            color: #ffffff;
            padding-left: 20px;
            box-sizing: border-box;
            line-height: 30px;
        }

        .mint-swipe-items-wrap {
            z-index: 10;
        }

        .mint-swipe-indicators {
            right: 0;
            left: auto;
            z-index: 100;
        }
    </style>
    <script src="https://unpkg.com/mint-ui/lib/index.js"></script>
</head>
<body>
<div class="dc-page wx-index">
    <div class="main">
        <%-- <div class="banner">
         </div>--%>
        <mt-swipe :auto="4000" class="swipe">
            <mt-swipe-item v-for="item in swipeData">
                <a class="swipe-item" :href="articleUrlEncode(item)">
                    <img :src="item.image" style="height: 100%;width: 100%">
                    <div class="title">{{item.title}}</div>
                </a>
            </mt-swipe-item>
        </mt-swipe>
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
                    <a class="weui-media-box weui-media-box_text text-wrap"
                       v-for="item in articleList"
                       :href="articleUrlEncode(item)"
                    >
                        <h4 class="weui-media-box__title">{{item.title}}</h4>
                        <p class="weui-media-box__desc">{{item.description}}</p>
                    </a>
                </div>
                <%-- <div class="weui-panel__ft" style="border-bottom:1px solid #e5e5e5">
                     <a href="javascript:void(0);" class="weui-cell weui-cell_access weui-cell_link">
                         <div class="weui-cell__bd">查看更多</div>
                         <span class="weui-cell__ft"></span>
                     </a>
                 </div>--%>
            </div>

        </div>
    </div>
    <div class="footer flex">
        <a class="weui-tabbar__item " href="/dcmsfront/front/appointment">
            <img src="../images/icon/yuyue.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">预约</p>
        </a>
        <a class="weui-tabbar__item " href="/dcmsfront/chatClient.html">
            <img src="../images/icon/zixun.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">咨询</p>
        </a>
        <a class="weui-tabbar__item " href="/dcmsfront/front/couponList">
            <img src="../images/icon/wenjuan.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">优惠券</p>
        </a>
        <a class="weui-tabbar__item " href="/dcmsfront/front/medicalResource">
            <img src="../images/icon/bingli.png" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">服务</p>
        </a>
    </div>
</div>

<script>
    (function () {
        new Vue({
            el: '.wx-index',
            data: function () {
                return {
                    category: [],
                    articleList: [],
                    swipeData: []
                }
            },
            created: function () {
                var _this = this
                httpService.getCategorys().then(function (data) {
                    _this.category = data.data
                    _this.category.forEach(function (item) {
                        if (item.name == '轮播栏目') {
                            httpService.getArticleList({categoryId: item.id}).then(function (swipeData) {
                                _this.swipeData = swipeData.data.list
                            })
                        }
                    })
                })
                var params = {
                    categoryId: '03cb8b8d831640f1ac5f625ddd6185c1',
                    pageNum: 1,
                    pageSize: 6
                }
                httpService.getArticleList(params).then(function (data) {
                    _this.articleList = data.data.list
                })
            },
            methods: {
                urlEncode: function (item) {
                    if (item.module == 'article') {
                        return Util.urlEncode('articleList', {
                            id: item.id,
                            name: item.name
                        })
                    } else {
                        return Util.urlEncode('linkList', {
                            id: item.id,
                            name: item.name
                        })
                    }
                },
                articleUrlEncode: function (item) {
                    return Util.urlEncode('articleData', {
                        id: item.id,
                        name: item.title
                    })
                },
            }
        })
    }())
</script>
</body>
</html>
