package gym;

public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise("Press", 10, 15);
        Trainer trainer1 = new Trainer("Sergiy Kotyshevech", 35, "Male", "Сan work in a group", 10);
        Trainer trainer2 = new Trainer("Eva Lomas", 25, "Female", "Personal trainer", 6);
        Member member1 = new Member(1,"Vlad Sor", 22, "Male", 78,186, 3, 150) ;
        Member member2 = new Member(2,"Anna Hit", 38, "Female", 50, 162, 1, 30);
        Gym gym = new Gym("Keep Fit",  true );
        Equipment equipment = new Equipment("Treadmill", "For running and walking", true);

        System.out.println("-------------GYM-------------");
        gym.setOpenStatus(true);
        gym.checkAvailability();

        gym.incrementOccupancy(65); // Додаємо 5 людей до кількості в спортзалі
        int currentOccupancy = gym.getCurrentOccupancy();


        System.out.println("----------Trainer----------");
        trainer1.moreInfo();
        trainer2.moreInfo();

        System.out.println("----------Member----------");
        member1.information();
        member1.isNeedToLostWight();
        member2.information();
        member2.isNeedToLostWight();

        // Перевизначений метод
        member1.interactWithMember(trainer1);
        // Перевантажений метод
        trainer1.engageWithTrainer(trainer2);
        trainer1.engageWithTrainer(member1);

        System.out.println("----------Exercise----------");
        exercise.Exercises();

        Exercise newExercise = Exercise.generateExercise("Squat", 4, 10);
        newExercise.Exercises();


        int sets = 5; // Кількість підходів
        int reps = 12; // Кількість повторень на підході
        int totalReps = exercise.calculateTotalReps(sets, reps);
        System.out.println("Total number of repetitions: " + totalReps);


        exercise.executeExercise(exercise.copyExerciseWithNewData("Squat", 5, 12));

        System.out.println("----------Equipment----------");
        equipment.displayInformation();
        equipment.useFinalVariables();

        equipment.checkAvailabilityForUser(true); // Якщо користувач - член спортзалу
        equipment.checkAvailabilityForUser(false); // Якщо користувач - не є членом спортзалу


    }
}

