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
                        <li class="active"><a href="/main"><fmt:message key="homepage"/></a></li>
                        <li><a href="https://github.com/JavaNinjas/BankProject" target="_blank">GitHub</a></li>
                        <li><a href="https://www.youtube.com/watch?v=DSwcIca_SAM"><fmt:message key="demo"/></a></li>
                    </ul>
                </div>
                <!-- /.nav-collapse -->
            </div>
        </div>
        <!-- /navbar-inner -->
    </div>

    <h3><fmt:message key="greeting"/>, <c:out value="${client}"/>
    </h3> <a href="/logout"><fmt:message key="logout"/></a>
    <br>
    <br>

    <div class="row-fluid">
        <div class="span6">
            <form name="input1" class="well">
                <legend>UAH</legend>
                <fmt:message key="balance"/>:
                <c:out value="${accountUAH.balance}"></c:out>
                <div class="control-group form-inline">
                    <input id="UAH" type="text" name="amount" class="input-small" placeholder="0.00">
                    <input type="hidden" name="currency" value="UAH">

                    <button id="addUAH" formaction="/sendservlet" formmethod="post" type="submit"
                            class="btn btn-inverse" disabled>
                        <fmt:message key="add"/>
                    </button>
                    <button id="sendUAH" type="submit" formaction="/sendPage" formmethod="get" class="btn btn-inverse"
                            disabled><fmt:message key="send"/>
                    </button>
                </div>
            </form>
        </div>

        <div class="span6">
            <form name="input2" class="well">
                <legend>USD</legend>
                <fmt:message key="balance"/>:
                <c:out value="${accountUSD.balance}"></c:out>
                <div class="control-group form-inline">
                    <input id="USD" type="text" name="amount" class="input-small" placeholder="0.00">
                    <input type="hidden" name="currency" value="USD">
                    <button id="addUSD" type="submit" formmethod="post" formaction="/sendservlet"
                            class="btn btn-inverse" disabled>
                        <fmt:message key="add"/>
                    </button>
                    <button id="sendUSD" type="submit" formaction="/sendPage" formmethod="get" class="btn btn-inverse"
                            disabled><fmt:message key="send"/>
                    </button>
                </div>
            </form>
        </div>
    </div>

    <div class="row-fluid">
        <div class="span6">
            <form name="input3" class="well">
                <legend>EUR</legend>
                <fmt:message key="balance"/>:
                <c:out value="${accountEUR.balance}"></c:out>
                <div class="control-group form-inline">
                    <input id="EUR" type="text" name="amount" class="input-small" placeholder="0.00">
                    <input type="hidden" name="currency" value="EUR">
                    <button id="addEUR" type="submit" formmethod="post" formaction="/sendservlet"
                            class="btn btn-inverse" disabled>
                        <fmt:message key="add"/>
                    </button>
                    <button id="sendEUR" type="submit" formaction="/sendPage" formmethod="get" class="btn btn-inverse"
                            disabled><fmt:message key="send"/>
                    </button>
                </div>
            </form>
        </div>

        <div class="span6">
            <form name="input4" class="well">
                <legend>RUB</legend>
                <fmt:message key="balance"/>:
                <c:out value="${accountRUB.balance}"></c:out>
                <div class="control-group form-inline">
                    <input id="RUB" type="text" name="amount" class="input-small" placeholder="0.00">
                    <input type="hidden" name="currency" value="RUB">
                    <button id="addRUB" type="submit" formmethod="post" formaction="/sendservlet"
                            class="btn btn-inverse" disabled>
                        <fmt:message key="add"/>
                    </button>
                    <button id="sendRUB" type="submit" formaction="/sendPage" formmethod="get" class="btn btn-inverse"
                            disabled><fmt:message key="send"/>
                    </button>
                </div>
            </form>
        </div>
    </div>

    <div class="row-fluid">
        <div class="control-group">
            <legend><fmt:message key="history"/></legend>
            <a href="/show" class="btn btn-inverse"><fmt:message key="show"/></a>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {

        $('input[id="UAH"]').keyup(function () {
            if ($('input[id="UAH"]').val() !== '') {
                $('button[id="addUAH"]').removeAttr('disabled');
                $('button[id="sendUAH"]').removeAttr('disabled');
            }
        });

        $('input[id="USD"]').keyup(function () {
            if ($('input[id="USD"]').val() !== '') {
                $('button[id="addUSD"]').removeAttr('disabled');
                $('button[id="sendUSD"]').removeAttr('disabled');
            }
        });

        $('input[id="EUR"]').keyup(function () {
            if ($('input[id="EUR"]').val() !== '') {
                $('button[id="addEUR"]').removeAttr('disabled');
                $('button[id="sendEUR"]').removeAttr('disabled');
            }
        });

        $('input[id="RUB"]').keyup(function () {
            if ($('input[id="RUB"]').val() !== '') {
                $('button[id="addRUB"]').removeAttr('disabled');
                $('button[id="sendRUB"]').removeAttr('disabled');
            }
        });
    });

</script>
</fmt:bundle>

</body>
</html>