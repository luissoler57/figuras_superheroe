import clasesfiguras.Coleccion;
import clasesfiguras.Dimension;
import clasesfiguras.Figura;
import clasesfiguras.Superheroe;

public class App {
    public static void main(String[] args) throws Exception {

        /* Objectos Superheroe */
        /* Create new object with parameters */
        Superheroe sup1 = new Superheroe("SpiderMan");

        /* Set valores */
        sup1.setDescripcion("Telarana");

        /* Show console */
        System.out.println(sup1.getNombre());
        System.out.println(sup1.getDescripcion());
        System.out.println(sup1.isCapa());

        /* Method toString */
        System.out.println(sup1.toString());

        /* Instanciamos otro objecto */
        Superheroe sup2 = new Superheroe("Batman");
        sup2.setDescripcion("Bruce Wanne");
        sup2.setCapa(true);

        System.out.println(sup2);

        /* Object Dimension */
        Dimension dimPeq = new Dimension(); // Parametros por defecto
        dimPeq.setAlto(20);
        dimPeq.setAncho(5);
        dimPeq.setProfundidad(6);
        System.out.println("------------------------Parametros por defecto----------------------");
        System.out.println(dimPeq);

        Dimension dimGra = new Dimension(70, 20, 20); // Parametros custom
        System.out.println("------------------------Parametros Enviados----------------------");
        System.out.println(dimGra);

        /* Figuras */
        System.out.println("------------------------Figuras----------------------");

        Figura figuraSpi = new Figura("spid-01", 30, sup1, dimPeq);

        System.out.println(figuraSpi);

        figuraSpi.subitPrecio(10);
        System.out.println(figuraSpi);

        /* Coleccion */
        Coleccion coleccion = new Coleccion("Super");

        coleccion.addFigura(figuraSpi);

        Figura figuraBatman = new Figura("bat-02", 50, sup2, dimPeq);
        coleccion.addFigura(figuraBatman);

        Figura figuraIron = new Figura("iron-03", 20, new Superheroe("IronMan"), new Dimension(6, 3, 4));
        coleccion.addFigura(figuraIron);

        System.out.println("\n================================================");
        System.out.println(coleccion);

        /* Figura con cap */
        System.out.println(coleccion.conCapa());

        /* Figura valor mas alto */
        Figura fMasValiosa = coleccion.masValioso();
        System.out.println("Figura de mas valor: " + fMasValiosa);

        /* Total precios */
        System.out.println("Valor de la coleccion: " + coleccion.getValorColeccion());

        /* Volumen Coleccion */
        System.out.println("Volumen de la coleccion: " + coleccion.getVolumenColeccion());
    }
}
