package com.eys.foro_alura.domain.respuesta.validaciones.actualizar;

import com.eys.foro_alura.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}
