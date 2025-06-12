<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Formularios</title>
      <link rel="stylesheet" href="css/style2.css">
</head>
<body>
  <center>
    <font face="Cooper" color="#2E4053" size="24">Uso de Formularios</font><br><br>
    <font face="Calibri" color="#2E4053" size="4">

    <fieldset>
      <legend>Formulario Básico</legend>
      <form action="http://www.inacap.cl">
        <table border="1">
          <tr><th>Control</th><th>Objeto</th></tr>
          <tr><td>Caja de Texto</td><td><input type="text" name="caja1" placeholder="Escribe tu RUT"></td></tr>
          <tr><td>Caja de Contraseña</td><td><input type="password" name="pass1"></td></tr>
          <tr>
            <td>Botones de Chequeo</td>
            <td>
              <input type="checkbox" name="check1" value="Op1">Opción 1<br>
              <input type="checkbox" name="check2" value="Op2" checked>Opción 2<br>
              <input type="checkbox" name="check3" value="Op3">Opción 3
            </td>
          </tr>
          <tr>
            <td>Botones de Radio</td>
            <td>
              <input type="radio" name="radio1" value="jd" checked>Jornada Diurna<br>
              <input type="radio" name="radio1" value="jv">Jornada Vespertina
            </td>
          </tr>
          <tr><td>Botón de Envío</td><td><input type="submit" name="enviar" value="Enviar Formulario"></td></tr>
          <tr><td>Botón de Limpieza</td><td><input type="reset" name="limpia" value="Limpiar Formulario"></td></tr>
          <tr><td>Botón de Imagen</td><td><input type="image" name="boton2" src="imagenes/14100911.png" width="90px" height="36px"></td></tr>
          <tr><td>Adjuntar Archivos</td><td><input type="file" name="adjuntar"></td></tr>
        </table>
      </form>
    </fieldset>


    <fieldset>
      <legend>Formulario Avanzado</legend>
      <table border="1">
        <tr><th>Control</th><th>Objeto</th></tr>
        <tr>
          <td>Área de Texto</td>
          <td>
            <label for="descripcion">Descripción</label><br>
            <textarea id="textar" name="desc" cols="50" rows="5"></textarea>
          </td>
        </tr>
        <tr>
          <td>Select con Combo</td>
          <td>
            <select>
              <option selected>Selecciona Marca</option>
              <option>Nissan</option>
              <option>Chevrolet</option>
              <option>Ford</option>
              <option>Kia</option>
              <option>Mazda</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Select con Tamaño</td>
          <td>
            <select size="6">
              <option selected>Selecciona Marca</option>
              <option>Nissan</option>
              <option>Chevrolet</option>
              <option>Ford</option>
              <option>Kia</option>
              <option>Mazda</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Select Múltiple</td>
          <td>
            <select size="6" multiple>
              <option selected>Selecciona Marca</option>
              <option>Nissan</option>
              <option>Chevrolet</option>
              <option>Ford</option>
              <option>Kia</option>
              <option>Mazda</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Select con Grupos</td>
          <td>
            <select>
              <optgroup label="Marcas de Vehículos">
                <option>Nissan</option>
                <option>Chevrolet</option>
                <option>Ford</option>
                <option>Kia</option>
                <option>Mazda</option>
              </optgroup>
              <optgroup label="Instrumentos Musicales">
                <option>Jackson</option>
                <option>Fender</option>
                <option>Gibson</option>
                <option>Tama</option>
                <option>Rickenbacker</option>
              </optgroup>
            </select>
          </td>
        </tr>
      </table>
    </fieldset>

    <fieldset>
      <legend>Formulario Etiquetas HTML5</legend>
      <form>
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre" placeholder="Tu nombre" required><br><br>

        <label for="email">Correo electrónico:</label><br>
        <input type="email" id="email" name="email" placeholder="correo@ejemplo.com" required><br><br>

        <label for="fecha">Fecha de nacimiento:</label><br>
        <input type="date" id="fecha" name="fecha"><br><br>

        <label for="numero">Número favorito:</label><br>
        <input type="number" id="numero" name="numero" min="1" max="100"><br><br>

        <label for="color">Color favorito:</label><br>
        <input type="color" id="color" name="color"><br><br>

        <input type="submit" value="Enviar">
      </form>
    </fieldset>

    </font>
  </center>
</body>
</html>


body {
  background-color: olive;
  font-family: Arial, sans-serif;
}

fieldset {
  margin: 20px auto;
  width: 80%;
  padding: 20px;
  border: 2px solid #2E4053;
}

legend {
  font-weight: bold;
  color: #2E4053;
  font-family: Calibri, sans-serif;
}

table {
  width: 100%;
  border-collapse: collapse;
  text-align: left;
}

th, td {
  padding: 10px;
  border: 1px solid #999;
}

input[type="submit"],
input[type="reset"] {
  background-color: #2E4053;
  color: white;
  padding: 6px 12px;
  border: none;
  cursor: pointer;
}

input[type="submit"]:hover,
input[type="reset"]:hover {
  background-color: #1c2b3a;
}












