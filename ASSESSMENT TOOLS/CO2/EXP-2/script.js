const email = document.getElementById("email");
const phone = document.getElementById("phone");

email.addEventListener("keyup", validateEmail);
phone.addEventListener("keyup", validatePhone);

function validateEmail() {

    let pattern = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;

    if (pattern.test(email.value)) {
        document.getElementById("emailError").innerHTML = "";
    }
    else {
        document.getElementById("emailError").innerHTML = "Invalid Email";
    }

}

function validatePhone() {

    let pattern = /^[0-9]{10}$/;

    if (pattern.test(phone.value)) {
        document.getElementById("phoneError").innerHTML = "";
    }
    else {
        document.getElementById("phoneError").innerHTML = "Phone must contain 10 digits";
    }

}
