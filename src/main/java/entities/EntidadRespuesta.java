package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class EntidadRespuesta {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "Respuesta")


    public class Respuesta{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        Long id;
        Long idPregunta;
        Long idUsuario;

private Integer votos;

private Boolean alerta;

private String respuesta;

        public Respuesta(Integer votos, Boolean alerta, String respuesta) {
            this.votos = votos;
            this.alerta = alerta;
            this.respuesta = respuesta;
        }
    }


}
