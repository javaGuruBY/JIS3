package by.rybak.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LookupArray implements Serializable {
    private ArrayList<Integer> array;

    public LookupArray() {
    }

    public LookupArray(List<Integer> array) {
        this.array = (ArrayList<Integer>) array;
    }

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = (ArrayList<Integer>) array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookupArray that = (LookupArray) o;
        return Objects.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Objects.hash(array);
    }

    @Override
    public String toString() {
        return "LookupArray{" +
                "array=" + array +
                '}';
    }
}
