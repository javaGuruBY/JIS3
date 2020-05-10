package bean;

public class User {
    public String user;
    public String password;
    public boolean UserIsBlocked = false;
    public int attempt=3;

    public User(String login, String password) {
        this.user = login;
        this.password = password;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean UserIsBlocked() {
        return UserIsBlocked;
    }

    public void setUserIsBlocked(boolean userIsBlocked) {
        this.UserIsBlocked = userIsBlocked;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }


    public void resetAttempt (){
        attempt = 3;

    }
    public void blockUser() {
        UserIsBlocked = true;
    }
}

