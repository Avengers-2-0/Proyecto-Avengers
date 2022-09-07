package Controladores;

import Entidades.Empresa;
import Servicios.EmpresaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("empresas")
public class EmpresaControladores {
    @Autowired
    EmpresaServicios servicios;

    @GetMapping("/empresas")
    public List<Empresa> getEmpresas(){
        return servicios.getEmpresas();
    }

    @GetMapping("/empresa/{id}")
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
}

