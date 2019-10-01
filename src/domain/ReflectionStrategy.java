package domain;

public class ReflectionStrategy implements CryptoStrategy {
    @Override
    public String encode(String text) {
        String result = "";
        for(int i= text.length()-1; i>=0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }

    @Override
    public String decode(String text) {
        String result = "";
        for(int i= text.length()-1; i>=0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }
}