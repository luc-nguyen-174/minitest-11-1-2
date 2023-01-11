import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhap thong tin san pham
        String[][] production = new String[5][5];
        for (int i = 0; i < production.length;i++) {
            String id = String.valueOf(i+1);
            production[i][0]= id;
            System.out.println("Nhap thong tin san pham " + id);

            System.out.print("Nhap vao ten san pham: ");
            String name = scanner.nextLine();
            production[i][1]= name;

            System.out.print("Nhap vao gia: ");
            String price = scanner.nextLine();
            production[i][2]= price;

            System.out.print("Nhap vao so luong: ");
            String quantity = scanner.nextLine();
            production[i][3]= quantity;

            System.out.print("Nhap vao discount: ");
            String discount = scanner.nextLine();
            production[i][4]= discount;
        }
    }
    public double totalAmount(int price,  int quantity, double discount) {
        double total;
        return total = price * quantity * discount;
    }
}