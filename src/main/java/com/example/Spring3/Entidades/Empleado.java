package com.example.Spring3.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombreEmpleado",unique = true)
    private String nombreEmpleado;
    @Column(name = "correoEmpleado",unique = true)
    private String correoEmpleado;
    @Column(name = "rolempleado")
    private String  rolEmpleado;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    public Empresa empresa;

    public Empleado(){}

    public Empleado(String nombreEmpleado, String correoEmpleado, String rolEmpleado, Empresa empresa) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.empresa = empresa;
    }

    public String getNombreEmpleado() {

        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public long getId() {
        return id;}
    public void setId(long id) {
        this.id = id;}
}