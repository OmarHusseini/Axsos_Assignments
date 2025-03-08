function alertme() {
    alert('This page says Ninga was like');
}

function removebutton(button) {
    button.remove();
}

function togolog() {
    if (button.innertext === "Loginbutton") {
        button.classname = "logout-button";
        button.innertext = "Logout";
    }
    else {
        button.classname = "Loginbutton";
        button.innertext = "login";
    }


}