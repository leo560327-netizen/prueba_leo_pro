public class Entrada {

    public static void main(String[] args){

        // VARIABLES

        // palabras
        String nombreNuevo = "Leo";
        String apellido1 = "Torrado";
        String apellido2 = "Alfonzo";
        nombreNuevo = "Leo T";

        // letras
        char letra = 'J';
        // convertir una variable de (primitiva a compleja)
        Character letraCompleja = letra;
        letra = 'F';

        // numero sin decimales usamos (int)
        int edad = 18;

        // numero con decimales usamos (double o float)
        // double te deja has 64
        double altura = 1.67;

        // float te deja 32 (poner f al final para que sepa que tiene que parar de guardar 0)
        float alturaFloat = 1.67f;

        // solo dos posibilidades (true o false)
        boolean acierto = true;

        // la clase object es como la que engloba todo (claase pade de java)
        Object cosa = "cualquier cosa";

        // no mutables
        final String DNI = "1234B";
        System.out.println(DNI);

        System.out.println("Hola mundo");
        System.out.println("siguiete linea");
        System.out.println(18+" esta es mi edad el dia de mi cumple");
        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años",nombreNuevo,apellido1,apellido2,edad);
        // %s -> es para poner una palabra
        // %d -> es para poner un numero sin decimales
        // %f -> es para poner un numero con decimales

    }
}