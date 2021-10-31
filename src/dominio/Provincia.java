package dominio;

import java.util.ArrayList;

/**
 * La clase Provincia se escribe como una agregación de municipios.
 * @author Daniel Fernández López
 */
public class Provincia {

    private String nombre;
    /**
     * Método ArrayList de municipios
     */
    private ArrayList<Municipio> municipios = new ArrayList<>();

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
     * El método get devuelve el valor del ArrayList de municipios
     * @return
     */
    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    /**
     * El método set toma un parámetro y lo asigna al ArrayList de municipios.
     * @param municipios
     */
    public void setMunicipios(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }

    /**
     * Método que permite añadir elementos al ArrayList (municipios).
     * @param municipio
     */
    public void addMunicipio(Municipio municipio){
        municipios.add(municipio);
    }

    /**
     * Método que calcula y devuelve el número total de habitantes de la provincia, a partir de la suma (iterativa)
     * de los habitantes de los municipios pertenecientes a dicha provincia.
     * @return
     */
    public int calcularPoblacionTotal(){
        int habitantes = 0;
        for (int i = 0; i < municipios.size() ; i++) {
            habitantes += municipios.get(i).calcularPoblacion();
        }
        return habitantes;
    }

    /**
     * Método que devuelve de manera implícita una cadena de carateres (String).
     * En este caso el nombre, los municipios y el número de habitantes de la provincia.
     * @return
     */
    /*public String toString(){
        return "La provincia " + nombre + " está formada por los siguientes municipios: " + municipios + " \nPoblación Provincia: " + calcularPoblacionTotal() + " habitantes";
    }*/

    public String toString(){
        String mensaje2 = "La provincia " + nombre + " tiene " + calcularPoblacionTotal() + " habitantes, y está formada por los siguintes municipios: \n";
        for (int i = 0; i < municipios.size(); i++){
            mensaje2 += municipios.get(i) + "\n";
        }
        return mensaje2;
    }
}
