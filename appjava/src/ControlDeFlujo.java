import java.util.Scanner;

public class ControlDeFlujo {
    public static void main(String[] args){
        // Operadores de comparación
        /*int a = 15;
        int b = 10;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);*/

        // Operadores lógicos
        /*boolean a = true;
        boolean b = false;

        boolean c = a || b; // or
        boolean d = a && b; // and

        System.out.println(c);
        System.out.println(d);

        boolean x = !a; // not
        System.out.println(x);

        boolean isAdult = true;
        boolean isActive = false;
        boolean isPremium = true;
        boolean isOn = true;

        String cupon = "chanchito_feliz";

        boolean promo = cupon.equals("ultimate_java") || cupon.equals("chanchito_feliz");
        boolean hasFunds = true;

        boolean canPurchase = isAdult && isActive && hasFunds;*/

        // if
        /*int edad = 8;
        String movieClassification = "RP18";
        boolean isWithAdult = true;

        boolean isRestricted = movieClassification.contains("R");

        if (!isRestricted) {
            System.out.println("Puedes ver la película");
        } else if (edad > 17) {
            System.out.println("Puedes ver la película igual");
        } else if (isRestricted && isWithAdult && edad < 18) {
            System.out.println("Viene con un adulto, puede ver la pelicula");
        } else {
            System.out.println("No puedes ver la película");
        }*/

        // Alcance
        /*if (true) {
            String texto = "Hola Mundo";

            System.out.println(texto);
        }

        System.out.println(texto);

        System.out.println("Fin de aplicación");*/

        // OPERADOR TERNARIO
        /*int edad = 25;
        String mensaje = edad > 17 ? "Puede votar" : "No puede votar";

        System.out.println(mensaje);*/

        // SWITCH
        /*String action = "agregar";

        switch (action) {
            case "agregar":
                System.out.println("Agregando");
                break;
            case "eliminar":
                System.out.println("Eliminando recurso");
                break;
            default:
                System.out.println("Accion por defecto");
        }*/

        // EJERCICIO
        /**
         * INGRESAR UN NUMERO MUESTRA SI ES PAR O NO ES PAR y divisible por cual numero
         * algoritmo para numeros pares e impares
         * algoritmo para numeros divisibles entre 3 y 4
         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int valor = scanner.nextInt();

        System.out.println(valor % 2 == 0 ? "El número es par" : "El numero es impar");

        if (valor % 3 == 0 && valor % 4 == 0) {
            System.out.println("Divisible por 3 y por 4");
        } else if (valor % 3 == 0) {
            System.out.println("Divisible por 3");
        } else if (valor % 4 == 0) {
            System.out.println("Divisible por 4");
        }*/

        // FOR, WHILE, DO WHILE, BREAK, CONTINUE, FOR EACH
        /*String[] textos = {"Hola Mundo", "Usuario 1", "Chanchito feliz"};

        for (int i = 0; i < 5; i++){
            System.out.println("Hola mundo " + i);
        }*/

        /*int i = 0;
        while (i < 5){
            System.out.println("Hola mundo " + i);
            i++;
        }*/

        // Primero ejecuta el codigo luego realiza la evaluación
        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);*/

        /*Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Ingresar un comando: ");
            input = scanner.next().toLowerCase();

            if (input.equals("salir")) {
                break;
            }

            if (input.equals("continuar")) {
                continue;
            }

            System.out.println("Esta linea no se debería ejecutar");
        }

        System.out.println("Termino el loop");*/

        /*String[] personajes = {"Goku", "Vegeta", "Chanchito Feliz"};

        //for (int i = 0; i < personajes.length; i++) {
        //    System.out.println(personajes[i]);
        //}

        for (String personaje: personajes) {
            System.out.println(personaje);
        }*/

        // APLICACIÓN DE TERMINAL
        /*Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("salir")) {
            System.out.println("Ingresa comando: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        System.out.println("Terminó el loop.");*/

        // EJERCICIO
        // CREAR UNA APLICACIÓN QUE SE PUEDA EJECUTAR DENTRO DE LA TERMINAL
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingresa Opción");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear la nasa");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Ingresa primer número: ");
                int numero1 = scanner.nextInt();
                int numero2 = scanner.nextInt();
                System.out.println("El resultado es:");
                System.out.println(numero1 + numero2);
            }
            else if (opcion == 2) {
                System.out.println("Hackeando nasa");
                for (int i = 1; i < 5; i++) {
                    System.out.println("#".repeat(i));
                }
                System.out.println("Listo, eres hackerman!");
            } else if (opcion == 3) {
                System.out.println("Chao mundo");
                break;
            }
        }

    }
}
