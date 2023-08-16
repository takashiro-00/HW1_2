public class InvalidDobException extends CommonException {
    public InvalidDobException(int year) {
        super(200, "Year of birth \"" + year + "\" is invalid");
    }
}
