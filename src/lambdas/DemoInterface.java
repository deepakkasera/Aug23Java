package lambdas;

@FunctionalInterface
public interface DemoInterface {
    void fun(); // Abstract method.

    default void fun1() {
        System.out.println("This is a demo functional interface");
    }
}
