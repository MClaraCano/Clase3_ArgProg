package ejdos;

import java.util.List;
import java.util.stream.Collectors;

public class Concatenador {

        public String concatenadorString (List<String> listaString, int n){
        String stringConcat = listaString.stream()
                .filter(palabra -> palabra.length() > n)
                .collect(Collectors.joining(" "));
        return stringConcat;
    }
}
