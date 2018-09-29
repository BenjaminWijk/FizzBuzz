package fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz game = new FizzBuzz();

        game.addToRuleList(
                new Rule(i -> i % 3 == 0, "Fizz"),
                new Rule(i -> i % 5 == 0, "Buzz")
        );

        game.printFizzBuzz();
    }

}

