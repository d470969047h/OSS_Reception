/**
 * Created by daihui on 2015-02-15.
 */
$(function () {
    var index = 0;
    var len = $(".num > li").length;
    var adTimer;
    $(".num li").mouseover(function () {
        index = $(".num li").index(this);//获取当前元素的索引
        showImg(index);
    }).eq(0).mouseover();//初始化，让第一个数字高亮，并显示第一个广告


    // 通过控制top ，来显示不同的幻灯片
    function showImg(index) {
        var adHeight = $(".content_right .ad").height();//获取高度
        $(".slider").stop(true, false).animate({ top: -adHeight * index}, 1000);
        $(".num li").removeClass("on")
            .eq(index).addClass("on");//给当前广告数字添加高亮样式
    }

    /*当不触碰广告时,滑入 停止动画，滑出开始动画.*/
    $('.ad').hover(function () {
        clearInterval(adTimer);
    }, function () {
        adTimer = setInterval(function () {
            showImg(index);
            index++;
            if (index == len) {
                index = 0;
            }
        }, 3000);
    }).trigger("mouseleave");
});


///*首页广告效果*/
//$(function(){
//    var len  = $(".num > li").length;
//    var index = 0;
//    var adTimer;
//    $(".num li").mouseover(function(){
//        index  =   $(".num li").index(this);
//        showImg(index);
//    }).eq(0).mouseover();
//    //滑入 停止动画，滑出开始动画.
//    $('.ad').hover(function(){
//        clearInterval(adTimer);
//    },function(){
//        adTimer = setInterval(function(){
//            showImg(index)
//            index++;
//            if(index==len){index=0;}
//        } , 3000);
//    }).trigger("mouseleave");
//})
//// 通过控制top ，来显示不同的幻灯片
//function showImg(index){
//    var adHeight = $(".content_right .ad").height();
//    $(".slider").stop(true,false).animate({top : -adHeight*index},1000);
//    $(".num li").removeClass("on")
//        .eq(index).addClass("on");
//}













