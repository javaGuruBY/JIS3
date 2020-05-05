package by.jrr.bean;
import java.io.Serializable;
import java.util.Objects;

        //Свойства
        //        Логин
        //        Пароль
        //       Заблокирован ли пользователь
        //       Количество попыток для входа в учетную запись, до блокировки пользователя
        //       (по-умолчанию максимальное количество попыток равно 3)

public class User implements Serializable{
    private String login;
    private String password;
    private boolean inBlocked = false;
    private int countLoginAttempts = 3;

    public User(){
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void resetTries() {
        this.countLoginAttempts = 3;
    }

    public boolean isInBlocked() {
        return inBlocked;
    }

    public void setInBlocked(boolean inBlocked) {
        this.inBlocked = inBlocked;
    }

    public int getCountLoginAttempts() {
        return countLoginAttempts;
    }

    public void setCountLoginAttempts(int countLoginAttempts) throws Exception {
        this.countLoginAttempts = countLoginAttempts;
        if (countLoginAttempts > 3 || countLoginAttempts < 0){
            try {
                throw new Exception();
            } catch (Exception exception) {
                System.out.println("invalid number of input attempts");
                exception.printStackTrace();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return inBlocked == user.inBlocked &&
                countLoginAttempts == user.countLoginAttempts &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, inBlocked, countLoginAttempts);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", inBlocked=" + inBlocked +
                ", countLoginAttempts=" + countLoginAttempts +
                '}';
    }
}

