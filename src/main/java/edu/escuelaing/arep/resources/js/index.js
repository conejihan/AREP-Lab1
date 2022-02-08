import { api } from './api.js';
const num = document.getElementById("num");
const select = document.getElementById("select")
const button = document.getElementById("button")
const resultado = document.getElementById("resultado")

function fToc () {
    api.fToc(num.value).then(res => {
        const {temp} = res;
        updateInput("celsius", temp);
    });
}

function updateInput(grade, temp) {
    resultado.value = temp;
}

function cTof () {
    api.cTof(num.value).then(res => {
        const {temp} = res;
        updateInput("fahrenheit", temp);
    });
}

function selected() {
    if(select.options[select.selectedIndex].value == 1) {
        cTof();
    }else {
        fToc ();
    }
    listener();
}

function listener(){
    button.addEventListener("click", selected);
}