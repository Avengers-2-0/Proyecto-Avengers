package Controladores;

import Entidades.Empresa;
import Servicios.EmpresaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("enterprises")
public class EmpresaControladores {
    @Autowired
    EmpresaServicios servicios;

    @GetMapping("/enterprises")
    public List<Empresa> getEmpresas(){
        return servicios.getEmpresas();
    }

    @GetMapping("/enterprises/[id_empresa]")
    public Empresa getEmpresa(@PathVariable("id") Long id_empresa) throws Exception {
        return servicios.getEmpresa(id_empresa);
    }

    @PostMapping("/enterprises/new")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return servicios.createEmpresa(empresa);
    }

    @PutMapping("/enterprises/[id_empresa]")
    public Empresa updateEmpresa(@PathVariable("id_empresa") Long id_empresa, @RequestBody Empresa empresa) throws Exception {
        return servicios.updateEmpresa(id_empresa, empresa);
    }

    @DeleteMapping("/enterprises/[id_empresa]")
    public boolean deleteEmpresa(@PathVariable("id empresa") Long id_empresa) throws Exception {
        return servicios.deleteEmpresa(id_empresa);
    }
}

