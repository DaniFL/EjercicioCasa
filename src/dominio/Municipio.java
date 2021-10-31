package dominio;

import java.util.ArrayList;

/**
 * La clase Municipio se escribe como una agregación de localidades.
 * @author Daniel Fernández López
 */
public class Municipio {

    private String nombre;
    /**
     * Método ArrayList de localidades.
     */
    private ArrayList<Localidad> localidades = new ArrayList<>();

    /**
     * El método get devuelve el valor del ArrayList de localidades.
     * @return
     */
    public ArrayList<Localidad> getLocalidades() {
        return localidades;
    }

    /**
     * El método set toma un parámetro y lo asigna al ArrayList
     * @param localidades
     */
    public void setLocalidades(ArrayList<Localidad> localidades) {
        this.localidades = localidades;
    }

    /**
     * El método get devuelve el valor del atributo nombre.
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

    /*public String toString(){
        return   "\nEl municipio " + nombre + " que está compuesto por estas localidades: " + localidades + " \nPoblación Municipio: " + calcularPoblacion() + " habitantes";
    }*/
    public String toString(){
        String mensaje = "El municipio " + nombre + " tiene " + calcularPoblacion() + " habitantes y está formado por las siguientes localidades: \n";
        for (int i = 0; i < localidades.size(); i++){
        mensaje += localidades.get(i) + "\n";

        }

        return mensaje;
    }
}
