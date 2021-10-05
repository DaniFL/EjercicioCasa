package aplicacion;

import dominio.Localidad;
import dominio.Municipio;

public class Principal {
    /**
     * Mi método main con el que se llevará a cabo la ejecución del programa.
     * @param args
     */
    public static void main(String[] args){

        Municipio municipio1 = new Municipio();
        municipio1.setNombre("Alcorcón");
        municipio1.setNumeroHabitantesMunicipio(12222);
        //System.out.println(municipio1);

        Localidad localidad1 = new Localidad();
        localidad1.setNombre("Montepríncipe");
        localidad1.setNumeroDeHabitantes(15000);
        //System.out.println(localidad1);

        Localidad localidad2 = new Localidad();
        localidad2.setNombre("Fuente Cisneros");
        localidad2.setNumeroDeHabitantes(15000);
        //System.out.println(localidad2);

        Localidad localidad3 = new Localidad();
        localidad3.setNombre("Ventorro del Cano");
        localidad3.setNumeroDeHabitantes(15000);
        //System.out.println(localidad3);

        Municipio municipio2 = new Municipio();
        municipio2.setNombre("Pozuelo Alarcón");
        municipio2.setNumeroHabitantesMunicipio(12222);
        //System.out.println(municipio2);

        Localidad localidad4 = new Localidad();
        localidad4.setNombre("Los Ángeles");
        localidad4.setNumeroDeHabitantes(15000);
        //System.out.println(localidad3);

        Localidad localidad5 = new Localidad();
        localidad5.setNombre("Monteclaro");
        localidad5.setNumeroDeHabitantes(15000);
        //System.out.println(localidad5);

        Localidad localidad6 = new Localidad();
        localidad6.setNombre("Somosaguas-Prado del Rey");
        localidad6.setNumeroDeHabitantes(15000);
        //System.out.println(localidad6);

        municipio1.setLocalidades(localidad1);
        System.out.println(municipio1);
        municipio1.setLocalidades(localidad2);
        System.out.println(municipio1);
        municipio1.setLocalidades(localidad3);
        System.out.println(municipio1);
    }
}
