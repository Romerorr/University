package util;

import exception.TooOldException;
import exception.TooYoungException;

public class CheckAge {
    public static boolean checkAge (Integer age){
        try {
            if (age != 0 && age > 0){
                checkTooYoungException(age);
                checkTooOldException(age);
                return true;
            }
        } catch (TooYoungException | TooOldException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public static void checkTooYoungException (Integer age) throws TooYoungException {
        if (age < 16) {
            throw new TooYoungException("You`re so young for study at University!");
        }
    }
    public static void checkTooOldException (Integer age) throws TooOldException {
        if (age > 100){
            throw new TooOldException("You`re so old for study at University");
        }
    }
}

