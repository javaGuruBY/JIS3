package by.jrr.bean;

import java.util.Objects;

public class Sign {
    private int number;

    public Sign(int number) {
        this.number = number;
    }

    public Sign() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sign sign = (Sign) o;
        return getNumber() == sign.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString() {
        return "Sign{" +
                "number=" + number +
                '}';
    }
}
