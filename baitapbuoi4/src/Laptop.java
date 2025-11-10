import java.util.ArrayList;

public class Laptop extends Product {
    private String ram;
    private String cpu;
    public static ArrayList<Laptop> danhSachLapTop = new ArrayList<>();
    public Laptop() {
        super();
    }

    public Laptop(String cpu, String ram, String name, String description, double price) {
        super(name, description, price);
        this.cpu = cpu;
        this.ram = ram;
    }
    public static void getInfo(){
        for(Laptop lt : danhSachLapTop){
            System.out.println(lt);
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
  


}
