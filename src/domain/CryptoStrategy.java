package domain;

public interface CryptoStrategy {
    String encode(String text);
    String decode(String text);
}
