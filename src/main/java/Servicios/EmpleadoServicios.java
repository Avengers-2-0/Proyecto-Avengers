package Servicios;

import Entidades.Empleado;

import java.util.List;

public interface EmpleadoServicios {
    public List<Empleado> getEmpleados()throws Exception;

    public Empleado getEmpleado(Long id) throws Exception;

    public Empleado createEmpleado(Empleado empleado);

    public Empleado updateEmpleado(Long id, Empleado empleado) throws Exception;

    public boolean deleteEmpleado(Long id) throws Exception;

}
