package CaseStudy09.model;

public class HandGoodsPhone extends Phone {
    private String portableCountry;
    private String status;

    public HandGoodsPhone() {
    }

    public HandGoodsPhone(String name, int price, int quantity, String brand, String portableCountry, String status) {
        super(name, price, quantity, brand);
        this.portableCountry = portableCountry;
        this.status = status;
    }

    public String getPortableCountry() {
        return portableCountry;
    }

    public void setPortableCountry(String portableCountry) {
        this.portableCountry = portableCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandGoodsPhone{" + super.toString() +
                ", portableCountry='" + portableCountry + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
