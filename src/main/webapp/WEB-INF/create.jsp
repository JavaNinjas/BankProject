<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

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
                        <li class="active"><a href="/main">Homepage</a></li>
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
            <form id="register" name="register" action="/create" method="post" class="well">
                <div class="form-inline">
                    <legend>Registration Form</legend>
                    <input id="fn" name="firstName" type="text" placeholder="First name" class="input-xlarge">
                    <br><span class="fn"></span><br>
                    <input id="ln" name="lastName" type="text" placeholder="Last name" class="input-xlarge">
                    <br> <span class="ln"></span> <br>
                    <input id="em" name="email" type="email" placeholder="E-mail" class="input-xlarge">
                    <br> <span class="em"></span>  <br>
                    <input id="p1" name="password" type="password" placeholder="Type password" class="input-xlarge">
                    <br><span class="ps"></span>   <br>
                    <input id="p2" name="passwordConfirm" type="password" placeholder="Re-type password" class="input-xlarge">
                    <br><span class="ps"></span>   <br>
                </div>


                <button type="submit" id="submitButton" class="btn btn-inverse">Confirm</button>

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
    $(document).ready(function () {
        $('#submitButton').click(function () {
            var fn = $("#fn").val();
            var ln = $("#ln").val();
            var em = $("#em").val();
            var p1 = $("#p1").val();
            var p2 = $("#p2").val();

            if (fn === "") {
                $('.fn').text("Enter name").show();
            }

            if (ln === "") {
                $('.ln').text("Enter surname").show();
            }

            if (em === "") {
                $('.em').text("Enter email").show();
            }

            if (p1 !== p2) {
                $('.ps').text("Passwords do not match").show();
                return false;
            } else {
                return;
            }
        })
    });
</script>


</body>
</html>