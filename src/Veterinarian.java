public class Veterinarian extends Person {
    private String specialization;
    private boolean available;

    public Veterinarian(String name, String phone, String specialization, boolean available) {
        super(name, phone);
        this.specialization = specialization;
        this.available = available;
    }

    public void treat(Pet pet) {
        if (available)
            System.out.println(getName() + " treats " + pet.getName());
        else
            System.out.println(getName() + " is not available");
    }

    public void changeStatus() {
        available = !available;
    }

    public String getRole() {
        return "Veterinarian";
    }
}
