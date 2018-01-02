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
    </style>
</head>
<body>
<div class="dc-page">
    <div class="main">
        <div class="weui-cells">
            <div class="weui-cell" v-for="item in infoArr">
                <div class="weui-cell__bd">
                    <p>{{item.title}}</p>
                </div>
                <div class="weui-cell__ft">{{item.value}}</div>
            </div>
        </div>
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

        // 调用init进行页面渲染，入参为用户信息json
        function init(data) {
            var infoPage = new Vue({
                el: ".dc-page",
                data: {
                    infoArr: []
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
                    }
                }
            })
        }
        init(data)
    })
</script>
</body>
</html>
