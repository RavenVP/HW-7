import exceptions.Data;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Data regs1 = new Data("12345678901234", "1231", "1231");
        Data.checker(regs1);
    }
}