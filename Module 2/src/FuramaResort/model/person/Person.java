package FuramaResort.model.person;

public abstract class Person {
    private String id;
    private String fullName;
    private String dayOfBirth;
    private String sex;
    private String identityCardNo;
    private String phoneNo;
    private String email;

    public Person() {
    }

    public Person(String id, String fullName, String dayOfBirth,
                  String sex, String identityCardNo, String phoneNo, String email) {
        this.id = id;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.sex = sex;
        this.identityCardNo = identityCardNo;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", identityCardNo='" + identityCardNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email ;
    }
}
