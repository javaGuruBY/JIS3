package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class Encoder implements Serializable {
    private short numForEncode;
    private char charForDecode;

    public Encoder() {
    }

    public short getNumForEncode() {
        return numForEncode;
    }

    public void setNumForEncode(short numForEncode) {
        this.numForEncode = numForEncode;
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
        return numForEncode == encoder.numForEncode &&
                charForDecode == encoder.charForDecode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numForEncode, charForDecode);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "numForEncode=" + numForEncode +
                ", charForDecode=" + charForDecode +
                '}';
    }
}
