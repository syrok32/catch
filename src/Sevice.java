import java.security.KeyStore;
import java.util.Random;

public class Sevice {
    public static boolean validation(String data) {
        return data.matches("^[a-zA-Z0-9_]{1,20}$");
    }
    public static void loginCheckLen(String login) throws WrongLoginException {
        if (!validation(login)){
            throw new WrongLoginException();
        }
    }

    public static void passwordCheckLen(String password) throws WrongPasswordException {
        if (!validation(password)) {
            throw new WrongPasswordException();
        }
    }

    public static void checkPasswordsMatch(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

    }
}

