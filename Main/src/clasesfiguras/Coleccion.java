package clasesfiguras;

import java.util.ArrayList;

public class Coleccion {

    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    /* Constructor con parametros se instacia una array vacio */
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        listaFiguras = new ArrayList<>();
    }

    /* Getters and Setter */
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    /* Agregar figura al array */
    public void addFigura(Figura figura) {
        listaFiguras.add(figura);
    }

    /* Subir precio a la figura por id */
    public void subirPrecio(double cantidad, String id) {
        for (Figura figura : listaFiguras) {
            if (figura.getCodigo().equals(id)) {
                figura.setPrecio(cantidad);
            }
        }
    }

    /* Metodo toString */
    @Override
    public String toString() {
        String cadena = "Coleccion " + nombreColeccion + "\n-------------------";
        for (Figura figura : listaFiguras) {
            cadena += figura;
        }
        return cadena;
    }

    /* Metedo retorna los heroes con capq */
    public String conCapa() {
        String cadena = "Figuras de superheroes con capa: \n ------------------------------ \n";
        for (Figura figura : listaFiguras) {
            if (figura.getSuperheroe().isCapa()) {
                cadena += figura + "\n";
            }
        }
        return cadena;
    }

    /* Retorna la figura con el precio mas alto */
    public Figura masValioso() {
        double precioMayor = 0.0;
        Figura figuraMax = null;

        for (Figura figura : listaFiguras) {
            if (figura.getPrecio() > precioMayor) {
                precioMayor = figura.getPrecio();
                figuraMax = figura;
            }
        }
        return figuraMax;
    }

    /* Retorna la suma de los precios de las figuras */
    public double getValorColeccion() {
        double total = 0;
        for (Figura figura : listaFiguras) {
            total += figura.getPrecio();
        }
        return total;
    }

    /* Retorna el volumente del tamano de la coleccion */
    public double getVolumenColeccion() {
        double volumen = 0;

        for (Figura figura : listaFiguras) {
            volumen += figura.getDimensiones().getVolumen();
        }
        return volumen + 200;
    }
}
