<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>    
<!DOCTYPE html>    
<html lang="pl">    
    <head>
        <title>Zastępstwa::<t:insertAttribute name="title" ignore="true" /></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>    
<body>
    <div class="jumbotron text-center" style="margin-bottom:0; padding: 0;">
        <t:insertAttribute name="header" />
    </div>
    <div class="container" style="margin-top: 30px;">
        <div class="row">
            <div class="col-xl-2">
                <t:insertAttribute name="menu" />
                <hr class="d-xl-none">
            </div>
            <div class="col-xl-10">
                <t:insertAttribute name="body" />
            </div>
        </div>
    </div>
    <div class="jumbotron text-center" style="margin-bottom:0; padding: 0;">
        <t:insertAttribute name="footer" />  
    </div>
</body>    
</html>    