<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Login Form</title>
    </head>
    <body>
        <form method="POST" action="j_security_check">
            Username: <input type="text" name="j_username" />
            Password: <input type="password" name="j_password" />
            <br />
            <input type="submit" value="Login" />
            <input type="reset" value="Reset" />
        </form>
    </body>
</html>