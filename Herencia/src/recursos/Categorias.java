package recursos;

import java.util.Objects;

public class Categorias extends Base{
    public Categorias(String name) {
        super(name);
        System.out.println("Soy categorias");
    }

    public String toString() {
        return this.name;
    }


    public void metodoCategoria() {
        System.out.println("soy instancia de categoria");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Categorias)) return super.equals(obj);


        var c = (Categorias)obj;
        return Objects.equals(this.name, c.name);
    }

    public void guardar() {
        System.out.println("Guardando categoria");
    }
}
