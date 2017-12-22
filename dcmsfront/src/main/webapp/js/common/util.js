var Util = {
    getQueryString: function (name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return decodeURI(r[2]);
        return null;
    },
    urlEncode: function (url, params) {
        var result = url + '?'
        for (var key in params) {
            result += key + '=' + params[key] + '&'
        }
        return encodeURI(result.substring(0, result.length - 1))
    }
}
