package entrega_sprint2;

public class MovimientoDinero {
    private double monto;
    private String concepto;
    private String usuarioEncargado;

    public MovimientoDinero(double monto, String concepto, String usuarioEncargado) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuarioEncargado = usuarioEncargado;
    }

    // Getter para el monto
    public double getMonto() {
        return monto;
    }

    // Setter para el monto
    public void setMonto(double monto) {
        this.monto = monto;
    }

    // Getter para el concepto
    public String getConcepto() {
        return concepto;
    }

    // Setter para el concepto
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    // Getter para el usuario encargado
    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }

    // Setter para el usuario encargado
    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }
}
