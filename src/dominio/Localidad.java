package dominio;

import java.util.ArrayList;

public class Localidad {

    private String nombre;
    private int numeroHabitantes;

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

    public String toString (){
        return "\n" + "- " + nombre +  " (" + numeroHabitantes + " habitantes)";
    }
}