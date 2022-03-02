package FinalExam.model;

public class Product {
    private static int idAuto = 0;
    private int id;
    private String productCode;
    private String name;
    private int price;
    private int quantity;
    private String producer;

    public Product() {
    }

    public Product(String productCode, String name, int price, int quantity, String producer) {
        idAuto++;
        this.id = idAuto;
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.producer = producer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", producer='" + producer;
    }
}
