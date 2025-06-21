function operacion() {
    // extraccion de valores
    const caja1 = document.getElementById("caja1");
    const caja2 = document.getElementById("caja2");
    const operacion = document.querySelector('input[name="opcion"]:checked');

    // Comprobacion de valores
    if (caja1.value === "" || caja2.value === "" || !operacion) {
        window.alert("Por favor, completa todos los campos.");
        return;
    }

    // Comprobacion de valores numericos
    if (isNaN(caja1.value) || isNaN(caja2.value)) {
        window.alert("Por favor, ingresa valores numéricos válidos.");
        return;
    }
    
    // Comprobacion de valores numericos para division
    if (operacion.value === "divi" && caja2.value == 0 && caja2.value == "0") {
        window.alert("No se puede dividir por cero.");
        return;
    }

    // Operaciones
    let resultadoOperacion;
    switch (operacion.value) {
        case "sum":
            resultadoOperacion = parseFloat(caja1.value) + parseFloat(caja2.value);
            break;
        case "dif":
            resultadoOperacion = parseFloat(caja1.value) - parseFloat(caja2.value);
            break;
        case "mult":
            resultadoOperacion = parseFloat(caja1.value) * parseFloat(caja2.value);
            break;
        case "divi":
            resultadoOperacion = parseFloat(caja1.value) / parseFloat(caja2.value);
            break;
        default:
            window.alert("Operación no válida.");
            return;
        }

    // Mostrar resultado
    const resultado = document.getElementById("resultado");
    resultado.value = resultadoOperacion;
}