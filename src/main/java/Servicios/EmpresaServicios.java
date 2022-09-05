package Servicios;

import Entidades.Empresa;

import java.util.List;

public interface EmpresaServicios {
    List<Empresa> getEmpresas() throws Exception;

    Empresa getEmpresa(Long id)throws Exception;

    Empresa createEmpresa(Empresa empresa);

    Empresa updateEmpresa(Long id, Empresa empresa) throws Exception;

    Empresa updateEmpresa(Empresa empresa) throws Exception;

    boolean deleteEmpresa(Long id) throws Exception;


    Iterable<Empresa> getAllEmpresa();
}
