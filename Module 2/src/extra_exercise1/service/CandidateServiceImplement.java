package extra_exercise1.service;

import extra_exercise1.model.Candidate;
import extra_exercise1.service.implement.CandidateService;

public class CandidateServiceImplement implements CandidateService {

    private static Candidate[] candidateList = new Candidate[0];

    static {
    }

    @Override
    public void add(Candidate candidate) {
        double sumScore = candidate.getMathScore() + candidate.getEnglishScore() + candidate.getLiteratureScore();
        if (sumScore > 15) {
            System.out.println("Congrats " + candidate.getName() + " met the requirement");
            Candidate[] newCandidateList = new Candidate[candidateList.length + 1];
            newCandidateList[newCandidateList.length - 1] = candidate;
            for (int index = 0; index < candidateList.length; index++) {
                newCandidateList[index] = candidateList[index];
            }
            candidateList = newCandidateList;
        } else {
            System.out.println(" The total of 3 subject of " + candidate.getName() + "  doesn’t match the requirement");
        }
    }

    @Override
    public void showAll() {
        for (Candidate candidate : candidateList) {
            if (candidate == null) {
                break;
            }
            System.out.println(candidate);
        }
    }
}
