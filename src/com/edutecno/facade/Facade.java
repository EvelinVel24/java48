package com.edutecno.facade;

import com.edutecno.dao.InscripcionDAO;
import com.edutecno.dto.InscripcionDTO;
import java.util.List;

public class Facade {

    private InscripcionDAO inscripcionDAO = new InscripcionDAO();

    public List<InscripcionDTO> obtieneInscripciones() {
        return inscripcionDAO.obtieneInscripciones();
    }
}
