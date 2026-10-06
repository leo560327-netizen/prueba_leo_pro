import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Escribe tu nombre completo");
        String nombre = lector.nextLine();

        System.out.println("Escribe tu Edad");
        int edad = lector.nextInt();

        System.out.println("Tu Nombre es: "+nombre);
        System.out.println("Tu Edad es: "+edad);

        lector.close();
    }
}
