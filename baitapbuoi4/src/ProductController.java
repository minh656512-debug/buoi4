import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class ProductController {
    public static Scanner sc = new Scanner(System.in);

    public static void addProduct(Product product) {
        Main.danhSachSP.add(product);
        if(product instanceof Laptop){
            Laptop.danhSachLapTop.add((Laptop) product);
        } else if(product instanceof SmartPhone){
            SmartPhone.danhSachSmartPhone.add((SmartPhone) product);
        }
        else{
            System.out.println("Da them san pham vao danh sach chung");
        }
    }

    public static void addProduct(String type, String name, String description, double price) {
        System.out.print("Nhap loai san pham muon them: ");
        type = sc.nextLine();
        if (type.equalsIgnoreCase("laptop")) {
            System.out.print("Ten laptop muon them: ");
            name = sc.nextLine();
            System.out.print("Mo ta: ");
            description = sc.nextLine();
            System.out.print("Gia: ");
            price = Double.parseDouble(sc.nextLine());
            System.out.print("Cpu: ");
            String cpu = sc.nextLine();
            System.out.print("Ram: ");
            String ram = sc.nextLine();
            Laptop laptop = new Laptop(cpu, ram, name, description, price);
            addProduct(laptop);
        } else if (type.equalsIgnoreCase("smartphone")) {
            System.out.print("Ten smartphone muon them: ");
            name = sc.nextLine();
            System.out.print("Mo ta: ");
            description = sc.nextLine();
            System.out.print("Gia: ");
            price = Double.parseDouble(sc.nextLine());
            System.out.print("Co 5G hay khong? (y/n): ");
            String luachon = sc.nextLine();
            boolean has5G;
            if (luachon.equalsIgnoreCase("y")) {
                System.out.print("Co 5G");
                has5G = true;
            } else {
                System.out.print("Khong co 5G");
                has5G = false;
            }
            SmartPhone smartPhone = new SmartPhone(has5G, name, description, price);
            addProduct(smartPhone);
        } else {
            System.out.println("San pham khong thuoc laptop hay smartphone -> Cho vao san pham chung");
            System.out.print("Ten san pham muon them: ");
            name = sc.nextLine();
            System.out.print("Mo ta: ");
            description = sc.nextLine();
            System.out.print("Gia: ");
            price = Double.parseDouble(sc.nextLine());
            Product product = new Product(name, description, price);
            addProduct(product);
        }

    }

    public static Product timKiemTheoMa(int maTim) {
        for (Product pd : Main.danhSachSP) {
            if (pd.getId() == maTim) {
                return pd;
            }
        }
        return null;
    }

    public static void removeById(int idXoa) {
        Product pd = timKiemTheoMa(idXoa);

        if (pd != null) {
            Main.danhSachSP.remove(pd);
            if (pd instanceof Laptop) {
                Laptop.danhSachLapTop.remove(pd);
            } else if (pd instanceof SmartPhone) {
                SmartPhone.danhSachSmartPhone.remove(pd);
            }
            System.out.println("Da xoa sp: ");
        } else {
            System.out.println("Khong co san pham co ID: " + idXoa);
        }
    }

    public static Product getById(int id) {

        for (Product pd : Main.danhSachSP) {
            if (pd.getId() == id) {
                return pd;
            }
        }
        return null;
    }

    public static void getAllProducts() {
        if (Main.danhSachSP.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            for (Product pd : Main.danhSachSP) {
                System.out.println(pd);
            }
        }

    }
}
