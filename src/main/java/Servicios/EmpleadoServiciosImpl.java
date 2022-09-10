package Servicios;

import Entidades.Empleado;
import Repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadoServiciosImpl implements EmpleadoServicios {
    @Autowired
    EmpleadoRepositorio empleadoRepositorio;
    @Override
    public List<Empleado> getEmpleados() throws Exception{
        return null;
    }

    @Override
    public Empleado getEmpleado(Long id) throws Exception {
        return null;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        return null;
    }

    @Override
    public Empleado updateEmpleado(Long id, Empleado empleado) throws Exception {
        return null;
    }

    @Override
    public boolean deleteEmpleado(Long id) throws Exception {
        return false;
    }
}
