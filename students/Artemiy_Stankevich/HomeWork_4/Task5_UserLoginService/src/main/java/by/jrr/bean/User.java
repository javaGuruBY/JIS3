package by.jrr.bean;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private String password;
    private boolean isBlocked = false;
    private int countLoginAttempts = 3;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void resetTries() {
        this.countLoginAttempts = 3;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public String getPassword() {
        return password;
    }

    public int getCountLoginAttempts() {
        return countLoginAttempts;
    }

    public void setCountLoginAttempts(int countLoginAttempts) {
        if (countLoginAttempts > 3 || countLoginAttempts < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("invalid value for login tries");
                e.printStackTrace();
            }
        }
        this.countLoginAttempts = countLoginAttempts;
    }
}
