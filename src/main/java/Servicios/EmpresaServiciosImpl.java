package Servicios;

import Entidades.Empresa;
import Repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServiciosImpl implements EmpresaServicios {

    @Autowired
    EmpresaRepositorio empresaRepositorio;

    @Override
    public List<Empresa> getEmpresas() {
        return this.empresaRepositorio.findAll();
    }


    @Override
    public Empresa getEmpresa(Long id_empresa) {
        Optional<Empresa> empresa = this.empresaRepositorio.findById(id_empresa);
        return empresa.orElse(null);
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        return this.empresaRepositorio.save(empresa);
    }

    @Override
    public Empresa updateEmpresa(Long id_empresa, Empresa empresa) {
        Optional<Empresa> dbEmpresa = this.empresaRepositorio.findById(id_empresa);
        if (dbEmpresa.isPresent()){
            empresa = dbEmpresa.get();
        empresa.setNit(empresa.getNit());
        empresa.setNombre(empresa.getNombre());
        empresa.setDireccion(empresa.getDireccion());
        empresa.setTelefono(empresa.getTelefono());
        this.empresaRepositorio.save(empresa);
        return empresa;
    }
        return null;
    }


    @Override
    public boolean deleteEmpresa(Long id_empresa) {
        try {
            this.empresaRepositorio.deleteById(id_empresa);
            return true;
        } catch (Exception empresa1) {
            return false;
        }
    }
}




