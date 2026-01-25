<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DevOps Final Project</title>
    <style>
        body { font-family: sans-serif; text-align: center; margin-top: 50px; background-color: #f4f4f4; }
        .container { background: white; padding: 30px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); display: inline-block; }
        input[type="text"] { padding: 10px; font-size: 16px; border: 1px solid #ddd; border-radius: 4px; }
        button { padding: 10px 20px; font-size: 16px; background-color: #007bff; color: white; border: none; border-radius: 4px; cursor: pointer; }
        button:hover { background-color: #0056b3; }
        a { display: block; margin-top: 20px; color: #333; text-decoration: underline; }
    </style>
</head>
<body>
    <div class="container">
        <h1>DevOps Project - HIT - 2026</h1>
        <h3>Submitted by: Shirel Ashtamker & Miriam Ben David</h3>

        <form action="index.jsp" method="get">
            <label for="username">Enter your name:</label><br><br>
            <input type="text" id="username" name="username" placeholder="Type here...">
            <br><br>

            <button type="submit">Send Greeting</button>
        </form>

        <a href="https://www.hit.ac.il" target="_blank">Go to HIT Website</a>

        <hr>

        <%
            // Java Code Area
            String name = request.getParameter("username");
            if (name != null && !name.isEmpty()) {
        %>
            <h2 style="color: green;">Hello, <%= name %>!</h2>
            <p>Welcome to our DevOps automated site.</p>
        <%
            }
        %>
    </div>
</body>
</html>