package extra_exercise2.model;

public class Student implements Comparable <Student>{
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private String className;
    private String classYear;

    public Student(int id, String name, String dateOfBirth, String sex, String className, String classYear) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.className = className;
        this.classYear = classYear;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", className='" + className + '\'' +
                ", classYear='" + classYear + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return getId() - o.getId();
    }
}
