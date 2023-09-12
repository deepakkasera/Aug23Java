package Builder;

public class OldBuilder {
    private String name;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private double psp;

//    public Student build() {
//        if (getGradYear() > 2022) {
//            throw new IllegalArgumentException("Invalid Grad Year");
//        }
//        //validations.
//
//        return new Student(this);
//    }

    public String getName() {
        return name;
    }

    public OldBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public OldBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public OldBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public OldBuilder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public OldBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public OldBuilder setPsp(double psp) {
        this.psp = psp;
        return this;
    }
}
