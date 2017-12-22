<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/22/022
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>Title</title>
    <style>
        .article-page .main {
            padding: 20px;
        }

        .article-page .main .title {
            text-align: center;
        }

        .article-page .sub-title {
            margin-top: 10px;
        }

        .article-page .sub-title .time {
            color: #999999;
        }

        .article-page .sub-title .category {
            color: #586C94;
            margin-left: 10px;
        }

        .article-page .content {
            margin-top: 10px;
        }
    </style>
</head>
<body>
<div class="dc-page article-page">
    <div class="main" v-if="articleData">
        <h3 class="title">
            {{articleData.title}}
        </h3>
        <div class="sub-title flex">
            <div class="time">{{articleData.updateDate}}</div>
            <div class="category">{{articleData.category.name}}</div>
        </div>
        <div class="content" v-html="articleData.articleData.content">
        </div>
    </div>
</div>
<script>
    (function () {
        new Vue({
            el: '.article-page',
            data: function () {
                return {
                    title: '',
                    id: Util.getQueryString('id'),
                    articleData: null
                }
            },
            created: function () {
                this.title = document.title = Util.getQueryString('name')
                var _this = this
                httpService.getArticleData({articleId: this.id}).then(function (data) {
                    _this.articleData = data.data
                    console.log(data)
                })
            }
        })
    }())
</script>
</body>
</html>
