import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;

public class VideoGame {
    private String name;
    private double price;
    private String category;
    static String[] categories = {"action", "rpg", "adventure", "racing"};

    public VideoGame(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getPrice() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        return nf.format(this.price);
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String newCategory) {
        for (String category: categories) {
            if (category.equals(newCategory)) {
                this.category = newCategory;
                break;
            }
        }
    }

}
