
package Libreria;

public abstract class Persona {
    // Atributos
    private String run;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    // Constructor
    public Persona() {
        run="";
        nombre="";
        apPaterno="";
        apMaterno="";        
    }
    // Propiedades

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }    
    // Métodos abstractos
    abstract String obtenerDatos();
}
