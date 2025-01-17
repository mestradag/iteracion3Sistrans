package uniandes.edu.co.proyecto.modelo;

import org.springframework.data.annotation.Id;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="usuarios")
public class Usuario {
    
    @Id
    private String idusuario;

    private String nombre;
    private String correo;
    private String rol;
    private List<Reserva> reservas;

    private String nombrehotel;


    public Usuario(){;}

    public Usuario(String nombre, String correo, String rol, List<Reserva> reservas, String nombrehotel){
        this.nombre=nombre;
        this.correo=correo; 
        this.rol=rol;
        this.reservas=reservas;
        this.nombrehotel=nombrehotel; 
    }

    public String getIdusuario() {
        return idusuario;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombrehotel() {
        return nombrehotel;
    }

    public void setNombrehotel(String nombrehotel) {
        this.nombrehotel = nombrehotel;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idusuario=" + idusuario +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", rol=" + rol +
                ", nombrehotel=" + nombrehotel +
                '}';
    }

    
}

