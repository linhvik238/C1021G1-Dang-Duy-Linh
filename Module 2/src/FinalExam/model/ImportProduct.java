package FinalExam.model;

public class ImportProduct extends Product {
    int importPrice;
    String importCity;
    double importTax;

    public ImportProduct() {
    }

    public ImportProduct(String productCode, String name, int price, int quantity, String producer, int importPrice, String importCity, double importTax) {
        super(productCode, name, price, quantity, producer);
        this.importPrice = importPrice;
        this.importCity = importCity;
        this.importTax = importTax;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public String getImportCity() {
        return importCity;
    }

    public void setImportCity(String importCity) {
        this.importCity = importCity;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" + super.toString() +
                ", importPrice=" + importPrice +
                ", importCity='" + importCity + '\'' +
                ", importTax=" + importTax +
                '}';
    }
}
