package domain;

import java.util.Arrays;

public class RandomCypherStrategy implements CryptoStrategy {

    private RandomCypher randomCypher;

    public  RandomCypherStrategy(){
        randomCypher = new RandomCypher();
    }
    @Override
    public String encode(String text) {
        return new String(randomCypher.encypher(text.toCharArray()));
    }

    @Override
    public String decode(String text) {
        return new String(randomCypher.decypher(text.toCharArray()));
    }
}
