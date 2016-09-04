package Libreria;

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
}
