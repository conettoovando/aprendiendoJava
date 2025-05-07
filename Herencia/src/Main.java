import recursos.Base;
import recursos.Categorias;
import recursos.Productos;

public class Main {
    public static void main(String[] args){
        Categorias c = new Categorias();
        Productos p = new Productos();

        Base b = new Base();
        System.out.println(b.hashCode());
    }
}
