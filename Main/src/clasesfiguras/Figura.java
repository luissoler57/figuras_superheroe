package clasesfiguras;

public class Figura {

    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimensiones;

    /* Constructor con parametros */
    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    /* Getters and Setters */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    /* Method toString */
    @Override
    public String toString() {
        return "Figura:\n codigo=" + codigo + ", precio=" + precio + "\n" + superheroe + "\n"
                + dimensiones;
    }
    
    public void subitPrecio(double cantidad) {
        precio += cantidad;
    }

}
