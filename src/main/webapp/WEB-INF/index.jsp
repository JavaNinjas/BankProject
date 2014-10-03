<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Bank Project</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">

    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <link id="switch_style" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="css/docs.css" rel="stylesheet">
    <link href="js/google-code-prettify/prettify.css" rel="stylesheet">
    <link href="flags/flags.css" rel="stylesheet">

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="bootstrap/js/jquery.js"></script>
    <script src="bootstrap/js/bootstrap-transition.js"></script>
    <script src="bootstrap/js/bootstrap-alert.js"></script>
    <script src="bootstrap/js/bootstrap-modal.js"></script>
    <script src="bootstrap/js/bootstrap-dropdown.js"></script>
    <script src="bootstrap/js/bootstrap-scrollspy.js"></script>
    <script src="bootstrap/js/bootstrap-tab.js"></script>
    <script src="bootstrap/js/bootstrap-tooltip.js"></script>
    <script src="bootstrap/js/bootstrap-popover.js"></script>
    <script src="bootstrap/js/bootstrap-button.js"></script>
    <script src="bootstrap/js/bootstrap-collapse.js"></script>
    <script src="bootstrap/js/bootstrap-carousel.js"></script>
    <script src="bootstrap/js/bootstrap-typeahead.js"></script>
    <script src="bootstrap/js/application.js"></script>
</head>


<body>
<fmt:setLocale value="${locale}"/>
<fmt:bundle basename="MessagesBundle">

<div class="container">
    <style>
        .container {
            width: 970px
        }

    </style>
    <div class="row-fluid">
        <div class="span9"><br/>

            <h1>Bank Project</h1>
        </div>
        <div class="span3"><br/>

            <div class="pull-right">
                <p>
                    USD: <c:out value="${USD}"/>
                    EUR: <c:out value="${EUR}"/>
                    RUB: <c:out value="${RUB}"/>
                </p>
                <br/>
            </div>
        </div>
    </div>

    <div class="navbar">
        <div class="navbar-inner">
            <div class="container">
                <a data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>

                <div class="nav-collapse">
                    <ul class="nav">
                        <li><a href="/main"><fmt:message key="homepage"/></a></li>
                        <li><a href="https://github.com/JavaNinjas/BankProject" target="_blank"><fmt:message
                                key="github"/></a></li>
                        <li><a href="/main"><fmt:message key="demo"/></a></li>
                    </ul>
                </div>

                    <%--<div class="nav-collapse pull-right"  style="margin: 10px -10px 0 0;">--%>
                    <%--<ul class="nav">--%>
                <form class="pull-right form-inline" style="margin: 10px -0px 0 0;">
                    <input type="submit" formaction="/locale" formmethod="get" name="en_US" value=" "
                           class="btn flag flag-us" style="border:0px; border-radius: 0px"/>
                    <input type="submit" formaction="/locale" formmethod="get" name="ru_RU" value=" "
                           class="btn flag flag-ru" style="border:0px; border-radius: 0px"/>
                    <input type="submit" formaction="/locale" formmethod="get" name="uk_UA" value=" "
                           class="btn flag flag-ua" style="border:0px; border-radius: 0px"/>
                </form>
                    <%--</ul>--%>
                    <%--</div>--%>


                <!-- /.nav-collapse -->
            </div>

        </div>
        <!-- /navbar-inner -->
    </div>

    <div class="row-fluid">
        <div class="span7">

            <div id="myCarousel" class="carousel slide">
                <!-- Carousel items -->
                <div class="carousel-inner">
                    <div class="active item"><img src="../pictures/vanGogh1.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4><fmt:message key="carouselTitle1"/></h4>

                            <p><fmt:message key="carouselText1"/></p>
                        </div>
                    </div>
                    <div class="item"><img src="../pictures/vanGogh2.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4><fmt:message key="carouselTitle2"/></h4>

                            <p><fmt:message key="carouselText2"/></p>
                        </div>
                    </div>
                    <div class="item"><img src="../pictures/vanGogh3.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4><fmt:message key="carouselTitle3"/></h4>

                            <p><fmt:message key="carouselText3"/></p>
                        </div>
                    </div>
                </div>
                <!-- Carousel nav -->
                <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
                <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
            </div>
        </div>

        <div class="span5">


            <img src="/pictures/stock1.jpg"/><br/><br/>

            <form name="input" action="/index" method="get" class="well">

                <h3><fmt:message key="welcome"/></h3>

                <div class="control-group">

                    <p style="text-align:justify">
                        <fmt:message key="provide"/>
                    </p>

                    <input type="email" name="email" placeholder=<fmt:message key="email"/>>
                    <input type="password" name="password" placeholder=<fmt:message key='password'/>><br>
                    <button class="btn btn-inverse" type="submit"><fmt:message key="sign_in"/></button>
                    <a href="/createPage" class="btn btn-inverse"><fmt:message key="register"/></a>
                </div>
            </form>

        </div>

    </div>
    <div class="row-fluid">
        <div class="span4">

            <center>
                <a data-toggle="modal" href="#myModal"><img src="../pictures/stock2.jpg"/></a>

                <div class="modal hide" id="myModal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3><fmt:message key="modalLorem"/></h3>
                        <img src="/pictures/modal3.jpg" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#"><fmt:message key="lorem"/></a>
            </center>
        </div>
        <div class="span4">
            <center>
                <a data-toggle="modal" href="#myModal1"><img src="../pictures/stock2.jpg"/></a>

                <div class="modal hide" id="myModal1">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3><fmt:message key="modalLorem"/></h3>
                        <img src="/pictures/modal2.jpg" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#"><fmt:message key="lorem"/></a>
            </center>

        </div>

        <div class="span4">
            <center>
                <a data-toggle="modal" href="#myModal1"><img src="../pictures/stock2.jpg"/></a>

                <div class="modal hide" id="myModal1">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3><fmt:message key="modalLorem"/></h3>
                        <img src="/pictures/modal1.jpg" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#"><fmt:message key="lorem"/></a>
            </center>

        </div>
    </div>
</div>
    </fmt:bundle>
</body>
</html>