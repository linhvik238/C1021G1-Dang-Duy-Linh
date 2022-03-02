package FinalExam.model;

public class ExportProduct extends Product {
    private int exportPrice;
    private String exportCountry;

    public ExportProduct() {
    }

    public ExportProduct(String productCode, String name, int price, int quantity, String producer, int exportPrice, String exportCountry) {
        super(productCode, name, price, quantity, producer);
        this.exportPrice = exportPrice;
        this.exportCountry = exportCountry;
    }

    public int getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    @Override
    public String toString() {
        return "ExportProduct{" + super.toString() +
                ", exportPrice=" + exportPrice +
                ", exportCountry='" + exportCountry + '\'' +
                '}';
    }
}
