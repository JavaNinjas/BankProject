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
                        <li class="active"><a href="/WEB-INF/index.jsp">Homepage</a></li>
                        <li><a href="/result.jsp">List of clients</a></li>
                        <li><a href="#">Sandbox</a></li>
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

            <div id="myCarousel" class="carousel slide">
                <!-- Carousel items -->
                <div class="carousel-inner">
                    <div class="active item"><img src="../pictures/vanGogh1.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4>Hibernate</h4>

                            <p>This project uses Hibernate + Heroku Postresql.</p>

                        </div>
                    </div>
                    <div class="item"><img src="../pictures/vanGogh2.jpg" style="width:100%"/>

                        <div class="carousel-caption">
                            <h4>MVC</h4>

                            <p>MVC architecture is implemented.</p>
                        </div>
                    </div>
                    <div class="item"><img src="../pictures/vanGogh3.jpg" style="width:100%"/>

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
            <img src="../pictures/stock1.jpg"/><br/><br/>

            <form name="input" action="/index" method="get" class="well">
                <h3>Welcome to our bank</h3>

                <p style="text-align:justify">
                    Provide your credentials to enter service. In case client is not found your profile will be created
                    automatically.
                </p>

                <input type="email" name="email" placeholder="Email">
                <input type="password" name="password" placeholder="Password"><br>
                <button class="btn btn-inverse" type="submit">Sign in</button>
                <a href="/WEB-INF/create.jspeate.jsp" class="btn btn-inverse">Register</a>
            </form>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span4">

            <center>
                <a data-toggle="modal" href="#myModal"><img src="../pictures/stock2.jpg"/></a>

                <div class="modal hide" id="myModal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3>Modal header</h3>
                        <img src="pictures/bb1.gif" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#">Lorem Ipsum is simply dummy<br/> text of the printing</a>
            </center>
        </div>
        <div class="span4">
            <center>
                <a data-toggle="modal" href="#myModal1"><img src="../pictures/stock2.jpg"/></a>

                <div class="modal hide" id="myModal1">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3>Modal header</h3>
                        <img src="pictures/bb2.gif" style="width:600px; height:300px"/>
                    </div>
                </div>
                <br/><br/>

                <a class="btn" style="width:285px;" href="#">Lorem Ipsum is simply dummy<br/> text of the printing</a>
            </center>

        </div>

        <div class="span4">
            <center>
                <a data-toggle="modal" href="#myModal1"><img src="../pictures/stock2.jpg"/></a>

                <div class="modal hide" id="myModal1">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">×</button>
                        <h3>Modal header</h3>
                        <img src="pictures/bb2.gif" style="width:600px; height:300px"/>
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



</body>
</html>