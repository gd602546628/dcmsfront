<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/2/002
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="dc-page index-form">
    <form class="main">
        <div class="weui-cells weui-cells_form">
            <div class="weui-cell">
                <div class="weui-cell__hd"><label class="weui-label">姓名</label></div>
                <div class="weui-cell__bd">
                    <input class="weui-input" placeholder="请输入姓名" required v-model="formData.name">
                </div>
                <div class="weui-cell__ft">
                    <i class="weui-icon-warn"></i>
                </div>
            </div>
            <div class="weui-cell">
                <div class="weui-cell__hd"><label class="weui-label">手机号</label></div>
                <div class="weui-cell__bd">
                    <input class="weui-input"
                           type="number"
                           pattern="^1[3|4|5|8][0-9]\d{4,8}$"
                           placeholder="请输入手机号"
                           required
                           tips="请输入正确的手机号"
                           v-model="formData.phone"
                    >
                </div>
                <div class="weui-cell__ft">
                    <div class="weui-vcode-btn"
                         @click="getCode"
                         v-if="showInterval"
                         style="color: #333333;"
                    >{{codeInterval}}
                    </div>
                    <div class="weui-vcode-btn" @click="getCode" v-if="!showInterval">获取验证码</div>
                </div>
                <div class="weui-cell__ft">
                    <i class="weui-icon-warn"></i>
                </div>
            </div>
            <div class="weui-cell">
                <div class="weui-cell__hd"><label class="weui-label">密码</label></div>
                <div class="weui-cell__bd">
                    <input type="password" class="weui-input" placeholder="请输入密码" required v-model="formData.password">
                </div>
                <div class="weui-cell__ft">
                    <i class="weui-icon-warn"></i>
                </div>
            </div>
            <div class="weui-cell">
                <div class="weui-cell__hd"><label class="weui-label">验证码</label></div>
                <div class="weui-cell__bd">
                    <input class="weui-input"
                           type="number"
                           placeholder="请输入验证码"
                           required
                           v-model="formData.regCode"
                    >
                </div>
                <div class="weui-cell__ft">
                    <i class="weui-icon-warn"></i>
                </div>
            </div>
        </div>
        <div class="weui-cells__title">请选择性别</div>
        <div class="weui-cells weui-cells_radio">
            <label class="weui-cell weui-check__label" for="x11">
                <div class="weui-cell__bd">
                    <p>男</p>
                </div>
                <div class="weui-cell__ft">
                    <input type="radio" class="weui-check" name="sex" id="x11" required
                           value="1"
                           v-model="formData.sex"
                           checked="formData.sex==1"
                    >
                    <span class="weui-icon-checked"></span>
                </div>
            </label>
            <label class="weui-cell weui-check__label" for="x12">
                <div class="weui-cell__bd">
                    <p>女</p>
                </div>
                <div class="weui-cell__ft">
                    <input type="radio"
                           name="sex"
                           class="weui-check"
                           id="x12"
                           checked="formData.sex==2"
                           value="2"
                           v-model="formData.sex"
                    >
                    <span class="weui-icon-checked"></span>
                </div>
            </label>
        </div>
        <div class="weui-btn weui-btn_primary" @click="confirm" style="margin-top: 20px">确定</div>
    </form>
</div>

<script>
    (function () {
        new Vue({
            el: '.index-form',
            data: function () {
                return {
                    formData: { // 表单数据
                        name: '',
                        phone: '',
                        regCode: '',
                        sex: '1', // 1男 2女
                        password: '',
                        referrerCode:"${referrerCode}"
                    },
                    codeInterval: 60,
                    showInterval: false
                }
            },
            mounted: function () {
                weui.form.checkIfBlur('.main')
            },
            methods: {
                confirm: function () { // 提交
                    var _this = this
                    weui.form.validate('.main', function (err) {
                        if (err) {
                            console.log(err)
                        } else { // 表单验证成功
                            httpService.register(_this.formData).then(function (data) {
                                if (data.code === '000000') {
                                    window.location.href = '/dcmsfront/weixin/login.do'
                                } else {
                                    weui.alert(data.mesg);
                                }
                            })
                        }
                    })
                },
                getCode: function () { // 获取验证码
                    if (this.showInterval) return
                    if (!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(this.formData.phone))) {
                        weui.toast('请输入正确的手机号', 1000);
                        return
                    }
                    this.showInterval = true
                    var _this = this
                    httpService.sendCode({
                        phoneNumbers: this.formData.phone
                    }).then(function(data){
                        var timer = setInterval(function () {
                            if (_this.codeInterval > 0) {
                                _this.codeInterval--
                            } else {
                                clearInterval(timer)
                                _this.showInterval = false
                            }
                        }, 1000)
                    })
                }
            }
        })
    })()
</script>
</body>
</html>
