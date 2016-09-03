package Libreria;

import java.util.ArrayList;

public class Cliente extends Persona{
    
    // Atributos
    private TipoCliente tipoCliente;
    // Constructor
    public Cliente() {
        super();
        tipoCliente=TipoCliente.Normal;
    }
    // Propiedades
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    // Métodos
    public String obtenerDatos(){
        String datos="";
        datos +="RUN          : " + super.getRun() + "\n";
        datos +="Nombre       : " + super.getNombre() + " " 
                + super.getApPaterno() + " " 
                + super.getApMaterno() + "\n";        
        datos +="Tipo Cliente : " + tipoCliente.name() + "\n";
        return datos;
    }

    private static ArrayList<Cliente> clientes = new ArrayList();

    public static void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public static Cliente buscarClientePorRun(String run) {
        for (Cliente cliente : clientes) {
            if (cliente.getRun().equals(run)) {
                return cliente;
            }
        }
        
        return null;
    }
}
