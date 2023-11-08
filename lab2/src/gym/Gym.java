package gym;

public class Gym {
    private String name;
    private boolean isOpen;
    private static int currentOccupancy = 0;
    private static int capacity = 60;

    public Gym(String name, boolean isOpen) {
        this.name = name;
        this.isOpen = isOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public static void setCurrentOccupancy(int currentOccupancy) {
        Gym.currentOccupancy = currentOccupancy;
    }

    public static int getCapacity() {
        return capacity;
    }

    public static void setCapacity(int capacity) {
        Gym.capacity = capacity;
    }

    //Перевірки доступності спортзалу
    public void setOpenStatus(boolean status) {
        isOpen = status;
        if (status) {
            System.out.println("Gym '" + name + "' open!");
            System.out.println();
        } else {
            System.out.println("Gym '" + name + "' closed.");
            System.out.println();
        }
    }

    //Перевірки доступності спортзалу
    public void checkAvailability() {
        if (isOpen) {
            System.out.println("Gym '" + name + "' open and available for training.");
            System.out.println();
        } else {
            System.out.println("Gym '" + name + "' now closed.");
            System.out.println();
        }
    }

    //Метод дозволяє контролювати кількість відвідувачів
    public static void incrementOccupancy(int additionalPeople) {
        if (currentOccupancy + additionalPeople <= capacity) {
            currentOccupancy += additionalPeople;
            System.out.println(additionalPeople + " people entered the gym. Current occupancy: " + currentOccupancy);
            System.out.println();
        } else {
            System.out.println("The gym is at full capacity. Cannot accommodate more people.");
            System.out.println("——————————————————————————————");
        }
    }

    //Отримуємо інформацію про поточну кількість відвідувачів спортзалу
    public static int getCurrentOccupancy() {
        return currentOccupancy;
    }
}