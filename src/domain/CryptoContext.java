package domain;

public abstract class CryptoContext implements CryptoStrategy {
    public CryptoContext(CryptoStrategy c){
        setCryptoStrategy(c);
    }

    public CryptoContext(){

    }

    public void setCryptoStrategy(CryptoStrategy c){

    }

    public String performEncoding(String text){
        return encode(text);
    }

    public String performDecoding(String text){
        return decode(text);
    }
}
