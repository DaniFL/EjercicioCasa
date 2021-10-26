package dominio;

/**
 * La clase Localidad crea objetos definidos a partir de sus variables
 * @author Daniel Fernández López
 */
public class Localidad {

    private String nombre;
    private int numeroHabitantes;

    /**
     * El método get devuelve el valor del atributo nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El método set toma un parámetro y lo asigna al atributo nombre.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El método get devuelve el valor del atributo número de habitantes
     * @return
     */
    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    /**
     * El método set toma un parámetro y lo asigna al atributo.
     * @param numeroHabitantes
     */
    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    /**
     * Método que devuelve de manera implícita una cadena de carateres (String).
     * En este caso el nombre y el número de habitantes de la localidad.
     * @return
     */
    public String toString (){
        return "\n" + "- " + nombre +  " (" + numeroHabitantes + " habitantes)";
    }
}