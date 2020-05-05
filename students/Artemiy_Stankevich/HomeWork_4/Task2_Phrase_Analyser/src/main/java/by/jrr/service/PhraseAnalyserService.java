package by.jrr.service;

public class PhraseAnalyserService {
    public String phraseOne = "It stands no chance";
    public String phraseTwo = "It could be worse";
    public String phraseNoOne = "It is fine, really";

    public String analyse(String text) {
        if(text.startsWith("Make")&&text.endsWith("great again")) {
            return phraseOne;
        } else if(text.startsWith("Make")||text.endsWith("great again")) {
            return phraseTwo;
        } else return phraseNoOne;
    }
}
