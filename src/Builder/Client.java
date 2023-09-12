package Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

        Student student = Student.getBuilder()
                                 .setName("Sunny")
                                 .setAge(25)
                                 .setGradYear(2019)
                                 .setPsp(90.0)
                                 .build();
//        builder.setName("Sunny");
//        builder.setAge(25);
//        builder.setBatch("Oct22");
//        builder.setPsp(90.0);
//        builder.setGradYear(2024);

        //Student student = new Student(builder);
        //Student student = builder.build();

        //Student student1 = new Student(null);

        Student st = Student.getBuilder().setName("Deepak").setGradYear(2018).build();

        System.out.println("DEBUG");
    }
}
