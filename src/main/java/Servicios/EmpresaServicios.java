package Servicios;

import Entidades.Empresa;

import java.util.List;

public interface EmpresaServicios {
    public List<Empresa> getEmpresas()throws Exception;

   public Empresa getEmpresa(Long id_empresa) throws Exception;

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(Long id_empresa, Empresa empresa) throws Exception;

    public boolean deleteEmpresa(Long id_empresa) throws Exception;

}
