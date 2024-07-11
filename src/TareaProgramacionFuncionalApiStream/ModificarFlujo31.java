package TareaProgramacionFuncionalApiStream;

import java.util.ArrayList;
import java.util.List;

public class ModificarFlujo31 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i < 101; i++) {
            numeros.add(i);
        }

//        System.out.println(numeros.size());

        double numerosModificados = numeros.stream()
                .filter(num -> !(num % 10 == 0))
                .mapToDouble(num -> (double) num / 2)
                .reduce(0, Double::sum);

        System.out.println(numerosModificados);
    }
}