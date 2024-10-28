
package com.edutecno.servlet;

import com.edutecno.facade.Facade;
import com.edutecno.dto.InscripcionDTO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listarInscripciones")
public class PreListarInscripciones extends HttpServlet {
    private Facade facade = new Facade();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<InscripcionDTO> inscripciones = facade.obtieneInscripciones();
        request.setAttribute("inscripciones", inscripciones);
        request.getRequestDispatcher("ListaInscripciones.jsp").forward(request, response);
    }
}
