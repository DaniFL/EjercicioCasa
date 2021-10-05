package dominio;

public class Municipio {

    //Agragación de Localidades
    private String nombre = "";
    private int numeroHabitantesMunicipio;
    private Localidad localidades;

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

    public Localidad getLocalidades() {
        return localidades;
    }

    public void setLocalidades(Localidad localidades) {
        this.localidades = localidades;
    }

    /*public int calcularNumeroHabitantesMunicipio(){
    }*/

    public String toString(){
        return localidades + nombre + numeroHabitantesMunicipio;
    }
}
