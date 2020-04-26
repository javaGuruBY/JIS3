package by.rybak.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UniqueWordCounter implements Serializable {
    private Map<String, String> map = new HashMap<>();

    public UniqueWordCounter() {
    }

    public UniqueWordCounter(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWordCounter that = (UniqueWordCounter) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public String toString() {
        return "UniqueWordCounter{" +
                "map=" + map +
                '}';
    }
}
