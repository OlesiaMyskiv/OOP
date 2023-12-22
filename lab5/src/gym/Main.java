package gym;

public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise("Press", 10, 15);
        Trainer trainer1 = new Trainer(1, "Sergiy Kotyshevech", 35, "Male", "Can work in a group", 10);
        Member member1 = new Member(1, "Vlad Sor", 22, "Male", 78, 186, 3, 150);
        PremiumMember premiumMember = new PremiumMember(80, 1, "Vlad Sor", 22, "Male", 78, 182, 3, 150);
        Gym gym = new Gym("Keep Fit",  true );
        final Equipment equipment = new Equipment();

        System.out.println("-------------GYM-------------");
        gym.setOpenStatus(true);
        gym.checkAvailability();


        System.out.println("----------Trainer----------");
        trainer1.moreInfo();


        System.out.println("----------Member----------");

        member1.displayDetails(true); // Перевантажений метод для відображення деталей
        member1.displayDetails(1);

        member1.isNeedToLostWeight();

        premiumMember.redeemPoints();
        premiumMember.exchangePointsForPrize();


        System.out.println("----------Exercise----------");
        exercise.Exercises();
        exercise.totalReps();



        System.out.println("----------Equipment----------");
        equipment.displayInformation();
        equipment.checkAvailabilityForUser(true); // Якщо користувач - член спортзалу




    }
}