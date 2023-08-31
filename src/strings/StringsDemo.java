package strings;

public class StringsDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());

//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s3));

        /*
        == compares the references
        to compare the actual String content, use equals() method.
         */


//        System.out.println((s1 == s2) + " " + s1.equals(s2));
//        System.out.println((s2 == s3) + " " + s2.equals(s3));
//        System.out.println((s1 == s3) + " " + s1.equals(s3));

        System.out.println(s1); //hello
        String s4 = s1.replace('l', 'x');
        System.out.println(s1); //hello
        System.out.println(s4); //hexxo

        s1 = s1.replace('l', 'x');
        System.out.println(s1);
    }
}
