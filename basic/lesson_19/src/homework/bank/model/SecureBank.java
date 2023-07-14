package homework.bank.model;
import java.util.Random;

public class SecureBank extends Application {
    int secureCode;
    String login;
    String password;

    public SecureBank(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public SecureBank(String name, String version, String developer, int secureCode, String login, String password) {
        super(name, version, developer);
        this.secureCode = secureCode;
        this.login = login;
        this.password = password;
    }

    public static int generateSixDigitNumber() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    public boolean checklog (String login,String password) {
        String log = "Admin";
        String pas = "1111";
        if (!login.equals(log) || !password.equals(pas)) {
            System.out.println("Wrong input!");
            return false;
        } else {
            System.out.println("You are in system!");
            return true;
        }
    }

    public int getSecureCode() {
        return secureCode;
    }

    public void setSecureCode(int secureCode) {
        this.secureCode = secureCode;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
