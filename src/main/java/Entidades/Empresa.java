package Entidades;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Empresa")

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nit")
    private String nit;
    @Column(name = "nombre", unique = true)
    private String nombre;
    @Column(name = "dirección")
    private String direccion;
    @Column(name = "telefono")
    private long telefono;

    private Date createAt;

    private Date updateAt;


//    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
//    private ArrayList<Empleado> empleados;

    //    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
//    private ArrayList<MovimientoDinero>movimientoDineros;
    public Empresa() {
    }

    public Empresa(String nit, String nombre, String direccion, long telefono) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}

