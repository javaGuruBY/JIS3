package service;
import bean.PhraseAnalyser;

public class PhraseService {

    public String analyses(String text) {
        System.out.println("Text : " + text);
        int textLength = text.length();
        int subText = text.indexOf("Make");
        int subTextTwo = text.indexOf("great",textLength - 11);
        int subTextThree = text.indexOf("again",textLength - 5);
        if(subText == 0 && (subTextTwo == textLength - 11 && subTextThree == textLength - 5) ){
            return "It stands no chance";
        } else if(subText == 0 || (subTextTwo == textLength - 11 && subTextThree == textLength - 5)){
            return "It could be worse";
        } else{
            return "It is fine, really";
        }
    }
}
