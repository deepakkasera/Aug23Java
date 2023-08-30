package lambdas;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //We can't create an object of interface.
        //Why ? Interfaces are incomplete.

        //Way 1 of creating object of interfaces.
        DemoClass way1 = new DemoClass();

        //Way 2 -> Anonymous class.
        DemoInterface way2 = new DemoInterface() {
            @Override
            public void fun() {
                System.out.println("Anonymous Class way of creating object of Interface");
            }
        };

        way1.fun();
        way2.fun();

        //Way 3 -> Lambda.
        DemoInterface way3 = () -> {
            //Provide the implementation of abstract method.
            System.out.println("Lambda way of DemoInterface");
        };
        way3.fun();

        //Anonymous Object
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.length() > 10) return true;
                else return false;
            }
        };
        //System.out.println(predicate.test("Scaler School of Technology"));


        //Lambda
        // () -> Input parameters
        // {} -> Function implementation.
        Predicate<String> predicate1 = (str) -> str.length() > 10;
        //System.out.println(predicate1.test("Scaler School of Technology"));

        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
        System.out.println(binaryOperator.apply("Hello ", "World!"));

        BiFunction<String, String, String> biFunction = (s1, s2) -> s1+s2;
        System.out.println(biFunction.apply("Hello ", "World!"));
    }
}
