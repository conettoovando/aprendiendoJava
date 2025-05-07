import java.awt.*;

public class TiposBasicos {
    public static void main(String[] args) {
        /* Primitivos...
        /byte edad = 18;
        /int numeroGrade = 1000;
        /float age = 15.5F;
        /System.out.println(age);

        boolean isActive = true;
        char course = 'a';

        System.out.println(isActive);
        System.out.println(course);
        */

        // String
        /*String text = "C:\\Hola \"Mundo!\"";

        int largo = text.length();

        String texto = text.replace("Hola", "Chao");
        System.out.println(texto);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mund"));

        System.out.println(text.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "   chanchito feliz   ";
        System.out.println(malo.trim());
        System.out.println(malo);

        String texto_ = "Hola \nMun\tdo";
        System.out.println(texto_);*/

        // Array
        //int[] numeros = new int[5];
        /*int[] numeros = {0, 1, 2, 3, 4};
        numeros[0] = 5;
        numeros[4] = 7;
        //numeros[7] = 10; -> Error
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length);
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));*/

        // Multiples dimensiones
        //int[][] numeros = { {0, 1}, {2, 3}};
        //int[][] numeros = new int[3][2];
        //numeros[0][0] = 5;
        //System.out.println(Arrays.deepToString(numeros));

        // Constantes
        //final String empresa = "Hola Mundo Limited";
        //empresa = "Chanchito feliz";
        //System.out.println(empresa);

        // Comentarios de multiples lineas
        /* Escribir todos
        * los comentarios */

        // Operadores aritmeticos
        /* int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        int m = 4 % 3; // modulo
        int d = 10 / 3; // -> 3
        float d2 = 10f / 3f; // -> 3.3333
        double d3 = 10.0 / 3.0;

        int x = 5;
        // int y = x++;
        x += 5;
        System.out.println(x);
        // System.out.println(y); */

        // Orden de las operaciones
        /**
         * PEMDAS
         * parentesis
         * potencias
         * multiplicación
         * división
         * suma
         * resta
         */
        /*int r = (5 + 3) * 2;
        System.out.println(r);*/

        // Conversion de tipos.

        // Conversion implicita
        /* byte a = 1;
        double b = 15.15;
        double c = a + b;
        System.out.println(c);

        // conversion explicita
        int x = 15;
        double y = 15.015;
        int z = x + (int) y;
        System.out.println(z);

        // conversion explicita de un string
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k;
        System.out.println(l);*/

        // Clase Math
        /*System.out.println(Math.abs(-15));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.floor(10.999));

        System.out.println(Math.max(10, 8));
        System.out.println(Math.min(10, 8));

        System.out.println(Math.round(15.5));

        double random = Math.random();
        System.out.println((int) (random * 100));*/

        // Formato de numeros
        // Cambiar formato
        /*Locale locale = Locale.forLanguageTag("es-CL");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String result = numberFormat.format(1099.90);
        System.out.println(result);

        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));*/

        // Clase Scanner
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        //String valor = scanner.next(); // Evalua cada una de las palabras separadas por un espacio como un token. next toma el primer token disponible
        //String valor = scanner.nextLine(); // Lo mismo pero con toda la linea
        Byte valor = scanner.nextByte();
        System.out.println("Tu edad es: ");
        System.out.println(valor);*/

        /**
         * Ejercicio 1
         * Crear una calculadora que reciba
         * 2 numeros y luego imprima el resultado
         * de la suma de estos dos números
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int primerValor = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int segundoValor = scanner.nextInt();
        int suma = primerValor + segundoValor;
        System.out.println(suma);*/

        // REFEERENCIA VS PRIMITIVOS
        // Primivita
        /*int a = 15;
        int b = a;

        b = 33;
        System.out.println(a);*/

        // REFERENCIA
        Point point1 = new Point();
        Point point2 = point1;

        point2.x = 15;

        System.out.println(point1);

        // metodo var para declarar variable
        //var x = 45;
    }
}