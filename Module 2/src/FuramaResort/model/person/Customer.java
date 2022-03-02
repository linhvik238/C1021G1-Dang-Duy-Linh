package FuramaResort.model.person;

public class Customer extends Person {
    private String guestType;
    private String address;

    public Customer() {
    }

    public Customer(String id, String fullName, String dayOfBirth, String sex, String identityCardNo,
                    String phoneNo, String email, String guestType, String address) {
        super(id, fullName, dayOfBirth, sex, identityCardNo, phoneNo, email);
        this.guestType = guestType;
        this.address = address;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
