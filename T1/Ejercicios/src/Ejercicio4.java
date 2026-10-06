import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double bebidas = 1.25;
        double bocadillos = 2.05;

        System.out.println("Cuantas bebidas quieres");
        int bebidasAmigos = lector.nextInt();

        System.out.println("Cuantos bocadillos quieres");
        int bocadillosAmigos = lector.nextInt();

        double totalBebidas= bebidas*bebidasAmigos;
        double totalBocadillos = bocadillos*bocadillosAmigos;
        double total = totalBebidas+totalBocadillos;



        System.out.println("tu total de bebidas es: "+totalBebidas);
        System.out.println("tu total de bocadillos es: "+totalBocadillos);
        System.out.println("tu total de todo es: "+total);

        lector.close();

    }
}
