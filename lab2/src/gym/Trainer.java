package gym;

public class Trainer {  public String name;
    public int age;
    public String gender;
    public String skills;
    public int workInAge;

    public Trainer(String name, int age, String gender, String skills, int workInAge) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.workInAge = workInAge;
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

    public int getWorkInAge() {
        return workInAge;
    }

    public void setWorkInAge(int workInAge) {
        this.workInAge = workInAge;
    }

    private int calculateYearsOfWork() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - workInAge;
    }

    void moreInfo() {
        System.out.println("Trainer name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Gender: " + gender);
        System.out.println("Coaching skills: " + skills);
        System.out.println("Has been working for " + workInAge + " years");
        System.out.println("Years of Work: " + calculateYearsOfWork());
    }



    // Перевантаження методу
    public void engageWithTrainer(Trainer otherTrainer) {
        System.out.println("Trainer " + getName() + " is engaging with another trainer " + otherTrainer.getName());
        System.out.println("Their skills include: " + getSkills() + " and " + otherTrainer.getSkills());
        System.out.println("——————————————————————————————");
    }

    // Перевантаження методу
    public void engageWithTrainer(Member member) {
        System.out.println("Trainer " + getName() + " is engaging with member " + member.getName());
        System.out.println("Member's age is: " + member.getAge());
        System.out.println();
    }
}
