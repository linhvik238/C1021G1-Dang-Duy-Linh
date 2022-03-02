package Test_Exam.model;

public class Student extends Person{
    private String className;
    private double mark;

    public Student() {
    }

    public Student(String id, String name, String dayOfBirth, String sex, String className, double mark) {
        super(id, name, dayOfBirth, sex);
        this.className = className;
        this.mark = mark;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", className='" + className + '\'' +
                ", mark=" + mark +
                '}';
    }
}
