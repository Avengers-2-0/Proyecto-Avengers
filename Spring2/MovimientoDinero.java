package Spring2;

public class MovimientoDinero {
   public int montoMovimiento;
    public String conceptoMovimiento;
    public String usuarioMoviento;

    public MovimientoDinero(int montoMovimiento, String conceptoMovimiento, String usuarioMoviento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMoviento = usuarioMoviento;
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

    public String getUsuarioMoviento() {
        return usuarioMoviento;
    }

    public void setUsuarioMoviento(String usuarioMoviento) {
        this.usuarioMoviento = usuarioMoviento;
    }

}
