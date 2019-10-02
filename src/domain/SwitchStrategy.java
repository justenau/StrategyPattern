package domain;

public class SwitchStrategy implements CryptoStrategy {
    @Override
    public String encode(String text) {
        String encoded="";
        for (int i = 0; i+1<text.length(); i+=2){
            encoded+=text.charAt(i+1);
            encoded+=text.charAt(i);
        }
        if (text.length()%2!=0)
            encoded+=text.charAt(text.length()-1);
        return encoded;
    }

    @Override
    public String decode(String text) {
        String decoded="";
        for (int i = 0; i+1<text.length(); i+=2){
            decoded+=text.charAt(i+1);
            decoded+=text.charAt(i);
        }
        if (text.length()%2!=0)
            decoded+=text.charAt(text.length()-1);
        return decoded;
    }
}
