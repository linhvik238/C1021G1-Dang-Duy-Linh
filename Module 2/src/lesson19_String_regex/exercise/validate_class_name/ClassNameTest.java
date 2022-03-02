package lesson19_String_regex.exercise.validate_class_name;


public class ClassNameTest {

    public static final String[] validName = new String[] {"C0318G", "C2308K"};
    public static final String[] inValidName = new String[] {"P0000A", "A123KK", "C5670A"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String name : validName) {
            boolean isValid = className.validate(name);
            System.out.println("Class name " + name + " is valid? " + isValid);
        }
        for (String name : inValidName) {
            boolean isValid = className.validate(name);
            System.out.println("Class name " + name + " is valid? " + isValid);
        }
    }
}
