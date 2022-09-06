package Repositorios;

import Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoDineroRepositorio extends JpaRepository<MovimientoDinero, Long> {
}
