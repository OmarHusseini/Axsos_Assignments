
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

function convert_tempreture() {
    var tr = document.querySelectorAll(".temp_right")
    var tl = document.querySelectorAll(".temp_left")
    var select = document.querySelector("#type_temp")
    // console.log(tl); 
    /* Here tr is sympolizes of temp_right clg of(tr) not innertext */

    for (var i = 0; i < tr.length; i++) {
        if (select.value === "c") {
            var result = ((tr[i].innerText) - 32) * (5 / 9)
            console.log(tr[i].innerText);
            tr[i].innerText = Math.trunc(result)

        }
        else {
            var result = ((tr[i].innerText) * (9 / 5)) + 32
            console.log(tr[i].innerText);
            tr[i].innerText = Math.trunc(result)



        }
    }

    for (var i = 0; i < tl.length; i++) {
        if (select.value == "c") {
            var result = ((tl[i].innerText) - 32) * (5 / 9)
            console.log(tl[i].innerText);
            tl[i].innerText = Math.trunc(result)

        }
        else {
            var result = ((tl[i].innerText) * (9 / 5)) + 32
            console.log(tr[i].innerText);
            tl[i].innerText = Math.trunc(result)


        }
    }


}
