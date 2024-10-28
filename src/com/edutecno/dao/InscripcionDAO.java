package com.edutecno.dao;

import com.edutecno.dto.InscripcionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InscripcionDAO {

    public List<InscripcionDTO> obtieneInscripciones() {
        List<InscripcionDTO> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripciones";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                InscripcionDTO inscripcion = new InscripcionDTO();
                inscripcion.setId(rs.getInt("id"));
                inscripcion.setCurso(rs.getString("curso"));
                inscripcion.setTipoPago(rs.getString("tipo_pago"));
                inscripciones.add(inscripcion);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return inscripciones;
    }
}
