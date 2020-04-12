package bean;

public class Encoder {
    private short code = 45;
    private char ch = 'V';

    public Encoder() {
    }

    public Encoder(short code, char ch) {
        this.code = code;
        this.ch = ch;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }
}
