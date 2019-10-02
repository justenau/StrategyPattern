package ui;

import domain.CaesarsStrategy;
import domain.CryptoContext;
import domain.CryptoStrategy;
import domain.ReflectionStrategy;

import javax.swing.*;

public class CryptoUi {
    public void CryptoContext(){
        CryptoContext cryptoContext;
    }

    public void showUi(){
        chooseSecretCode();
    }

    public void chooseSecretCode(){
        String code = JOptionPane.showInputDialog("Enter your code to encode or decode:");
        if (code.isEmpty()){
            JOptionPane.showMessageDialog(null, "The code cannot be empty!");
            return;
        }
        chooseOperation(code);
    }

    public void chooseOperation(String text){
        String[] choices = { "CaesarsStrategy","ReflectionStrategy"};
        String input = (String) JOptionPane.showInputDialog(null, "Select Strategy type:",
                "", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        switch(input){
            case "CaesarsStrategy":
                CryptoContext();
                CryptoStrategy coding = new CaesarsStrategy();
                chooseType(coding,text);
                break;
            case "ReflectionStrategy":
                CryptoStrategy codings = new ReflectionStrategy();
                chooseType(codings,text);
                break;
        }
    }

    public void chooseType(CryptoStrategy cryptoStrategy,String text){
        String[] choices = { "Encode","Decode"};
        String input = (String) JOptionPane.showInputDialog(null, "Select coding type:",
                "", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        switch(input){
            case "Encode":
                JOptionPane.showMessageDialog(null, cryptoStrategy.encode(text));
                break;
            case "Decode":
                JOptionPane.showMessageDialog(null, cryptoStrategy.decode(text));
                break;
        }
    }
}
