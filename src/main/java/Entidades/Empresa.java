package Entidades;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Empresa", uniqueConstraints = {
        @UniqueConstraint(name = "uc_empresa_telefonoempresa", columnNames = {"telefonoEmpresa"})
})
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nombreEmpresa")
    private String nombreEmpresa;

    @Column(name = "direcciónEmpresa")
    public String direccionEmpresa;
    @Column(name = "telefonoEmpresa")
    public long telefonoEmpresa;

    @Column(name = "nitEmpresa")
    public String nitEmpresa;

    public Empresa() {
    }


    public Empresa(String nombreEmpresa, String direccionEmpresa, long telefonoEmpresa, String nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public long getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(long telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public Long getId() {
        return id;
    }


}
