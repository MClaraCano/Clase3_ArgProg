package ejdos;

import java.util.List;

public class MainDos {
    public static void main(String[] args) {

        List<String> listaString = List.of("murciélado", "elefante", "oso", "perro");

        Concatenador concatenador = new Concatenador();

        System.out.println(concatenador.concatenadorString(listaString, 5));

    }


}
