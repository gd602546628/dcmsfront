<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/19/019
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>个人信息</title>
    <style>
        .dc-page .weui-cell {
            margin-top: 10px;
            background: #fff;
        }

        .dc-page .weui-cells {
            background: none;
        }

        .dc-page .weui-cell__ft {
            text-overflow: ellipsis;
            overflow: hidden;
            white-space: nowrap;
            margin-left: 10px;
        }

        .header {
            height: 50px;
            background: black;
            color: #ffffff;
            position: relative;
        }

        .header .title {
            text-align: center;
        }

        .header .back {
            left: 20px;
            position: absolute;
        }
    </style>
</head>
<body>
<div class="dc-page">
    <div class="main">
        <div class="weui-cells grxx" v-if="currentIndex==0">
            <div class="weui-cell" v-for="item in infoArr">
                <div class="weui-cell__bd">
                    <p>{{item.title}}</p>
                </div>
                <div class="weui-cell__ft">{{item.value}}</div>
            </div>
        </div>
        <div class="bl" v-if="currentIndex==1">
            病例
        </div>
        <div class="xfjl" v-if="currentIndex==2">
            消费记录
        </div>
        <div class="xgxx" v-if="currentIndex==3">
            <div class="weui-cells__title">修改信息</div>
            <div class="weui-cells weui-cells_form">
                <div class="weui-cell">
                    <div class="weui-cell__hd"><label class="weui-label">手机号</label></div>
                    <div class="weui-cell__bd">
                        <input class="weui-input" type="number"placeholder="请输入手机号">
                    </div>
                </div>
            </div>
            <div class="weui-cell">
                <div class="weui-cell__hd"><label class="weui-label">密码</label></div>
                <div class="weui-cell__bd">
                    <input class="weui-input"placeholder="请输入密码">
                </div>
            </div>
        </div>
    </div>
    <div class="weui-tabbar">
        <a href="javascript:;" class="weui-tabbar__item" @click="tabClick(0)"
           :class="{'weui-bar__item_on':currentIndex===0}">
                    <span style="display: inline-block;position: relative;">
                        <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                    </span>
            <p class="weui-tabbar__label">个人信息</p>
        </a>
        <a href="javascript:;" class="weui-tabbar__item" @click="tabClick(1)"
           :class="{'weui-bar__item_on':currentIndex===1}"
        >
            <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">病例本</p>
        </a>
        <a href="javascript:;" class="weui-tabbar__item" @click="tabClick(2)"
           :class="{'weui-bar__item_on':currentIndex===2}"
        >
                    <span style="display: inline-block;position: relative;">
                        <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                    </span>
            <p class="weui-tabbar__label">消费记录</p>
        </a>
        <a href="javascript:;" class="weui-tabbar__item" @click="tabClick(3)"
           :class="{'weui-bar__item_on':currentIndex===3}"
        >
            <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
            <p class="weui-tabbar__label">修改信息</p>
        </a>
    </div>
</div>
<script>
    $(function () {
        var data = {
            "id": "c5d17af6ea9d41c1ac3963d630c1b3e5",
            "code": "17113017403793",
            "name": "王五",
            "sex": "2",
            "birthday": "2012-11-29",
            "phone": "13888888888",
            "password": "111111",
            "nationality": "中国",
            "tel": "",
            "photo": "",
            "address": "云南昆明",
            "work": "第一小学",
            "workOccupation": "学生",
            "workPhone": "",
            "fax": "",
            "email": "",
            "isAdult": "0",
            "source": "报纸",
            "age": 5,
            "delFlag": "0"
        }
        var infoPage = new Vue({
            el: ".dc-page",
            data: {
                infoArr: [],
                currentIndex: 0
            },
            created: function () {
                this.dataFormat()
            },
            methods: {
                dataFormat: function () {
                    data.isAdult = data.isAdult === "0" ? '否' : '是'
                    data.sex = data.sex === '1' ? '男' : '女'
                    var dataMap = {
                        "id": "id",
                        "code": "病历号",
                        "name": "姓名",
                        "sex": "性别",
                        "birthday": "出生日期",
                        "phone": "手机",
                        "password": "密码",
                        "nationality": "国籍",
                        "tel": "座机号码",
                        "photo": "头像",
                        "address": "家庭地址",
                        "work": "工作单位",
                        "workOccupation": "职业",
                        "workPhone": "单位电话",
                        "fax": "传真",
                        "email": "电子邮件",
                        "isAdult": "是否成年",
                        "source": "来源",
                        "age": "年龄",
                        "delFlag": "delFlag"
                    }
                    var result = []
                    for (var key in data) {
                        if (dataMap[key]) {
                            result.push({title: dataMap[key], value: data[key]})
                        }
                    }
                    this.infoArr = result
                },
                tabClick: function (index) {
                    this.currentIndex = index
                }
            }
        })
    })
</script>
</body>
</html>
