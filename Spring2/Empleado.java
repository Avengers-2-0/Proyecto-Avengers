package Spring2;

import java.lang.reflect.Array;
import java.util.*;

public class Empleado {
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;

    String [] rolEmpleado = new String[] {"Administrador","Operario"};


    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;

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

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }
}
