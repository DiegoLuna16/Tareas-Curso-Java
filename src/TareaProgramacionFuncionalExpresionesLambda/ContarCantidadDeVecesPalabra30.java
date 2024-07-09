package TareaProgramacionFuncionalExpresionesLambda;

import java.util.Collections;

public class ContarCantidadDeVecesPalabra30 {
    public static void main(String[] args) {
        ContarPalabras30 contar = a -> {
            String[] arreglo = a.replace(".", "")
                    .replace(",", "")
                    .toLowerCase()
                    .split(" ");

        int max = 0;
        String palabra = null;
        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i].equalsIgnoreCase(arreglo[j])) {
                    cantidad++;
                }
            }

            if(cantidad > max){
                max = cantidad;
                palabra = arreglo[i];
            }
        }

        return Collections.singletonMap(palabra, max);
    };
        contar.contar("Yo ni te conozco, ni te he visto, ni se tu nombre, ni te hablaré, ni me interesas.")
                .forEach( (k, v) -> System.out.println("la palabra " + k + " se repite " + v + " veces."));
}
}
