<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/23/023
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>优惠券</title>
    <style>
        .coupon-item {
            background: #ffffff;
            margin: 10px;
            border-radius: 6px;
        }

        .coupon-content {
        }

        .coupon-content .left {
            padding: 0 20px;
            border-right: 2px dashed #e5e5e5;
            color: #25ce95;
        }

        .coupon-content .left .worth span {
            font-size: 12px;
            -webkit-align-items: flex-end;
            align-items: flex-end;
            position: relative;
            bottom: 6px;
        }

        .coupon-content .left .worth p {
            font-size: 26px;
            margin-left: 2px;
            font-weight: 500;
        }

        .coupon-content .left .type {
            position: relative;
            bottom: 6px;
        }

        .coupon-content .right {
            padding-left: 20px;
        }

        .coupon-content .right .name {
            font-weight: bold;
            font-size: 16px;
        }

        .coupon-content .right .premise {
            color: #959595;
            font-size: 14px;
        }

        .coupon-date {
            background: #FBFAFA;
            color: #959595;
            font-size:14px;
            padding: 4px 0 4px 20px;
        }
    </style>
</head>
<body>
<div class="dc-page coupon-list">
    <div class="main">
        <div class="coupon-wrap">
            <div class="coupon-item" v-for="item in couponList">
                <div class="coupon-content flex">
                    <div class="left flex flex-align-center flex-psack-center flex-v">
                        <div class="worth flex">
                            <span class="flex">¥</span>
                            <p>{{item.worth}}</p>
                        </div>
                        <div class="type">优惠券</div>
                    </div>
                    <div class="right flex-1 flex  flex-pack-center flex-v">
                        <p class="name">{{item.name}}</p>
                        <p class="premise">{{item.premise}}</p>
                    </div>
                </div>
                <div class="coupon-date">
                    使用期限：2017-11-2 至 2017-12-31
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    (function () {
        new Vue({
            el: '.coupon-list',
            data: function () {
                return {
                    couponList: [{
                        "id": "a02734553eb8451496d6f53f8d4f0a74",
                        "code": "09887",
                        "type": "1",
                        "name": "大吉大利，晚上吃鸡",
                        "image": "",
                        "worth": 200.0,
                        "total": 100,
                        "remain": 99,
                        "startTime": "2017-11-20 06:23:26",
                        "endTime": "2017-12-31 06:23:29",
                        "premise": "到店消费，无门槛使用",
                        "discount": 0.0,
                        "fullReduce": 0.0
                    }]
                }
            }
        })
    })()
</script>
</body>
</html>
