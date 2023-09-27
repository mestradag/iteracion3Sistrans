package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios")
public abstract class Servicio {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer costoTotal;
    private Integer capacidad;
    
    @ManyToOne
    @JoinColumn(name="cuentas_C",referencedColumnName = "id")
    private CuentaConsumo cuentaC;

    @ManyToOne
    @JoinColumn(name="planes_c",referencedColumnName = "id")
    private PlanConsumo planC;

    @ManyToOne
    @JoinColumn(name="hoteles",referencedColumnName = "id")
    private Hotel hotel;

    public Servicio(){
    ;
    }
    
    public Servicio(Integer costoTotal, Integer capacidad, CuentaConsumo cuentaC ,PlanConsumo planC,Hotel hotel ){
        this.costoTotal=costoTotal;
        this.capacidad=capacidad;
        this.cuentaC=cuentaC;
        this.planC=planC;
        this.hotel=hotel;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public CuentaConsumo getCuentaC() {
        return cuentaC;
    }

    public void setCuentaC(CuentaConsumo cuentaC) {
        this.cuentaC = cuentaC;
    }

    public PlanConsumo getPlanC() {
        return planC;
    }

    public void setPlanC(PlanConsumo planC) {
        this.planC = planC;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    

}
