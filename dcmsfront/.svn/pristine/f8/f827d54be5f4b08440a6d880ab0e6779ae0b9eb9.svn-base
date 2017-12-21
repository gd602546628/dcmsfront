var locationService = {
    getLocation: function () {
        var def = $.Deferred()
        if (window.navigator && window.navigator.geolocation) {
            var geolocation = new window.BMap.Geolocation()
            geolocation.getCurrentPosition(function (r) {
                if (this.getStatus() !== window.BMAP_STATUS_SUCCESS) {
                    def.reject('定位失败')
                } else {
                    var result = {}
                    result.city = r.address.city
                    result.country = null
                    result.county = r.address.district
                    result.province = r.address.province
                    result.street = r.address.street
                    result.latitude = r.latitude
                    result.longitude = r.longitude
                    def.resolve(result)
                }
            })
        } else {
            reject('定位失败')
        }
        return def.promise()
    },
    locationTo: function (option) {
        this.getLocation().then(function (data) {
            var url = 'http://api.map.baidu.com/direction?origin=' + data.latitude + ',' + data.longitude + '&destination=' + option.dLat + ',' + option.dLng + '&mode=driving&region=' + option.dName + '&output=html'
            console.log(url)
            window.location.href = url
        })
    }
}
