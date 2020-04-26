package by.jrr.bean;


import java.util.Arrays;

public class LookupArray {
    private int[] array;

    public LookupArray() {
    }

    public LookupArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookupArray that = (LookupArray) o;
        return Arrays.equals(getArray(), that.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArray());
    }

    @Override
    public String toString() {
        return "LookupArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
