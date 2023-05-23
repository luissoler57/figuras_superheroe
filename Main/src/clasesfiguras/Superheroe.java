package clasesfiguras;

public class Superheroe {

    private String nombre;
    private String descripcion;
    private boolean capa;

    /* Constructor con parametros */
    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    /*
     * Method toString -> Retorna una cadena con los datos por defecto de todo el
     * objecto cuando se instancia
     */
    /**
     * This is a Java function that overrides the default toString() method to
     * return a string
     * representation of a superhero object's name, description, and whether they
     * wear a cape.
     * 
     * @return A string representation of a Superheroe object, which includes the
     *         values of its nombre,
     *         descripcion, and capa attributes.
     */
    @Override
    public String toString() {
        return "Superheroe [nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa + "]";
    }

}
