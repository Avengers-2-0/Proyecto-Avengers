package Entidades;


import javax.persistence.*;


@Entity
@Table(name = "Enterprises")

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa", nullable = false)
    private Long id_empresa;
    @Column(name = "nombre", unique = true)
    private String nombre;
    @Column(name = "dirección")
    private String direccion;
    @Column(name = "telefono")
    private long telefono;

    @Column(name = "nit")
    private String nit;


    public Empresa() {
    }

    public Empresa(Long id_empresa, String nombre, String direccion, long telefono, String nit) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}