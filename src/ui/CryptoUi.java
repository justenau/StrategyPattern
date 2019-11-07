package ui;

import domain.*;
import jdk.nashorn.api.tree.CaseTree;

import javax.swing.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class CryptoUi {

    private CryptoContext cryptoContext;

    public CryptoUi(){
        cryptoContext = new CryptoContext();
    }

    public void showUi(){
        while(true) {
            try {
                String message = JOptionPane.showInputDialog("Enter your message to encode or decode:");
                if (message.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "The message cannot be empty!");
                    continue;
                }
                if(!chooseSecretCode()){
                    JOptionPane.showMessageDialog(null, "You must choose a secret code!");
                    continue;
                };
                if(!chooseOperation(message)){
                    JOptionPane.showMessageDialog(null, "You must choose an operation!");
                    continue;
                };
            } catch (NullPointerException e){
                return;
            }
        }
    }

    public boolean chooseSecretCode(){
        String[] choices = Stream.of(StrategyEnum.values()).map(e->e.getStrategyName().substring(0,e.getStrategyName().indexOf(' '))).toArray(String[]::new);
        String input = (String) JOptionPane.showInputDialog(null, "Select Strategy type:",
                "", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        if (input!=null) {
            CryptoStrategy cryptoStrategy = StrategyFactory.createStrategy(input);
            cryptoContext.setCryptoStrategy(cryptoStrategy);
           return true;
        }
        else return false;
    }

    public boolean chooseOperation(String text){
        String[] choices = { "Encode","Decode"};
        String input = (String) JOptionPane.showInputDialog(null, "Select coding type:",
                "", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        if (input!=null) {
            switch (input) {
                case "Encode":
                    JOptionPane.showMessageDialog(null, cryptoContext.performEncoding(text));
                    break;
                case "Decode":
                    JOptionPane.showMessageDialog(null, cryptoContext.performDecoding(text));
                    break;
            }
            return true;
        } else return false;
    }
}
