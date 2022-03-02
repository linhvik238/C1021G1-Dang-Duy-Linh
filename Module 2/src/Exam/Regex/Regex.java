package Exam.Regex;

import FuramaResort.controller.FuramaController;

public class Regex {
//    String regexDate = "[0-9]{1,2}/[0-9]{1,2}/(20|19)[0-9]{2}";
//    String regexPhone = "0[397][0378][0-9]{7}";
//    String regexEmail = "[a-zA-Z][a-zA-Z0-9]+@gmail.com";
//    String regexIdentityCardNumber = "[0-9]{9}";

//    do {
//        check = false;
//        System.out.println(FuramaController.midPlace + "Enter day of birth (dd/mm/yyyy): ");
//        inputDate = scanner.nextLine();
//
//        if (!inputDate.matches(regexDate)) {
//            check = true;
//            System.out.println(FuramaController.midPlace + "Wrong date format, please enter again! ");
//            continue;
//        }
//        String[] temp = inputDate.split("/");
//        if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 12) {
//            check = true;
//            continue;
//        }
//        if (Integer.parseInt(temp[1]) == 1 || Integer.parseInt(temp[1]) == 3 || Integer.parseInt(temp[1]) == 5 || Integer.parseInt(temp[1]) == 7 ||
//                Integer.parseInt(temp[1]) == 8 || Integer.parseInt(temp[1]) == 10 || Integer.parseInt(temp[1]) == 12) {
//            if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 31) {
//                check = true;
//                continue;
//            }
//        } else if (Integer.parseInt(temp[1]) == 2) {
//            if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0) {
//                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 29) {
//                    check = true;
//                    continue;
//                }
//            } else {
//                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 28) {
//                    check = true;
//                    continue;
//                }
//            }
//
//        } else if (Integer.parseInt(temp[1]) > 0 || Integer.parseInt(temp[1]) < 13) {
//            if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 30) {
//                check = true;
//                continue;
//            }
//        } else {
//            check = true;
//        }
//    } while (check);
}
