package practice.user.model;

public class User {
    private String username;
    private String email;
    private String password;

    // методы класса, отвечают за поведение


    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }
    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid.");
        }
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println(password + " isn't valid.");
        }
    }
//Requirements for e-mail:

//1) @ exists and only one
//2) dot after @
//3) after last dot minimum 2 symbols
//4) alphabetic, digits, _ , - , . , @
    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@'); // узнали индекс собаки
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
            return false;
        }
        if (email.indexOf('.',indexAt) == -1) { // если после собаки не нашлась точкa, indexOf ищет после индекса собаки
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() -2 ) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!((c > 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false; // если все это не выполнилось, возвращаем false
            }
        }
        return true;

    }
//Requirements for password:

//1) min 8 symbols
//2) min one symbol of uppercase
//3) min one symbol of lowercase
//4) min one digit
//5) min one special symbol (!%@*&)

    private boolean validatePassword(String password) {
        boolean[] res = new boolean[5];
        if (password.length() >= 8) {
            res[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                res[1] = true;
            }
            if (Character.isLowerCase(c)) {
                res[2] = true;
            }
            if (Character.isDigit(c)) {
                res[3] = true;
            }
            if ("!%@*&".indexOf(c) >= 0) {
                res[4] = true;
            }
        }
        return res[0] && res[1] && res[2] && res[3] && res[4];
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
