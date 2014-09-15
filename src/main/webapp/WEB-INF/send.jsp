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
                        <li class="active"><a href="/main">Homepage</a></li>
                        <li><a href="https://github.com/JavaNinjas/BankProject" target="_blank">GitHub</a></li>

                    </ul>
                </div>
                <!-- /.nav-collapse -->
            </div>
        </div>
        <!-- /navbar-inner -->
    </div>

    <div class="span7">


        <form class="form-actions" action="/sendservlet" method="get">
            <fieldset>

                <!-- Form Name -->
                <legend>Send money form</legend>

                <!-- First name input-->
                <div class="control-group">
                    <div class="controls">
                        <input name="senderEmail" type="text" placeholder="Sender's e-mail" class="input-xlarge">
                    </div>
                </div>

                <!-- Last name input-->
                <div class="control-group">
                    <div class="controls">
                        <input name="receiverEmail" type="text" placeholder="Receiver's e-mail" class="input-xlarge">
                    </div>
                </div>

                <!-- E-mail input-->
                <div class="control-group">
                    <div class="controls">
                        <input name="amount" type="text" placeholder="0.00" class="input-xlarge">
                    </div>
                </div>

                <!-- Password input-->
                <div class="control-group">
                    <div class="controls">
                        <input name="senderCurrency" type="text" placeholder="Sender's currency" class="input-xlarge">
                    </div>
                </div>

                <!-- Password repeat-->
                <div class="control-group">
                    <div class="controls">
                        <input name="receiverCurrency" type="text" placeholder="Receiver's currency"
                               class="input-xlarge">
                    </div>
                </div>

                <!-- Button -->
                <div class="control-group">
                    <div class="controls">
                        <button id="singlebutton" type="submit" name="singlebutton" class="btn btn-inverse">Confirm</button>
                        <a href="/login" class="btn btn-inverse">Cancel</a>
                    </div>
                </div>

            </fieldset>
        </form>


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