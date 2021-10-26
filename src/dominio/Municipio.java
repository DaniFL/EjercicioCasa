package dominio;
import java.util.ArrayList;

public class Municipio {

    //Atributos
    private String nombre;
    //Creamos la clase Municipio como una agregación de localidades, gracias a un ArrayList que almacenará dichos elementos.
    private ArrayList<Localidad> localidades = new ArrayList<>();

    //Getters & Setters de los atributos privados de la clase:
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

    /**
     * Método que permite añadir elementos al ArrayList (localidades).
     * @param localidad
     */
    public void addLocalidad(Localidad localidad){
        localidades.add(localidad);
    }

    /**
     * Método que calcula y devuelve el número total de habitantes de un municipio, a partir de la suma (iterativa)
     * de los habitantes de cada localidad perteneciente a dicho municipio.
     * @return
     */
    public int calcularPoblacion(){
        int sumHabitantes=0;
       for (int i = 0; i < localidades.size() ; i++) {
           sumHabitantes += localidades.get(i).getNumeroHabitantes();
       }
        return sumHabitantes;
    }

    /**
     * Método que devuelve de manera implícita una cadena de carateres (String).
     * En este caso el nombre, las localidades y el número de habitantes del municipio.
     * @return
     */
    public String toString(){
        return   "\nEl municipio " + nombre + " que está compuesto por estas localidades: " + localidades + " \nPoblación Municipio: " + calcularPoblacion() + " habitantes";
    }
}
