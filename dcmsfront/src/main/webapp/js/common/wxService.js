var wxService = {
    initFlag: false,
    config: {
        debug: true,
        appId: 'wxf297ce8d4d3047d7', // 必填，公众号的唯一标识
        timestamp: '', // 必填，生成签名的时间戳
        nonceStr: '', // 必填，生成签名的随机串
        signature: '',// 必填，签名，见附录1
        jsApiList: ['openLocation', 'getLocation', 'checkJsApi'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
    },
    getConfig: function () {
        // TODO: 跟换接口
        var def = $.Deferred()
        $.ajax({
            url: 'http://172.31.60.66:8888/getSignature',
            dataType: 'json'
        }).then(function (data) {
            def.resolve(data)
        })
        return def.promise()
    },
    wxInit: function () {
        var def = $.Deferred()
        var _this = this
        if (this.initFlag) {
            def.resolve()
        } else {
            this.getConfig().then(function (data) {
                _this.config.timestamp = data.timestamp
                _this.config.signature = data.signature
                _this.config.nonceStr = data.nonceStr
                wx.config(_this.config);
                _this.initFlag = true
                def.resolve()
            })
        }
        return def.promise()
    },
    getLocation: function () {

        var def = $.Deferred()
        this.wxInit().then(function () {
            wx.getLocation({
                success: function (res) {
                    def.resolve(res)
                }
            })
        })
        return def.promise()
    },
    openLocation: function (options) {
        this.wxInit().then(function () {
            wx.openLocation({
                latitude: options.latitude,
                longitude: options.longitude,
                name: options.name || '',
                address: options.address || '',
                scale: options.scale || 1,
                infoUrl: options.infoUrl || ''
            })
        })
    }
}
