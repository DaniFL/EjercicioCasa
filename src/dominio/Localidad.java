package dominio;

public class Localidad {

    //Atributos
    private String nombre;
    private int numeroHabitantes;

    //Getters & Setters de los atributos privados de la clase:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

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