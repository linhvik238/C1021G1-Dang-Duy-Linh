package lesson19_String_regex.practice.validate_mail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
        public static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        private static Pattern pattern;
        private Matcher matcher;

        public EmailExample () {
                pattern = Pattern.compile(EMAIL_REGEX);
        }

        public boolean validate (String regex) {
                matcher = pattern.matcher(regex);
                return matcher.matches();
        }
}
