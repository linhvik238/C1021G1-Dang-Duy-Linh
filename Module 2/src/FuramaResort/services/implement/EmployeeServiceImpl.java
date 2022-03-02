package FuramaResort.services.implement;

import FuramaResort.controller.FuramaController;
import FuramaResort.model.person.Employee;
import FuramaResort.services.IPersonService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IPersonService {
    public static final String EMPLOYEE_PROFILE_CSV = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\FuramaResort\\data\\employeeProfile.csv";
    public static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public EmployeeServiceImpl() {
        employeeList = readFromFile();
    }
    static {
        List<Employee> listFile = new ArrayList<>();
        listFile = readFromFile();
        if (listFile.size() == 0) {
            Employee employee = new Employee("DIA399", "Lươn Anh Hoàng", "12/12/1996", "FeMale",
                    "876543123456", "0935666888", "lah@gmail.com", "University", "456 nguyễn lương bằng", 100000000);
            employeeList.add(employee);
            writeFile();
        }
    }

    public int random() {
        int random = (int) Math.round(Math.random() * 10);
        return random;
    }

    @Override
    public void edit() {
        System.out.println(FuramaController.midPlace + "Please input customer Id that you want to edit!");
        String customerId = scanner.nextLine();
        Employee tempEmployee;
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().toLowerCase().equals(customerId.toLowerCase())) {
                String tempId = employeeList.get(i).getId().substring(3);
                tempEmployee = createEmployee();
                tempId = tempEmployee.getId().substring(0, 3) + tempId;
                tempEmployee.setId(tempId);
                employeeList.set(i, tempEmployee);
                writeFile();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(FuramaController.midPlace + "input does not match!");
        }
    }

    @Override
    public void addNew() {
        Employee employee = createEmployee();
        employeeList.add(employee);
        writeFile();
    }

    public void displayList() {
        if (employeeList.size() > 0) {
            for (Employee ep : employeeList) {
                System.out.println(ep);
            }
        } else System.out.println(FuramaController.midPlace + "data does not exist, please add new data!");
    }


    public Employee createEmployee() {
        String[] educationArr = {"Intermediate", "University", "College", "PostUniversity"};
        String[] positionArr = {"Receptionist", "Serve", "Monitor", "Supervisor", "Manager", "Director"};
        String regexDate = "[0-9]{1,2}/[0-9]{1,2}/(20|19)[0-9]{2}";
        String regexPhone = "0[397][0378][0-9]{7}";
        String regexEmail = "[a-zA-Z][a-zA-Z0-9]+@gmail.com";
        String regexIdentityCardNumber = "[0-9]{9}";
        String inputDate;
        String inputEmail;
        String inputNumberPhone;
        String inputName;
        String inputGender;
        String inputIndetityCardNumber;
        String inputEducation;
        String inputPosition;
        String employeeId = null;
        boolean check;
        double inputSalary = 0;

        System.out.println(FuramaController.midPlace + "Enter full name: ");
        inputName = scanner.nextLine();

        do {
            check = false;
            System.out.println(FuramaController.midPlace + "Enter day of birth (dd/mm/yyyy): ");
            inputDate = scanner.nextLine();

            if (!inputDate.matches(regexDate)) {
                check = true;
                System.out.println(FuramaController.midPlace + "Wrong date format, please enter again! ");
                continue;
            }
            String[] temp = inputDate.split("/");
            if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 12) {
                check = true;
                continue;
            }
            if (Integer.parseInt(temp[1]) == 1 || Integer.parseInt(temp[1]) == 3 || Integer.parseInt(temp[1]) == 5 || Integer.parseInt(temp[1]) == 7 ||
                    Integer.parseInt(temp[1]) == 8 || Integer.parseInt(temp[1]) == 10 || Integer.parseInt(temp[1]) == 12) {
                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 31) {
                    check = true;
                    continue;
                }
            } else if (Integer.parseInt(temp[1]) == 2) {
                if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0) {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 29) {
                        check = true;
                        continue;
                    }
                } else {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 28) {
                        check = true;
                        continue;
                    }
                }

            } else if (Integer.parseInt(temp[1]) > 0 || Integer.parseInt(temp[1]) < 13) {
                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 30) {
                    check = true;
                    continue;
                }
            } else {
                check = true;
            }
        } while (check);
