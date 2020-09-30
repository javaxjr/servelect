<%--
  Created by IntelliJ IDEA.
  User: 17814
  Date: 2020/9/20
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/asserts/css/bootstrap.css" />
    <script type="text/javascript" src="/asserts/js/jquery-1.12.4.js" ></script>
    <script type="text/javascript" src="/asserts/js/bootstrap.js" ></script>

    <script type="text/javascript" >
        $(function () {
            $.getJSON("/asserts/json/Txm.json", function(data) {
                $.each(data, function(i, xm) {

                });
            })
        })
    </script>

</head>
<body>
    <div class="container" style="width: 80%; background: #c0c0c0" >
        <div class="nav" >

                <div class="col-md-2 left">
                    <img src="asserts/img/09.JPG">

                </div>

                <div class="col-md-10 right">

                    <div class="col-md-12 rightrow">
                        <div class="col-md-3" style="text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/03.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>

                        </div>
                        <div class="col-md-3" style="text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/04.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>

                        </div>
                        <div class="col-md-3" style=" text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/05.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>
                        </div>
                        <div class="col-md-3" style="text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/06.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>
                        </div>
                    </div>
                    <div class="col-md-12 rightrow">
                        <div class="col-md-3" style=" text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/03.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>

                        </div>
                        <div class="col-md-3" style=" text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/04.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>

                        </div>
                        <div class="col-md-3" style=" text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/05.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>
                        </div>
                        <div class="col-md-3" style="text-align: center; background: #ffffff">
                            <div>
                                <img src="asserts/img/06.JPG">
                            </div>
                            <span style="font-size: 13px; ">小米10至尊版</span></br>
                            <div>120x变焦/120w秒冲/120Hz屏幕</div>
                            <span>5299元起</span>
                        </div>
                    </div>

                </div>

        </div>
    </div>

</body>
</html>
