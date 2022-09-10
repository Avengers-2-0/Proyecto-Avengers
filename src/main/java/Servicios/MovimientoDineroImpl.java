package Servicios;

import Entidades.MovimientoDinero;
import Repositorios.MovimientoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovimientoDineroImpl implements MovimientoDineroServicios {
    @Autowired
    MovimientoDineroRepositorio movimientoDineroRepositorio;

    @Override
    public List<MovimientoDinero> getMovimientosDinero() {
        return this.movimientoDineroRepositorio.findAll();
    }

    @Override
    public MovimientoDinero getMovimientoDinero(Long id_transaction) {
        Optional<MovimientoDinero> movimientoDinero = this.movimientoDineroRepositorio.findById(id_transaction);
        return movimientoDinero.orElse(null);
    }

    @Override
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero) {
        return this.movimientoDineroRepositorio.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero updateMovimientoDinero(Long id_transaction, MovimientoDinero movimientoDinero) {
        Optional<MovimientoDinero> dbMovimiento = this.movimientoDineroRepositorio.findById(id_transaction);
        if (dbMovimiento.isPresent()) {
            movimientoDinero = dbMovimiento.get();
            movimientoDinero.setMontoMovimiento(movimientoDinero.getMontoMovimiento());
            movimientoDinero.setConceptoMovimiento(movimientoDinero.getConceptoMovimiento());
            this.movimientoDineroRepositorio.save(movimientoDinero);
            return movimientoDinero;
        }
        return null;
    }

    @Override
    public boolean deleteMovimientoDinero(Long id_transaction) throws Exception {
        try {
            this.movimientoDineroRepositorio.deleteById(id_transaction);
            return true;
        } catch (Exception movimientoDinero) {
            return false;
        }
    }


}

