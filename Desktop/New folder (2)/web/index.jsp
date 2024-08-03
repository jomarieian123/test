<%--
  Created by IntelliJ IDEA.
  User: wmdcprog
  Date: 7/17/2024
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.tailwindcss.com"></script>
  </head>
  <body>

  <center>
    <h1 class="">
      Log In
    </h1>
    <div class="bord">
    <form action="" method="post">
      <label for="">Username</label>
      <input type="text"><br>
      <label for="">Password</label>
      <input type="text"><br>
      <input type="submit" value="Submit">
    </form>
    </div>
  </center>

  </body>
  <script>
      $(document).ready(function () {
          $.ajax({
              url:'/test',
              type: 'GET',
              dataType:'json',
              success:function (data) {
//                  console.log(data)
//                  console.log(data.last);
//
//                  $('p').text(data.last);
                  }

          })
      })

  </script>
</html>
