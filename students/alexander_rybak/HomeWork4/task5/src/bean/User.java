package bean;

public class User {
    private String password;
    private String login;
    private boolean isBlocked = false;
    private int countOfAttemptsToEnterTheAccount = 0;

    public User(String login, String password) {
        this.password = password;
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getCountOfAttemptsToEnterTheAccount() {
        return countOfAttemptsToEnterTheAccount;
    }

    public void setCountOfAttemptsToEnterTheAccount(int countOfAttemptsToEnterTheAccount) {
        this.countOfAttemptsToEnterTheAccount = countOfAttemptsToEnterTheAccount;
    }

}