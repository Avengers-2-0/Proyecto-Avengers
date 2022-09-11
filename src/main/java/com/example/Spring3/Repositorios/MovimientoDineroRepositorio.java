package com.example.Spring3.Repositorios;

import com.example.Spring3.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepositorio extends JpaRepository<MovimientoDinero, Long> {
}
