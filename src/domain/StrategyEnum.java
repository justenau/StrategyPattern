package domain;

public enum StrategyEnum {
    CAESARS("Caesars strategy", "domain.CaesarsStrategy"),
    REFLECTION("Reflection strategy", "domain.ReflectionStrategy"),
    SWITCH("Switch strategy", "domain.SwitchStrategy"),
    RANDOM("Random cypher strategy","domain.RandomCypherStrategy");

    private final String strategyName;
    private final String className;

    StrategyEnum(String strategyName, String className){
        this.strategyName = strategyName;
        this.className = className;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public String getClassName() {
        return className;
    }


}
