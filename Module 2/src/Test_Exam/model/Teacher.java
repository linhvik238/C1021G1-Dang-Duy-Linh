package Test_Exam.model;

public class Teacher extends Person {
    private String qualification;

    public Teacher() {
    }

    public Teacher(String id, String name, String dayOfBirth, String sex, String qualification) {
        super(id, name, dayOfBirth, sex);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
