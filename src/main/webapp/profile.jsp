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
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <link id="switch_style" href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="css/docs.css" rel="stylesheet">
    <link href="js/google-code-prettify/prettify.css" rel="stylesheet">

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

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
                <a href="#" original-title="facebook"><img src="bootstrap/icon/soc1.png" alt="facebook"></a>
                <a href="#" original-title="Delicious"><img src="bootstrap/icon/soc2.png" alt="Delicious"></a>
                <a href="#" original-title="myspace"><img src="bootstrap/icon/soc3.png" alt="myspace"></a><br/><br/>
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
                        <li class="active"><a href="/index.jsp">Homepage</a></li>
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

        <div class="span4">
            <div class="form-actions form-inline">
                <fieldset>
                    <legend>UAH</legend>
                    Account status: active<br>
                    Account balance: 1337.00<br>
                    <br>

                    <div class="control-group">
                        <div class="controls form-inline">
                            <button id="singlebutton1" name="singlebutton1" class="btn btn-inverse">Open account</button>
                            <button id="singlebutton2" name="singlebutton2" class="btn btn-inverse disabled">Close
                                account
                            </button>
                        </div>
                    </div>
                </fieldset>
            </div>
        </div>


        <div class="span4">
            <div class="form-actions form-inline">
                <fieldset>
                    <legend>USD</legend>
                    Account status: active<br>
                    Account balance: 1337.00<br>
                    <br>

                    <div class="control-group">
                        <div class="controls form-inline">
                            <button id="singlebutton" name="singlebutton" class="btn btn-inverse">Open account</button>
                            <button id="singlebutton" name="singlebutton" class="btn btn-inverse disabled">Close
                                account
                            </button>
                        </div>
                    </div>
                </fieldset>
            </div>
        </div>


        <div class="span4">
            <div class="form-actions form-inline">
                <fieldset>
                    <legend>RUB</legend>
                    Account status: active<br>
                    Account balance: 1337.00<br>
                    <br>

                    <div class="control-group">
                        <div class="controls form-inline">
                            <button id="singlebutton" name="singlebutton" class="btn btn-inverse">Open account</button>
                            <button id="singlebutton" name="singlebutton" class="btn btn-inverse disabled">Close
                                account
                            </button>
                        </div>
                    </div>
                </fieldset>
            </div>
        </div>
    </div>


    <legend>Operations</legend>
    <div class="control-group">

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
            <label class="control-label" for="textinput">Amount:</label>

            <div class="controls form-horizontal">
                <input type="text" class="input" placeholder="0.00" id="inputKey">
            </div>
        </div>


        <div class="control-group">
            <div class="control-group">
                <label class="control-label" for="textinput">Recipient:</label>
                <input type="text" class="input" placeholder="Leave blank if recepient is you" id="inputKey">

            </div>
            <div class="control-group">

                <button id="singlebutton" name="singlebutton" class="btn btn-inverse">Send money</button>
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


<script src="http://code.jquery.com/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>




<script>
    var buttonToSwitch1 = $('#singlebutton1')
    var buttonToSwitch2 = $('#singlebutton2')


    $(document).ready(function () {
        $('.btn-inverse').click(
                function () {
                    switch (true) {
                        case(buttonToSwitch1.hasClass('disabled')):
                            buttonToSwitch1.removeClass('disabled');
                            buttonToSwitch2.addClass('disabled');
                            $.ajax({
                                url: "/added",
                                data: "data",
                                success: function() {
                                  window.location.replace("/added.jsp")
                                }
                            })
                            break;
                        case(buttonToSwitch2.hasClass('disabled')):
                            buttonToSwitch2.removeClass('disabled');
                            buttonToSwitch1.addClass('disabled');
                    }
//            $(this).addClass('disabled');
//            $('#singlebutton2').removeClass('disabled');
                });
    });
</script>


</body>
</html>