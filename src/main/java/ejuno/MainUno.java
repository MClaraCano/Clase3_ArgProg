package ejuno;

import java.util.List;
import java.util.stream.Collectors;

public class MainUno {
    public static void main(String[] args) {

        List<String> listaString = List.of("banana", "pera", "manzana", "melón");

        List<String> listaMayus = listaString.stream()
                .map(fruta -> fruta.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(listaMayus);
    }
}
