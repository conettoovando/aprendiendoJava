public class Metodos {
    public static void main(String[] args) {
        //miMetodo("Cristian", 24);
        //miMetodo("Chanchito feliz", 32);
        /*int resultado = suma(12, 25);
        int resultado2 = suma(12, 25, 45);

        System.out.println(resultado);
        System.out.println(resultado2);

        String texto = suma();
        System.out.println(texto);*/

        int r = suma(new int[] {1, 2, 3, 4, 5});
        System.out.println(r);
    }

    /*static void miMetodo(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tu edad es: " + edad);
    }

    static int suma (int a, int b ) {
        return a + b;
    }

    // overloading
    static int suma (int a, int b, int c) {
        return a + b + c;
    }

    static String suma() {
        return "Hola mundo";
    }*/

    static int suma(int[] numeros) {
        int result = 0;

        for(int numero: numeros){
            result += numero;
        }
        return result;
    }
}