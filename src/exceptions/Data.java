package exceptions;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;
    static final String validSymbols = "^[a-zA-Z0-9_]{1,20}$";

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean checker(Data data) throws WrongPasswordException, WrongLoginException {
        if (data.login.matches(validSymbols) && data.login.length() > 0 && data.login.length() < 21
                && (data.login != null || !data.login.isEmpty() || !data.login.isBlank()) ){
            System.out.println("Логин введён верно");
        } else {
            throw new WrongLoginException("Логин введён неверно");
        }
        if (data.password.matches(validSymbols) && data.getPassword().equals(data.getConfirmPassword())
                && data.password.length() > 0 && data.password.length() < 21
                && (data.password != null || !data.password.isEmpty() || !data.password.isBlank())) {
            System.out.println("Пароль введён верно");
        } else {
            throw new WrongPasswordException("Пароль введён не верно, либо пароли не совпадают");
        }
        return false;
    }

    public String getLogin() {return login;}
    public String getPassword() {return password;}
    public String getConfirmPassword() {return confirmPassword;}

}
