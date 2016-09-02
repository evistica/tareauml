
package Libreria;

import java.text.DecimalFormat;

public class Compra implements IPago {
    static final float PORC_IVA=0.19F;
    // Atributos
    private Cliente cliente;
    private int monto;
    // Constructor
    public Compra() {
        cliente=new Cliente();
        monto=0;
    }
    // Propiedades

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    // Métodos
    public int obtenerDescuento(){
        switch (cliente.getTipoCliente()){
            case Normal:
                return Math.round(monto * PORC_NORMAL);
            case Silver:
                return Math.round(monto * PORC_SILVER);
            case Gold:
                return Math.round(monto * PORC_GOLD);
            default:
                return Math.round(monto * PORC_PREMIUM);                
        }
    }
    public int obtenerSubtotal(){
        return monto - obtenerDescuento();
    }
    public int obtenerIVA() {
        return Math.round(obtenerSubtotal() * PORC_IVA);
    }
    public int obtenerPago(){
        return obtenerSubtotal() + obtenerIVA();
    }
    public String obtenerDatos() {
        String patronM="$##,###,###";
        DecimalFormat formatM = new DecimalFormat(patronM);
        String datos="";
        datos +=cliente.obtenerDatos();
        datos +="Subtotal     : " + formatM.format(obtenerSubtotal()) + "\n";         
        datos +="Monto IVA    : " + formatM.format(obtenerIVA()) + "\n";  
        datos +="Monto Total  : " + formatM.format(obtenerPago()) + "\n";  
        return datos;        
    }
}
