package Libreria;

public interface IPago {
    final float PORC_NORMAL=0.043F;
    final float PORC_SILVER=0.05F;
    final float PORC_GOLD=0.072F;
    final float PORC_PREMIUM=0.1015F;
    int obtenerDescuento();
    int obtenerSubtotal();
    int obtenerIVA();
    int obtenerPago();
}
