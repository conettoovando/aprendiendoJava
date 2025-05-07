class User {
    static String tableName = "user";
    double id = Math.random();
    String name;
    String email;

    private String password = "15#@!oau";

    User(String name) {
        this.name = name;
    }

    User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println("llamando a base de datos");
    }

    private void validatePassword() {
        System.out.println("Verificar contraseña");
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword (String password) {
        System.out.println("Encriptando contraseña");
        String ecryptedPassword = password;

        this.password = ecryptedPassword;
    }

    public void setPassword (String password, String encryption) {
        System.out.println("Encriptar la contraseña con el encriptado");
    }

}
