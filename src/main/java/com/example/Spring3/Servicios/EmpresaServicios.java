package com.example.Spring3.Servicios;

import com.example.Spring3.Entidades.Empresa;

import java.util.List;

public interface EmpresaServicios {
    List<Empresa> getEmpresas()throws Exception;

    Empresa getEmpresa(Long id_empresa) throws Exception;

    Empresa createEmpresa(Empresa empresa);

    Empresa updateEmpresa(Long id_empresa, Empresa empresa) throws Exception;

    boolean deleteEmpresa(Long id_empresa) throws Exception;

}
