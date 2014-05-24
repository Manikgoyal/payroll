<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Dazzler Login Portal</title>
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css" />
        <link type="text/css" rel="stylesheet" href="css/font-awesome.min.css" />
        <link type="text/css" rel="stylesheet" href="css/style.css" />

    </head>
    <body>

        <!-- Fixed Navigation Bar -->

        <div class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="#" class="navbar-brand"><b>Tech Dazzler</b></a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class=" nav navbar-nav">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Tutorials</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
            </div>
        </div> 

        <!-- Carousel -->

        <div id="myCarousel" class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="item active">
                    <img src="img/img2.jpg"/>
                    <div class="container">
                        <div class="carousel-caption">
                            <div class="col-md-12">
                                
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label for="username" class="col-sm-2 control-label">User Name</label>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control" placeholder="Enter username"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="col-sm-2 control-label">Password</label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control" placeholder="Enter Password"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-6">
                                            <button class="col-sm-offset-1 btn btn-primary" type="submit">Submit</button>
                                            <button class="btn btn-default" type="reset">Clear</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="img/img2.jpg"/>
                    <div class="container">
                        <div class="carousel-caption">
                            <div class="col-md-12">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label for="username" class="col-sm-2 control-label">User Name</label>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control" placeholder="Enter username"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="col-sm-2 control-label">Password</label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control" placeholder="Enter Password"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-6">
                                            <button class="col-sm-offset-1 btn btn-primary" type="submit">Submit</button>
                                            <button class="btn btn-default" type="reset">Clear</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="img/img2.jpg"/>
                    <div class="container">
                        <div class="carousel-caption">
                            <div class="col-md-12">
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label for="username" class="col-sm-2 control-label">User Name</label>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control" placeholder="Enter username"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="col-sm-2 control-label">Password</label>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control" placeholder="Enter Password"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-6">
                                            <button class="col-sm-offset-1 btn btn-primary" type="submit">Submit</button>
                                            <button class="btn btn-default" type="reset">Clear</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
        </div>


        <!------  Login Form  ----->




        <!----Font Awesome Fotter -->

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="well">
                        <a href="#"><i class="largeIcon fa fa-android"></i></a> 
                        <a href="#"> <i class="largeIcon fa fa-digg"></i></a> 
                        <a href="#"><i class="largeIcon fa fa-facebook"></i></a> 
                        <a href="#"><i class="largeIcon fa fa-google-plus"></i></a> 
                        <a href="#"><i class="largeIcon fa fa-twitter"></i></a> 
                        <a href="#"><i class="largeIcon fa fa-jsfiddle"></i></a> 
                        <a href="#"><i class="largeIcon fa fa-html5"></i></a> 
                        <a href="#"><i class="largeIcon fa fa-pagelines"></i></a> 
                        <a href="#"><i class="largeIcon fa fa-linkedin"></i></a> 

                    </div>
                </div>
            </div>
        </div>



        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.js"></script>
    </body>
</html>