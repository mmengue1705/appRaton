package ratonera;

/** Esta clase define objetos llamados 'raton' que tienen una edad, peso y una tasa de crecimiento
 * @author tarde Marta Mendoza
 * @version 1
 */

/**Esta clase define objetos llamados 'raton' que tiene una edad, peso y una tasa de crecimiento
 * @version 2
 *
 */

public class Raton {
    /**  Edad del raton en dias
     @since 1
     */
    private int edad;

    /** Peso del raton en gramos
     @since 1
     */
    private double peso;

    /**Incremento del peso por dia en porcentaje
     @since 1
     */
    private double tasaCrecimiento;

    /**
     * Constructor para la creacion de un objeto de esta clase
     */
    public Raton(){
        this(0,0);
    } //Cierre del constructor

    /**
     * Constructor para la creacion de un objeto de esta clase
     * @since 2
     * @param edad en dias
     * @param peso en gramos
     *
     **/
    public Raton(int edad, double peso) {
       this.edad=edad;
       this.peso=peso;

    }

    /**
     * Este metodo simula el crecimiento de un raton en un dia
     * No requiere ningun argumento, ni devuelve nada
     */
    public void desarrollar() {
        this.setPeso(this.getPeso() + (this.getPeso() * this.getTasaCrecimiento() /100.0));
        this.setEdad(this.getEdad() + 1);
    }

    /**
     * Este metodo devuelve formateada la edad y el peso del raton
     * @return edad,peso (siguiendo el formato indicado)
     */
    public String datos() {
        return String.format("(%d;%.2f)", this.getEdad(), this.getPeso());
    }

    /**  Metodo get edad del raton
     @since 2
     */
    public int getEdad() {
        return edad;
    }

    /**  Metodo set edad del ratón
     @since 2
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /** Metodo get peso del raton
     @since 2
     */
    public double getPeso() {
        return peso;
    }

    /** Metodo set peso del raton
     @since 2
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**Metodo get tasa de crecimento en porcentaje
     * @see <a href = "https://es.wikipedia.org/wiki/Rat%C3%B3n_de_laboratorio" /> Raton</a>
     @since 2
     */
    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }
    /**Metodo set tasa de crecimento en porcentaje
     * @see <a href = "https://es.wikipedia.org/wiki/Rat%C3%B3n_de_laboratorio" /> Raton</a>
     @since 2
     */
    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }
}
