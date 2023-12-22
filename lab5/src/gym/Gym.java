package gym;

public class Gym {
    private String name;
    private boolean isOpen;

    public Gym(String name, boolean isOpen) {
        this.name = name;
        this.isOpen = isOpen;
    }

    // Перевірки доступності спортзалу
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

    // Перевірки доступності спортзалу
    public void checkAvailability() {
        if (isOpen) {
            System.out.println("Gym '" + name + "' open and available for training.");
            System.out.println();
        } else {
            System.out.println("Gym '" + name + "' now closed.");
            System.out.println();
        }
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
}
