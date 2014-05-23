<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dazzler Login Portal</title>
<link type="text/css" rel="stylesheet" href="css/bootstrap.css" />

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
                <img src="img/img1.jpg"/>
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Payroll Slider</h1>
                        <p>This is my first Application</p>
                        <p><a class="btn btn-primary">SignUp</a></p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="img/img2.jpg"/>
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Payroll Slider</h1>
                        <p>This is my first Application</p>
                        <p><a class="btn btn-primary">SignUp</a></p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="img/img3.jpg"/>
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Payroll Slider</h1>
                        <p>This is my first Application</p>
                        <p><a class="btn btn-primary">SignUp</a></p>
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
    
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>