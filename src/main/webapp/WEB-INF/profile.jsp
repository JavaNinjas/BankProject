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

<div class="container" width="970px">
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

    <h3>Welcome, <c:out value="${client}"/>
    </h3> <a href="/logout">Logout</a>
    <br>
    <br>

    <div class="row-fluid">
        <div class="span6">
            <form name="input" action="/sendPage" method="post" class="well">
                <legend>UAH</legend>
                Account balance:
                <c:out value="${accountUAH.balance}"></c:out>
                <div class="control-group form-inline">
                    <input type="text" name="amountUAH" class="input-small" placeholder="0.00">
                    <button id="addUAH" class="btn btn-inverse">Add funds</button>

                    <button id="sendUAH" type="submit" class="btn btn-inverse">Send money</button>
                </div>
            </form>
        </div>

        <div class="span6">
            <form name="input" action="/sendPage" method="get" class="well">
                <legend>USD</legend>
                Account balance:
                <c:out value="${accountUSD.balance}"></c:out>
                <div class="control-group form-inline">
                    <input type="text" name="recipient" class="input-small" placeholder="0.00">
                    <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Add funds</button>
                    <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Send money</button>
                </div>
            </form>
        </div>
    </div>

    <div class="row-fluid">
        <div class="span6">
            <form name="input" action="/send" method="get" class="well">
                <legend>EUR</legend>
                Account balance:
                <c:out value="${accountEUR.balance}"></c:out>
                <div class="control-group form-inline">
                    <input type="text" name="recipient" class="input-small" placeholder="0.00">
                    <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Add funds</button>
                    <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Send money</button>
                </div>
            </form>
        </div>
        <div class="span6">
            <form name="input" action="/send" method="get" class="well">
                <legend>RUB</legend>
                Account balance:
                <c:out value="${accountRUB.balance}"></c:out>
                <div class="control-group form-inline">
                    <input type="text" name="recipient" class="input-small" placeholder="0.00">
                    <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Add funds</button>
                    <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Send money</button>
                </div>
            </form>
        </div>
    </div>

    <div class="row-fluid">
        <div class="control-group">
            <legend>Payment history</legend>
            <a href="/show" class="btn btn-inverse">Show transactions</a>
        </div>
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

</div>


<script src="http://code.jquery.com/jquery.min.js"></script>
<script src="bootstrap.min.js"></script>


<script>
    $(document).ready(function (e) {
        $('#singlebutton1').click(
                function () {
                    if ($(this).hasClass('disabled'))
                        e.preventDefault();
                    $(this).addClass('disabled');

                    $.ajax({
                        type: "GET",
                        url: "/createAcc",
                        //data: "data",
                        success: function () {
                        }
                    })
                });
    });
</script>

<script>
    $(document).ready(function () {
        $('#sendMoney').click(
                function () {
                    $.ajax({
                        type: "GET",
                        url: "/send",
                        success: function () {

                        }
                    })
                });
    });
</script>


</body>
</html>