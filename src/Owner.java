
public class Owner extends Person {
    private String address;
    private Pet pet;

    public Owner(String name, String phone, String address, Pet pet) {
        super(name, phone);
        this.address = address;
        this.pet = pet;
    }

    public void showInfo() {
        System.out.println(getName());
        System.out.println(address);
        System.out.println(pet.getInfo());
    }

    public String getRole() {
        return "Owner";
    }

    public Pet getPet() {
        return pet;
    }
}
