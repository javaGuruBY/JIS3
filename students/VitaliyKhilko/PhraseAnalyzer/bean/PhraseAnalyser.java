package bean;

public class PhraseAnalyser {
    private String texts = "Make homework and get a good grade great again";

    public PhraseAnalyser(){
    }

    public PhraseAnalyser(String texts){
        this.texts = texts;
    }

    public void setPhraseAnalyser(String text){
        this.texts = text;
    }

    public String getPhraseAnalyser(){
        return texts;
    }
}

