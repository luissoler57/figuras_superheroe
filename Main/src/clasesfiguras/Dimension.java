package clasesfiguras;

public class Dimension {

    private double alto;
    private double ancho;
    private double profundidad;

    /* Constructor sin parametros */
    public Dimension() {
        /* Parametros por defecto */
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    /* Contructor con parametros */
    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    /* Method toString */
    @Override
    public String toString() {
        return "Dimension [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + ", Volumen="
                + getVolumen() + "]";
    }

    /* Getters and Setters */
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    /* Method Volumen */
    public double getVolumen() {
        return alto * ancho * profundidad;
    }

}
