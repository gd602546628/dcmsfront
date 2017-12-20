var pageInit = function () {
    $(function () {
        var el = $('.dc-page')[0]
        if (el) {
            el.style.height = document.documentElement.clientHeight + 'px'
            el.style.width = document.documentElement.clientWidth + 'px'
            el.style.display = 'flex'
        }
    })
}
pageInit()