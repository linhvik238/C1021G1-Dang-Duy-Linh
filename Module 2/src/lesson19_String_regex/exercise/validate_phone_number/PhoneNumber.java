package lesson19_String_regex.exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static final String PHONE_REGEX = "^[0-9]{2}-[0-9]{9}$";

    public PhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
