package HashTable;

public class Products {
    private String ID;
    private String ProductName;
    private int price;

    public Products(String ID, String productName, int price) {
        this.ID = ID;
        ProductName = productName;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "ID='" + ID + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", price=" + price +
                '}';
    }
}
