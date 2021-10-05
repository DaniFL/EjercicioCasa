package dominio;

public class Localidad {

    private String nombre = "";
    private int numeroDeHabitantes;

    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString (){
        return nombre + numeroDeHabitantes;
    }
}
