package by.jrr.bean;
import java.io.Serializable;
import java.util.Objects;

public class Encoder implements Serializable{
    private short numberForEncode;
    private char charForDecode;

    public Encoder(){
    }

    public short getNumberForEncode() {
        return numberForEncode;
    }

    public void setNumberForEncode(short numberForEncode) {
        this.numberForEncode = numberForEncode;
    }

    public char getCharForDecode() {
        return charForDecode;
    }

    public void setCharForDecode(char charForDecode) {
        this.charForDecode = charForDecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return numberForEncode == encoder.numberForEncode &&
                charForDecode == encoder.charForDecode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberForEncode, charForDecode);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "numberForEncode=" + numberForEncode +
                ", charForDecode=" + charForDecode +
                '}';
    }
}
