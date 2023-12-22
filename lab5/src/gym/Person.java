package gym;

public abstract class Person {
    protected int memberId;
    protected String name;
    protected int age;
    protected String gender;

    public Person(int memberId, String name, int age, String gender) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}