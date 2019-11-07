package domain;

public class StrategyFactory {

    public static CryptoStrategy createStrategy(String strategyName){
        StrategyEnum strategyEnum = StrategyEnum.valueOf(strategyName.toUpperCase());
        String strategyClassName = strategyEnum.getClassName();
        CryptoStrategy cryptoStrategy = null;
        try{
            Class strategyClass = Class.forName(strategyClassName);
            cryptoStrategy = (CryptoStrategy)strategyClass.newInstance();
        } catch (Exception e){

        }
        return cryptoStrategy;
    }
}
