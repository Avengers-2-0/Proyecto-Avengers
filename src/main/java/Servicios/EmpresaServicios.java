package Servicios;

import Entidades.Empresa;

import java.util.List;

public interface EmpresaServicios {
    public List<Empresa> getEmpresas() throws Exception;

    Empresa getEmpresa(Long id) throws Exception;

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(Long id, Empresa empresa) throws Exception;

    public boolean deleteEmpresa(Long id) throws Exception;

}
