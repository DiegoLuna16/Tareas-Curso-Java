package TareaProgramacionFuncionalApiStream;

import java.util.stream.Stream;

public class ObtenerNumeroMayorArreglo32 {

    public static void main(String[] args) {

        Integer mayorNumero = Stream.of(4,7,10,56,345,23,5656,44324,45,436,345,321,3,100000)
                .reduce( (a,b) -> a > b ? a : b)
                .orElseThrow();
        System.out.println("mayorNumero = " + mayorNumero);
    }
}
