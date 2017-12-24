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
            margin: 10px 10px 0 10px;
        }

        .coupon-content {
        }

        .coupon-content .left {
            padding: 0 20px;
            border-right: 2px dashed #e5e5e5;
            color: #06ceae;
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
            margin: 0 12px;
            padding: 6px 0;
            color: #333333;
        }

        .coupon-content .right .name {
            font-weight: bold;
            font-size: 16px;
        }

        .coupon-content .right .premise {
            color: #999999;
            font-size: 14px;
        }

        .coupon-date {
            background: #fafafa;
            color: #999999;
            font-size: 14px;
            padding: 4px 0 4px 20px;
        }

        .coupon-wrap .receive-btn {
            background: #06ceae;
            color: #ffffff;
            padding: 0 6px;
        }

        .coupon-list .weui-navbar {
            position: static;
        }

        .my-coupon .coupon-disable .coupon-content .left, .my-coupon .coupon-disable .coupon-content .right, .coupon-disable .premise {
            color: #cccccc !important;
        }

        .coupon-disable .receive-btn {
            background: #cccccc;
        }
    </style>
</head>
<body>
<div class="dc-page coupon-list">
    <div class="weui-navbar">
        <div class="weui-navbar__item"
             @click.stop="tabClick(1)"
             :class="{'weui-bar__item_on':currentIndex==1}"
        >
            优惠券
        </div>
        <div class="weui-navbar__item" @click.stop="tabClick(2)"
             :class="{'weui-bar__item_on':currentIndex==2}"
        >
            我的券
        </div>
    </div>
    <div class="main" ref="_main">
        <div class="coupon-wrap receive-coupon" v-show="currentIndex==1">
            <div class="coupon-item" v-for="item in couponList">
                <div class="flex">
                    <div class="flex-1">
                        <div class="coupon-content flex">
                            <div class="left flex flex-align-center flex-pack-center flex-v">
                                <div class="worth flex">
                                    <span class="flex">¥</span>
                                    <p>{{item.worth}}</p>
                                </div>
                                <div class="type">优惠券</div>
                            </div>
                            <div class="right flex-1 flex  flex-pack-center flex-v">
                                <p class="name">{{item.name}}</p>
                                <p>剩余{{item.remain}}</p>
                                <p class="premise">{{item.premise}}</p>
                            </div>
                        </div>
                    </div>
                    <div class="receive-btn flex flex-align-center">
                        <div>立即领取</div>
                    </div>
                </div>
                <div class="coupon-date">
                    使用期限：2017-11-2 至 2017-12-31
                </div>
            </div>
        </div>

        <div class="coupon-wrap my-coupon" v-show="currentIndex==2"
        >
            <div class="coupon-item" v-for="item in couponList" :class="{'coupon-disable':item.status==2}">
                <div class="flex">
                    <div class="flex-1">
                        <div class="coupon-content flex">
                            <div class="left flex flex-align-center flex-pack-center flex-v">
                                <div class="worth flex">
                                    <span class="flex">¥</span>
                                    <p>{{item.worth}}</p>
                                </div>
                                <div class="type">优惠券</div>
                            </div>
                            <div class="right flex-1 flex  flex-pack-center flex-v">
                                <p class="name">{{item.name}}</p>
                                <p>剩余{{item.remain}}</p>
                                <p class="premise">{{item.premise}}</p>
                            </div>
                        </div>
                    </div>
                    <div class="receive-btn flex flex-align-center">
                        <div v-if="item.status==1">未使用</div>
                        <div v-if="item.status==2">已使用</div>
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
                    currentIndex: 1, // 1优惠券，2我的券
                    positionCash: 0, // 缓存当前选项卡位置
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
                        "fullReduce": 0.0,
                        status: 1
                    }, {
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
                        "fullReduce": 0.0,
                        status: 2
                    }
                    ]
                }
            },
            created: function () {
            },
            methods: {
                tabClick: function (index) {
                    this.currentIndex = index
                    this.fixPosition()
                },
                fixPosition: function () { // 修正tab切换后滚动位置
                    var positionTmp = this.$refs._main.scrollTop
                    this.$refs._main.scrollTop = this.positionCash
                    this.positionCash = positionTmp
                }
            }
        })
    })()
</script>
</body>
</html>
