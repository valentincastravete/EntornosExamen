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

}
