package dominio;

import java.util.ArrayList;

public class Municipio {

    //Esta clase muestra un municipio como un conjunto de localidades
    private String nombre = "";
    private int numeroHabitantesMunicipio;
    private ArrayList<Localidad> localidades = new ArrayList<>();

    public ArrayList<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(ArrayList<Localidad> localidades) {
        this.localidades = localidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitantesMunicipio() {
        return numeroHabitantesMunicipio;
    }

    public void setNumeroHabitantesMunicipio(int numeroHabitantesMunicipio) {
        this.numeroHabitantesMunicipio = numeroHabitantesMunicipio;
    }

    /*public Localidad getLocalidades() {
        return localidades;
    }
    public void setLocalidades(Localidad localidades) {
        this.localidades = localidades;
    }
    public int calcularNumeroHabitantesMunicipio(){
        return
    }*/

    public String toString(){
        return   "-" + nombre + ": " + numeroHabitantesMunicipio + "\n" + localidades;
    }
}
