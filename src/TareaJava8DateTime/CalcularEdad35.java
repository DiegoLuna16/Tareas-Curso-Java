package TareaJava8DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularEdad35 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento");
        /*System.out.println("Ingresa tu dia de nacimiento");
        int dia = s.nextInt();
        System.out.println("Ingresa tu mes de nacimiento con número");
        int mes = s.nextInt();
        System.out.println("Ingresa tu año de nacimiento");
        int year = s.nextInt();*/
        String fecha = s.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fecha);
        System.out.println("La fecha de nacimiento es: " + fechaNacimiento);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("edad = " + edad.getYears());

    }
}
