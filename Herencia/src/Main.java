import recursos.*;

/*public class Main {
    public static void main(String[] args){
        Categorias c = new Categorias("Telefonos");
        Productos p = new Productos("Iphone");

        Base[] recursos = { c, p };
        guardarRecursos(recursos);
    }

    public static void miMetodo(Base base) {
        if (base instanceof Categorias){
            var c = (Categorias)base;
            c.metodoCategoria();
        }
        System.out.println(base.getName());
    }

    public static void guardarRecursos(Base[] recursos) {
        for (Base recurso: recursos) {
            recurso.guardar();
        }
    }
}*/


public class Main {
    public static void main(String[] args) {
        Restaurante r = new Restaurante();
        Garzon g1 = new Garzon();
        Garzon g2 = new Garzon();
        Garzon g3 = new Garzon();

        r.llevarCervezas(new Garzon[]{ g1, g2, g3 });
    }
}