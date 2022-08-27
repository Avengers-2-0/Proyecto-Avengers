package Spring2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Empleado {
    public String nombreEmpleado;
    public String correoEmpleado;
    public Empresa Empresa;
    public String rolEmpleado;

    //String [] rolEmpleado = new String[] {"Administrador","Operativo"};


    public Empleado(String nombreEmpleado, String correoEmpleado, Spring2.Empresa empresa, String rolEmpleado) {
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

    public Spring2.Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(Spring2.Empresa empresa) {
        Empresa = empresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
