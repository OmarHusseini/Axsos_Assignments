function alertme() {
    alert('This page says Ninga was like');
}

function removebutton(button) {
    button.remove();
}

function togolog(el) {
    if (el.value === "Login") {
        el.value = "Logout";
    }
    else {
        el.value = "Login"
    }


}