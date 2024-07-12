package TareaProgramacionFuncionalApiStream;

import java.util.ArrayList;
import java.util.List;

public class CalcularImporte34 {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto( 15.0,2));
        productos.add(new Producto(4500.0,1));
        productos.add(new Producto( 2300.0,2));
        productos.add(new Producto( 3700.0,2));
        productos.add(new Producto( 12,8));

        double sum = productos.stream()
                .map(a -> a.getPrecio()*a.getCantidad())
                .reduce(0d, Double::sum);
        System.out.println("Suma total: " + sum);
    }
}
