package CaseStudy09.model;

public class AuthenticPhone extends Phone {
    private int warrantyPeriod;
    private String warrantyCoverage;

    public AuthenticPhone() {
    }

    public AuthenticPhone(String name, int price, int quantity, String brand, int warrantyPeriod, String warrantyCoverage) {
        super(name, price, quantity, brand);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "AuthenticPhone{" + super.toString() +
                ", warrantyPeriod=" + warrantyPeriod +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
