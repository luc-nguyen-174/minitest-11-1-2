public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private double discount;

    public Product() {
    }

    public Product(int id, String name, int price, int quantity, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return price * quantity;
    }

    public double getAmountAfterDiscount() {
        return price * (1 - discount / 100) * quantity;
    }


    @Override
    public String toString() {
        return "Mã sản phẩm=" + id +
                ", tên sản phầm: " + name +
                ", giá: " + price +
                ", số lượng: " + quantity +
                ", giảm giá: " + discount + "%";
    }
}
