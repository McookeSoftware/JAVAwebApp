<%-- 
    Document   : index
    Created on : 03-Apr-2019, 16:29:37
    Author     : matthew cooke
--%>
<%-- 
  JSP is a server-side programming technology that enables the creation of dynamic, 
 platform-independent method for building Web-based applications.
--%>
<page contentType="text/html" pageEncoding="UTF-8"/>

<taglib prefix="f" uri="http://java.sun.com/jsf/core"/>
<taglib prefix="h" uri="http://java.sun.com/jsf/html"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>

<html>
    <head>
        <title>Login form</title>
        <link rel="stylesheet" href="CSSsheet.css" type="text/css"/>
    </head>
    <body>
    <style>
          body{
    
      background-image: url('images/beach.jpg');
      background-size: 100%;
      
  }
    </style>
         <center>
            <img src="images/Logo.gif" width="210" height="210" title="chakra" />
        </center>
        <form method="post"  action="MySQLConnect">        
        Username <input type="text" name="user" /><br/><br/>
        Password <input type="password" name="pass" /><br/><br/>
        <input type="submit" value="Submit"  />
        </form>
    <%-- 
From created so the user can enter password and username this connects to the MySqlConnect class
--%>
    </body>
</f:view>
</html>
