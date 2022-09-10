package Controladores;

import Entidades.Empleado;
import Servicios.EmpleadoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Empleados")

public class EmpleadoControladores {
  @Autowired
    EmpleadoServicios servicios;

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return servicios.getEmpleados();
    }

    @GetMapping("/empleado/{id}")
    public Empleado getEmpleado(@PathVariable("id") Long id) throws Exception {
        return servicios.getEmpleado(id);
    }

    @PostMapping("/empleado/new")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return servicios.createEmpleado(empleado);
    }

   @PutMapping("/empleado/{id}")
    public Empleado updateEmpleado(@PathVariable("id") Long id, @RequestBody Empleado empleado) throws Exception{
        return servicios.updateEmpleado(id,empleado);
   }

    @DeleteMapping("/empleado/{id}")
    public boolean deleteEmpleado(@PathVariable("id") Long id) throws Exception{
        return servicios.deleteEmpleado(id);
    }
}
