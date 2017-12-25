<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/23/023
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>在线预约</title>
    <style>
        .wx-appointment .banner {
            background-image: url("${pageContext.request.contextPath}/images/banner.jpg");
            background-position: center;
            background-size: 100% 100%;
            background-repeat: no-repeat;
            height: 150px;
        }

        .wx-appointment .weui-media-box {
            margin-top: 10px;
            background: #ffffff;
        }

        .wx-appointment .weui-media-box .weui-media-box__desc {
            display: block;
            letter-spacing: 2px
        }

        .wx-appointment .footer .btn1 {
            height: 40px;
            background: #1AAD19;
            color: #ffffff;
        }

        .wx-appointment .footer .btn2 {
            height: 40px;
            background: #0164a6;
            color: #ffffff;
        }
    </style>
</head>
<body>
<div class="dc-page wx-appointment">
    <div class="main">
        <div class="banner">
        </div>
        <div class="weui-cells">
            <div class="weui-cell" v-for="item in info">
                <div class="weui-cell__bd">
                    <p>{{item.title}}</p>
                </div>
                <div class="weui-cell__ft">{{item.value}}</div>
            </div>
        </div>
        <div class="weui-media-box weui-media-box_text">
            <h4 class="weui-media-box__title">诊所简介</h4>
            <p class="weui-media-box__desc">
                诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介诊所简介</p>
        </div>
    </div>
    <div class="footer flex">
        <a href="tel:13000000000" class="flex-1 flex flex-align-center flex-pack-center btn1">电话预约</a>
        <a href="javascript:;" class="flex-1 flex flex-align-center flex-pack-center btn2">诊所导航</a>
    </div>
</div>
<script>
    (function () {
        new Vue({
            el: '.wx-appointment',
            data: function () {
                return {
                    info: [
                        {
                            title: '诊所名称',
                            value: '亲亲口腔诊所'
                        },
                        {
                            title: '诊所地址',
                            value: '地球'
                        },
                        {
                            title: '联系人',
                            value: '韩梅梅'
                        },
                        {
                            title: '电话',
                            value: '13000000000'
                        },
                        {
                            title: '营业时间',
                            value: '08:00 -- 21:00'
                        }
                    ]
                }
            }
        })
    }())
</script>
</body>
</html>
