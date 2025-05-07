public class ejercicio1 {
    public static void main(String[] args) {
        /**
         * Crear la clase VideoGame
         * con las propiedades
         * name string
         * price double
         * category string
         *
         * getter y setters para todas las propiedades
         */

        VideoGame game = new VideoGame("Schedule I", 10.500, "drugs");

        System.out.println(game.getName());
        System.out.println(game.getPrice());
        System.out.println(game.getCategory());

        game.setPrice(10);
        System.out.println(game.getPrice());
        game.setCategory("falopa");
        System.out.println(game.getCategory());
        game.setCategory("action");
        System.out.println(game.getCategory());
    }
}
