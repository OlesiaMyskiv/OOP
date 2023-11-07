package gym;

class Member {
    private String name;
    private int age;
    private String gender;
    private int weight;
    private int growth;

    public Member(String name, int age, String gender, int weight, int growth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.growth = growth;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    void information() {
        System.out.println("——————————————————————————————");
        System.out.println("Name: " + name);
        System.out.println("Age :" + age);
        System.out.println("Gender :" + gender);
        System.out.println("Weight :" + weight);
        System.out.println("Growth :" + growth);
        System.out.println("Body mass index: " + calculateBMI());
        System.out.println("——————————————————————————————");
    }

    void isNeedToLostWight() {
        int need = growth - 100;
        if (weight >= (need + 5) && weight >= (need - 5)) {
            System.out.println("Your weigth is normal");
        } else {
            System.out.println("You need to visit gym");
        }
        System.out.println("——————————————————————————————");
    }

    public double calculateBMI() {
        double heightInMeters = getGrowth() / 100.0; // перетворення з сантиметрів у метри
        return weight / (heightInMeters * heightInMeters);

    }

    public void interactWithMember(Trainer otherTrainer) {
        System.out.println("Member " + getName() + " is interacting with trainer " + otherTrainer.getName());
        System.out.println("Trainer's skills include: " + otherTrainer.getSkills());
        System.out.println("——————————————————————————————");
    }
}