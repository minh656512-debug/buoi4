import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static ArrayList<Product> danhSachSP = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        danhSachSP.addAll(SmartPhone.danhSachSmartPhone);
        danhSachSP.addAll(Laptop.danhSachLapTop);

        Laptop lt1 = new Laptop("Apple M2", "8GB", "MacBook Air", "Mỏng nhẹ, pin lâu", 1200.0);
        Laptop lt2 = new Laptop( "Intel i7", "16GB", "Dell XPS 13", "Siêu mỏng, hiệu năng cao", 1500.0);
        SmartPhone sp1 = new SmartPhone( true, "iPhone 15", "Hiệu năng cao, camera xuất sắc", 1200.0);

        danhSachSP.add(lt1);
        danhSachSP.add(lt2);
        danhSachSP.add(sp1);

    int choice;
    do{
        showMenu();
        System.out.print("Vui long chon chuc nang: ");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                ProductController.addProduct("", "", "", 0);
                break;
            case 2:
                System.out.print("Nhap ID sp can xoa: ");
                int idXoa = Integer.parseInt(sc.nextLine());
                ProductController.removeById(idXoa);
                break;
            case 3:
                System.out.println("San pham can tim");
                System.out.print("Nhap ID san pham can tim: ");
                int idTim = Integer.parseInt(sc.nextLine());
                Product found = ProductController.getById(idTim);
                if (found != null) {
                    System.out.println("Tim thay san pham:");
                    System.out.println(found);
                } else {
                    System.out.println("Khong tim thay san pham co ID: " + idTim);
                }
                break;
            case 4:
                System.out.println("Danh sach san pham");
                ProductController.getAllProducts();
                break;

            case 5:
                System.out.println("Thoat chuong trinh");
                break;
            default:
                System.out.println("Loi chuong trinh!!! Yeu cau nhap lai tu 1->5");






        }


    }while (choice != 5);




    }



    public static void showMenu(){
        System.out.println("\n--- MENU ---");
        System.out.println("1. Nhap san pham can them");
        System.out.println("2. Xoa san pham");
        System.out.println("3. Tim san pham");
        System.out.println("4. Hien thi tat ca san pham");
        System.out.println("5. Thoat");
    }



}
