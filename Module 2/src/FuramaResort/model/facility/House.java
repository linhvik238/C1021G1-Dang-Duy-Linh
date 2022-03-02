package FuramaResort.model.facility;

import FuramaResort.model.facility.Facility;

import java.util.Objects;

public class House extends Facility {
    private String roomStandard;
    private byte floorQuantity;

    public House() {
    }

    public House(String idService, String serviceName, double usableArea, int rentPrice, short maxPeople,
                 String rentType, String roomStandard, byte floorQuantity) {
        super(idService, serviceName, usableArea, rentPrice, maxPeople, rentType);
        this.roomStandard = roomStandard;
        this.floorQuantity = floorQuantity;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public byte getFloorQuantity() {
        return floorQuantity;
    }

    public void setFloorQuantity(byte floorQuantity) {
        this.floorQuantity = floorQuantity;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                ", roomStandard: " + roomStandard + '\'' +
                ", floorQuantity: " + floorQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(roomStandard, house.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomStandard);
    }
}
