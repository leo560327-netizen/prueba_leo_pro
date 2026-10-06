import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero1 = lector.nextInt();

        System.out.println("Introduce otro numero");
        int numero2 = lector.nextInt();

        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int divisionEntera = numero1/numero2;
        int resto = numero1%numero2;
        double diviReal = (double)numero1/numero2;
        double restoReal = (double)numero1%numero2;

        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la division es: "+divisionEntera);
        System.out.println("el resto es: "+resto);
        System.out.println("la divion real es: "+diviReal);
        System.out.println("el resto real es: "+restoReal);


        lector.close();

    }
}
