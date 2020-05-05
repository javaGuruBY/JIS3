package by.jrr;

import by.jrr.bean.PhraseAnalyser;
import by.jrr.service.PhraseAnalyserService;

public class App {
    public static void main(String[] args) {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        phraseAnalyser.setText("Make");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        System.out.println(phraseAnalyserService.analyse(phraseAnalyser.getText()));
    }
}
