<%@ page import="com.jagat.Encryption.AESEncryption" %>
<%@ page import="com.jagat.Encryption.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>

    <form action="register" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" required/>

        <label for="password">Password:</label>
        <input type="password" name="encryptedpassword" id="encryptedpassword" required/>

        <input type="submit" value="Submit"/>
    </form>

</body>
</html>
