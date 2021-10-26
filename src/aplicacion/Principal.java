package aplicacion;

import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;

/**
 * La clase Principal inicializa el programa.
 * @author Daniel Fernández lópez
 */
public class Principal {

    /**
     * Método main a partir del que se llevará a cabo la ejecución del programa.
     * @param args
     */
    public static void main(String[] args){

        //Creación y relación entre los Objetos de las clases Provincia, Municipio y Localidad
        Provincia provincia1 = new Provincia();
        provincia1.setNombre("Madrid");

        Municipio municipio1 = new Municipio();
        municipio1.setNombre("Alcorcón");
        provincia1.addMunicipio(municipio1);

        Localidad localidad1 = new Localidad();
        localidad1.setNombre("Montepríncipe");
        localidad1.setNumeroHabitantes(1500);
        municipio1.addLocalidad(localidad1);
        //System.out.println(municipio1);

        Localidad localidad2 = new Localidad();
        localidad2.setNombre("Fuente Cisneros");
        localidad2.setNumeroHabitantes(4000);
        municipio1.addLocalidad(localidad2);
        //System.out.println(municipio1);

        Localidad localidad3 = new Localidad();
        localidad3.setNombre("Ventorro del Cano");
        localidad3.setNumeroHabitantes(6300);
        municipio1.addLocalidad(localidad3);
        //System.out.println(municipio1);

        Municipio municipio2 = new Municipio();
        municipio2.setNombre("Pozuelo de Alarcón");
        provincia1.addMunicipio(municipio2);

        Localidad localidad4 = new Localidad();
        localidad4.setNombre("Los Ángeles");
        localidad4.setNumeroHabitantes(3400);
        municipio2.addLocalidad(localidad4);

        Localidad localidad5 = new Localidad();
        localidad5.setNombre("Monteclaro");
        localidad5.setNumeroHabitantes(2500);
        municipio2.addLocalidad(localidad5);

        Localidad localidad6 = new Localidad();
        localidad6.setNombre("Somosaguas");
        localidad6.setNumeroHabitantes(4900);
        municipio2.addLocalidad(localidad6);
        //System.out.println(municipio2);

        System.out.println(provincia1);
    }
}
