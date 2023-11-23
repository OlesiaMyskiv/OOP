package gym;

class Member {
    public int memberId;
    public String name;
    public int age;
    public String gender;
    public int weight;
    public int growth;
    public int durationInMonths;  // Тривалість абонементу в місяцях
    public double price;


    public Member(int memberId, String name, int age, String gender, int weight, int growth, int durationInMonths, double price) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.growth = growth;
        this.durationInMonths = durationInMonths;
        this.price = price;
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

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalCost() { // Розрахунок загальної вартості абонементу
        return durationInMonths * price;
    }

    void information() {
        System.out.println("——————————————————————————————");
        System.out.println("ID: " + getMemberId());
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("Weight:" + weight);
        System.out.println("Growth:" + growth);
        System.out.println("Duration (months): " + getDurationInMonths());
        System.out.println("Price per month: $" + getPrice());
        System.out.println("Total cost: $" + getTotalCost());
        System.out.println("Body mass index: " + calculateBMI());
        System.out.println("——————————————————————————————");
    }

    void isNeedToLostWight() { //Підрахунок чи потрібно схуднути користувачу чи ні
        int need = growth - 100;
        if (weight >= (need + 5) && weight >= (need - 5)) {
            System.out.println("Your weigth is normal");
        } else {
            System.out.println("You need to visit gym");
        }
        System.out.println("——————————————————————————————");
    }

    public double calculateBMI() {
        double heightInMeters = getGrowth() / 100.0; // Перетворення зросту з сантиметрів у метри
        return weight / (heightInMeters * heightInMeters);// Розрахунок ІМТ

    }

    public void interactWithMember(Trainer otherTrainer) { //Виведення інформації про взаємодію між членом спортзалу та тренером
        System.out.println("Member " + getName() + " is interacting with trainer " + otherTrainer.getName());
        System.out.println("Trainer's skills include: " + otherTrainer.getSkills());
        System.out.println("——————————————————————————————");
    }
}