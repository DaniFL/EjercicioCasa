package dominio;

import java.util.ArrayList;

public class Provincia {

    //Atributos
    private String nombre;
    //Escribimos la clase Provincia como una agregación de municipios, gracias a un ArrayList que almacenará dichos elementos.
    private ArrayList<Municipio> municipios = new ArrayList<>();

    ////Getters & Setters de los atributos privados de la clase:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

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
    public String toString(){
        return "La provincia " + nombre + " está formada por los siguientes municipios: " + municipios + " \nPoblación Provincia: " + calcularPoblacionTotal() + " habitantes";
    }
}
