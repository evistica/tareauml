package Aplicacion;

import Libreria.*;

public class GestionCompra {
    public static void main(String[] args){
        // Datos Cliente
        String run="22222222-2";
        String nombre="Eva";
        String apPaterno="Lechu";
        String apMaterno="Master";
        TipoCliente tipoCliente=TipoCliente.Premium;
        // Datos Compra
        int monto=100000;
        // Instanciamos un objeto c de la clase Cliente
        Cliente c = new Cliente();
        c.setRun(run);
        c.setNombre(nombre);
        c.setApPaterno(apPaterno);
        c.setApMaterno(apMaterno);
        c.setTipoCliente(tipoCliente);
        // instanciamos un objeto co de la clase Compra
        Compra co = new Compra();
        co.setCliente(c);
        co.setMonto(monto);
        
        mostraDatosCompra(co);
    }
    public static void mostraDatosCompra(Compra co){
        System.out.println(co.obtenerDatos());
    }
}
