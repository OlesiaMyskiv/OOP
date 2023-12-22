package gym;

public class Member extends Person {
    private int weight;
    private int growth;
    private int durationInMonths;
    private double price;

    public Member(int memberId, String name, int age, String gender, int weight, int growth, int durationInMonths, double price) {
        super(memberId, name, age, gender);
        this.weight = weight;
        this.growth = growth;
        this.durationInMonths = durationInMonths;
        this.price = price;
    }

    // Перевантажений метод для відображення деталей
    public void displayDetails(boolean includeBMI) {
        System.out.println("Displaying member details with BMI:");

        if (includeBMI) {
            information();  // Виклик існуючого методу
            System.out.println("Body mass index: " + calculateBMI());
            System.out.println("——————————————————————————————");
        } else {
            information();  // Виклик існуючого методу
        }
    }

    private void information() {
        System.out.println("——————————————————————————————");
        System.out.println("ID: " + getMemberId());
        System.out.println("Name: " + getName());
        System.out.println("Age:" + getAge());
        System.out.println("Gender:" + getGender());
        System.out.println("Weight:" + weight);
        System.out.println("Growth:" + growth);
        System.out.println("  ");
        System.out.println("Duration (months): " + durationInMonths);
        System.out.println("Price per month: $" + price);
        System.out.println("Total cost: $" + getTotalCost());
        System.out.println("——————————————————————————————");
    }

    public double calculateBMI() {
        double heightInMeters = growth / 100.0; // Перетворення зросту з сантиметрів у метри
        return weight / (heightInMeters * heightInMeters);// Розрахунок ІМТ
    }

    public double getTotalCost() { // Розрахунок загальної вартості абонементу
        return durationInMonths * price;
    }

    public void isNeedToLostWeight() { //Підрахунок чи потрібно схуднути користувачу чи ні
        int need = growth - 100;
        if (weight >= (need + 5) && weight >= (need - 5)) {
            System.out.println("Your weight is normal");
        } else {
            System.out.println("You need to visit gym");
        }
        System.out.println("——————————————————————————————");
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
}