package Controladores;

import Entidades.Empresa;
import Entidades.MovimientoDinero;
import Servicios.EmpresaServicios;
import Servicios.MovimientoDineroServicios;

import java.util.List;

@RestController
@RequestMapping("movimientos")
public class MovimientoDineroControladores {
    @Autowired
    MovimientoDineroServicios mdServicios;

    @GetMapping("/movimientos")
    public List<MovimientoDinero> getMovimiento(){
        return mdServicios.getMoviemientos();
    }

/*    @GetMapping("/empresa/{id}")
    public Empresa getEmpresa(@PathVariable("id") Long id) throws Exception {
        return servicios.getEmpresa(id);
    }

    @PostMapping("/empresa/new")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return servicios.createEmpresa(empresa);
    }

    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable("id") Long id, @RequestBody Empresa empresa) throws Exception {
        return servicios.updateEmpresa(id, empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public boolean deleteEmpresa(@PathVariable("id") Long id) throws Exception {
        return servicios.deleteEmpresa(id);
    }
*/}
