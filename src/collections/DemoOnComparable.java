package collections;

import com.sun.nio.sctp.NotificationHandler;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class DemoOnComparable {
    public static class Car implements Comparable<Car> { //Static Inner Class.
        int speed;
        int price;
        String brand;

        Car(int speed, int price, String brand) {
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "[Speed: " + this.speed + ", Price: " + this.price + ", Brand: " + this.brand + "]\n";
        }


        @Override
        public int compareTo(Car other) {
            return this.price - other.price;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Car> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Car(100, 8800, "A"));
        priorityQueue.add(new Car(120, 7800, "B"));
        priorityQueue.add(new Car(80, 2500, "C"));
        priorityQueue.add(new Car(200, 9900, "D"));
        priorityQueue.add(new Car(500, 8400, "E"));
        priorityQueue.add(new Car(70, 1200, "F"));

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll());
        }
    }
}
