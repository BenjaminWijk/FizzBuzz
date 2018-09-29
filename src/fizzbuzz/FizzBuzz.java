package fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    private List<Rule> ruleList = new ArrayList<>();
    private int gameLength;

    public FizzBuzz(){
        this.gameLength = 100;
    }

    public FizzBuzz(int gameLength){
        if(gameLength < 0){
            throw new IllegalArgumentException("gameLength must be a positive integer");
        }
        this.gameLength = gameLength;
    }

    public void addToRuleList(Rule... rules) {
        ruleList.addAll(Arrays.asList(rules));
    }

    public void clearList(){
        ruleList.clear();
    }

    public void printFizzBuzz(){
        for (int i=0; i<gameLength; i++){
            System.out.print(printLine(i));
            System.out.print("\n");
        }
    }

    private String printLine(Integer i){
        StringBuilder sb = new StringBuilder();

        for (Rule rule : ruleList) {
            if(rule.test(i)){
                sb.append(rule.getOutput());
            }
        }

        if(sb.length() == 0){
           return i.toString();
        }
        else {
            return sb.toString();
        }
    }
}
