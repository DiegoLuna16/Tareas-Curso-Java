package TareaProgramacionFuncionalExpresionesLambda;

public class EliminarEspacios29 {
    public static void main(String[] args) {

        ModificarFrase29 modificar = a -> {
            return a.replace(".","")
                    .replace(",","")
                    .replace(" ","")
                    .toUpperCase();
        };

        String resultado = modificar.modificarFrase("Hola como estas, mi nombre es diego.");
        System.out.println(resultado);

    }
}
