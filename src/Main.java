import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Max", "Dog", 5);

        Owner owner = new Owner("Ali", "77079979004", "Astana", pet);
        Veterinarian vet = new Veterinarian("Sara", "000", "Surgery", true);

        ArrayList<Person> list = new ArrayList<>();
        list.add(owner);
        list.add(vet);

        for (Person p : list) {
            System.out.println(p.getRole());

            if (p instanceof Owner) {
                Owner o = (Owner) p;
                o.showInfo();
                o.getPet().vaccinate();
            }

            if (p instanceof Veterinarian) {
                Veterinarian v = (Veterinarian) p;
                v.treat(pet);
                v.changeStatus();
                v.treat(pet);
            }
        }
    }
}
