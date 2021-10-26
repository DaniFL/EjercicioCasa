package dominio;
import java.util.ArrayList;

public class Municipio {

    private String nombre;
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

    public void addLocalidad(Localidad localidad){
        localidades.add(localidad);
    }

    public int calcularPoblacion(){
        int sumHabitantes=0;
       for (int i = 0; i < localidades.size() ; i++) {
           sumHabitantes += localidades.get(i).getNumeroHabitantes();
       }
        return sumHabitantes;
    }

    public String toString(){
        return   "\nEl municipio " + nombre + " que está compuesto por estas localidades: " + localidades + " \nPoblación Municipio: " + calcularPoblacion() + " habitantes";
    }
}
