package org.example.bean;

import java.io.Serializable;
import java.util.Objects;

public class PhraseAnalyser implements Serializable {
    String text;

    public PhraseAnalyser() {
    }

    public PhraseAnalyser(String text) {
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
        PhraseAnalyser that = (PhraseAnalyser) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "PhraseAnalyser{" +
                "text='" + text + '\'' +
                '}';
    }
}
