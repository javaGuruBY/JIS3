package by.bariloegor.bean;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
    private String login;
    private String password;
    private boolean blocked;
    private int maxLoginAttemptsLeft;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.maxLoginAttemptsLeft = Settings.MAX_LOGIN_ATTEMPTS;
    }

    public User() {
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

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public int getMaxLoginAttemptsLeft() {
        return maxLoginAttemptsLeft;
    }

    public void setMaxLoginAttemptsLeft(int maxLoginAttemptsLeft) {
        this.maxLoginAttemptsLeft = maxLoginAttemptsLeft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return blocked == user.blocked &&
                maxLoginAttemptsLeft == user.maxLoginAttemptsLeft &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, blocked, maxLoginAttemptsLeft);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blocked=" + blocked +
                ", maxLoginAttemptsLeft=" + maxLoginAttemptsLeft +
                '}';
    }
}
