package Controladores;

import Entidades.Empleado;
import Servicios.EmpleadoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Users")

public class EmpleadoControladores {
  @Autowired
    EmpleadoServicios servicios;

    @GetMapping("/Users")
    public List<Empleado> getEmpleados() throws Exception {
        return servicios.getEmpleados();
    }

    @GetMapping("/Users/{id}")
    public Empleado getEmpleado(@PathVariable("id") Long id) throws Exception {
        return servicios.getEmpleado(id);
    }

    @PostMapping("/Users/new")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return servicios.createEmpleado(empleado);
    }

   @PutMapping("/Users/{id}")
    public Empleado updateEmpleado(@PathVariable("id") Long id, @RequestBody Empleado empleado) throws Exception{
        return servicios.updateEmpleado(id,empleado);
   }

    @DeleteMapping("/Users/{id}")
    public boolean deleteEmpleado(@PathVariable("id") Long id) throws Exception{
        return servicios.deleteEmpleado(id);
    }
}
