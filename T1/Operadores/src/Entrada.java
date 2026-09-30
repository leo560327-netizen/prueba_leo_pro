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

        // Operadores aritmeticas
        int operador1 = 5;
        int operador2 = 2;
        int suma = operador1+operador2;
        int resta = operador1-operador2;
        int multiplicacion = operador1*operador2;
        double division = (double)operador1/operador2;

        // Modulo (%) es el resto de la division de dos numeros
        int resto = 5%2;

        String numero = "5";
        String numero2 = "7";

        System.out.println("concatenar string "+ (operador1+operador2));
        System.out.println("la suma de los operadores es: "+suma);
        System.out.println("la resta de los operadores es: "+resta);
        System.out.println("la multiplicacion de los operadores es: "+multiplicacion);
        System.out.println("la division de los operadores es: "+division);
        System.out.println("el resto de la division es: "+resto);

        //Operadores de asignacion
        operador1 = 10;
        operador2 = 16;
        operador1++;
        operador2--;
        operador1+= 12;
        operador2-= 5;
        operador1*= 2;
        operador2%=2;
        System.out.println("el valor despues de haber operado es: "+operador1);
        System.out.println("el valor despues de haber operado es: "+operador2);

        //Operadores Relacionales o Comparacion -> siempre te tiene que dar un boolean (true o false)
        operador1 = 10;
        operador2 = 10;
        boolean comparacion = operador1>operador2; // false
        System.out.println("la comparacion de > es: "+comparacion);
        comparacion = operador1>=operador2; //true
        System.out.println("la comparacion de >= es: "+comparacion);
        comparacion = operador2<operador1; // false
        System.out.println("la comparacion de < es: "+comparacion);
        comparacion = operador2<=operador1; // true
        System.out.println("la comparacion de <= es: "+comparacion);
        comparacion = operador1 == operador2; // true
        System.out.println("la comparacion de == es: "+comparacion);
        comparacion = operador1 != operador2; //false
        System.out.println("la comparacion de != es: "+comparacion);

        // Comparar con String(comparar palabras se tiene que utilizar equals en ves de ==)
        // para comparar palabras hay dos formas con equals (esta toma en cuenta si hay mayuscula o minuscula) o equalsIgnoreCase (esta ignora eso)
        String palabra1 = "prOgramaciones";
        String palabra2 = "programacion";
        boolean compararPalabraIguales = palabra1.equals(palabra2); // false
        compararPalabraIguales = palabra1.equalsIgnoreCase(palabra2); // true
        boolean compararPalabrasDiferentes = !palabra1.equalsIgnoreCase(palabra2); // false
        System.out.println("la comparacion de palabras es: "+compararPalabraIguales);
        System.out.println("esta palabra es diferente: "+compararPalabrasDiferentes);

        // Operadores logicos -> sentencias && -> ||
        // && -> AND (con que tenga solo una falsa el resultado va hacer falso)
        // || -> OR (con que tenga solo una verdadera el resultado va hacer verdadero)
        operador1 = 10;
        operador2 = 20;
        boolean comparacionAND = operador2 > 0 && operador1 < 10; //false
        //                       T             && F
        boolean comparacionOR = operador1 < 10 || operador2 < 20 || operador1*2 >= operador2; // true
        //                      F              || F                 T
        System.out.println("comparacion verdadero o falso: "+comparacionAND);
        System.out.println("comparacion verdadero o falso OR: "+comparacionOR);


    }
}
