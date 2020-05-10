package by.bariloegor.service;

public class PhraseAnalyserService {
    public String phraseAnalysis(String phrase){
        if((phrase.startsWith("Make")) && (phrase.endsWith("great again."))){
            return "It stands no chance.";
        } else if((phrase.startsWith("Make")) || (phrase.endsWith("great again."))){
            return "It could be worse.";
        } else return "It is fine, really.";
    }
}