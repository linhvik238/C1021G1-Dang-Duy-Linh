package extra_exercise1.controller;

import extra_exercise1.model.Candidate;
import extra_exercise1.service.implement.CandidateService;
import extra_exercise1.service.CandidateServiceImplement;

import java.util.Scanner;

public class CandidateController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandidateService candidateService = new CandidateServiceImplement();
        Candidate[] candidateList = null;

        int select = 0;
        do {
            System.out.println("--Candidate Menu--");
            System.out.println("1. Add new candidate");
            System.out.println("2. List all");
            System.out.println("9. Exit");

            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1: // Add new
                    System.out.println("Please enter ID of the Candidate");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter name of the Candidate");
                    String name = scanner.nextLine();
                    System.out.println("Please enter birthday of the Candidate");
                    String dayOfBirth = scanner.nextLine();
                    System.out.println("Please enter math score of the Candidate");
                    int mathScore = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter literature score of the Candidate");
                    int literatureScore = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter english score of the Candidate");
                    int englishScore = Integer.parseInt(scanner.nextLine());
                    Candidate candidateNew = new Candidate(id, name, dayOfBirth,
                            mathScore, englishScore, literatureScore);
                    candidateService.add(candidateNew);
                    break;

                case 2: //List all
                    candidateService.showAll();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Input error!");
            }
        } while (select != 9);
    }
}

