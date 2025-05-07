public class Main {
    public static void main(String[] args) {
        User user = new User("Cristian");

        user.login();

        String pass = user.getPassword();
        System.out.println(pass);
        user.setPassword("12312345");
        System.out.println(user.getPassword());

        User user2 = new User("Hola mundo", "Chanchito@feliz.com");
    }
}
