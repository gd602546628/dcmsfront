<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/20/020
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common.jsp" %>
<html>
<head>
    <title>Title</title>
    <script>
        // 百度导航
        /*  locationService.locationTo({
              dLat: '24.360483', // 目的地纬度
              dLng: '102.555847', // 目的地经度
              dName: '群众工作局' //  目的地名称
          })*/

        // 微信导航
        //  这里坐标要用火星坐标
        wxService.openLocation({
            latitude: 24.360483,  // 纬度，浮点数，范围为90 ~ -90
            longitude: 102.555847,// 经度，浮点数，范围为180 ~ -180。
            name: '', // 位置名
            address: '', // 地址详情说明
            scale: 1, // 地图缩放级别,整形值,范围从1~28。默认为最大
            infoUrl: '' // 在查看位置界面底部显示的超链接,可点击跳转
        })
    </script>
</head>
<body>
</body>
</html>
