<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bank Project</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <link id="switch_style" href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <link href="../bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="css/docs.css" rel="stylesheet">
    <link href="js/google-code-prettify/prettify.css" rel="stylesheet">

    <script src="jquery.js"></script>
    <script src="bootstrap-transition.js"></script>
    <script src="bootstrap-alert.js"></script>
    <script src="bootstrap-modal.js"></script>
    <script src="bootstrap-dropdown.js"></script>
    <script src="bootstrap-scrollspy.js"></script>
    <script src="bootstrap-tab.js"></script>
    <script src="bootstrap-tooltip.js"></script>
    <script src="bootstrap-popover.js"></script>
    <script src="bootstrap-button.js"></script>
    <script src="bootstrap-collapse.js"></script>
    <script src="bootstrap-carousel.js"></script>
    <script src="bootstrap-typeahead.js"></script>
    <script src="application.js"></script>
</head>
<body>

<div class="container">


    <div class="row-fluid">
        <div class="span9"><br/>

            <h1>Bank Project</h1>
        </div>
        <div class="span3"><br/>

            <div class="pull-right">
                <a href="#" original-title="facebook"><img src="../bootstrap/icon/soc1.png" alt="facebook"></a>
                <a href="#" original-title="Delicious"><img src="../bootstrap/icon/soc2.png" alt="Delicious"></a>
                <a href="#" original-title="myspace"><img src="../bootstrap/icon/soc3.png" alt="myspace"></a><br/><br/>
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
                        <li class="active"><a href="/WEB-INF/index.jsp">Homepage</a></li>
                        <li><a href="/result.jsp">List of clients</a></li>
                        <li><a href="#">Sandbox</a></li>
                        <li><a href="#">About</a></li>
                    </ul>
                </div>
                <!-- /.nav-collapse -->
            </div>
        </div>
        <!-- /navbar-inner -->
    </div>


    <div class="row-fluid">
        <div class="span7">
            <h3><c:out value="${clientAdded}"/> added</h3>

            <form name="submit" action="/index" method="get">
                <input type="submit" name="showAll" class="btn btn-inverse" value="Show all"/>
            </form>
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

<script>
    $(function () {
        $('#theme_switcher ul li a').bind('click',
                function (e) {
                    $("#switch_style").attr("href", "css/" + $(this).attr('rel') + "/bootstrap.min.css");
                    return false;
                }
        );
    });
</script>

</body>
</html>