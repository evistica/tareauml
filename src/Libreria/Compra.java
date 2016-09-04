package Libreria;

import java.text.DecimalFormat;
import java.util.Date;

public class Compra implements IPago {

    private static float PORC_IVA = 0.19F;

    // Atributos
    private Cliente cliente;
    private Date fecha;
    private int monto;
    private String numero;

    // Constructor
    public Compra() {
        cliente = new Cliente();
        numero = "";
        fecha = new Date();
        monto = 0;
    }

    // Propiedades
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static float getPORC_IVA() {
        return PORC_IVA;
    }

    public static void setPORC_IVA(float aPORC_IVA) {
        PORC_IVA = aPORC_IVA;
    }

    // Métodos
    @Override
    public int obtenerDescuento() {
        TipoCliente tipo = getCliente().getTipoCliente();
        
        switch (getCliente().getTipoCliente()) {
            case Normal:
                return Math.round(getMonto() * PORC_NORMAL);
            case Silver:
                return Math.round(getMonto() * PORC_SILVER);
            case Gold:
                return Math.round(getMonto() * PORC_GOLD);
            case Premium:
                return Math.round(getMonto() * PORC_PREMIUM);
            default:
                return getMonto();
        }
    }

    /**
     *
     * @return
     */
    @Override
    public int obtenerSubtotal() {
        return getMonto() - obtenerDescuento();
    }

    @Override
    public int obtenerIVA() {
        return Math.round(obtenerSubtotal() * getPORC_IVA());
    }

    @Override
    public int obtenerPago() {
        return obtenerSubtotal() + obtenerIVA();
    }

    public String obtenerDatos() {
        String patronM = "$##,###,###";
        DecimalFormat formatM = new DecimalFormat(patronM);
        String datos = "";
        datos += getCliente().obtenerDatos();
        datos += "Subtotal     : " + formatM.format(obtenerSubtotal()) + "\n";
        datos += "Monto IVA    : " + formatM.format(obtenerIVA()) + "\n";
        datos += "Monto Total  : " + formatM.format(obtenerPago()) + "\n";
        return datos;
    }
}
