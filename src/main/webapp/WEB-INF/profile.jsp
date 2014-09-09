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

    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <link id="switch_style" href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="css/docs.css" rel="stylesheet">
    <link href="js/google-code-prettify/prettify.css" rel="stylesheet">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
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
                    <li class="active"><a href="/WEB-INF/index.jspndex.jsp">Homepage</a></li>
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

<h3>Welcome, <c:out value="${client}"/></h3>
<a href="/logout">Logout</a>

<div class="row-fluid">

    <div class="span6">
        <div class="form-actions form-inline">
            <fieldset>
                <legend>UAH</legend>
                Account balance:
                <c:out value="${accountUAH.quantity}"></c:out>
                <br>
                <br>

                <div class="control-group">
                    <div class="controls form-inline">

                        <input type="text" name="recipient" class="input-small" placeholder="0.00">
                        <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Add funds
                        </button>
                    </div>
                </div>
            </fieldset>
        </div>
    </div>

    <div class="span6">
        <div class="form-actions form-inline">
            <fieldset>
                <legend>USD</legend>
                Account balance:
                <c:out value="${accountUSD.quantity}"></c:out>
                <br>
                <br>

                <div class="control-group">
                    <div class="controls form-inline">

                        <input type="text" name="recipient" class="input-small" placeholder="0.00">

                        <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                            ...
                            <li class="dropdown-submenu">
                                <a tabindex="-1" href="#">More options</a>


                                </ul>
                            </li>
                        </ul>

                        <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Confirm
                        </button>

                    </div>
                </div>

            </fieldset>
        </div>
    </div>
      </div>
<div class="row-fluid">

    <div class="span6">
        <div class="form-actions form-inline">
            <fieldset>
                <legend>EUR</legend>
                Account balance:
                <c:out value="${accountEUR.quantity}"></c:out>
                <br>
                <br>

                <div class="control-group">
                    <div class="controls form-inline">

                        <input type="text" name="recipient" class="input-small" placeholder="0.00">
                        <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Add funds
                        </button>
                    </div>
                </div>
            </fieldset>
        </div>
    </div>


    <div class="span6">
        <div class="form-actions form-inline">
            <fieldset>
                <legend>RUB</legend>
                Account balance:
                <c:out value="${accountRUB.quantity}"></c:out>
                <br>
                <br>

                <div class="control-group">
                    <div class="controls form-inline">

                        <input type="text" name="recipient" class="input-small" placeholder="0.00">
                        <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Add funds
                        </button>
                    </div>
                </div>


            </fieldset>
        </div>
    </div>
</div>

<div class="row-fluid">
    <div class="control-group span4">
        <legend>Operations</legend>
        <label class="control-label">Choose currency:</label>

        <div class="control-group form-horizontal">
            <label class="radio" for="radios-0">
                <input type="radio" name="radios" id="radios-0" value="Option one" checked="checked">
                UAH
            </label>
            <label class="radio" for="radios-1">
                <input type="radio" name="radios" id="radios-1" value="Option two">
                USD
            </label>
            <label class="radio" for="radios-1">
                <input type="radio" name="radios" id="radios-1" value="Option two">
                RUB
            </label>
        </div>

        <div class="control-group">
            <label class="control-label">Amount:</label>

            <div class="controls form-horizontal">
                <input type="text" name="amount" class="input" placeholder="0.00">
            </div>
        </div>

        <div class="control-group">
            <div class="control-group">
                <label class="control-label">Recipient:</label>
                <input type="text" name="recipient" class="input" placeholder="Leave blank if recepient is you">


            </div>
            <div class="control-group">
                <button id="sendMoney" class="btn btn-inverse">Send money</button>

            </div>
            <div class="control-group">
                <button id="sendMoney" class="btn btn-inverse">Payment history</button>

            </div>
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