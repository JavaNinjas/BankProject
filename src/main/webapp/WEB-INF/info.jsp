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


        <div class="row-fluid">
            <div class="span9"><br/>

                <h1>Bank Project</h1>
            </div>
            <div class="span3"><br/>

                <div class="pull-right">
                    <a href="#" original-title="facebook"><img src="../bootstrap/icon/soc1.png" alt="facebook"></a>
                    <a href="#" original-title="Delicious"><img src="../bootstrap/icon/soc2.png" alt="Delicious"></a>
                    <a href="#" original-title="myspace"><img src="../bootstrap/icon/soc3.png"
                                                              alt="myspace"></a><br/><br/>
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
                            <li class="active"><a href="/main"><fmt:message key="homepage"/></a></li>
                            <li><a href="https://github.com/JavaNinjas/BankProject" target="_blank">GitHub</a></li>

                        </ul>
                    </div>
                    <!-- /.nav-collapse -->
                </div>
            </div>
            <!-- /navbar-inner -->
        </div>


        <div class="row-fluid">
            <div class="span7">
                <h3><c:out value="${message}"/></h3>
                <br>

                <a href="/main" class="btn btn-inverse"><fmt:message key="back"/></a>

            </div>
        </div>


        <div id="theme_switcher">
            <style>
                .container {
                    width: 970px
                }

                #theme_switcher {
                    left: 10px;
                    position: fixed;
                    top: 10px;
                }
            </style>

        </div>
    </div>


    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="bootstrap.min.js"></script>

</fmt:bundle>
</body>
</html>