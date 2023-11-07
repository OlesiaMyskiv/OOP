package gym;

public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise("Press", 10, 15);
        Trainer trainer = new Trainer("Sergiy Kotyshevech", 35, "Male", "can work in a group", 10);
        Member member = new Member("Elina Hontarenko", 30, "Female", 55, 160) ;
        Gym gym = new Gym("Keep Fit",  true );

        gym.setOpenStatus(true);
        gym.checkAvailability();

        gym.incrementOccupancy(65); // Додаємо 5 людей до кількості в спортзалі
        int currentOccupancy = gym.getCurrentOccupancy();

        trainer.moreInfo();
        member.information();
        member.isNeedToLostWight();
        exercise.Exercises();

        // Перевизначений метод
        member.interactWithMember(trainer);
        // Перевантажений метод
        trainer.engageWithTrainer(trainer);
        trainer.engageWithTrainer(member);

        Exercise newExercise = Exercise.generateExercise("Squat", 4, 10);
        newExercise.Exercises();


        int sets = 5; // Кількість підходів
        int reps = 12; // Кількість повторень на підході
        int totalReps = exercise.calculateTotalReps(sets, reps);
        System.out.println("Total number of repetitions: " + totalReps);

        exercise.executeExercise(exercise.copyExerciseWithNewData("Squat", 5, 12));

    }
}

