<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Design by foolishdeveloper.com -->
    <title>Update Form</title>
 
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            margin: 0;
            padding: 0;
        }

        .background {
            position: absolute;
            top: 0;
            left: 0;
            height: 100vh;
            width: 100vw;
            background: linear-gradient(135deg, #ff70a6, #ff9770);
            overflow: hidden;
        }

        .shape {
            position: absolute;
            height: 100px;
            width: 100px;
            background: rgba(255, 255, 255, 0.2);
            border-radius: 50%;
            opacity: 0.5;
            pointer-events: none;
        }

        .shape:nth-child(1) {
            top: 20%;
            left: 10%;
            animation: animate 20s linear infinite;
        }

        .shape:nth-child(2) {
            top: 50%;
            left: 30%;
            animation: animate 15s linear infinite;
        }

        @keyframes animate {
            0% {
                transform: translateX(0) translateY(0);
                opacity: 0.5;
                border-radius: 50%;
            }

            100% {
                transform: translateX(400px) translateY(500px);
                opacity: 0;
                border-radius: 20%;
            }
        }

        form {
            position: relative;
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: white;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            margin-top: 100px;
        }

        h3 {
            margin-bottom: 20px;
            color: #333333;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #555555;
            font-weight: 500;
            text-align: left;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #cccccc;
            border-radius: 3px;
            margin-bottom: 20px;
            font-size: 14px;
        }

        button[type="submit"] {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 3px;
            background-color: #ff70a6;
            color: white;
            cursor: pointer;
            font-size: 14px;
            transition: background-color 0.3s ease;
        }

        button[type="submit"]:hover {
            background-color: #ff4d8c;
        }
    </style>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form method="POST" action="/register">
         <h3>Update Here</h3>

        <label for="Id">ID:</label>
        <input type="text" name="empId" placeholder="ID" value="${emp.empId}" id="userId">

        <label for="name">Name:</label>
        <input type="text" name="empName" value="${emp.empName}" placeholder="Name" id="name">
        
        <label for="text">City:</label>
        <input type="text" name="empcity" value="${emp.empcity}" placeholder="City" id="city">
		
        <button type="submit">Update</button>
        <input type="hidden" name="empId" value="${emp.empId}">
       
    </form>
</body>
</html>
