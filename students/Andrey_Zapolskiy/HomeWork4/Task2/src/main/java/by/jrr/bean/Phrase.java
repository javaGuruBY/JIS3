package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class Phrase implements Serializable {
    private String text;

    public Phrase() {
    }

    public Phrase(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phrase phrase = (Phrase) o;
        return Objects.equals(getText(), phrase.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText());
    }

    @Override
    public String toString() {
        return "Phrase{" +
                "text='" + text + '\'' +
                '}';
    }
}
