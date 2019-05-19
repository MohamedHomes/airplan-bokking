<%-- 
    Document   : Home
    Created on : Apr 30, 2019, 1:47:48 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
  <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style_1.css" media="screen" type="text/css" />
    </head>
    <body>
  <div class="wrap">
		<div class="avatar">
                    <img src="images/w.jpg">
		</div>
      <form method="post" action="log">
      <input type="text" name="email" placeholder="EMAIL" required>
		<div class="bar">
			<i></i>
		</div>
      <input type="password"  name="pass" placeholder="password" required>
		<a href="" class="forgot_link">forgot ?</a>
		<button>Sign in</button>
	</div>
    </form>
    <script src="js/index.js"></script>
  </body>
</html>