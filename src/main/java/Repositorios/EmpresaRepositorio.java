package Repositorios;

import Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {
    public Optional<Empresa> Encontrarpornombre(String nombre);
}