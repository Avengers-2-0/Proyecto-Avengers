package com.example.Spring3;

public class Empleado {
    private final Empresa Empresa;
    public String nombreEmpleado;
    public String correoEmpleado;
    public Empresa empresa;
    public String rolEmpleado;


    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa empresa, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        Empresa = empresa;
        this.rolEmpleado = rolEmpleado;
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

    public src.main.java.com.example.Spring3.Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(src.main.java.com.example.Spring3.Empresa empresa) {
        Empresa = empresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
