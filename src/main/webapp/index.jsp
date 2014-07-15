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
    <link href="template/css/bootstrap.css" rel="stylesheet">
    <link id="switch_style" href="template/css/silver/bootstrap.min.css" rel="stylesheet">

    <link href="template/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="css/docs.css" rel="stylesheet">
    <link href="js/google-code-prettify/prettify.css" rel="stylesheet">

    <script src="template/js/jquery.js"></script>
    <script src="template/js/bootstrap-transition.js"></script>
    <script src="template/js/bootstrap-alert.js"></script>
    <script src="template/js/bootstrap-modal.js"></script>
    <script src="template/js/bootstrap-dropdown.js"></script>
    <script src="template/js/bootstrap-scrollspy.js"></script>
    <script src="template/js/bootstrap-tab.js"></script>
    <script src="template/js/bootstrap-tooltip.js"></script>
    <script src="template/js/bootstrap-popover.js"></script>
    <script src="template/js/bootstrap-button.js"></script>
    <script src="template/js/bootstrap-collapse.js"></script>
    <script src="template/js/bootstrap-carousel.js"></script>
    <script src="template/js/bootstrap-typeahead.js"></script>
    <script src="template/js/application.js"></script>
</head>
<body>
<div class="container">


    <div class="row-fluid">
        <div class="span9"><br/>

            <h1>Bank Project</h1>
        </div>
        <div class="span3"><br/>

            <div class="pull-right">
                <a href="#" original-title="facebook"><img src="template/icon/soc1.png" alt="facebook"></a>
                <a href="#" original-title="Delicious"><img src="template/icon/soc2.png" alt="Delicious"></a>
                <a href="#" original-title="myspace"><img src="template/icon/soc3.png" alt="myspace"></a><br/><br/>
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
        <div class="span7">

            <div id="myCarousel" class="carousel slide">
                <!-- Carousel items -->
                <div class="carousel-inner">
                    <div class="active item"><img src="vanGoghStarryNight.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4>Hibernate</h4>

                            <p>This project uses Hibernate + Heroku Postresql.</p>

                        </div>
                    </div>
                    <div class="item"><img src="vanGoghSunsetAtMontmajour.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4>MVC</h4>

                            <p>MVC architecture is implemented.</p>
                        </div>
                    </div>
                    <div class="item"><img src="vanGoghWheatFieldWithCypresses.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4>Feel free to test it</h4>

                            <p>Add clients, delete them or transfer money.</p>
                        </div>
                    </div>
                </div>
                <!-- Carousel nav -->
                <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
                <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
            </div>


        </div>

        <div class="span5">
            <img src="stock1.jpg"/><br/><br/>

            <form name="input" action="/add" method="get" class="well">
                <h3>Welcome to our bank</h3>

                <p style="text-align:justify">
                    Provide your credentials to enter service. In case client is not found your profile will be created automatically.
                </p>

                <input type="text" name="firstName" placeholder="First name">
                <input type="text" name="lastName" placeholder="Last name"><br>
                <button class="btn btn-inverse" type="submit">Sign in</button>
            </form>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span4">

            <center>
                <a data-toggle="modal" href="#myModal"><img src="stock2.jpg"/></a>

                <div class="modal hide" id="myModal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3>Modal header</h3>
                        <img src="http://placehold.it/600x300" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#">Lorem Ipsum is simply dummy<br/> text of the printing</a>
            </center>
        </div>
        <div class="span4">
            <center>
                <a data-toggle="modal" href="#myModal1"><img src="stock2.jpg"/></a>

                <div class="modal hide" id="myModal1">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3>Modal header</h3>
                        <img src="http://placehold.it/600x300" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#">Lorem Ipsum is simply dummy<br/> text of the printing</a>
            </center>

        </div>

        <div class="span4">
            <center>
                <a data-toggle="modal" href="#myModal2"><img src="stock2.jpg"/></a>

                <div class="modal hide" id="myModal2">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3>Modal header</h3>
                        <img src="http://placehold.it/600x300" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#">Lorem Ipsum is simply dummy<br/> text of the printing</a>
            </center>

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

<script>
    $(function() {
        $('#theme_switcher ul li a').bind('click',
                function(e) {
                    $("#switch_style").attr("href", "css/"+$(this).attr('rel')+"/bootstrap.min.css");
                    return false;
                }
        );
    });
</script>

</body>
</html>