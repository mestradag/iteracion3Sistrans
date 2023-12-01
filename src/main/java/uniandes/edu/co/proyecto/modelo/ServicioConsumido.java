package uniandes.edu.co.proyecto.modelo;

import java.security.Timestamp;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios_consumidos")
public class ServicioConsumido {

    private Timestamp fechaReserva;
    private Integer idServicio;


    public ServicioConsumido(){
    ;
    }
    
    public ServicioConsumido(Timestamp fechaReserva, Integer idServicio){
        this.fechaReserva=fechaReserva;
        this.idServicio=idServicio;
       

    }

    public Timestamp getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Timestamp fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }


}