function findall(){
    var x = document.querySelectorAll(".celsiusright")
    console.log(x)
}
// this is function is example
function alertme(el) {
    // var x=document.querySelector('.country')
    // console.log(el.innerText)
    alert('Loading weather report' + "  " + el.innerText);
}

// var window=document.getElementsByClassName(cookies)
function removewindow() {
    var window = document.querySelector('.cookies')
    window.remove();

}

function convertfahrenhiet(n) {
    var f = document.querySelectorAll('.celsius , .celsiusright ')
    f = ((n * 9.0 / 5.0) + 32.0);


}