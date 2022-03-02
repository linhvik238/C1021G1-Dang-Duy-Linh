package FuramaResort.services.implement;

import FuramaResort.controller.FuramaController;
import FuramaResort.model.facility.Facility;
import FuramaResort.model.facility.House;
import FuramaResort.model.facility.Room;
import FuramaResort.model.facility.Villa;
import FuramaResort.services.IFacilityService;
import groovyjarjarpicocli.CommandLine;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    public static final String FILE_VILLA = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\FuramaResort\\data\\villaProfile.csv";
    public static final String FILE_HOUSE = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\FuramaResort\\data\\houseProfile.csv";
    public static final String FILE_ROOM = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\FuramaResort\\data\\roomProfile.csv";
    Scanner scanner = new Scanner(System.in);
    public static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    public static void readFile() {
        for (Map.Entry<Facility, Integer> facility : readVillaFromFile().entrySet()) {
            facilityList.put(facility.getKey(), 1);
        }
        for (Map.Entry<Facility, Integer> facility : readHouseFromFile().entrySet()) {
            facilityList.put(facility.getKey(), 1);
        }
        for (Map.Entry<Facility, Integer> facility : readRoomFromFile().entrySet()) {
            facilityList.put(facility.getKey(), 1);
        }
    }

    public FacilityServiceImpl() {
    }
    static {
        readFile();
        if (facilityList.size() == 0) {
            Villa villa = new Villa("SVVL-0001", "Villa", 40.0, 15000000,
                    (short) 15, "year", "Spanish", 35.0, (byte) 2);

            House house = new House("SVHO-0001", "House", 35, 2500000,
                    (short) 10, "month", "Superior", (byte) 2);
            Room room = new Room("SVRO-0001", "Room", 35,
                    600000, (short) 2, "day", "Water");
            writeToFileRoom();
            writeToFileHouse();
            writeToFileVilla();
        }
    }

    public int random() {
        int random = (int) Math.floor(Math.random() * 10);
        return random;
    }

    public String inputIdService(String service) {
        String idService;
        boolean check = false;
        do {
            if (service.equals("villa")) {
                idService = "SVVL-" + random() + random() + random() + random();
                break;
            } else if (service.equals("house")) {
                idService = "SVHO-" + random() + random() + random() + random();
                break;
            } else {
                idService = "SVRO-" + random() + random() + random() + random();
                break;
            }
        } while (check);
        return idService;
    }

    public String[] createFacility() {
        String[] propertyFacility = new String[4];
        double usableArea = inputUsableArea();
        int rentPrice = inputPrice();
        short maxPeople = maxPeople();
        String[] rentTypeList = {"year", "month", "day", "hour"};
        String rentType = rentType(rentTypeList);
        propertyFacility[0] = String.valueOf(usableArea);
        propertyFacility[1] = String.valueOf(rentPrice);
        propertyFacility[2] = String.valueOf(maxPeople);
        propertyFacility[3] = String.valueOf(rentType);
        return propertyFacility;
    }

    private double inputUsableArea() {
        double usableArea;

        do {
            System.out.println("Enter usage area: ");
            try {
                usableArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input error, please try again with (number.number) format");
                continue;
            }
            if (usableArea < 30) {
                System.out.println("Cannot less than 30 meter square, please input again!");
                continue;
            }
            return usableArea;
        } while (true);
    }

    private int inputPrice() {
        boolean check;
        int rentPrice = 0;
        do {
            check = false;
            System.out.println("Enter price: ");
            try {
                rentPrice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input number only, please try again!");
                check = true;
                continue;
            }
            if (rentPrice < 0) {
                System.out.println("Cannot input negative price, please try again!");
                check = true;
            }
        } while (check);
        return rentPrice;
    }

    private short maxPeople() {
        boolean check;
        short maxPeople = 0;
        System.out.println("Enter max number of people: ");
        do {
            check = false;
            try {
                maxPeople = Short.parseShort(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Only can input a number, please try again!");
                check = true;
                continue;
            }
            if (maxPeople < 0 || maxPeople > 20) {
                System.out.println("Number of people cannot less than 0 and greater than 20, please try again!");
                check = true;
            }
        } while (check);
        return maxPeople;
    }

    private String rentType(String[] rentType) {
        String rentT;
        boolean check;
        do {
            check = true;
            System.out.println("Enter rent type: ");
            rentT = scanner.nextLine();
            for (String array : rentType) {
                if (rentT.toLowerCase().equals(array.toLowerCase())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Input wrong data, please input either (year, month, day or hour)");
            }
        } while (check);
        return rentT;
    }

    @Override
    public void listMaintenance() {
        for (Map.Entry<Facility, Integer> facilityMaintenance : facilityList.entrySet()) {
            if (facilityMaintenance.getValue() == 5) {
                if (facilityMaintenance.getKey() instanceof Villa) {
                    Villa villa = (Villa) facilityMaintenance.getKey();
                    System.out.println(villa.getServiceName() + " " + villa.getRoomStandard()
                            + " has been used for 5 times, please maintain!");
                } else if (facilityMaintenance.getKey() instanceof House) {
                    House house = (House) facilityMaintenance.getKey();
                    System.out.println(house.getServiceName() + " " + house.getRoomStandard()
                            + " has been used for 5 times, please maintain!");
                } else {
                    System.out.println(facilityMaintenance.getKey().getServiceName()
                            + " has been used for 5 times, please maintain!");
                }
            } else if (facilityMaintenance.getKey() instanceof Villa) {
                Villa villa = (Villa) facilityMaintenance.getKey();
                System.out.println(villa.getServiceName() + " " + villa.getRoomStandard()
                        + " does not need maintain!");
            } else if (facilityMaintenance.getKey() instanceof House) {
                House house = (House) facilityMaintenance.getKey();
                System.out.println(house.getServiceName() + " " + house.getRoomStandard()
                        + " does not need maintain!");
            } else {
                System.out.println(facilityMaintenance.getKey().getServiceName() + " does not need maintain!");
            }
        }
    }

    public void addNew(int a) {
        byte floorQuantity;
        double poolArea = 0;
        boolean check;
        String vStandard;
        String[] propertyFacility = createFacility();

        if (a == 1) {
            addNewVilla(poolArea, propertyFacility);
        }
        if (a == 2) {
            addNewHouse(propertyFacility);
        }

        if (a == 3) {
            addNewRoom(propertyFacility);
        }
    }

    private void addNewRoom(String[] propertyFacility) {
        boolean check;
        String complimentaryService;
        do {
            check = true;
            String[] focService = {"Welcome fruit", "Water", "Free Wifi", "Coffee and Tea", "Notebook and pen"};
            System.out.println("Enter complimentary service: ");
            complimentaryService = scanner.nextLine();
            for (String b : focService) {
                if (complimentaryService.toLowerCase().equals(b.toLowerCase())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Wrong input, please input either (Welcome fruit, Water, free wifi, " +
                        "coffee and tea, or notebook and pen");
                continue;
            }
        } while (check);

        Room room = new Room(inputIdService("room"), "Room", Double.parseDouble(propertyFacility[0]), Integer.parseInt(propertyFacility[1]), Short.parseShort(propertyFacility[2]),
                propertyFacility[3], complimentaryService);
        updateNumberOfUses(room);
        writeToFileRoom();
    }

    private static void writeToFileRoom() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(FILE_ROOM);
            bw = new BufferedWriter(fw);
            for (Map.Entry<Facility, Integer> room : facilityList.entrySet()) {
                if (room.getKey() instanceof Room) {
                    Room room1 = (Room) room.getKey();
                    bw.write(room1.getIdService() + "," + room1.getServiceName() + "," + room1.getUsableArea() +
                            "," + room1.getRentPrice() + "," + room1.getMaxPeople() +
                            "," + room1.getRentType() + "," + room1.getComplimentaryService());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNewHouse(String[] propertyFacility) {
        byte floorQuantity;
        boolean check;
        String hStandard;
        String[] houseStandard = {"Superior", "Deluxe", "PremierDeluxe", "Luxury"};

        do {
            check = true;
            System.out.println("Enter house standard: ");
            hStandard = scanner.nextLine();
            for (String b : houseStandard) {
                if (hStandard.toLowerCase().equals(b.toLowerCase())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Wrong input, please input either (Superior, Deluxe, PremierDeluxe, Luxury");
            }
        } while (check);

        System.out.println("Enter floor quantity: ");
        floorQuantity = Byte.parseByte(scanner.nextLine());

        House house = new House(inputIdService("house"), "House", Double.parseDouble(propertyFacility[0]), Integer.parseInt(propertyFacility[1]), Short.parseShort(propertyFacility[2]),
                propertyFacility[3], hStandard, floorQuantity);
        updateNumberOfUses(house);
        writeToFileHouse();
    }

    private static void writeToFileHouse() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(FILE_HOUSE);
            bw = new BufferedWriter(fw);
            for (Map.Entry<Facility, Integer> house : facilityList.entrySet()) {
                if (house.getKey() instanceof House) {
                    House house1 = (House) house.getKey();
                    bw.write(house1.getIdService() + "," + house1.getServiceName() + "," + house1.getUsableArea() +
                            "," + house1.getRentPrice() + "," + house1.getMaxPeople() + "," + house1.getRentType() +
                            "," + house1.getRoomStandard() + "," + house1.getFloorQuantity());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void addNewVilla(double poolArea, String[] propertyFacility) {
        byte floorQuantity;
        String vStandard;
        boolean check;
        String[] villaStandard = {"Spanish", "Arabic", "Combinative",
                "Mediterranean", "Contemporary", "Classic Design"};
        do {
            check = true;
            System.out.println("Enter villa standard: ");
            vStandard = scanner.nextLine();
            for (String b : villaStandard) {
                if (vStandard.toLowerCase().equals(b.toLowerCase())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Wrong input, please input either (Spanish, Arabic, Combinative, " +
                        "Mediterranean, Contemporary, Classic Design");
            }
        } while (check);


        do {
            check = false;
            System.out.println("Enter pool area: ");
            try {
                poolArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input error, please try again with (number.number) format");
                check = true;
                continue;
            }
            if (poolArea < 30) {
                System.out.println("Pool area must greater than 30 meter square");
                check = true;
                continue;
            }
        } while (check);

        do {
            check = false;
            System.out.println("Enter floor quantity: ");
            floorQuantity = Byte.parseByte(scanner.nextLine());
            if (floorQuantity < 0) {
                System.out.println("Cannot input negative number, please try again!");
                check = true;
            }
        } while (check);

        Villa villa = new Villa(inputIdService("villa"), "Villa", Double.parseDouble(propertyFacility[0]), Integer.parseInt(propertyFacility[1]), Short.parseShort(propertyFacility[2]),
                propertyFacility[3], vStandard, poolArea, floorQuantity);
        updateNumberOfUses(villa);
        writeToFileVilla();
    }

    private static void writeToFileVilla() {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_VILLA);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> villa : facilityList.entrySet()) {
                if (villa.getKey() instanceof Villa) {
                    Villa villa1 = (Villa) villa.getKey();
                    bufferedWriter.write(villa1.getIdService() + "," + villa1.getServiceName() + "," + villa1.getUsableArea() +
                            "," + villa1.getRentPrice() + "," + villa1.getMaxPeople() +
                            "," + villa1.getRentType() + "," + villa1.getRoomStandard() + "," + villa1.getPoolArea() +
                            "," + villa1.getFloorQuantity());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void displayVilla() {
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey() instanceof Villa) {
                System.out.println(facility.getKey());
                System.out.println(facility.getValue());
            }
        }
    }

    public void displayHouse() {

        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey() instanceof House) {
                System.out.println(facility.getKey());
                System.out.println(facility.getValue());
            }
        }
    }


    public void displayRoom() {
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey() instanceof Room) {
                Room room = (Room) facility.getKey();
                System.out.println(facility.getKey());
                System.out.println(facility.getValue());
//                String data = "%12sroom.getIdService() + " " + room.getServiceName() + " " + room.getUsableArea() + " "
//                        + room.getRentPrice() + " " + room.getMaxPeople() +
//                        " " + room.getRentType() + " " + room.getComplimentaryService();
//                CommandLine.Help.TextTable tt = new CommandLine.Help.TextTable(roomStr, data);
            }
        }
    }

    public void updateNumberOfUses(Facility facility) {
        if (facilityList.containsKey(facility)) {
            facilityList.put(facility, facilityList.get(facility) + 1);
        } else facilityList.put(facility, 1);
    }

    public static Map<Facility, Integer> readVillaFromFile() {
        Map<Facility, Integer> readVilla = new LinkedHashMap<>();
        FileReader fr = null;
        try {
            fr = new FileReader(FILE_VILLA);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] villaList;
            Villa villa = null;
            while ((line = br.readLine()) != null) {
                villaList = line.split(",");
                villa = new Villa(villaList[0], villaList[1], Double.parseDouble(villaList[2]), Integer.parseInt(villaList[3]), Short.parseShort(villaList[4]), villaList[5],
                        villaList[6], Double.parseDouble(villaList[7]), Byte.parseByte(villaList[8]));
                readVilla.put(villa, 1);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readVilla;
    }

    public static Map<Facility, Integer> readHouseFromFile() {
        Map<Facility, Integer> readHouse = new LinkedHashMap<>();
        FileReader fr = null;
        try {
            fr = new FileReader(FILE_HOUSE);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] houseList;
            House house = null;
            while ((line = br.readLine()) != null) {
                houseList = line.split(",");
                house = new House(houseList[0], houseList[1], Double.parseDouble(houseList[2]), Integer.parseInt(houseList[3]),
                        Short.parseShort(houseList[4]), houseList[5], houseList[6], Byte.parseByte(houseList[7]));
                readHouse.put(house, 1);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readHouse;
    }

    public static Map<Facility, Integer> readRoomFromFile() {
        Map<Facility, Integer> readRoom = new LinkedHashMap<>();
        FileReader fr = null;
        try {
            fr = new FileReader(FILE_ROOM);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] roomList;
            Room room = null;
            while ((line = br.readLine()) != null) {
                roomList = line.split(",");
                room = new Room (roomList[0], roomList[1], Double.parseDouble(roomList[2]), Integer.parseInt(roomList[3]),
                        Short.parseShort(roomList[4]), roomList[5], roomList[6]);
                readRoom.put(room, 1);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readRoom;
    }
}


