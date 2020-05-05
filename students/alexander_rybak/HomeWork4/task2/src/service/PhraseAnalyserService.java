package service;

public class PhraseAnalyserService {
    public String analyse(String text) {
        int firstIndex = text.indexOf("Make");
        int lastIndex = text.lastIndexOf("great again");

        if (firstIndex == 0 && lastIndex == text.length() - 11) return "It stands no chance";
        else if (firstIndex == 0 || lastIndex == text.length() - 11) return "It could be worse";
        else return "It is fine, really";
    }
}