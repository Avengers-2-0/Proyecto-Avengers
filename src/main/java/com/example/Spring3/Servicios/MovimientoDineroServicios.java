package com.example.Spring3.Servicios;

import com.example.Spring3.Entidades.MovimientoDinero;

import java.util.List;

public interface MovimientoDineroServicios {
    List<MovimientoDinero> getMovimientosDinero() throws Exception;

    MovimientoDinero getMovimientoDinero(Long id_transaction) throws Exception;

    MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);

    MovimientoDinero updateMovimientoDinero(Long id_transaction, MovimientoDinero movimientoDinero) throws Exception;

    boolean deleteMovimientoDinero(Long id_transaction) throws Exception;
}

