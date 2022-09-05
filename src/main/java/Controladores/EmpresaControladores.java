package Controladores;

import Entidades.Empresa;
import Servicios.EmpresaServicios;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaControladores {
    private EmpresaServicios servicios;

    public EmpresaControladores(EmpresaServicios servicios) {
        this.servicios = servicios;
    }
    @GetMapping("/empresas")
    public List<Empresa> getEmpresa() throws Exception {
        return this.servicios.getEmpresas();
    }

    @GetMapping("/empresa/{id}")
    public Empresa getEmpresa(@PathVariable("id") Long id) throws Exception {
        return this.servicios.getEmpresa(id);
    }

    @PostMapping("/empresa/new")
    public Empresa createEnterprise(@RequestBody Empresa empresa){
        return this.servicios.createEmpresa(empresa);
    }

    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable("id") Long id, @RequestBody Empresa empresa) throws Exception {
        return this.servicios.updateEmpresa(id, empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public boolean deleteEmpresa(@PathVariable("id") Long id) throws Exception {
        return this.servicios.deleteEmpresa(id);
    }
}

