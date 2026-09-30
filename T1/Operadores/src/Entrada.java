import java.sql.SQLOutput;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("indicame tu nombre");
        // dependiendo del tipo de dato que quieras leer la variable lector tiene metodos para ello

        String nombre = lector.nextLine();
        System.out.println("en que ciclo estas matriculado");
        String ciclo = lector.nextLine();

        System.out.println("Que nota quieres sacar de media en "+ciclo);
        double media = lector.nextDouble();

        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Media: "+media);
    }
}
