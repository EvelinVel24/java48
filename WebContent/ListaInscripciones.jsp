<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Inscripciones</title>
</head>
<body>
    <h1>Lista de Inscripciones</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Curso</th>
                <th>Tipo de Pago</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="inscripcion" items="${inscripciones}">
                <tr>
                    <td>${inscripcion.id}</td>
                    <td>${inscripcion.curso}</td>
                    <td>${inscripcion.tipoPago}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
