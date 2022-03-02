package FuramaResort.model.facility;

import FuramaResort.model.facility.Facility;

import java.util.Objects;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private byte floorQuantity;

    public Villa() {
    }

    public Villa(String idService, String serviceName, double usableArea, int rentPrice, short maxPeople,
                 String rentType, String roomStandard, double poolArea, byte floorQuantity) {
        super(idService, serviceName, usableArea, rentPrice, maxPeople, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorQuantity = floorQuantity;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public byte getFloorQuantity() {
        return floorQuantity;
    }

    public void setFloorQuantity(byte floorQuantity) {
        this.floorQuantity = floorQuantity;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                ", roomStandard: " + roomStandard + '\'' +
                ", poolArea: " + poolArea +
                ", floorQuantity: " + floorQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return Objects.equals(roomStandard, villa.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomStandard);
    }
}
