package Controladores;


import Entidades.MovimientoDinero;
import Servicios.MovimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transaction")
public class MovimientoDineroControladores {
    @Autowired
    MovimientoDineroServicios movimientoDineroServicios;
    @GetMapping("/transaction")
    public List<MovimientoDinero> getMovimientoDinero() throws Exception {
        return movimientoDineroServicios.getMovimientosDinero();
    }

    @GetMapping("/transaction/{id_transaction}")
    public MovimientoDinero getMovimientoDinero(@PathVariable("id_transaction") Long id_transaction) throws Exception {
        return movimientoDineroServicios.getMovimientoDinero(id_transaction);
    }

    @PostMapping("/transaction/new")
    public MovimientoDinero createMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        return movimientoDineroServicios.createMovimientoDinero(movimientoDinero);
    }

    @PutMapping("/transaction/{id_transaction}")
    public MovimientoDinero updateMovimientoDinero(@PathVariable("id_transaction") Long id_transaction, @RequestBody MovimientoDinero movimientoDinero) throws Exception {
        return movimientoDineroServicios.updateMovimientoDinero(id_transaction, movimientoDinero);
    }

    @DeleteMapping("/transaction/{id_transaction}")
    public boolean deleteMovimientoDinero(@PathVariable("id_transaction") Long id_transaction) throws Exception {
        return movimientoDineroServicios.deleteMoviminentoDinero(id_transaction);
    }
}
