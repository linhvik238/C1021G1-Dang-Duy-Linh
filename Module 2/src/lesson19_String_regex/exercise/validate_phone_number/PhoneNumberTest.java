package lesson19_String_regex.exercise.validate_phone_number;

public class PhoneNumberTest {
    public static PhoneNumber phoneNumber;

    private static final String[] validPhoneNo = new String[] {"65-903111222", "69-903555888", "84-993338888"};
    private static final String[] inValidPhoneNo = new String[] {"0-905123789", "84-9053338888", "6-905688127"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String phoneNo : validPhoneNo) {
            boolean isValid = phoneNumber.validate(phoneNo);
            System.out.println("The phone number " + phoneNo + " is valid? " + isValid);
        }
        for (String phoneNo : inValidPhoneNo) {
            boolean isValid = phoneNumber.validate(phoneNo);
            System.out.println("The phone number " + phoneNo + " is valid? " + isValid);
        }
    }
}
