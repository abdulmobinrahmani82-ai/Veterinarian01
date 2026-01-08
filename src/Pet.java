public class Pet {
    private String name;
    private String type;
    private int age;
    private boolean vaccinated;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        vaccinated = false;
    }

    public String getName() {
        return name;
    }

    public void vaccinate() {
        vaccinated = true;
        System.out.println(name + " vaccinated");
    }

    public String getInfo() {
        return name + " " + type + " " + age;
    }
}
