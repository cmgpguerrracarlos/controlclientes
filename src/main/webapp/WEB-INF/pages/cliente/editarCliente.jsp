
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Editar cliente</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/pages/parts/header.jsp" />

        <form action="${pageContext.request.contextPath}/ServletController?accion=editar&idCliente=${cliente.idCliente}" method="POST" class="was-validated">
            <jsp:include page="/WEB-INF/pages/parts/botonesNavEdicion.jsp" />

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Cliente</h4>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" value="${cliente.nombre}" required />
                                    </div>
                                    <div class="form-group">
                                        <label for="apellido">Apellido</label>
                                        <input type="text" class="form-control" name="apellido" value="${cliente.apellido}" required />
                                    </div>
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input type="email" class="form-control" name="email" value="${cliente.email}"required />
                                    </div>
                                    <div class="form-group">   
                                        <label for="telefono">Telefono</label>
                                        <input type="tel" class="form-control" name="telefono" value="${cliente.telefono}" required />
                                    </div>
                                    <div class="form-group">    
                                        <label for="saldo">Saldo</label>
                                        <input type="number" class="form-control" name="saldo" value="${cliente.saldo}" step="any" required />
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>


        </form>

        <jsp:include page="/WEB-INF/pages/parts/footer.jsp"/>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

        <script src="https://kit.fontawesome.com/9b2bfdfb60.js" crossorigin="anonymous"></script>
    </body>
</html>
