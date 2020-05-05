package org.example.bean;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String login;
    private String password;
    private boolean blocked = false;
    private int attemptsBeforeBlock = 3;

    public User() {
    }

    public void resetAttempts(User user){
        user.setAttemptsBeforeBlock(3);
    }

    public void blockUser(User user){
        user.setBlocked(true);
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
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

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public int getAttemptsBeforeBlock() {
        return attemptsBeforeBlock;
    }

    public void setAttemptsBeforeBlock(int attemptsBeforeBlock) {
        this.attemptsBeforeBlock = attemptsBeforeBlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return blocked == user.blocked &&
                attemptsBeforeBlock == user.attemptsBeforeBlock &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, blocked, attemptsBeforeBlock);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blocked=" + blocked +
                ", attemptsBeforeBlock=" + attemptsBeforeBlock +
                '}';
    }
}
