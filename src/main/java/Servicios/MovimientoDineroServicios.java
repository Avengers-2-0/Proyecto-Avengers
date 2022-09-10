package Servicios;

import Entidades.MovimientoDinero;

import java.util.List;

public interface MovimientoDineroServicios {
    public List<MovimientoDinero> getMovimientosDinero();

    public MovimientoDinero getMovimientoDinero(Long id_transaction) throws Exception;

    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);

    public MovimientoDinero updateMovimientoDinero(Long id_transaction, MovimientoDinero movimientoDinero) throws Exception;

    public boolean deleteMoviminentoDinero(Long id_transaction) throws Exception;
}

