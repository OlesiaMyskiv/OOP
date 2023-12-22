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
    public void totalReps(){
        int total = calculateTotalReps(getSets(), getReps());
        System.out.println("Total number of repetitions: " + total);
        System.out.println("——————————————————————————————");
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
}