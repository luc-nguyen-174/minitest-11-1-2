import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];
        products[0] = new Product(1,"Táo",3000,13,5);
        products[1] = new Product(2,"Lê",5000,9,10);
        products[2] = new Product(3,"Chuối",10000,8,15);
        products[3] = new Product(4,"Xoài",9000,10,2);
        products[4] = new Product(5,"Mận",2000,5,7);

        for (int i = 0; i < products.length; i++){
            System.out.println(products[i].toString());
        }
        Main main = new Main();
        System.out.println("\nGiá trước khuyến mãi: " + main.getTotalAmount(products));
        System.out.println("\nGiá sau khi đã giảm khuyến mãi: "+main.getAmountAfterDiscount(products));
        System.out.println("\nTiền chênh lệch: " + (main.getTotalAmount(products)-main.getAmountAfterDiscount(products)));
    }

    public double getTotalAmount(Product[] products){
        double totalAmount=0;
        for (int i = 0; i < products.length; i++){
            totalAmount += products[i].getAmount();
        }
        return totalAmount;
    }


    public double getAmountAfterDiscount(Product[] products) {
        double totalAmountAfterDiscount=0;
        for (int i = 0; i < products.length; i++){
            totalAmountAfterDiscount += products[i].getAmountAfterDiscount();
        }
        return totalAmountAfterDiscount;
    }
}