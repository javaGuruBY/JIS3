package service;

public class PhraseAnalyserService {
    public String analyse(String text){
        if (text.startsWith("Make") && text.endsWith("great again")){
            return "It stands no chance";
        } else if (text.startsWith("Make") || text.endsWith("great again")){
            return "It could be worse";
        }
        return "It is fine, really";
    }
}
