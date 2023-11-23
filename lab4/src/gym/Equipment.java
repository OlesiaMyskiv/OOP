package gym;

public class Equipment {
    private final String name;
    private final String description;
    private final boolean availability;

    public Equipment(String name, String description, boolean availability) {
        this.name = name;
        this.description = description;
        this.availability = availability;
    }

    //Про спортивне обладнання
    public void displayInformation() {
        System.out.println("——————————————————————————————");
        System.out.println("Equipment Name: " + name);
        System.out.println("Equipment Description: " + description);
        System.out.println("Availability: " + (availability ? "available" : "not available")); //availability = true, і "not available", якщо availability = false.
        System.out.println("——————————————————————————————");
    }

    public void useFinalVariables() {
        System.out.println("Using final variables:");
        System.out.println("Equipment Name: " + name);
        System.out.println("Equipment Description: " + description);
        System.out.println("Availability: " + (availability ? "available" : "not available"));
        System.out.println("——————————————————————————————");
    }

    //Доступність обладнання
    public void checkAvailabilityForUser(boolean userIsMember) {
        final String userStatus = userIsMember ? "member" : "non-member"; // Локальна фінальна змінна для статусу користувача

        System.out.println("Checking availability for a " + userStatus + ":");

        if (availability) {
            System.out.println("The equipment named '" + name + "' is available for " + userStatus + "s.");
        } else {
            System.out.println("The equipment named '" + name + "' is not available for " + userStatus + "s.");
        }

        System.out.println("——————————————————————————————");
    }

}