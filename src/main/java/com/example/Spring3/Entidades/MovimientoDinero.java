package com.example.Spring3.Entidades;


import javax.persistence.*;

@Entity
@Table(name = "movements")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaction")
    public long id_transaction;

    @Column(name = "montoMovimiento")
    public int montoMovimiento;

    @Column(name = "conceptoMovimiento")
    public String conceptoMovimiento;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    public Empleado empleado;

    public MovimientoDinero() {
    }

    public MovimientoDinero(int montoMovimiento, String conceptoMovimiento, Empleado empleado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleado = empleado;
    }

    public long getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(long id_transaction) {
        this.id_transaction = id_transaction;
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}