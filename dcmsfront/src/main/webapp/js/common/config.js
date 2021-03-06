(function () {
    var build = 1 // 0测试  1生产
    var prdConfig = {
        getCategorys: 'http://172.31.65.92:8080/dcmsfront/cms/getCategorys',
        getArticleList: 'http://172.31.65.92:8080/dcmsfront/cms/getArticleList',
        getArticleData: 'http://172.31.65.92:8080/dcmsfront/cms/getArticleData',
        getMedicalResource: 'http://172.31.65.92:8080/dcmsfront/medicalResource/getAll',
        getCouponList: 'http://172.31.65.92:8080/dcmsfront/MedicalCoupon/getCounponList',
        getMyCouponList: 'http://172.31.65.92:8080/dcmsfront/MedicalCouponCustomer/findMyCoupon',
        receiveCoupon: 'http://172.31.65.92:8080/dcmsfront/MedicalCouponCustomer/getCoupon',
        getOffice: 'http://172.31.65.92:8080/dcmsfront/office/getAllList',
        getLinkList: 'http://172.31.65.92:8080/dcmsfront/cms/getLinkList'
    }
    var devConfig = {
        getCategorys: '/dcmsfront/cms/getCategorys',
        getArticleList: '/dcmsfront/cms/getArticleList',
        getArticleData: '/dcmsfront/cms/getArticleData',
        getMedicalResource: '/dcmsfront/medicalResource/getAll',
        getCouponList: '/dcmsfront/MedicalCoupon/getCounponList',
        getMyCouponList: '/dcmsfront/MedicalCouponCustomer/findMyCoupon',
        receiveCoupon: '/dcmsfront/MedicalCouponCustomer/getCoupon',
        getOffice: '/dcmsfront/office/getKissDental',
        getLinkList: '/dcmsfront/cms/getLinkList',
        findResultList: '/dcmsfront/diagnosis/findResultList',
        findPayList: '/dcmsfront/diagnosis/findPayList',
        register: '/dcmsfront/reg/register',
        updateUserInfo: '/dcmsfront/customer/update',
        getUserInfo: '/dcmsfront/customer/getInfo',
        sendCode: '/dcmsfront/reg/sendCode',
    }
    var arr = [prdConfig, devConfig]
    window.httpConfig = arr[build]
}())