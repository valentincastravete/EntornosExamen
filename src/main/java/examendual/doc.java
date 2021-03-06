package examendual;

/**
 * Write a description of class doc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface doc {

    // Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
    /**
     * Devuelve el contenido del archivo tras insertar la linea line en la linea
     * numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi
     * sucesivamente.
     *
     * @param x Número de línea del fichero.
     * @param line Línea de texto que se va a insertar.
     * @param file El fichero en el cuál se va a insertar la línea.
     * @return El contenido del fichero habiendo insertado la el texto de la
     * línea en el número de la línea indicada.
     */
    public abstract String escribirLinea(int x, String line, String file);

    //Devuelve el área de una ciudad en KM cuadrados.
    /**
     * Devuelve el área de una ciudad en KM cuadrados.
     *
     * @param ciudad La ciudad de la cúal se calculará el área.
     * @return Los KM cuadrados de la ciudad.
     * Precondición El objeto cuidad no
     * debe ser null y tiene que tener dos atributos que indiquen su anchura y
     * largura.
     * Postcondición Un número que indica el área de la ciudad.
     *
     */
    public abstract double kmCuadradosCiudad(Class ciudad);

}
