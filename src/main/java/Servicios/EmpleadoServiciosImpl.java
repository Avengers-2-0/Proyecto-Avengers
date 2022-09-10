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
        return this.empleadoRepositorio.findAll();
    }

    @Override
    public Empleado getEmpleado(Long id) throws Exception {
        Optional<Empleado> empresa = this.empleadoRepositorio.findById(id);
        return empresa.orElse(null);
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {

        return this.empleadoRepositorio.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Long id, Empleado empleado) throws Exception {

        Optional<Empleado> dbEmpleado = this.empleadoRepositorio.findById(id);
        if (dbEmpleado.isPresent()) {
            Empleado empleado1=dbEmpleado.get();
            empleado1.setNombreEmpleado(empleado1.getNombreEmpleado());
            empleado1.setCorreoEmpleado(empleado1.getCorreoEmpleado());
            empleado1.setRolEmpleado(empleado1.getRolEmpleado());
            empleado1.setEmpresa(empleado1.getEmpresa());
            this.empleadoRepositorio.save(empleado1);
            return empleado1;

        }
        return null;
    }

    @Override
    public boolean deleteEmpleado(Long id) throws Exception {
        try {
            this.empleadoRepositorio.deleteById(id);
            return true;
        } catch (Exception empleado1) {
            return false;
        }
    }
}
