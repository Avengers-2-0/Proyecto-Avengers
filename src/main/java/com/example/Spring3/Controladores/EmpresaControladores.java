package com.example.Spring3.Controladores;

import com.example.Spring3.Entidades.Empresa;
import com.example.Spring3.Servicios.EmpresaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class EmpresaControladores {
    @Autowired
    EmpresaServicios empresaServicios;
    public EmpresaControladores(EmpresaServicios empresaServicios){
        this.empresaServicios = empresaServicios;}



    @GetMapping("/enterprises/{id_empresa}")
    public Empresa getEmpresa(@PathVariable("id_empresa") Long id_empresa) throws Exception {
        return empresaServicios.getEmpresa(id_empresa);
    }

    @PostMapping("/enterprises")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaServicios.createEmpresa(empresa);
    }

    @PatchMapping("/enterprises/{id_empresa}")
    public Empresa updateEmpresa(@PathVariable("id_empresa") Long id_empresa, @RequestBody Empresa empresa) throws Exception {
        return empresaServicios.updateEmpresa(id_empresa,empresa);
    }

    @DeleteMapping("/enterprises/{id_empresa}")
    public boolean deleteEmpresa(@PathVariable("id_empresa") Long id_empresa) throws Exception {
        return empresaServicios.deleteEmpresa(id_empresa);
    }
}

