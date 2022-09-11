package com.example.Spring3.Servicios;

import com.example.Spring3.Entidades.Empleado;

import java.util.List;

public interface EmpleadoServicios {
    List<Empleado> getEmpleados()throws Exception;

    Empleado getEmpleado(Long id) throws Exception;

    Empleado createEmpleado(Empleado empleado);

    Empleado updateEmpleado(Long id, Empleado empleado) throws Exception;

    boolean deleteEmpleado(Long id) throws Exception;

}
