package com.example.Spring3.Controladores;


import com.example.Spring3.Entidades.MovimientoDinero;
import com.example.Spring3.Servicios.MovimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MovimientoDineroControladores {
    @Autowired
    MovimientoDineroServicios movimientoDineroServicios;
    public MovimientoDineroControladores(MovimientoDineroServicios movimientoDineroServicios){
        this.movimientoDineroServicios = movimientoDineroServicios;}
    @GetMapping("/movements")
    public List<MovimientoDinero> getMovimientoDinero() throws Exception {
        return movimientoDineroServicios.getMovimientosDinero();
    }


    @GetMapping("/enterprises/{id_transaction}/movements")
    public MovimientoDinero getMovimientoDinero(@PathVariable("id_transaction") Long id_transaction) throws Exception {
        return movimientoDineroServicios.getMovimientoDinero(id_transaction);
    }

    @PostMapping("/enterprises/{id_transaction}/movements")
    public MovimientoDinero createMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        return movimientoDineroServicios.createMovimientoDinero(movimientoDinero);
    }

    @PatchMapping("/enterprises/{id_transaction}/movements")
    public MovimientoDinero updateMovimientoDinero(@PathVariable("id_transaction") Long id_transaction, @RequestBody MovimientoDinero movimientoDinero) throws Exception {
        return movimientoDineroServicios.updateMovimientoDinero(id_transaction, movimientoDinero);
    }

    @DeleteMapping("/enterprises/{id_transaction}/movements")
    public boolean deleteMovimientoDinero(@PathVariable("id_transaction") Long id_transaction) throws Exception {
        return movimientoDineroServicios.deleteMovimientoDinero(id_transaction);
    }
}
