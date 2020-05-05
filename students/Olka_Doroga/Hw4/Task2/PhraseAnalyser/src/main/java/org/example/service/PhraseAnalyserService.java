package org.example.service;

import org.example.bean.PhraseAnalyser;

public class PhraseAnalyserService {
    public String analyse(PhraseAnalyser phraseAnalyser) {
        if (phraseAnalyser.getText().startsWith("Make") & phraseAnalyser.getText().endsWith("great again")) {
            return "It stands no chance";
        } else if (phraseAnalyser.getText().startsWith("Make") | phraseAnalyser.getText().endsWith("great again")) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
