public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {



        try {
            User user = new User("Step", "12102Step", "12102Step");
            Usrevalidate(user.getLogin(), user.getConfirmPassword(), user.getPassword());
            System.out.println("успешно");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("ошибка");

        }
    }
    public static void Usrevalidate(String login, String confPassword, String password) throws WrongLoginException, WrongPasswordException {
        Sevice.loginCheckLen(login);
        Sevice.passwordCheckLen(confPassword);
        Sevice.checkPasswordsMatch(password, confPassword);
    }

}