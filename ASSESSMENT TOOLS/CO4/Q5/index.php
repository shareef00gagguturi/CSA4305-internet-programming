<!DOCTYPE html>
<html>
<body>

<h2>Registration Form</h2>

<form method="post">

    Name:
    <input type="text" name="name">
    <br><br>

    Email:
    <input type="text" name="email">
    <br><br>

    Password:
    <input type="password" name="password">
    <br><br>

    <button type="submit">Register</button>

</form>

<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $name = trim($_POST["name"]);
    $email = trim($_POST["email"]);
    $password = $_POST["password"];

    $errors = [];

    if (empty($name)) {
        $errors[] = "Name is required";
    }

    if (empty($email)) {
        $errors[] = "Email is required";
    } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $errors[] = "Invalid email";
    }

    if (empty($password)) {
        $errors[] = "Password is required";
    } elseif (strlen($password) < 6) {
        $errors[] = "Password must contain at least 6 characters";
    }

    if (count($errors) > 0) {

        foreach ($errors as $error) {
            echo "<p style='color:red;'>$error</p>";
        }

    } else {

        echo "<p style='color:green;'>
                Registration Successful
              </p>";
    }
}

?>

</body>
</html>
