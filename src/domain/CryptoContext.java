package domain;

public class CryptoContext {
    private CryptoStrategy cryptoStrategy;

    public CryptoContext(){ }
    public CryptoContext(CryptoStrategy c){
        setCryptoStrategy(c);
    }

    public void setCryptoStrategy(CryptoStrategy cryptoStrategy){
        this.cryptoStrategy =cryptoStrategy;
    }

    public String performEncoding(String text){
        return cryptoStrategy.encode(text);
    }

    public String performDecoding(String text){
        return cryptoStrategy.decode(text);
    }
}
