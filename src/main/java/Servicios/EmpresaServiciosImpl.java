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
        Optional<Empresa> dbEmpresa = this.empresaRepositorio.findById(id);
        if (dbEmpresa.isPresent()){
            Empresa empresa1=dbEmpresa.get();
        empresa1.setNit(empresa1.getNit());
        empresa1.setNombre(empresa1.getNombre());
        empresa1.setDireccion(empresa1.getDireccion());
        empresa1.setTelefono(empresa1.getTelefono());
        this.empresaRepositorio.save(empresa1);
        return empresa1;
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
//    public boolean deleteEmpresa(Long id) {
//        boolean eliminar = true;
//        Empresa empresa1 = (Empresa) empresaRepositorio.findById(id).orElse(null);
//        if (empresa1 == null) {
//            eliminar = false;
////        }else {
////            empresaRepositorio.deleteById(id);
//        }
    }
}




