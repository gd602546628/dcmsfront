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
        var urlOption = {
            location: option.dLat + ',' + option.dLng,
            output: 'html',
            title: option.dName
        }
        var url = 'http://api.map.baidu.com/marker?'
        for (var key in urlOption) {
            url += key + '=' + urlOption[key] + '&'
        }
        var resultUrl = url.substring(0, url.length - 1)
        console.log(resultUrl)
        window.location.href = resultUrl

        /* this.getLocation().then(function (data) {
             loading.hide(function () {
                 var urlOption = {
                     origin: data.latitude + ',' + data.longitude,
                     destination: option.dLat + ',' + option.dLng,
                     mode: 'driving',
                     output: 'html',
                     region: '昆明'
                 }
                 var url = 'http://api.map.baidu.com/direction?'
                 for (var key in urlOption) {
                     url += key + '=' + urlOption[key] + '&'
                 }
                 var resultUrl = url.substring(0, url.length - 1)
                 // alert(resultUrl)
                 console.log(resultUrl)
                 window.location.href = resultUrl
             })
         })*/
    }
}
