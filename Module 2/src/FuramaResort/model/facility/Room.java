package FuramaResort.model.facility;

import FuramaResort.model.facility.Facility;

public class Room extends Facility {
    private String complimentaryService;

    public Room() {
    }

    public Room(String idService, String serviceName, double usableArea, int rentPrice,
                short maxPeople, String rentType, String complimentaryService) {
        super(idService, serviceName, usableArea, rentPrice, maxPeople, rentType);
        this.complimentaryService = complimentaryService;
    }

    public String getComplimentaryService() {
        return complimentaryService;
    }

    public void setComplimentaryService(String complimentaryService) {
        this.complimentaryService = complimentaryService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                " complimentaryService: " + complimentaryService + '\'' +
                '}';
    }
}
