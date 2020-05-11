package by.self.userValidationService.constant;

public class Constant {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;
    private static final int MIN_USER_NAME_OR_SURNAME_LENGTH = 3;
    private static final int MAX_USER_NAME_OR_SURNAME_LENGTH = 15;

    public static int getMaxAge() {
        return MAX_AGE;
    }

    public static int getMinAge() {
        return MIN_AGE;
    }

    public static int getMinUserNameOrSurnameLength() {
        return MIN_USER_NAME_OR_SURNAME_LENGTH;
    }

    public static int getMaxUserNameOrSurnameLength() {
        return MAX_USER_NAME_OR_SURNAME_LENGTH;
    }

}
