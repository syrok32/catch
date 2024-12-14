public class User {
    private final String login;
    private final String password;
    private final String confirmPassword;

    public User(String login, String confirmPassword,  String password) {

        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}



