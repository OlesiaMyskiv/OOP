package gym;

public class Exercise {
    private String name;
    private int sets;
    private int reps;

    public Exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    //
    public static Exercise generateExercise(String name, int sets, int reps) {
        return new Exercise(name, sets, reps);
    }

    void Exercises() {
        System.out.println("The name of the exercise: " + name);
        System.out.println("Sets: " + sets);
        System.out.println("Number of repetitions: " + reps);
        System.out.println("——————————————————————————————");
    }

    // Обчислює загальну кількість повторень для заданої кількості підходів.
    int calculateTotalReps(int sets, int reps) {
        if (sets == 0) {
            return 0; // Базовий випадок, коли підходів більше не залишилось
        } else {
            return reps + calculateTotalReps(sets - 1, reps); // Рекурсивний випадок
        }
    }


    public void executeExercise(Exercise otherExercise) { //Відслідковування виконання вправи
        System.out.println("——————————————————————————————");
        System.out.println("Executing exercise: " + otherExercise.getName());
        System.out.println("This exercise is performed with " + otherExercise.getSets() + " sets and " + otherExercise.getReps() + " reps.");
        System.out.println("——————————————————————————————");
    }

    //
    public Exercise copyExerciseWithNewData(String newName, int newSets, int newReps) { //Метод, який створює копію вправи з новими даними.
        return new Exercise(newName, newSets, newReps);
    }

}
