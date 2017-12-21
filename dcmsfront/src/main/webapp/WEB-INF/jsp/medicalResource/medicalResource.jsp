<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/21/021
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>诊疗资源</title>
    <style>
        .medical-resource .weui-navbar {
            position: static;
        }

        .medical-resource .weui-panel__bd {
            background: #ffffff;
        }
    </style>
</head>
<body>
<div class="dc-page medical-resource">
    <div class="weui-navbar">
        <div class="weui-navbar__item"
             :class="{'weui-bar__item_on':currentIndex==1}"
             @click="select(1)"
        >
            诊疗服务
        </div>
        <div class="weui-navbar__item "
             :class="{'weui-bar__item_on':currentIndex==2}"
             @click="select(2)">
            诊疗物资
        </div>
    </div>
    <div class="main">
        <div class="service" v-show="currentIndex==1">
            <div class="weui-panel__bd">
                <div class="weui-media-box weui-media-box_text">
                    <h4 class="weui-media-box__title">服务一</h4>
                    <p class="weui-media-box__desc"></p>
                </div>
                <div class="weui-media-box weui-media-box_text">
                    <h4 class="weui-media-box__title">服务二</h4>
                    <p class="weui-media-box__desc"></p>
                </div>
            </div>
        </div>
        <div class="material" v-show="currentIndex==2">
            <div class="weui-panel__bd">
                <div class="weui-media-box weui-media-box_text">
                    <h4 class="weui-media-box__title">物资一</h4>
                    <p class="weui-media-box__desc"></p>
                </div>
                <div class="weui-media-box weui-media-box_text">
                    <h4 class="weui-media-box__title">物资二</h4>
                    <p class="weui-media-box__desc"></p>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    (function () {
        var page = new Vue({
            el: '.medical-resource',
            data: function () {
                return {
                    searchStr: '',
                    currentIndex: 1
                }
            },
            created: function () {
            },
            mounted: function () {
            },
            methods: {
                select: function (index) {
                    this.currentIndex = index
                }
            }
        })
    }());
</script>
</body>
</html>
