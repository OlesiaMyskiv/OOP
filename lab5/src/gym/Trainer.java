package gym;

public class Trainer extends Person {
    private String skills;
    private int workInAge;

    public Trainer(int memberId, String name, int age, String gender, String skills, int workInAge) {
        super(memberId, name, age, gender);
        this.skills = skills;
        this.workInAge = workInAge;
    }

    //Кількость років роботи тренера на даний момент
    private int calculateYearsOfWork() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - workInAge;
    }

    void moreInfo() {
        System.out.println("——————————————————————————————");
        System.out.println("ID: " + getMemberId());
        System.out.println("Trainer name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Gender: " + gender);
        System.out.println("Coaching skills: " + skills);
        System.out.println("Has been working for " + workInAge + " years");
        System.out.println("Years of Work: " + calculateYearsOfWork());
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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getWorkInAge() {
        return workInAge;
    }

    public void setWorkInAge(int workInAge) {
        this.workInAge = workInAge;
    }
}

