package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntroToStreams {
    //How to create Streams.

    /*
    What is Stream -> Wrapper over the data source (map, list, array, file etc)
     */

    //Way-1
    Integer[] array = {1,2,3,4,6,7};
    Stream<Integer> s1 = Stream.of(array);

    //Way-2
    List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
    Stream<Integer> s2 = list.stream();


    //Way-3
    //Stream.Builder<Integer> sb = Stream.Builder();
}
