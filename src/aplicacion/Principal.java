package aplicacion;

import dominio.Localidad;

public class Principal {
    /**
     * Mi método main con el que se llevará a cabo la ejecución del programa.
     * @param args
     */
    public static void main(String[] args){

        Localidad localidad1 = new Localidad();
        localidad1.setNombre("Madrid");
        localidad1.setNumeroDeHabitantes(15000);

        System.out.println(localidad1);

    }
}
