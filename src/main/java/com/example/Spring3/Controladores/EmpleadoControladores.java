package com.example.Spring3.Controladores;

import com.example.Spring3.Entidades.Empleado;
import com.example.Spring3.Servicios.EmpleadoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoControladores {
  @Autowired
    EmpleadoServicios empleadoServicios;
    public EmpleadoControladores(EmpleadoServicios empleadoServicios){
        this.empleadoServicios = empleadoServicios;}

    @GetMapping("/users")
    public List<Empleado> getEmpleados() throws Exception {
        return empleadoServicios.getEmpleados();
    }

    @GetMapping("/user/{id}")
    public Empleado getEmpleado(@PathVariable("id") Long id) throws Exception {
        return empleadoServicios.getEmpleado(id);
    }

    @PostMapping("/users")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return empleadoServicios.createEmpleado(empleado);
    }

   @PatchMapping("/user/{id}")
    public Empleado updateEmpleado(@PathVariable("id") Long id, @RequestBody Empleado empleado) throws Exception{
        return empleadoServicios.updateEmpleado(id,empleado);
   }

    @DeleteMapping("/user/{id}")
    public boolean deleteEmpleado(@PathVariable("id") Long id) throws Exception{
        return empleadoServicios.deleteEmpleado(id);
    }
}
