package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class Encoder implements Serializable {
    private short code;
    private char symbol;

    public Encoder() {
    }

    public Encoder(short code, char symbol) {
        this.code = code;
        this.symbol = symbol;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return getCode() == encoder.getCode() &&
                getSymbol() == encoder.getSymbol();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getSymbol());
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "code=" + code +
                ", symbol=" + symbol +
                '}';
    }
}
