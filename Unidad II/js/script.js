function saludo(){
    window.alert('Hola!')
}
function cambio(nro){
    if(revisaPar(nro)){
        window.alert('Hola, el '+nro+' es par')
    }
    else{
        window.alert('Hola, el '+nro+' es impar')
    }
}

function revisaPar(nro){
    if (nro % 2 == 0){
        return true
    }
    else{
        return false
    }
}
function pulsar(){
    window.alert('Evento onClick')
}

function foco(){
    window.alert('Evento onFocus')
}

function tecla(){
    window.alert('Evento onKeyPress')
}