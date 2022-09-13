package com.example.Spring3.Servicios;

import com.example.Spring3.Entidades.Empleado;
import com.example.Spring3.Repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        this.empleadoRepositorio.findById(id).get();
        return this.empleadoRepositorio.save(empleado);


        }

    @Override
    public boolean deleteEmpleado(Long id) throws Exception {
        try {
            this.empleadoRepositorio.deleteById(id);
            return true;
        } catch (Exception empleado) {
            return false;
        }
    }
}
