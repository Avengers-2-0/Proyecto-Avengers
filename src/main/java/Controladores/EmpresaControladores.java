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
    EmpresaServicios Empresaservicios;

    @GetMapping("/enterprises")
    public List<Empresa> getEmpresas() throws Exception{
        return Empresaservicios.getEmpresas();
    }

    @GetMapping("/enterprises/[id_empresa]")
    public Empresa getEmpresa(@PathVariable("id") Long id_empresa) throws Exception {
        return Empresaservicios.getEmpresa(id_empresa);
    }

    @PostMapping("/enterprises/new")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return Empresaservicios.createEmpresa(empresa);
    }

    @PutMapping("/enterprises/[id_empresa]")
    public Empresa updateEmpresa(@PathVariable("id_empresa") Long id_empresa, @RequestBody Empresa empresa) throws Exception {
        return Empresaservicios.updateEmpresa(id_empresa,empresa);
    }

    @DeleteMapping("/enterprises/[id_empresa]")
    public boolean deleteEmpresa(@PathVariable("id_empresa") Long id_empresa) throws Exception {
        return Empresaservicios.deleteEmpresa(id_empresa);
    }
}

