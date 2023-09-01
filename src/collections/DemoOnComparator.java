package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoOnComparator {
    public static class Car {
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


        public static CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        public static CarPriceComparator carPriceComparator = new CarPriceComparator();
        public static CarCustomComparator carCustomComparator = new CarCustomComparator();

        static class CarSpeedComparator implements Comparator<Car> {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed - o2.speed;
            }
        }

        static class CarPriceComparator implements Comparator<Car> {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        }

        static class CarCustomComparator implements Comparator<Car> {

            @Override
            public int compare(Car o1, Car o2) {
                if (o1.speed == o2.speed) {
                    return o2.price - o1.price;
                }
                return o1.speed - o2.speed;
            }
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Car> priorityQueue =
                new PriorityQueue<>(Car.carCustomComparator);

        priorityQueue.add(new Car(100, 8800, "A"));
        priorityQueue.add(new Car(120, 7800, "B"));
        priorityQueue.add(new Car(100, 2500, "C"));
        priorityQueue.add(new Car(200, 9900, "D"));
        priorityQueue.add(new Car(500, 8400, "E"));
        priorityQueue.add(new Car(70, 1200, "F"));

//        while (!priorityQueue.isEmpty()) {
//            System.out.print(priorityQueue.poll());
//        }

        //Different ways to pass an object of an Interface.
        //1. Create a class that implements the interface and create an object of this class. -> DONE.
        //2. Anonymous Object.
        //3. Using Lambda

        PriorityQueue<Car> pq = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed - o2.speed;
            }
        });


        pq.add(new Car(100, 8800, "A"));
        pq.add(new Car(120, 7800, "B"));
        pq.add(new Car(100, 2500, "C"));
        pq.add(new Car(200, 9900, "D"));
        pq.add(new Car(500, 8400, "E"));
        pq.add(new Car(70, 1200, "F"));

//        while (!pq.isEmpty()) {
//            System.out.print(pq.poll());
//        }

        Comparator<Car> comparator = (car1, car2) -> {return car2.speed - car1.speed;};
        PriorityQueue<Car> pq1 = new PriorityQueue<>(comparator);


        pq1.add(new Car(100, 8800, "A"));
        pq1.add(new Car(120, 7800, "B"));
        pq1.add(new Car(100, 2500, "C"));
        pq1.add(new Car(200, 9900, "D"));
        pq1.add(new Car(500, 8400, "E"));
        pq1.add(new Car(70, 1200, "F"));

//        while (!pq1.isEmpty()) {
//            System.out.print(pq1.poll());
//        }

        PriorityQueue<Car> pq2 = new PriorityQueue<>((c1, c2) -> c1.price - c2.price);

        pq2.add(new Car(100, 8800, "A"));
        pq2.add(new Car(120, 7800, "B"));
        pq2.add(new Car(100, 2500, "C"));
        pq2.add(new Car(200, 9900, "D"));
        pq2.add(new Car(500, 8400, "E"));
        pq2.add(new Car(70, 1200, "F"));

        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll());
        }
    }
}
