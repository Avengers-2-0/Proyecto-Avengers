package Servicios;

import Entidades.Empresa;
import Repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiciosImpl implements EmpresaServicios{

    @Autowired
    EmpresaRepositorio empresaRepositorio;

    @Override
    public List<Empresa> getEmpresas() throws Exception {
        return null;
    }

    @Override
    public Empresa getEmpresa(Long id) throws Exception {
        return null;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        empresaRepositorio.save(empresa);
        return empresa;
    }

    @Override
    public Empresa updateEmpresa(Long id, Empresa empresa) throws Exception {
        return empresa;
    }

    @Override
    public Empresa updateEmpresa(Empresa empresa) throws Exception {
        return empresa;
    }

    @Override
    public boolean deleteEmpresa(Long id) throws Exception {

        return false;
    }


    @Override
    public Iterable<Empresa> getAllEmpresa(){return empresaRepositorio.findAll();}

}
