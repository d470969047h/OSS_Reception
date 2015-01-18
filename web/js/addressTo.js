/**
 * Created by daihui on 2015-01-08.
 */
$(function () {
    $("#similar p").hover(function () {
        $(this).addClass('bggray');
        if (!($(this).hasClass('selected'))) {
            $(this).find('a').show();
        }
    }, function () {
        $(this).removeClass('bggray');
        $(this).find('a').hide();
    })
    $("#similar p").click(function () {
        var con = confirm('更换地址后您需要更换订单信息');
        if (con == true) {
            /**初始化**/
            $('#similar p').addClass('common').removeClass('selected');
            $("#similar input[type='radio']").attr("checked", false);
            $('#similar p').find('span').html('');
            /***当前的样式**/
            $(this).addClass('selected').removeClass('common');
            $(this).find('span').html('寄送至');
            $(this).find("input[type='radio']").attr("checked", true);
        }
    })
})