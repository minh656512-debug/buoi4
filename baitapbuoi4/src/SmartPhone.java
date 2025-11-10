import java.util.ArrayList;

public class SmartPhone extends Product {
    private boolean has5G;
    public static ArrayList<SmartPhone> danhSachSmartPhone = new ArrayList<>();
    public SmartPhone(){
        super();
    }

    public SmartPhone(boolean has5G, String name, String description, double price) {
        super(name, description, price);
        this.has5G = has5G;
    }
    public static void getInfo(){
        for(SmartPhone sp : danhSachSmartPhone){
            System.out.println(sp);
        }
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "id=" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() + '\'' +
                ", has5G=" + has5G +
                '}';
    }
//    public static void getInfo(){
//        for(Product pd : Main.danhSachSP){
//            System.out.println(pd.toString());
//        }
//    }
}
