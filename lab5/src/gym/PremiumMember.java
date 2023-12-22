package gym;

public class PremiumMember extends Member {
    private int points;

    public PremiumMember(int points, int memberId, String name, int age, String gender, int weight, int growth, int durationInMonths, double price) {
        super(memberId, name, age, gender, weight, growth, durationInMonths, price);
        this.points = points;
    }

    public void redeemPoints() {
        System.out.println(super.getName() + " accumulates " + points + " points.");
    }

    public void managePoints() {
        System.out.println("Managing points in PremiumMember.");
        System.out.println("PremiumMember name: " + super.getName());
        System.out.println("Points: " + points);
    }

    public void exchangePointsForPrize() {
        if (points >= 50) {
            System.out.println("Congratulations! You can exchange 50 points for a free month of gym membership.");
            points -= 50;
            System.out.println("Remaining points: " + points);
        } else {
            System.out.println("You need at least 50 points to exchange for a prize.");
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}