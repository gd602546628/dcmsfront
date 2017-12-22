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
            <div v-for="item in allService" class="wrap">
                <div class="weui-cells__title">{{item.category}}</div>
                <div class="weui-cells">
                    <div class="weui-cell" v-for="list in item.list">
                        <div class="weui-cell__bd">
                            <p>{{list.name}}</p>
                        </div>
                        <%--      <div class="weui-cell__ft">说明文字</div>--%>
                    </div>
                </div>
            </div>
        </div>
        <div class="material" v-show="currentIndex==2">
            <div v-for="item in allMaterial" class="wrap">
                <div class="weui-cells__title">{{item.category}}</div>
                <div class="weui-cells">
                    <div class="weui-cell" v-for="list in item.list">
                        <div class="weui-cell__bd">
                            <p>{{list.name}}</p>
                        </div>
                        <%--      <div class="weui-cell__ft">说明文字</div>--%>
                    </div>
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
                    currentIndex: 1,
                    allMaterial: [],
                    allService: []
                }
            },
            created: function () {
                var _this = this
                httpService.getMedicalResource().then(function (data) {
                    _this.allMaterial = data.data.allMaterial
                    _this.allService = data.data.allService
                })
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
