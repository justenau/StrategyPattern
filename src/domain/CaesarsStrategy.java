package domain;

public class CaesarsStrategy implements CryptoStrategy {
    private int shift = 3;
    @Override
    public String encode(String text) {
        String result = "";
        int len = text.length();
        for(int x = 0; x < len; x++){
            char c = (char)(text.charAt(x) + shift);
            if (c > 'z')
                result += (char)(text.charAt(x) - (26-shift));
            else
                result += (char)(text.charAt(x) + shift);
        }
        return result;
    }

    @Override
    public String decode(String text) {
        String result = "";
        int len = text.length();
        for(int x = 0; x < len; x++){
            char c = (char)(text.charAt(x) + (-shift));
            if (c > 'z')
                result += (char)(text.charAt(x) - (26-(-shift)));
            else
                result += (char)(text.charAt(x) + (-shift));
        }
        return result;
    }
}
