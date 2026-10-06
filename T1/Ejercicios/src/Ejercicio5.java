import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("que cantidad de segundos quieres pasar a h:m:s");
        int segundosSistemas = lector.nextInt();
        lector.close();

        int horas = segundosSistemas/3600;
        int segundosrestantes = segundosSistemas%3600;
        System.out.println("horas "+horas);
        System.out.println("segundos restantes "+segundosrestantes);
        int minutos = segundosrestantes/60;
        System.out.println("minutos "+minutos);
        int segundos = segundosrestantes%60;
        System.out.println("segundos "+segundos);
    }
}
