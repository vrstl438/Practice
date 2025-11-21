package Tests_Practice;

public class IsValidPhoneNumber {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
