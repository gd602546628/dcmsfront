var httpService = {
    get: function (url, data) {
        return $.ajax({
            url: url,
            dataType: 'json',
            type: 'GET',
            data: data
        })
    },
    post: function (url, data) {
        return $.ajax({
            url: url,
            type: 'POST',
            dataType:'json',
            data: data
        })
    },
    getCategorys: function (siteId, parentId) {
        var pSiteId = siteId || 1
        var pParentId = parentId || 1
        return this.get(httpConfig.getCategorys, {siteId: pSiteId, parentId: pParentId})
    },
    getArticleList: function (data) {
        return this.get(httpConfig.getArticleList, data)
    },
    getArticleData: function (data) {
        return this.get(httpConfig.getArticleData, data)
    },
    getMedicalResource: function () {
        return this.get(httpConfig.getMedicalResource)
    },
    getCouponList: function (data) {
        return this.get(httpConfig.getCouponList, data)
    },
    getMyCouponList: function (data) {
        return this.get(httpConfig.getMyCouponList, data)
    },
    receiveCoupon: function (data) {
        return this.get(httpConfig.receiveCoupon, data)
    },
    getOffice: function () {
        return this.get(httpConfig.getOffice)
    },
    getLinkList: function (data) {
        return this.get(httpConfig.getLinkList, data)
    },
    findResultList: function (data) {
        return this.get(httpConfig.findResultList, data)
    },
    findPayList: function (data) {
        return this.get(httpConfig.findPayList, data)
    },
    register: function (data) {
        return this.post(httpConfig.register, data)
    },
    updateUserInfo: function (data) {
        return this.get(httpConfig.updateUserInfo, data)
    },
    getUserInfo: function (data) {
        return this.get(httpConfig.getUserInfo, data)
    },
    sendCode: function (data) {
        return this.get(httpConfig.sendCode, data)
    }
}
