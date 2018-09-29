package fizzbuzz;

import java.util.function.Predicate;

public class Rule {

    private Predicate<Integer> condition;
    private String output;

    public Rule(Predicate<Integer> condition, String output){
        if(condition == null || output == null){
            throw new IllegalArgumentException("Null values not allowed");
        }

        this.condition = condition;
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public boolean test(Integer i){
        return condition.test(i);
    }
}
