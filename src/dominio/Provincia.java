package dominio;

import java.util.ArrayList;

public class Provincia {

    private String nombre;
    private ArrayList<Municipio> municipios = new ArrayList<>();

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

    public void addMunicipio(Municipio municipio){
        municipios.add(municipio);
    }
    public int calcularPoblacionTotal(){
        int habitantes = 0;
        for (int i = 0; i < municipios.size() ; i++) {
            habitantes += municipios.get(i).calcularPoblacion();
        }
        return habitantes;
    }

    public String toString(){
        return "La provincia " + nombre + " está formada por los siguientes municipios: " + municipios + " \nPoblación Provincia: " + calcularPoblacionTotal() + " habitantes";
    }
}
