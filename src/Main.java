public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {


        try {
            User user = new User("Step", "12102Step", "12102Step");
            Sevice.loginCheckLen(user.getLogin());
            Sevice.passwordCheckLen(user.getPassword());
            Sevice.checkPasswordsMatch(user.getPassword(), user.getConfirmPassword());
            System.out.println("успешно");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("ошибка");

        }
    }

}