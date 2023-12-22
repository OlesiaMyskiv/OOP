package gym;

public class Equipment {
    final String name = "Treadmill";
    final String description = "For running and walking";
    final boolean availability = true;


    //Про спортивне обладнання
    public final void displayInformation() {
        System.out.println("Equipment Name: " + name);
        System.out.println("Equipment Description: " + description);
        System.out.println("Availability: " + (availability ? "available" : "not available")); //availability = true, і "not available", якщо availability = false.
        System.out.println("——————————————————————————————");
    }

    //Доступність обладнання
    public void checkAvailabilityForUser(boolean userIsMember) {
        String userStatus = userIsMember ? "member" : "non-member";
        String availabilityStatus = availability ? "available" : "not available";

        System.out.println("Checking availability for a " + userStatus + ":");
        System.out.println("The equipment named '" + name + "' is " + availabilityStatus + " for " + userStatus + "s.");
        System.out.println("——————————————————————————————");
    }
}