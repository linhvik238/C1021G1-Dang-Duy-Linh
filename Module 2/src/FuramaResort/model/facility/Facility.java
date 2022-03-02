package FuramaResort.model.facility;

public abstract class Facility {
    private String idService;
    private String serviceName;
    private double usableArea;
    private int rentPrice;
    private short maxPeople;
    private String rentType;

    public Facility() {
    }

    public Facility (String idService, String serviceName, double usableArea,
                     int rentPrice, short maxPeople, String rentType) {
        this.idService = idService;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentPrice = rentPrice;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public short getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(short maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return
                "idService= " + idService +
                ",serviceName='" + serviceName +
                ", usableArea=" + usableArea +
                ", rentPrice=" + rentPrice +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType ;
    }
}
