<!DOCTYPE html>
<html>
  <head>
    <title>WELCOME TO APP</title>
    <style>
      body {
        background-color: gray;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 20px;
      }

      h2 {
        color: white;
        text-align: center;
      }

      form {
        background-color: white;
        padding: 20px;
        border-radius: 5px;
        max-width: 400px;
        margin: 0 auto;
      }

      label {
        display: block;
        margin-bottom: 10px;
        color: gray;
      }

      input[type="text"] {
        width: 100%;
        padding: 8px;
        border-radius: 3px;
        border: 1px solid lightgray;
      }

      input[type="submit"] {
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 3px;
        background-color: #4caf50;
        color: white;
        cursor: pointer;
      }

      input[type="submit"]:hover {
        background-color: #45a049;
      }
    </style>
  </head>
  <body>
    <h2>WELCOME TO REGISTER FORM</h2>
    <form action="register" method="POST">
      <label for="empId">ID:</label>
      <input type="text" name="empId" id="empId" required />

      <label for="empName">NAME:</label>
      <input type="text" name="empName" id="empName" required />

      <label for="empcity">City:</label>
      <input type="text" name="empcity" id="empcity" required />

      <input type="submit" value="Submit" />
    </form>
  </body>
</html>
