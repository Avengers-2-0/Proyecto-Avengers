package com.example.Spring3;

public class Empleado {
    public String nombreEmpleado;
    public String correoEmpleado;
    public src.main.java.com.example.Spring3.Empresa Empresa;
    public String rolEmpleado;

    //String [] rolEmpleado = new String[] {"Administrador","Operativo"};


    public Empleado(String nombreEmpleado, String correoEmpleado, src.main.java.com.example.Spring3.Empresa empresa, String rolEmpleado) {
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
