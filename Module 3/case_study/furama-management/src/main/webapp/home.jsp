<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
<html>
<head>
    <title></title>
    <style>
        .container div {
            margin: 10px;
            padding: 10px;
            background: #fbfcfc;
        }
    </style>
</head>
<body>
<div class="container-fluid bg-secondary">
    <div class="d-flex">
        <div class="bg-secondary p-1 m-1"><img src="static/image/logo.jpg" class="rounded" width="75px" height="75px">
        </div>
        <div class="bg-secondary p-1 m-1 ml-auto">Đặng Duy Linh</div>
    </div>
</div>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Employee</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Customer</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Service</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contract</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>

<div class="container-fluid" >
    <div class="body">
        <div class="col-2"></div>
        <a>Item One</a><br>
        <a>Item Two</a><br>
        <a>Item three</a>
        <div class="col-10"></div>
    </div>
</div>
    <script src="/static/jquery/jquery-3.5.1.min.js"></script>
</body>
</html>
