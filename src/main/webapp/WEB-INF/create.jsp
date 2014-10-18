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

    <script>
        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
                m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

        ga('create', 'UA-55881474-1', 'auto');
        ga('send', 'pageview');

    </script>

</head>
<body>

<fmt:setLocale value="${locale}" scope="session"/>
<fmt:bundle basename="MessagesBundle">

<div class="container">

    <style> .container {
        width: 970px
    } </style>


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
                        <li class="active"><a href="/main"><fmt:message key="homepage"/></a></li>
                        <li><a href="https://github.com/JavaNinjas/BankProject" target="_blank">GitHub</a></li>
                        <li><a href="https://www.youtube.com/watch?v=DSwcIca_SAM" target="_blank"><fmt:message key="demo"/></a></li>
                    </ul>
                </div>
                <!-- /.nav-collapse -->
            </div>
        </div>
        <!-- /navbar-inner -->
    </div>


    <div class="row-fluid">
        <div class="span7">
            <form id="register" action="/create" method="post" class="well">
                <div class="form-inline">
                    <legend><fmt:message key="regform"/></legend>

                    <input id="fname" name="firstName" type="text" placeholder="<fmt:message key='firstname'/>" class="input-xlarge">
                    <br><span class="fname"></span><br>

                    <input id="lname" name="lastName" type="text" placeholder="<fmt:message key='lastname'/>" class="input-xlarge">
                    <br> <span class="lname"></span> <br>

                    <input id="e-mail" name="email" type="email" placeholder="<fmt:message key='email'/>" class="input-xlarge">
                    <br> <span class="email"></span> <br>

                    <input id="pass1" name="password" type="password" placeholder="<fmt:message key='typepass'/>"
                           class="input-xlarge">
                    <br><span class="pass1"></span> <br>

                    <input id="pass2" name="passwordConfirm" type="password" placeholder="<fmt:message key='retype'/>"
                           class="input-xlarge">
                    <br><span class="pass2"></span> <br>
                </div>
                <button id="submitButton" type="submit" class="btn btn-inverse"><fmt:message key='confirm'/></button>
            </form>
        </div>
    </div>
</div>

<style>
    span {
        color: #4176c4;
        font-size: 12px;
    }
</style>

<script>

    function fieldRequired(className, text) {
        $(className).text(text).fadeIn("slow").delay(2000).fadeOut("slow");
    }

    $(document).ready(function () {
        $('#register').submit(function () {

            var flag = true;

            if ($('#fname').val() === "") {
                flag = false;
                fieldRequired(".fname", "Enter name");
            }

            if ($('#lname').val() === "") {
                flag = false;
                fieldRequired(".lname", "Enter surname");
            }

            if ($('#e-mail').val() === "") {
                flag = false;
                fieldRequired(".email", "Enter email");
            }

            if ($('#pass1').val() === "") {
                flag = false;
                fieldRequired(".pass1", "Password is required");
            }

            if ($('#pass1').val() !== $('#pass2').val()) {
                flag = false;
                fieldRequired(".pass2", "Passwords do not match");
            }

            if ("" === $('#pass1').val() && "" === $('#pass2').val()) {
                flag = false;
            }

            return flag

        })
    });


</script>

</fmt:bundle>
</body>
</html>