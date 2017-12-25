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
    <script src="https://unpkg.com/mint-ui/lib/index.js"></script>
    <style>
        .coupon-item {
            background: #ffffff;
            margin: 10px 10px 0 10px;
        }

        .coupon-content {
            height: 84px;
            box-sizing: border-box;
        }

        .coupon-content .left {
            width: 90px;
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
            overflow: hidden;
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
            height: 30px;
            box-sizing: border-box;
        }

        .coupon-wrap .receive-btn {
            background: #06ceae;
            color: #ffffff;
            width: 74px;
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

        .receive-btn-disable {
            background: #cccccc !important;
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
        <div ref="content">
            <div class="coupon-wrap receive-coupon"
                 v-show="currentIndex==1"
            >
                <div class="coupon-item" v-for="item in couponList">
                    <div class="flex">
                        <div class="flex-1 overflow-hidden">
                            <div class="coupon-content flex">
                                <div class="left flex flex-align-center flex-pack-center flex-v">
                                    <div class="worth flex">
                                        <span class="flex">¥</span>
                                        <p>{{item.worth}}</p>
                                    </div>
                                    <div class="type">优惠券</div>
                                </div>
                                <div class="right flex-1 flex  flex-pack-center flex-v">
                                    <p class="name ellipsis">{{item.name}}</p>
                                    <p>剩余{{item.remain}}</p>
                                    <p class="premise ellipsis">{{item.premise}}</p>
                                </div>
                            </div>
                        </div>
                        <div class="receive-btn flex flex-align-center flex-pack-center"
                             @click.stop="receiveCoupon(item)"
                             :class="{'receive-btn-disable':item.status==1}"
                        >
                            <div v-if="item.status==0">立即领取</div>
                            <div v-if="item.status==1">已领取</div>
                        </div>
                    </div>
                    <div class="coupon-date">
                        使用期限：{{dateFormat(item.startTime)}} 至 {{dateFormat(item.endTime)}}
                    </div>
                </div>
            </div>

            <div class="coupon-wrap my-coupon"
                 v-show="currentIndex==2"
            >
                <div class="coupon-item" v-for="item in myCouponList" :class="{'coupon-disable':item.status==1}">
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
                                    <p class="name ellipsis">{{item.name}}</p>
                                    <p v-if="item.remain">剩余{{item.remain}}</p>
                                    <p class="premise ellipsis">{{item.premise}}</p>
                                </div>
                            </div>
                        </div>
                        <div class="receive-btn flex flex-align-center flex-pack-center">
                            <div v-if="item.status==0">未使用</div>
                            <div v-if="item.status==1">已使用</div>
                        </div>
                    </div>
                    <%--  <div class="coupon-date">
                      </div>--%>
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
                    couponList: [],
                    myCouponList: [],
                    couponListFinish: false,
                    myCouponFinish: false,
                    pageNum: {
                        couponList: 1,
                        myCoupon: 1
                    },
                    pageSize: 20,
                    //customerId: '8f5dfdfe2e214dee9fdb9acff6ed',
                    customerId: '${sessionScope.customerId}',
                    loading: false
                }
            },
            created: function () {
                this.couponListInit()
                if (!this.customerId) {
                    window.location.href = '../../dcmsfront/weixin/login.do'
                }
            },
            mounted: function () {
                this.bindLoadMore()
            },
            methods: {
                tabClick: function (index) {
                    var _this = this
                    this.savePosition(index)
                    this.currentIndex = index
                    if (index == 2) {
                        this.myCouponInit()
                    }
                    this.$nextTick(function () {
                        if (index == 1) {
                            _this.$refs._main.scrollTop = _this.positionCash
                        } else {
                            _this.$refs._main.scrollTop = 0
                        }
                    })
                },
                savePosition: function (index) {
                    if (index == 2) {
                        this.positionCash = this.$refs._main.scrollTop
                    }
                },
                getCouponList: function () {
                    var def = $.Deferred()
                    var params = {
                        pageNo: this.pageNum.couponList,
                        pageSize: this.pageSize,
                        customerId: this.customerId
                    }
                    var _this = this
                    httpService.getCouponList(params).then(function (data) {
                        _this.couponListFinish = data.data.pageNo >= data.data.totalPage
                        console.log(_this.couponListFinish)
                        def.resolve(data.data.list)
                    })
                    return def.promise()
                },
                getMyCouponList: function () {
                    var def = $.Deferred()
                    var params = {
                        pageNo: this.pageNum.myCoupon,
                        pageSize: this.pageSize,
                        customerId: this.customerId
                    }
                    var _this = this
                    httpService.getMyCouponList(params).then(function (data) {
                        _this.myCouponFinish = data.data.pageNo >= data.data.totalPage
                        console.log(_this.myCouponFinish)
                        def.resolve(data.data.list)
                    })
                    return def.promise()
                },
                dateFormat: function (date) {
                    return date.split(' ')[0]
                },
                loadMore: function () {
                    var _this = this
                    var def = $.Deferred()
                    if (this.currentIndex == 1 && !this.couponListFinish) { // 当前tab为优惠券
                        this.pageNum.couponList++
                        this.getCouponList().then(function (couponList) {
                            _this.couponList = _this.couponList.concat(couponList)
                            def.resolve()
                        })
                    } else if (this.currentIndex == 2 && !this.myCouponFinish) {
                        this.pageNum.myCoupon++
                        this.getMyCouponList().then(function (myCouponList) {
                            _this.myCouponList = _this.myCouponList.concat(myCouponList)
                            def.resolve()
                        })
                    } else {
                        def.resolve()
                    }
                    return def.promise()
                },
                receiveCoupon: function (item) {
                    if (item.status == 1) return
                    var loading = weui.loading()
                    var params = {
                        couponCode: item.code,
                        customerId: this.customerId
                    }
                    httpService.receiveCoupon(params)
                        .then(function (data) {
                            loading.hide()
                            if (data.code == '000000') {
                                weui.alert('领取成功')
                                item.status = 1
                                item.remain--
                            } else {
                                weui.alert(data.mesg)
                            }
                        })
                },
                myCouponInit: function () {
                    var _this = this
                    this.pageNum.myCoupon = 1
                    this.myCouponFinish = false
                    this.getMyCouponList().then(function (myCouponList) {
                        _this.myCouponList = myCouponList
                    })
                },
                couponListInit: function () {
                    var _this = this
                    this.pageNum.couponList = 1
                    this.couponListFinish = false
                    this.getCouponList().then(function (couponList) {
                        _this.couponList = couponList
                    })
                },
                bindLoadMore: function () {
                    var _this = this
                    var content = this.$refs.content
                    this.$refs._main.addEventListener('scroll', function () {
                        var distance = Math.ceil(this.scrollTop) >= content.offsetHeight - this.offsetHeight
                        if (distance && !_this.loading) {
                            _this.loading = true
                            _this.loadMore().then(function () {
                                _this.loading = false
                            })
                        }
                    })
                }
            }
        })
    })()
</script>
</body>
</html>
