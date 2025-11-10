import java.util.UUID;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private static int count=0;

    public Product() {
    }

    public Product(String name, String description, double price) {
        this.id = count++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Product getById(int id){
        for(Product pd : Main.danhSachSP ){
            if(pd.getId() == id){
                return pd;
            }
        }
        return null;
    }

    public static void getInfo(){
        for(Product pd : Main.danhSachSP){
            System.out.println(pd.toString());
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