//
//
        do {
            System.out.println(FuramaController.midPlace + "Enter gender: ");
            inputGender = scanner.nextLine();
            if (inputGender.toLowerCase().equals("male") ||
                    inputGender.toLowerCase().equals("female")) {
                break;
            } else {
                System.out.println(FuramaController.midPlace + "gender must be male or female!");
            }
        } while (true);
//
//
        do {
            System.out.println(FuramaController.midPlace + "please Input identity card number: ");
            inputIndetityCardNumber = scanner.nextLine();
            if (inputIndetityCardNumber.matches(regexIdentityCardNumber)) {
                break;
            }
            System.out.println(FuramaController.midPlace + "Identity card number is error, please input again!");
        } while (true);
//
//
        do {
            System.out.println(FuramaController.midPlace + "please input phone number : ");
            inputNumberPhone = scanner.nextLine();
            if (inputNumberPhone.matches(regexPhone)) {
                break;
            }
            System.out.println(FuramaController.midPlace + "Phone number errors, please input again!");

        } while (true);

        do {
            System.out.println(FuramaController.midPlace + "please input EMAIL: ");
            inputEmail = scanner.nextLine();
            if (inputEmail.matches(regexEmail)) {
                break;
            }
            System.out.println(FuramaController.midPlace + "email is error format,please input again! ");
        } while (true);
//
//
        do {
            check = true;
            System.out.println(FuramaController.midPlace + "please input Education (Intermediate, University," +
                    " College , PostUniversity: ");
            inputEducation = scanner.nextLine();
            for (String education : educationArr) {
                if (education.equals(inputEducation.toLowerCase())) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                break;
            }
            System.out.println(FuramaController.midPlace + "education is error, please input again");
        } while (check);

        do {
            check = false;
            System.out.println(FuramaController.midPlace + "please input position: ");
            System.out.println(FuramaController.midPlace + "receptionist, serve, monitor," +
                    " supervisor, manager, director: ");
            inputPosition = scanner.nextLine();
            for (String position : positionArr) {
                if (position.toLowerCase().equals(inputPosition.toLowerCase())) {
                    check = true;
                    continue;
                }
            }
            if (!check) {
                break;
            }
            System.out.println(FuramaController.midPlace + "Position is error, please input again!");
        } while (check);

        do {
            System.out.println(FuramaController.midPlace + "Input SALARY: ");
            try {
                inputSalary = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(FuramaController.midPlace + "Input SALARY AGAIN: ");
                continue;
            }
            break;
        } while (true);
        for (String pos : positionArr) {
            if (inputPosition.toLowerCase().equals(pos)) {
                employeeId = inputPosition.substring(0, 3).toUpperCase() + random() + random() + random();
            }
        }
        Employee employee = new Employee(employeeId, inputName, inputDate, inputGender, inputIndetityCardNumber,
                inputNumberPhone, inputEmail, inputEducation, inputPosition, inputSalary);
        return employee;
    }

    public static void writeFile() {
        File file = new File(EMPLOYEE_PROFILE_CSV);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getId() + "," + employee.getFullName() + "," + employee.getDayOfBirth() + "," +
                        employee.getSex() + "," + employee.getIdentityCardNo() + "," + employee.getPhoneNo() + "," +
                        employee.getEmail() + "," + employee.getEducation() + "," + employee.getPosition() + "," + employee.getSalary());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFromFile() {
        List<Employee> listEmployee = new ArrayList<>();
        File file = new File(EMPLOYEE_PROFILE_CSV);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null) {
                String[] dataArray = data.split(",");
                Employee employee = new Employee(dataArray[0], dataArray[1], dataArray[2], dataArray[3], dataArray[4], dataArray[5],
                        dataArray[6], dataArray[7], dataArray[8], Double.parseDouble(dataArray[9]));
                listEmployee.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listEmployee;
    }
}